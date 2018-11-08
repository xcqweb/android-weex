package com.instapp.natex.extend;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.content.Context;
import com.instapp.natex.R;
import com.instapp.natex.WXApplication;
import com.instapp.natex.WXPageActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;
import java.util.Map;

//weex 扩展模块类
public class WXEventModule extends WXModule {
  private Context mContext;
  @JSMethod()
  public void openURL(String url) {
    if (TextUtils.isEmpty(url)) {
      return;
    }
    Uri uri = Uri.parse(url);
    String scheme = uri.getScheme();

    if (scheme.equals("http") || scheme.equals("https") || scheme.equals("file")) {
      Intent renderIntent = new Intent(mWXSDKInstance.getContext(), WXPageActivity.class);
      renderIntent.setData(uri);
      mWXSDKInstance.getContext().startActivity(renderIntent);
    } else {
      Intent intent = new Intent(Intent.ACTION_VIEW);
      intent.setData(uri);
      mWXSDKInstance.getContext().startActivity(intent);
    }
  }

  //获取token
  @JSMethod()
  public void getToken(JSCallback callback){

    Map<String, Object> option =  new HashMap<>();
    option.put("token",WXApplication.token);
    callback.invokeAndKeepAlive(option);
  }

  //跳转登录页面
  @JSMethod()
  public void goLogin(){
    Intent intent = new Intent("com.autel.usercenter.LoginActivity");
    intent.putExtra("come_from","com.instapp.natex" );
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    mWXSDKInstance.getContext().startActivity(intent);
  }
}
