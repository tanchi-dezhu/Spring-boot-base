package com.base.demo.vo;

/**
 * @auth JiteShen
 系统常量类
 **/

public final class WebConstants {
    public static final String PROJECT_NAME="CMHG2";
    /** 系统*/
    public static final String STR_ERROR="ERROR";
    public static final String ERROR_CODE = "500";	//错误编码
    public static final String SUCCESS_CODE = "200";	//成功
    public static final String SUCCESS_STR = "SUCCESS";	//成功
    public static final String SUCCESS_CODE_WITH_WARNING = "201";	//成功但是有警告信息
    public static final String TOKEN_ERROR = "401";//登录超时或未登录
    public static final String NOT_EXIST_ERROR = "404";//不存在
    public static final String NOT_ACCEPT_ERROR = "406";//未授权，不接受访问 
    public static final String FILE_SEP = System.getProperty("file.separator");
    public static final String CHARSET = "UTF-8";
    public static final String VSERION = "1.0";	
    public static final String UNDERSCORE="_";
    public static final String DASH="-";
	public static final Integer DATA_INSERT_STATUS = new Integer(0);
	public static final String  DATA_INSERT_STATUS_STR="INSERT";
    public static final Integer DATA_DELETE_STATUS = new Integer(9);
	public static final String  DATA_DELETE_STATUS_STR="DELETE";
    public static final Integer DATA_FROZEN_STATUS = new Integer(6);   //冻结
	public static final String  DATA_FROZEN_STATUS_STR="FROZEN";
    public static final Integer MAGIC_NUMBER_ONE = new Integer(1);	
    public static final Integer MAGIC_NUMBER_TEN_THOUSAND = new Integer(10000);

    public static final String ALIYUN_RESULT_OK_CODE = "OK";//发送短信成功后阿里云返回的code
    public static final Integer SEND_STATUS_SUCCESSFUL = 1;//发送状态（1.发送成功   2.发送失败  3测试）
    public static final Integer SEND_STATUS_FAILURE = 2;//发送状态（1.发送成功   2.发送失败  3测试）
    public static final Integer SEND_STATUS_TEST = 3;//发送状态（1.发送成功   2.发送失败  3测试）

    /*短信配置*/
    public static final String ALIYUN_DYSMSAPI = "ALIYUN_SMS";
    public static final String ALIYUN_SMTP = "ALIYUN-EMAIL";
    public static final String SEND_TITLE_REGISTERED = "REGISTERED";
    public static final String ALIYUN_DYSMSAPI_REGIONID = "cn-shenzhen";//发送短信地区
    public static final String SEND_MSG_SIGN = "阿里云短信测试专用";//这个是短信模板签名
    public static final String ALIYUN_DYSMSAPI_PRODUCT = "Dysmsapi";
    public static final String ALIYUN_DYSMSAPI_DOMAIN = "dysmsapi.aliyuncs.com";
    public static final String ALIYUN_DYSMSAPI_KEYID = "LTAIyVaWnuVjYIQA";
    public static final String ALIYUN_DYSMSAPI_SECRET = "bpOTz0HKSe4dZ7w2p3QThVgLb4qWLh";
    public static final String ALIYUN_DYSMSAPI_CONNECTIONTIMEOUT = "10000";
    public static final String ALIYUN_DYSMSAPI_READTIMEOUT = "10000";


    /*邮件配置*/
    public static final Integer SEND_TEST_EMAIL_STATUS = new Integer(3);//发送邮件测试状态
    public static final String ALIYUN_EMAIL_REGIONID = "cn-hangzhou";//发送短信地区，目前支持 cn-hangzhou、ap-southeast-1、ap-southeast-2
    public static final String ALIYUN_SMTP_SERVICE_HOST = "smtp.qq.com";//SMTP 服务地址（华东 1）
    public static final Integer ALIYUN_SMTP_SERVICE_PORT = new Integer(587);//SMTP 服务端口: 25，80，465（SSL加密）
    public static final String ALIYUN_SMTP_DOMAIN = "qq.com";//邮件域名
    public static final String ALIYUN_SMTP_PASSWORD = "qpsbhbfkixizbdfi";//邮件密码
    public static final String ALIYUN_SMTP_SEND_ADDRESS = "595620282@qq.com";//发信地址
    public static final String ALIYUN_SMTP_REPLY_ADDRESS = "595620282@qq.com";//回信地址
    public static final String ALIYUN_SMTP_CHARSET = "text/html;charset=UTF-8";//smtp编码
    public static final String ALIYUN_SMTP_LEVEL = "3";//发送优先级
    public static final String ALIYUN_SMTP_HEAD = "运营团队";//发邮件上面发送者

