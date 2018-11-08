// DiagnoseVehicleHistory.aidl  以下定义了些aidl的方法 只需在运行的页面引入调用
package com.autels.usercenter;

// Declare any non-default types here with import statements

interface DiagnoseVehicleHistoryManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);
    /**根据vin码或者车牌号关联查找对关联的客户*/
    String getRelationCustomer(String vin,String license);

    /**获取上次登录的userid和token信息*/
    String getUseridAndTokenInfo();

    /**对应历史测试记录修改后的保存更新数据库功能*/
    void editAndSaveRecord(String record);

    /**初始化第一次获取每月二十条测车记录*/
    String initDBData(String userid, String customerid, int type,String language,int functionid);

    /**获取满足搜索条件的所有车*/
    String getDiagRecordByFilter(String content,String userid,int type,int functionid,String language);

    /**删除某类下所有测车历史记录*/
    int deleteAllHisRecordByType(String userid,String customerid,int type,String language);

    /**删除某类下某个测车历史记录*/
    int deleteSingleHisRecord(int localid);

    /**删除某类下所有测车历史记录*/
    int deleteAllHisRecordByTypeDate(String userid,String customerid,int year,int month,int type,String language);

    /**获取某年月下的测车历史记录*/
    String getMoreDataByYearMonthFromOffset(String userid, String customerid,int year,int month,int offset,int type,String language,int functionid);

    /*获取序列号和密码*/
    void setSnAndPwd(String sn,String pwd);
    /*同步服务的最新数据*/
    void syncServerHistoryData(String sn);

    /*上传所有未上传诊断历史记录至服务器*/
    void uploadDiagHisRecord();

    /*上传所有未上传诊断历史记录至服务器*/
    void uploadSingleDiagHisRecord(String mainid);

    /**获取本地所有诊断历史记录信息*/
    String getAllDiagHisRecord(String language);

    /**获取诊断历史记录中ECU和故障码信息*/
    String getEcuAndDTCInfo(String recordreportid);

    /**获取诊断历史记录中ECU和故障码信息*/
    void updateEcuAndDTCInfo(String deu);

    /**存储诊断历史记录中数据流信息*/
    String getDataStreamInfo(String datastreamid);

    /**存储诊断历史记录中ECU和故障码信息*/
    boolean saveEcuAndDTCInfo(String info);

    /**存储诊断历史记录中数据流信息*/
    boolean saveDataStreamInfo(String datastreaminfo);

    /**存储诊断历史记录*/
    boolean saveDiagHisRecord(String record);

    /* 更新已存在的历史记录*/
    void updateDiagHisRecord(String record);

    /**查看某条诊断记录是否已经存在*/
    boolean isDiagHisRecordIsExist(String id);

    /**查看某条诊断数据流记录是否已经存在*/
    boolean isDatasreamIsExist(String id);

    /**查看某条诊断记录ECU和故障码信息是否已经存在*/
    boolean isDTCAndEcuIsExist(String id);

    /**获取某条诊断记录的本地ID*/
    int getDiagHisRecordLocalId(String id);

     /**通知usercenter更新*/
    boolean updateStatisticeDatas();

    /**添加一条主页大数据统计*/
    boolean addBehaviorStatistics(String event,String data,long time);

    /**添加一条诊断大数据统计*/
    boolean addDiagnosticPathStatistics(String event,String data,long time);

    /*datalog*/
    void sendDataLogInfo(String info);
    /**获取该车的最新一条历史记录*/
    String getLatestHisRecordOfCar(String vehicle_path);

    /*获取维修单号的历史记录*/
    String getHisRecordByOrder(String order,String lang);
    /*更新维修报告信息*/
    int updatePrepost(int localid, String prepost,String adas,int testType);
}
