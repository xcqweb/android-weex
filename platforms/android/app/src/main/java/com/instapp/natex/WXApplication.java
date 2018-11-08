package com.instapp.natex;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.autels.usercenter.DiagnoseVehicleHistoryManager;
import com.instapp.natex.extend.ImageAdapter;
import com.instapp.natex.extend.WXEventModule;
import com.alibaba.weex.plugin.loader.WeexPluginContainer;
import com.instapp.natex.util.AppConfig;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVAnalytics;
import com.taobao.weex.devtools.trace.ViewUtils;
import org.json.JSONObject;
import java.util.Timer;
import java.util.TimerTask;

import static com.taobao.weex.ui.component.list.template.WXRecyclerTemplateList.TAG;

public class WXApplication extends Application {


    public static String token; //定义静态数据 其他页面可通过WXApplication.token 获取
    private boolean mBound;
    private DiagnoseVehicleHistoryManager historyManager;
    private ServiceConnection mConnection = new ServiceConnection() { //aidl 建立连接
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            historyManager = DiagnoseVehicleHistoryManager.Stub.asInterface(iBinder);
            Log.e("lsp", "start ");
            try {
                new Timer("upload").schedule(new TimerTask() {
                    @Override
                    public void run() {
                        try {
                            String userInfo = historyManager.getUseridAndTokenInfo();
                            if (!TextUtils.isEmpty(userInfo)) {
                               // Log.e(TAG, "userinfo::" + userInfo);
                                JSONObject userInfoJson = new JSONObject(userInfo);
                                token = userInfoJson.getString("access_token");
//                                if(TextUtils.isEmpty(token)){
//                                    Intent intent = new Intent("com.autel.usercenter.LoginActivity");
//                                    intent.putExtra("come_from","com.instapp.natex" );
//                                    startActivity(intent);
//                                }
//                                token = "access_token";
//                PrefsUtils.putString(application, Contant.TOKEN, userInfoJson.getString(Contant.TOKEN));
//                PrefsUtils.putString(application, Contant.USER_ID, userInfoJson.getString(Contant.USER_ID));
//                PrefsUtils.putString(application, Contant.LOGIN_ROLE, userInfoJson.getString(Contant.LOGIN_ROLE));
//                PrefsUtils.putString(application, Contant.ACCOUNT_STATUS, userInfoJson.getString(Contant.ACCOUNT_STATUS));
//                PrefsUtils.putString(application, Contant.AUTHOR_KNOW_HOW, userInfoJson.getString(Contant.AUTHOR_KNOW_HOW));
                            }

                        } catch (RemoteException e) {
                            Log.d(TAG, "application remotionn exception");
                            attemptBindService();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mBound = false;
            attemptBindService();
        }
    };


    @Override
    public void onCreate() {
        if (Build.VERSION.SDK_INT >= 18) {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            builder.detectFileUriExposure();
        }

        super.onCreate();

        attemptBindService();
        WXSDKEngine.addCustomOptions("appName", "NatExplorer");
        WXSDKEngine.addCustomOptions("appGroup", "Instapp");
        WXSDKEngine.initialize(this,
                new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build()
        );

        AVOSCloud.useAVCloudUS();
        AVOSCloud.initialize(this, ApiKey.LC_APPID, ApiKey.LC_APPKEY);
        AVAnalytics.enableCrashReport(this, true);

        try {
            WXSDKEngine.registerModule("event", WXEventModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
        AppConfig.init(this);
        WeexPluginContainer.loadAll(this);
    }

    public void attemptBindService() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.usercenter.aidl");
            intent.setPackage("com.autel.usercenter");
            //intent = ViewUtils.getExplicitIntent(this, intent);
            bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