    public static final String SEND_LOCAL_LOCK = "";

    //七牛云
    public static final String SYSTEM_DICT_TYPE_QINIUYUN_CONFIG="QINIUYUN_CONFIG";
    public static final String SYSTEM_DICT_ITEM_QINIUYUN_BUCKET="QINIUYUN_BUCKET";
    public static final String SYSTEM_DICT_ITEM_QINIUYUN_ACCESS_KEY="QINIUYUN_ACCESS_KEY";
    public static final String SYSTEM_DICT_ITEM_SECRET_KEY="QINIUYUN_SECRET_KEY";
    public static final String SYSTEM_DICT_ITEM_QINIUYUN_SAVEPATH = "QINIUYUN_SAVEPATH";

    /*------------*/
    public static final Integer DATA_SUCCESS = new Integer(0);//成功
    public static final Integer DATA_FAIL = new Integer(1);//失败
    public static final Integer DATA_PROCESS = new Integer(2);

    public static final Integer SORT_MAXIMUM = new Integer(999);
    public static final Integer SOTE_MINIMUM = new Integer(0);
    
    public static final Integer BANNER_CLIENT_PC = new Integer(1);
    public static final Integer BANNER_CLIENT_APP = new Integer(2);
    
    public static final Integer ISNOTNOTICE_YES = new Integer(0);
    public static final Integer ISNOTNOTICE_NOT = new Integer(1);

    public static final String REQUEST_HEADER_TOKEN_PARA_NAME="accessToken";//后台的token
    public static final String REQUEST_HEADER_USER_TOKEN_NAME="userToken";//获取用户端token
    public static final String REQUEST_HEADER_API_TOKEN_NAME="apiToken";//第三方调用token
    public static final Integer TOKEN_USER_FROM_PORTAL=1;
    public static final Integer TOKEN_USER_FROM_CONSOLE=2;
    public static final Integer TOKEN_USER_FROM_THIRD=3;
    public static final Integer TOKEN_USER_OSTYPE_WEB=1;//电脑网页
    public static final Integer TOKEN_USER_OSTYPE_APP_ANDROID=2;//安卓APP
    public static final Integer TOKEN_USER_OSTYPE_APP_IOS=3;//苹果APP
    public static final Integer TOKEN_USER_OSTYPE_WECHAT=4;//微信公众号
    public static final Integer TOKEN_USER_OSTYPE_H5=5;//手机网页版
    public static final Integer TOKEN_USER_OSTYPE_WCAPP=6;//微信小程序
	public static final Integer OSTYPE_PC = 1;
	public static final Integer OSTYPE_ANDROID = 2;
	public static final Integer OSTYPE_IOS = 3;
	public static final Integer OSTYPE_WECHAT = 4;
	public static final Integer OSTYPE_H5 = 5;
	public static final Integer OSTYPE_3DPRINT = 6;

	public static final String REGIST_BY_PHONE_NUMBER="REGIST_PHONE_NUMBER";
	public static final String REGIST_BY_EMAIL="REGIST_EMAIL";
	public static final String LOGIN_BY_PHONE_NUMBER="LOGIN_PHONE_NUMBER";
	public static final String LOGIN_BY_EMAIL="LOGIN_EMAIL";
	
    public static final String SEND_TEST_SWITCH_TYPE_OPEN = "2";
    public static final String SEND_TEST_SWITCH_TYPE_CLOSE = "1";
    
