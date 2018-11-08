/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\weex\\app\\platforms\\android\\app\\src\\main\\aidl\\com\\autels\\usercenter\\DiagnoseVehicleHistoryManager.aidl
 */
package com.autels.usercenter;
// Declare any non-default types here with import statements

public interface DiagnoseVehicleHistoryManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.autels.usercenter.DiagnoseVehicleHistoryManager
{
private static final java.lang.String DESCRIPTOR = "com.autels.usercenter.DiagnoseVehicleHistoryManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.autels.usercenter.DiagnoseVehicleHistoryManager interface,
 * generating a proxy if needed.
 */
public static com.autels.usercenter.DiagnoseVehicleHistoryManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.autels.usercenter.DiagnoseVehicleHistoryManager))) {
return ((com.autels.usercenter.DiagnoseVehicleHistoryManager)iin);
}
return new com.autels.usercenter.DiagnoseVehicleHistoryManager.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getRelationCustomer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getRelationCustomer(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUseridAndTokenInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getUseridAndTokenInfo();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_editAndSaveRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.editAndSaveRecord(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_initDBData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
java.lang.String _result = this.initDBData(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDiagRecordByFilter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
java.lang.String _arg4;
_arg4 = data.readString();
java.lang.String _result = this.getDiagRecordByFilter(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_deleteAllHisRecordByType:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.deleteAllHisRecordByType(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteSingleHisRecord:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.deleteSingleHisRecord(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteAllHisRecordByTypeDate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
int _result = this.deleteAllHisRecordByTypeDate(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMoreDataByYearMonthFromOffset:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
java.lang.String _arg6;
_arg6 = data.readString();
int _arg7;
_arg7 = data.readInt();
java.lang.String _result = this.getMoreDataByYearMonthFromOffset(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setSnAndPwd:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setSnAndPwd(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_syncServerHistoryData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.syncServerHistoryData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_uploadDiagHisRecord:
{
data.enforceInterface(DESCRIPTOR);
this.uploadDiagHisRecord();
reply.writeNoException();
return true;
}
case TRANSACTION_uploadSingleDiagHisRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.uploadSingleDiagHisRecord(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAllDiagHisRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getAllDiagHisRecord(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getEcuAndDTCInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getEcuAndDTCInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_updateEcuAndDTCInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.updateEcuAndDTCInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDataStreamInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getDataStreamInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_saveEcuAndDTCInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.saveEcuAndDTCInfo(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_saveDataStreamInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.saveDataStreamInfo(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_saveDiagHisRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.saveDiagHisRecord(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateDiagHisRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.updateDiagHisRecord(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isDiagHisRecordIsExist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isDiagHisRecordIsExist(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDatasreamIsExist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isDatasreamIsExist(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDTCAndEcuIsExist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isDTCAndEcuIsExist(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDiagHisRecordLocalId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getDiagHisRecordLocalId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateStatisticeDatas:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.updateStatisticeDatas();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addBehaviorStatistics:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
long _arg2;
_arg2 = data.readLong();
boolean _result = this.addBehaviorStatistics(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addDiagnosticPathStatistics:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
long _arg2;
_arg2 = data.readLong();
boolean _result = this.addDiagnosticPathStatistics(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendDataLogInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendDataLogInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getLatestHisRecordOfCar:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getLatestHisRecordOfCar(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getHisRecordByOrder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getHisRecordByOrder(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_updatePrepost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
int _result = this.updatePrepost(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.autels.usercenter.DiagnoseVehicleHistoryManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String getRelationCustomer(java.lang.String vin, java.lang.String license) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(vin);
_data.writeString(license);
mRemote.transact(Stub.TRANSACTION_getRelationCustomer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getUseridAndTokenInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUseridAndTokenInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**对应历史测试记录修改后的保存更新数据库功能*/
@Override public void editAndSaveRecord(java.lang.String record) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(record);
mRemote.transact(Stub.TRANSACTION_editAndSaveRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String initDBData(java.lang.String userid, java.lang.String customerid, int type, java.lang.String language, int functionid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userid);
_data.writeString(customerid);
_data.writeInt(type);
_data.writeString(language);
_data.writeInt(functionid);
mRemote.transact(Stub.TRANSACTION_initDBData, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDiagRecordByFilter(java.lang.String content, java.lang.String userid, int type, int functionid, java.lang.String language) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(content);
_data.writeString(userid);
_data.writeInt(type);
_data.writeInt(functionid);
_data.writeString(language);
mRemote.transact(Stub.TRANSACTION_getDiagRecordByFilter, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteAllHisRecordByType(java.lang.String userid, java.lang.String customerid, int type, java.lang.String language) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userid);
_data.writeString(customerid);
_data.writeInt(type);
_data.writeString(language);
mRemote.transact(Stub.TRANSACTION_deleteAllHisRecordByType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteSingleHisRecord(int localid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(localid);
mRemote.transact(Stub.TRANSACTION_deleteSingleHisRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteAllHisRecordByTypeDate(java.lang.String userid, java.lang.String customerid, int year, int month, int type, java.lang.String language) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userid);
_data.writeString(customerid);
_data.writeInt(year);
_data.writeInt(month);
_data.writeInt(type);
_data.writeString(language);
mRemote.transact(Stub.TRANSACTION_deleteAllHisRecordByTypeDate, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMoreDataByYearMonthFromOffset(java.lang.String userid, java.lang.String customerid, int year, int month, int offset, int type, java.lang.String language, int functionid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userid);
_data.writeString(customerid);
_data.writeInt(year);
_data.writeInt(month);
_data.writeInt(offset);
_data.writeInt(type);
_data.writeString(language);
_data.writeInt(functionid);
mRemote.transact(Stub.TRANSACTION_getMoreDataByYearMonthFromOffset, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*获取序列号和密码*/
@Override public void setSnAndPwd(java.lang.String sn, java.lang.String pwd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sn);
_data.writeString(pwd);
mRemote.transact(Stub.TRANSACTION_setSnAndPwd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/*同步服务的最新数据*/
@Override public void syncServerHistoryData(java.lang.String sn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sn);
mRemote.transact(Stub.TRANSACTION_syncServerHistoryData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/*上传所有未上传诊断历史记录至服务器*/
@Override public void uploadDiagHisRecord() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_uploadDiagHisRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/*上传所有未上传诊断历史记录至服务器*/
@Override public void uploadSingleDiagHisRecord(java.lang.String mainid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mainid);
mRemote.transact(Stub.TRANSACTION_uploadSingleDiagHisRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getAllDiagHisRecord(java.lang.String language) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(language);
mRemote.transact(Stub.TRANSACTION_getAllDiagHisRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getEcuAndDTCInfo(java.lang.String recordreportid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(recordreportid);
mRemote.transact(Stub.TRANSACTION_getEcuAndDTCInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**获取诊断历史记录中ECU和故障码信息*/
@Override public void updateEcuAndDTCInfo(java.lang.String deu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(deu);
mRemote.transact(Stub.TRANSACTION_updateEcuAndDTCInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getDataStreamInfo(java.lang.String datastreamid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(datastreamid);
mRemote.transact(Stub.TRANSACTION_getDataStreamInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**存储诊断历史记录中ECU和故障码信息*/
@Override public boolean saveEcuAndDTCInfo(java.lang.String info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(info);
mRemote.transact(Stub.TRANSACTION_saveEcuAndDTCInfo, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**存储诊断历史记录中数据流信息*/
@Override public boolean saveDataStreamInfo(java.lang.String datastreaminfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(datastreaminfo);
mRemote.transact(Stub.TRANSACTION_saveDataStreamInfo, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**存储诊断历史记录*/
@Override public boolean saveDiagHisRecord(java.lang.String record) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(record);
mRemote.transact(Stub.TRANSACTION_saveDiagHisRecord, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* 更新已存在的历史记录*/
@Override public void updateDiagHisRecord(java.lang.String record) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(record);
mRemote.transact(Stub.TRANSACTION_updateDiagHisRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**查看某条诊断记录是否已经存在*/
@Override public boolean isDiagHisRecordIsExist(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_isDiagHisRecordIsExist, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**查看某条诊断数据流记录是否已经存在*/
@Override public boolean isDatasreamIsExist(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_isDatasreamIsExist, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**查看某条诊断记录ECU和故障码信息是否已经存在*/
@Override public boolean isDTCAndEcuIsExist(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_isDTCAndEcuIsExist, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDiagHisRecordLocalId(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_getDiagHisRecordLocalId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**通知usercenter更新*/
@Override public boolean updateStatisticeDatas() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateStatisticeDatas, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**添加一条主页大数据统计*/
@Override public boolean addBehaviorStatistics(java.lang.String event, java.lang.String data, long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(event);
_data.writeString(data);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_addBehaviorStatistics, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**添加一条诊断大数据统计*/
@Override public boolean addDiagnosticPathStatistics(java.lang.String event, java.lang.String data, long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(event);
_data.writeString(data);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_addDiagnosticPathStatistics, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*datalog*/
@Override public void sendDataLogInfo(java.lang.String info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(info);
mRemote.transact(Stub.TRANSACTION_sendDataLogInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getLatestHisRecordOfCar(java.lang.String vehicle_path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(vehicle_path);
mRemote.transact(Stub.TRANSACTION_getLatestHisRecordOfCar, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getHisRecordByOrder(java.lang.String order, java.lang.String lang) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(order);
_data.writeString(lang);
mRemote.transact(Stub.TRANSACTION_getHisRecordByOrder, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int updatePrepost(int localid, java.lang.String prepost, java.lang.String adas, int testType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(localid);
_data.writeString(prepost);
_data.writeString(adas);
_data.writeInt(testType);
mRemote.transact(Stub.TRANSACTION_updatePrepost, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getRelationCustomer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getUseridAndTokenInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_editAndSaveRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_initDBData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDiagRecordByFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_deleteAllHisRecordByType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteSingleHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteAllHisRecordByTypeDate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getMoreDataByYearMonthFromOffset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setSnAndPwd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_syncServerHistoryData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_uploadDiagHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_uploadSingleDiagHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getAllDiagHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getEcuAndDTCInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_updateEcuAndDTCInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getDataStreamInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_saveEcuAndDTCInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_saveDataStreamInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_saveDiagHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_updateDiagHisRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_isDiagHisRecordIsExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isDatasreamIsExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isDTCAndEcuIsExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getDiagHisRecordLocalId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_updateStatisticeDatas = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_addBehaviorStatistics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_addDiagnosticPathStatistics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_sendDataLogInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getLatestHisRecordOfCar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getHisRecordByOrder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_updatePrepost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
}
public java.lang.String getRelationCustomer(java.lang.String vin, java.lang.String license) throws android.os.RemoteException;
public java.lang.String getUseridAndTokenInfo() throws android.os.RemoteException;
/**对应历史测试记录修改后的保存更新数据库功能*/
public void editAndSaveRecord(java.lang.String record) throws android.os.RemoteException;
public java.lang.String initDBData(java.lang.String userid, java.lang.String customerid, int type, java.lang.String language, int functionid) throws android.os.RemoteException;
public java.lang.String getDiagRecordByFilter(java.lang.String content, java.lang.String userid, int type, int functionid, java.lang.String language) throws android.os.RemoteException;
public int deleteAllHisRecordByType(java.lang.String userid, java.lang.String customerid, int type, java.lang.String language) throws android.os.RemoteException;
public int deleteSingleHisRecord(int localid) throws android.os.RemoteException;
public int deleteAllHisRecordByTypeDate(java.lang.String userid, java.lang.String customerid, int year, int month, int type, java.lang.String language) throws android.os.RemoteException;
public java.lang.String getMoreDataByYearMonthFromOffset(java.lang.String userid, java.lang.String customerid, int year, int month, int offset, int type, java.lang.String language, int functionid) throws android.os.RemoteException;
/*获取序列号和密码*/
public void setSnAndPwd(java.lang.String sn, java.lang.String pwd) throws android.os.RemoteException;
/*同步服务的最新数据*/
public void syncServerHistoryData(java.lang.String sn) throws android.os.RemoteException;
/*上传所有未上传诊断历史记录至服务器*/
public void uploadDiagHisRecord() throws android.os.RemoteException;
/*上传所有未上传诊断历史记录至服务器*/
public void uploadSingleDiagHisRecord(java.lang.String mainid) throws android.os.RemoteException;
public java.lang.String getAllDiagHisRecord(java.lang.String language) throws android.os.RemoteException;
public java.lang.String getEcuAndDTCInfo(java.lang.String recordreportid) throws android.os.RemoteException;
/**获取诊断历史记录中ECU和故障码信息*/
public void updateEcuAndDTCInfo(java.lang.String deu) throws android.os.RemoteException;
public java.lang.String getDataStreamInfo(java.lang.String datastreamid) throws android.os.RemoteException;
/**存储诊断历史记录中ECU和故障码信息*/
public boolean saveEcuAndDTCInfo(java.lang.String info) throws android.os.RemoteException;
/**存储诊断历史记录中数据流信息*/
public boolean saveDataStreamInfo(java.lang.String datastreaminfo) throws android.os.RemoteException;
/**存储诊断历史记录*/
public boolean saveDiagHisRecord(java.lang.String record) throws android.os.RemoteException;
/* 更新已存在的历史记录*/
public void updateDiagHisRecord(java.lang.String record) throws android.os.RemoteException;
/**查看某条诊断记录是否已经存在*/
public boolean isDiagHisRecordIsExist(java.lang.String id) throws android.os.RemoteException;
/**查看某条诊断数据流记录是否已经存在*/
public boolean isDatasreamIsExist(java.lang.String id) throws android.os.RemoteException;
/**查看某条诊断记录ECU和故障码信息是否已经存在*/
public boolean isDTCAndEcuIsExist(java.lang.String id) throws android.os.RemoteException;
public int getDiagHisRecordLocalId(java.lang.String id) throws android.os.RemoteException;
/**通知usercenter更新*/
public boolean updateStatisticeDatas() throws android.os.RemoteException;
/**添加一条主页大数据统计*/
public boolean addBehaviorStatistics(java.lang.String event, java.lang.String data, long time) throws android.os.RemoteException;
/**添加一条诊断大数据统计*/
public boolean addDiagnosticPathStatistics(java.lang.String event, java.lang.String data, long time) throws android.os.RemoteException;
/*datalog*/
public void sendDataLogInfo(java.lang.String info) throws android.os.RemoteException;
public java.lang.String getLatestHisRecordOfCar(java.lang.String vehicle_path) throws android.os.RemoteException;
public java.lang.String getHisRecordByOrder(java.lang.String order, java.lang.String lang) throws android.os.RemoteException;
public int updatePrepost(int localid, java.lang.String prepost, java.lang.String adas, int testType) throws android.os.RemoteException;
}
