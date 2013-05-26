package com.fever.liveppt.utils;

/**
 * 接口状态码信息
 * 1xxx 用户接口类错误码 
 * 2xxx PPT接口类错误码 
 * 3xxx会议接口类错误码 
 * x1xx 查询类错误
 * x2xx获取类错误
 * x3xx增加类错误
 * x4xx删除类错误
 * x5xx更改类错误
 * 9000操作成功
 * 
 * @author 黎伟杰
 *
 */
public class StatusCode {
	//一切正常
	public final static int NONE = 9000;
	//****************用户类型错误*****************
	//用户密码错误
	public final static int USER_PASSWORD_ERROR = 1100;
	//用户不存在
	public final static int USER_NOT_EXISTED = 1101;
	//用户已存在
	public final static int USER_EXISTED = 1300;
	
	//****************PPT类型错误*****************
	//PPT不存在
	public final static int PPT_NOT_EXISTED = 2100;
	//PPT列表为空
	public final static int PPT_LIST_NULL = 2200;
	
	//****************MEETING类型错误**************
	//meetingId字段错误
	public final static int MEETING_ID_ERROR = 3100;
	//pageIndex字段错误
	public final static int MEETING_PAGEINDEX_ERROR = 3102;
	//根据meetingID查询的meeting不存在
	public final static int MEETING_NOT_EXISTED = 3200;	
	
}