    public static final String CONSOLE_SYSTEM_DICTIONARY=PROJECT_NAME+"_CONSOLE_SYSTEM_DICTIONARY";
    public static final String CONSOLE_BUSINESS_DICTIONARY=PROJECT_NAME+"_CONSOLE_BUSINESS_DICTIONARY";
    public static final String CONSOLE_SYSTEM_DICTIONARY_LIST_WITH_TREE=PROJECT_NAME+"_CONSOLE_SYSTEM_DICTIONARY_LIST_WITH_TREE";
    public static final String CONSOLE_BUSINESS_DICTIONARY_LIST_WITH_TREE=PROJECT_NAME+"_CONSOLE_BUSINESS_DICTIONARY_LIST_WITH_TREE";
    public static final String CONSOLE_SYSTEM_DICTIONARY_BY_ID = PROJECT_NAME + "_CONSOLE_SYSTEM_DICTIONARY_BY_ID";
    public static final String CONSOLE_BUSINESS_DICTIONARY_BY_ID = PROJECT_NAME + "_CONSOLE_BUSINESS_DICTIONARY_BY_ID";
    public static final String CONSOLE_ALL_MENU=PROJECT_NAME+"_CONSOLE_MENU";
    public static final String CONSOLE_ALL_MENU_FUNCTION=PROJECT_NAME+"_CONSOLE_MENU_FUNCTION";
    public static final String CONSOLE_ROLE_ALL_MENU=PROJECT_NAME+"_CONSOLE_ROLE_MENU";
    public static final String CONSOLE_ROLE_ALL_MENU_FUNCTION=PROJECT_NAME+"_CONSOLE_ROLE_MENU_FUNCTION";
    public static final String CONSOLE_ACCOUNT_USER_TOKEN_MAP=PROJECT_NAME+"_CONSOLE_ACCOUNT_USER_TOKEN_MAP";
    public static final String CONSOLE_ACCOUNT_USER_MENU_MAP=PROJECT_NAME+"_CONSOLE_ACCOUNT_USER_MENU_MAP";
    public static final String CONSOLE_ACCOUNT_USER_APISTR_MAP=PROJECT_NAME+"_CONSOLE_ACCOUNT_USER_APISTR_MAP";
    public static final String CONSOLE_ACCOUNT_USER_FUNCTIONIDSTR_MAP=PROJECT_NAME+"_CONSOLE_ACCOUNT_USER_FUNCTIONIDSTR_MAP";
    public static final String CONSOLE_ACCOUNT_USER_ONLINE_CUSTOMER_MAP=PROJECT_NAME+"_CONSOLE_ACCOUNT_USER_ONLINE_CUSTOMER_MAP";

    public static final String THIRD_MESSAGE_TEMPLATE_MAP = PROJECT_NAME+"_THIRD_MESSAGE_TEMPLATE_MAP";//短信模板redis key
    public static final String THIRD_MAILBOX_TEMPLATE_MAP = PROJECT_NAME+"_THIRD_MAILBOX_TEMPLATE_MAP";//邮箱模板redis key

    public static final String CONSOLE_VERIFY_CODE_MAP = PROJECT_NAME+"_VERIFY_CODE_MAP";//验证码redis key

    //public static final String PORTAL_ACCOUNT_USER_TOKEN_MAP=PROJECT_NAME+"_PORTAL_ACCOUNT_USER_TOKEN_MAP";
    //重构登录用户   的  token存储， 分成两个Map 
    public static final String PORTAL_ACCOUNT_USER_TOKEN_TO_ID_MAP=PROJECT_NAME+"_PORTAL_ACCOUNT_USER_TOKEN_TO_ID_MAP";
    public static final String PORTAL_ACCOUNT_USERID_TO_VO_MAP=PROJECT_NAME+"_PORTAL_ACCOUNT_USERID_TO_VO_MAP";
   
    public static final String PORTAL_ACCOUNT_USER_APISTR_MAP=PROJECT_NAME+"_PORTAL_ACCOUNT_USER_APISTR_MAP";
    public static final String PORTAL_ACCOUNT_USER_FUNCTIONIDSTR_MAP=PROJECT_NAME+"_PORTAL_ACCOUNT_USER_FUNCTIONIDSTR_MAP";



    //未来第三方接口调用时 
    public static final String THIRD_ACCOUNT_USER_TOKEN_MAP=PROJECT_NAME+"_THIRD_ACCOUNT_USER_TOKEN_MAP";
    public static final String THIRD_ACCOUNT_USER_APISTR_MAP=PROJECT_NAME+"_THIRD_ACCOUNT_USER_APISTR_MAP";
    public static final String THIRD_ACCOUNT_USER_FUNCTIONIDSTR_MAP=PROJECT_NAME+"_THIRD_ACCOUNT_USER_FUNCTIONIDSTR_MAP";
    
    public static final String WX="WX";
    //系统字典值类型或项名
    public static final String SYSTEM_DICT_TYPE_WX_CONFIG="WX_CONFIG";
    public static final String SYSTEM_DICT_ITEM_WX_MP_OPEN_ID="WX_MP_OPEN_ID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SECRET="WX_MP_SECRET";
    public static final String SYSTEM_DICT_ITEM_WX_MP_ACCESS_TOKEN="WX_MP_ACCESS_TOKEN";
    public static final String SYSTEM_DICT_ITEM_WX_MP_ACCESS_TOKEN_EXPIRE_TIME="WX_MP_ACCESS_TOKEN_EXPIRE_TIME";
    public static final String SYSTEM_DICT_ITEM_WX_MP_TICKET="WX_MP_TICKET";
    public static final String SYSTEM_DICT_ITEM_WX_MP_TICKET_EXPIRE_TIME="WX_MP_TICKET_EXPIRE_TIME";
    public static final String SYSTEM_DICT_ITEM_WX_MP_MCH_ID="WX_MP_MCH_ID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_API_KEY="WX_MP_API_KEY";
    public static final String SYSTEM_DICT_ITEM_WX_MP_PAID_NOTIFY_URL="WX_MP_PAID_NOTIFY_URL";
    public static final String SYSTEM_DICT_ITEM_WX_MP_REFUND_P12_FILE="WX_MP_REFUND_P12_FILE";
    //系统字典值类型或项名
    public static final String SYSTEM_DICT_ITEM_WX_MP_SERVER_URL="WX_MP_SERVER_URL";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SERVER_TOKEN="WX_MP_SERVER_TOKEN";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SERVER_ENCODINGAESKEY="WX_MP_SERVER_ENCODINGAESKEY";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SAVE_IMAGE_PATH="WX_MP_SAVE_IMAGE_PATH";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SAVE_IMAGE_URL="WX_MP_SAVE_IMAGE_URL";
    //系统字典订单信息
    public static final String SYSTEM_DICT_ITEM_WX_MP_PAID_MSG_TMPID="WX_MP_PAID_MSG_TMPID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_NEW_ORDER_NOTIFY_MSG_TMPID="WX_MP_NEW_ORDER_NOTIFY_MSG_TMPID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_NEXT_PAY_ORDER_SUCCESS_TMPID="WX_MP_NEXT_PAY_ORDER_SUCCESS_TMPID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_APPLY_MSG_TMPID="WX_MP_APPLY_MSG_TMPID";
    public static final String SYSTEM_DICT_ITEM_WX_MP_USER_ORDER_URL="WX_MP_USER_ORDER_URL";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SEND_REPORT_URL="WX_MP_SEND_REPORT_URL";
    public static final String SYSTEM_DICT_ITEM_WX_MP_STORE_ORDER_URL="WX_MP_STORE_ORDER_URL";
    public static final String SYSTEM_DICT_ITEM_WX_MP_SEND_REPOR_TMPID="WX_MP_SEND_REPOR_TMPID";
    //系统字典短信配置
    public static final String SYSTEM_DICT_TYPE_ALIYUN_CONFIG="ALIYUN_CONFIG";
    public static final String SYSTEM_DICT_TYPE_ALIYUN_SMS_SIGNATURE="ALIYUN_SMS_SIGNATURE";

    //短信内容配置
    public static final String BUSINESS_DICT_MSG_CONTENT_CONFIG = "MSG_CONTENT_CONFIG";
    public static final String BUSINESS_DICT_MEMBER_NOTCIE = "MEMBER_NOTCIE";

    //业务字典开关类型与项名
    public static final String BUSINESS_DICT_TYPE_SWITCH = "SWITCH_PARAM";//所有开关type
    public static final String BUSINESS_DICT_ITEM_MSG_EVENT_SWITCH = "SEND_MSG_EVENT_SWITCH";//短信不触发事件开关 （开启之后什么都不会发生，包括发短信和发消息和存redis和存消息和存用户信息）
    public static final String BUSINESS_DICT_ITEM_MSG_TEST_SWITCH = "SEND_MSG_TEST_SWITCH";//短信测试开关 （开启之后可以不发送短信，其它的功能正常使用）
    public static final String BUSINESS_DICT_ITEM_MSG_FIXED_VCODE_SWITCH = "SEND_MSG_FIXED_VCODE_SWITCH";//短信发送固定验证码开关 （开启之后会发送固定验证码，验证码数据库要可配置）

    public static final String BUSINESS_DICT_ITEM_EMAIL_EVENT_SWITCH = "SEND_EMAIL_EVENT_SWITCH";//邮件不触发事件开关 （开启之后什么都不会发生，包括发短信和发消息和存redis和存消息和存用户信息）
    public static final String BUSINESS_DICT_ITEM_EMAIL_TEST_SWITCH = "SEND_EMAIL_TEST_SWITCH";//邮件测试开关 （开启之后可以不发送短信，其它的功能正常使用）
    public static final String BUSINESS_DICT_ITEM_EMAIL_FIXED_VCODE_SWITCH = "SEND_EMAIL_FIXED_VCODE_SWITCH";//邮件发送固定验证码开关 （开启之后会发送固定验证码，验证码数据库要可配置）

    public static final String BUSINESS_DICT_TYPE_FIXED_VCODE =  "CONSOLE_VERIFYCODE";//固定验证码的type
    public static final String BUSINESS_DICT_ITEM_MSG_FIXED_VCODE_ = "MSG_FIXED_VERIFYCODE";//固定短信验证码的数据字典值
    public static final String BUSINESS_DICT_ITEM_EMAIL_FIXED_VCODE_ = "EMAIL_FIXED_VERIFYCODE";//固定邮箱验证码的数据字典值

    public static final String BUSINESS_DICT_ITEM_POINTS_DISCOUNT_SWITCH =  "POINTS_DISCOUNT_SWITCH"; //积分抵扣业务开关

    public static final String BUSINESS_SWITCH_OFF = "OFF";
    public static final String BUSINESS_SWITCH_ON = "ON";

    //业务字典类型与项名
    public static final String BUSINESS_DICT_TYPE_CUSTOMER_SERVICE="CUSTOMER_SERVICE";
    public static final String BUSINESS_DICT_ITEM_CONTACT_NUMBER="CONTACT_NUMBER";
    public static final String BUSINESS_DICT_ITEM_CONTACT_NAME="CONTACT_NAME";
    public static final String BUSINESS_DICT_TYPE_TEXT_CN="TEXT_CN";
    public static final String BUSINESS_DICT_ITEM_PAY_NOW="PAY_NOW";
    public static final String BUSINESS_DICT_ITEM_PAY_NEXT="PAY_NEXT";
    public static final String BUSINESS_DICT_TYPE_BIZ_CONFIG="BIZ_CONFIG";
    public static final String BUSINESS_DICT_ITEM_IN_MINS_APPLY_CANCEL="IN_MINS_APPLY_CANCEL";
    public static final String BUSINESS_DICT_TYPE_POINT_CONFIG="POINT_CONFIG";
    public static final String BUSINESS_DICT_ITEM_POINTS_DISCOUNT="POINTS_DISCOUNT";
    public static final String BUSINESS_DICT_ITEM_MEMBER_DISCOUNT="MEMBER_DISCOUNT";

    public static final String SYSTEM_DICT_TYPE_SESSION_CONSOLE="SESSION_CONSOLE";
    public static final String SYSTEM_DICT_ITEM_TOKEN_VALID_MINS="SYSTEM_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_TYPE_SESSION_PORTAL="SESSION_PORTAL";
    public static final String SYSTEM_DICT_ITEM_WEB_TOKEN_VALID_MINS="WEB_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_ITEM_APP_TOKEN_VALID_MINS="APP_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_ITEM_WECHAT_TOKEN_VALID_MINS="WECHAT_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_ITEM_H5_TOKEN_VALID_MINS="H5_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_ITEM_WCAPP_TOKEN_VALID_MINS="APP_ACCESS_TOKEN_VALID_MINS";
    public static final String SYSTEM_DICT_TYPE_SESSION_THIRD="SESSION_THIRD";
    public static final String SYSTEM_DICT_ITEM_THIRD_TOKEN_VALID_MINS="API_ACCESS_TOKEN_VALID_MINS";
    
    //微信相关属性常量值
    public static final Integer WX_USER_STATUS_SUBSCRIBED=0;//已关注
    public static final Integer WX_USER_STATUS_UNSUBSCRIBED=6;//已取消关注-冻结状态
    public static final Integer WX_USER_STATUS_DELETED=9;//已被拉黑删除
    
    public static final String WX_SERVER_MSG_TYPE_EVENT="event";
    public static final String WX_SERVER_EVENT_TYPE_SUBSCRIBE="subscribe";
    public static final String WX_SERVER_EVENT_TYPE_UNSUBSCRIBE="unsubscribe";
    public static final String WX_SERVER_EVENT_TYPE_SCAN="SCAN";
    public static final String WX_SERVER_EVENT_TYPE_LOCATION="LOCATION";
    public static final String WX_SERVER_EVENT_TYPE_CLICK="CLICK";
    public static final String WX_SERVER_EVENT_TYPE_VIEW="VIEW";
    public static final String WX_SERVER_MSG_TYPE_TEXT="text";
    public static final String WX_SERVER_MSG_TYPE_IMAGE="image";
    public static final String WX_SERVER_MSG_TYPE_LOCATION="location";
    public static final String WX_SERVER_MSG_TYPE_VOICE="voice";
    public static final String WX_SERVER_MSG_TYPE_VIDEO="video";
    public static final String WX_SERVER_MSG_TYPE_LINK="link";
    
    
    //用户积分类型
    public static final String PORTAL_USER_POINT_TYPE_SUBSCRIBE="SUBSCRIBE";
    public static final String PORTAL_USER_POINT_TYPE_SUBSCRIBE_CN_SHORT="关注公众号";
    public static final String PORTAL_USER_POINT_TYPE_SUBSCRIBE_CN_DESC="用户首次关注公众号";
    public static final String PORTAL_USER_POINT_TYPE_PAY_MONEY="PAY_MONEY";
    public static final String PORTAL_USER_POINT_TYPE_PAY_MONEY_CN_SHORT="购买";
    public static final String PORTAL_USER_POINT_TYPE_PAY_MONEY_CN_DESC="订单编号ORDER_SER_NUM消费金额TOTAL_MONEY_YUAN元赠送";
    public static final String PORTAL_USER_POINT_TYPE_REGISTER="REGISTER";
    public static final String PORTAL_USER_POINT_TYPE_REGISTER_CN_SHORT="注册";
    public static final String PORTAL_USER_POINT_TYPE_REGISTER_CN_DESC="填写手机号等信息注册会员";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_JOIN="INVITE_JOIN";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_JOIN_CN_SHORT="推广关注";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_JOIN_CN_DESC="推广朋友FRIEND_WX_NAME关注公众号";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_PAY_TIME="INVITE_PAY_TIME";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_PAY_CN_SHORT="推广消费";
    public static final String PORTAL_USER_POINT_TYPE_INVITE_PAY_CN_DESC="推广的朋友消费了金额TOTAL_MONEY_YUAN元";
    public static final String PORTAL_USER_POINT_TYPE_POINTS_DEDUCTION="POINTS_DEDUCTION";
    public static final String PORTAL_USER_POINT_TYPE_POINTS_DEDUCTION_CN_SHORT="积分抵扣";
    public static final String PORTAL_USER_POINT_TYPE_POINTS_DEDUCTION_CN_DESC="订单编号ORDER_SER_NUM时抵扣";
    public static final String PORTAL_USER_POINT_TYPE_REFUND_POINT="REFUND_POINT";
    public static final String PORTAL_USER_POINT_TYPE_REFUND_POINT_SHORT="退还积分";
    public static final String PORTAL_USER_POINT_TYPE_REFUND_POINT_CN_DESC="订单编号ORDER_SER_NUM作废时退还";
    
    public static final String PORTAL_USER_POINT_TYPE_PLAY_VR="PLAY_VR";
    public static final String PORTAL_USER_POINT_TYPE_PLAY_VR_CN_SHORT="体验VR";
    public static final String PORTAL_USER_POINT_TYPE_PLAY_VR_CN_DESC="到店体验VR虚拟游戏";
    public static final String PORTAL_USER_POINT_TYPE_SERVICE_MAKE="SERVICE_MAKE";
    public static final String PORTAL_USER_POINT_TYPE_SERVICE_MAKE_CN_SHORT="熬制中药";
    public static final String PORTAL_USER_POINT_TYPE_SERVICE_MAKE_CN_DESC="到店熬制中药服务";
    
    //微信自动回复消息类型
    public static final String WX_REPLY_MSG_TYPE_SUBSCRIBE_FIRST="SUBSCRIBE_FIRST";
    public static final String WX_REPLY_MSG_TYPE_SUBSCRIBE_AGAIN="SUBSCRIBE_AGAIN";
    public static final String WX_REPLY_MSG_TYPE_INVITE_FAILED="INVITE_FAILED";
    public static final String WX_REPLY_MSG_TYPE_POSTCARD="POSTCARD";
    public static final String WX_REPLY_MSG_TYPE_INVITE_SUCCESS="INVITE_SUCCESS";
    
    //商品分类顶级
    public static final int TOP_CATALOG_PARENT_ID=0;
    //商品模块分类
    public static final int MODEL_CATALOG_PARENT_ID=864;
    //一些默认值
    public static final int SYSTEM_SESSION_CONSOLE_DEFAULT_MINS=30;
    public static final int SYSTEM_SESSION_PORTAL_WEB_DEFAULT_MINS=30;
    public static final int SYSTEM_SESSION_PORTAL_APP_DEFAULT_MINS=10080;
    public static final int SYSTEM_SESSION_PORTAL_WECHAT_DEFAULT_MINS=10080;
    public static final int SYSTEM_SESSION_PORTAL_H5_DEFAULT_MINS=30;
    public static final int SYSTEM_SESSION_PORTAL_WCAPP_DEFAULT_MINS=10080;
    public static final int SYSTEM_SESSION_THIRD_DEFAULT_MINS=120;


    //短信模板类型
    public static  final  Integer MSG_TEMPLATE_TYPE_VERIFY_CODE = 1;//验证码类型，type值为1 详情参考t_third_message_template
    
    //邮箱模板类型
    public static final Integer MAIL_TEMPLATE_TYPE_VERIFY_CODE = 1;//验证码类型，type值为1 详情参考t_third_mail_template

    //验证码类型
    public static final String VERIFY_CODE_NOTICE_TYPE = "notice";//通知类型验证码
    public static final String VERIFY_CODE_LOGIN_TYPE = "login";//登录类型验证码
    public static final String VERIFY_CODE_REGISTER_TYPE = "Rregister";//注册类型验证码

    //发送类型是邮箱还是短信
    public static final String MSG_VERIFY_CODE = "SMS";
    public static final String MAIL_VERIFY_CODE = "MAIL";

    //一些JSON关键属性值
    public static final String ALL_TYPE_USER_VO_ACCESS_TOKEN="accessToken";
    public static final String ALL_TYPE_USER_VO_LAST_ACTIVE_TIME="lastActiveTime";
    public static final String ALL_TYPE_USER_VO_LOGON_TIME="logonTime";
    public static final String ALL_TYPE_USER_VO_OSTYPE="ostype";
    
    //数据字典描述分隔符
    public static final String DICTIONARY_DESCRIPTION_SEPERATER="-";
    //数据字典不可删除但可编辑
    public static final Integer DICTIONARY_CANNOT_DELETE_BUT_CAN_EDIT=6;
    //数据字典不可删除也不可编辑
    public static final Integer DICTIONARY_CANNOT_DELETE_CANNOT_EDIT=9;
    
   
    
    //消息类型
    public static final String PORTAL_ACCOUNT_MESSAGE_SYSTEM="SYSTEM";//系统消息
    public static final String PORTAL_ACCOUNT_MESSAGE_SYSTEM_PRACTICE="PRACTICE";//平台重大事件
    public static final String PORTAL_ACCOUNT_MESSAGE_SYSTEM_UPGRADE="UPGRADE";
    public static final String PORTAL_ACCOUNT_MESSAGE_BUSINESS="BUSINESS";//业务消息
    
 
    //记录接口调用日志接口
    public static final String SYSTEM_LOG_API_URI_PATH_FOR_PORTAL="/api/log/v01/savePortalUserVisitLogWithoutToken.do"; 
    public static final String SYSTEM_LOG_API_URI_PATH_FOR_CONSOLE="/api/log/v01/saveConsoleVisitLogWithoutToken.do"; 
    public static final String SYSTEM_LOG_API_URI_PATH_FOR_THIRD="/api/log/v01/saveThirdVisitLogWithoutToken.do"; 
    
    /*产品订单支付方式列表*/
    public static final String ORDER_PAY_TIME_PAY_NOW = "PAY_NOW";
    public static final String ORDER_PAY_TIME_PAY_NEXT = "PAY_NEXT";
    public static final String ORDER_PAY_TIME_PAY_OFFLINE = "OFFLINE";
    public static final String ORDER_PAY_TIME_PAY_BY_CARD="PAY_BY_CARD";
    /*产品订单支付状态列表*/
    public static final String ORDER_PAY_STATUS_NOT_PAY = "NOT_PAY";
    public static final String ORDER_PAY_STATUS_PAID = "PAID";
    /*产品订单状态*/
    public static final String DELIVER_STATUS_ON_THE_WAY = "ON_THE_WAY";//送货中
    public static final String DELIVER_STATUS_DELIVERED = "DELIVERED";//已送货
    public static final String DELIVER_STATUS_CONFIRMED = "CONFIRMED";//确认收货
    public static final String ORDER_STATUS_ON_GOING = "ON_GOING";//进行中
    public static final String ORDER_STATUS_APPLY_CANCEL = "APPLY_CANCEL";//申请取消该单
    public static final String ORDER_STATUS_CANCELED = "CANCELED";//确认取消
    public static final String ORDER_STATUS_NOT_EVALUATED = "NOT_EVALUATED";//未评价
    public static final String ORDER_STATUS_REJECT_CANCEL = "REJECT_CANCEL";//拒绝取消
    public static final String ORDER_STATUS_APPLY_DRAWBACK = "APPLY_DRAWBACK";//申请退款
    public static final String ORDER_STATUS_DRAWBACKED = "DRAWBACKED";//确认退款
    public static final String ORDER_STATUS_REJECT_DRAWBACK = "REJECT_DRAWBACK";//拒绝退款
    public static final String ORDER_STATUS_COMPLETE="COMPLETE";
    
    public static final String DRAWBACK_STATUS_NONE="NONE";
    public static final String DRAWBACK_STATUS_SUCCESS="SUCCESS";
    public static final String DRAWBACK_STATUS_FAIL="FAIL";
    public static final String DRAWBACK_STATUS_SECTION="SECTION";//部分退款

    /*订单状态变更类型*/
    public static final String LOG_ORDER_CHANGE_TYPE_DATA="DATA";//数据
    public static final String LOG_ORDER_CHANGE_TYPE_DELIVER="DELIVER";//货运状态变更
    public static final String LOG_ORDER_CHANGE_TYPE_PAY="PAY";//支付状态变更
    public static final String LOG_ORDER_CHANGE_TYPE_BIZ="BIZ";//业务类型
    
    /*订单长度*/
    public static final Integer ORDER_CODE_ID_LENGTH = new Integer(17);

    /*判断商家权限 1(全部接收) 2(接收新订单) 3(接收报表)*/
    public static final  String  ALL_NOTICE= "1";
    public static final  String  NEWORDER_NOTICE= "2";
    public static final  String  REPORT_NOTICE= "3";

    /*订单状态0(成功)，6(有错)，9(删除)*/
    public static final Integer ORDER_CODE_SUCCESS = new Integer(0);
    public static final Integer ORDER_CODE_FAIL = new Integer(6);
    public static final Integer ORDER_CODE_DELETE = new Integer(9);
    /*订单打印状态0(未打印)，1已打印*/
    public static final Integer ORDER_NOT_PRINT=0;
    public static final Integer ORDER_DID_PRINT=1;

    /* 退款方式 Warranty 保修 PartPrice部分退款 FullPrice 全额退款 */
    public static final String DRAWBACK_METHOD_WARRANtY = "WARRANTY";
    public static final String DRAWBACK_METHOD_PARTPRICE = "PARTPRICE";
    public static final String DRAWBACK_METHOD_FULLPRICE = "FULLPRICE";
    
//    public static final String SEND = "";
    
    public static final String TEMPLATEID_SORT = "ACTIVITY_INFORMATION";
    
    
    public static final Integer IN_MONEY=0;
    public static final Integer OUT_MONEY=1;
    
    public static final String SEND_MODULE_CONSOLE = "CONSOLE";
      //支付类型
/*    public static final String TRADE_TYPE_SERVICE = "SERVICE";
    public static final String TRADE_TYPE_DESIGN = "DESIGN";
    public static final String TRADE_TYPE_PRODUCT = "PRODUCT";
    public static final String TRADE_TYPE_DEMAND = "DEMAND";*/
    public static final String TRADE_TYPE_SIGNING = "SIGNING";
    public static final String TRADE_TYPE_PAY = "PAY";
    public static final String TRADE_TYPE_WITHDRAWAL = "WITHDRAWAL";
    public static final String TRADE_TYPE_REFUND = "REFUND";

        
    public static final String PROPERTY_DICT_ITEM_NAME="itemName";
    public static final String PROPERTY_DICT_ITEM_VALUE="itemValue";
    
    /*网易云IM*/
    public static final String NETEASE_IM_DICT_TYPE_NAME="THIRD_PARTY";
    public static final String NETEASE_IM_DICT_APIKEY_NAME="VERIFICATION-IM-AUTHCODE";
    public static final String NETEASE_IM_DICT_APIKEY_SECRET="VERIFICATION-IM-PASSWORD"; 
    
    public static final Integer HOME_BANNER_APP_MAXIMUN = 3;
    public static final String SENDMAIL = PROJECT_NAME+"_SENDEMAIL";
    public static final String SENDMESSAGE = PROJECT_NAME+"_SENDMESSAGE";
    
    /**IP安全检查**/
    public static final String IP_TYPE_PASS_LOCALHOST1="localhost";
    public static final String IP_TYPE_PASS_LOCALHOST2="127.0.0.1";
    public static final String IP_TYPE_PASS_LOCALHOST3="::1";
    public static final Integer IP_TYPE_WIHTE=1;
    public static final Integer IP_TYPE_BLACK=2;
    
    
    //统一提示语
    public static final String TOKON_INVALID_OR_NOT_LOGIN="登录超时或未登录";   
    
    public static final Integer SUBSTITUTE_TROLLEY=0;
    public static final int SUBSTITUTE_CATALOGID = 883;
    public static final Integer SUBSTITUTE_ORDER=1;
}


