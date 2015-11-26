package com.handpay.ibenefit;

/**
 * 项目全局常量定义
 *
 * @author bob.pu
 *
 */
public interface IBSConstants {


	/** 发送信息模板加载 */
	// 获取手机验证码
	public static final String SMS_MOBILE_VALIDATE_CODE = "mobileCode";
	// 获取手机验证码(官网下载电子卡券模板)
	public static final String SMS_MOBILE_DOWNLOAD_CARDINFO = "DOWN_VIRTUAL_CARDINFO";
	//手机验证找回登陆密码模板
	public static final String SMS_MOBILE_RETRIEVE_LOGIN_PASSWORD = "RETRIEVE_LOGIN_PASSWORD";
	//手机验证找回支付密码模板
	public static final String SMS_MOBILE_RETRIEVE_PAYMENT_PASSWORD = "RETRIEVE_PAYMENT_PASSWORD";
	//游客下单成功发送短信
	public static final String SMS_MOBILE_CREATE_ORDER_SUCCESS = "CREATE_ORDER_SUCCESS";
    //员工端下单购买体检电子兑换券支付成功发送生成卡密的短信
	public static final String SMS_MOBILE_CREATE_ORDER_CARD = "CREATE_ORDER_CARD";
	//提供体检预约后丢失卡密的用户找回密码短信
	public static final String SMS_MOBILE_PHYSICAL_CARD_PASSWORD = "PHYSICALSUBSCIBE_CARD_PASSWORD";
	//手机验证找回登陆密码模板
    public static final String EMAIL_RETRIEVE_LOGIN_PASSWORD = "EMAIL_RETRIEVE_LOGIN_PASSWORD";
    //手机验证找回支付密码模板
    public static final String EMAIL_RETRIEVE_PAYMENT_PASSWORD = "EMAIL_RETRIEVE_PAYMENT_PASSWORD";
    //体检预约及改期成功后
    public static final String SMS_PHYSICAL_SUCCESS = "SMS_PHYSICAL_SUCCESS";
    //员工福利商品发货邮件通知
    public static final String  EMAIL_WELFARE_PRODUCT_SEND="EMAIL_WELFARE_PRODUCT_SEND";
    //hr购买积分成功选择发短息则发送短信
    public static final String SMS_MOBILE_HR_POINT="SMS_MOBILE_HR_POINT";
	//hr下单成功发送邮件
    public static final String EMAIL_HR_CREATE_ORDER="EMAIL_HR_CREATE_ORDER";
    //体检预约及改期成功邮件模板
    public static final String EMAIL_PHYSICAL_SUCCESS="EMAIL_PHYSICAL_SUCCESS";
    //用户体检预约日前一天，系统自动发出检前提醒通知短信&体检须知
    public static final String SMS_ONEDAY_BEFORE_PHYSICAL="SMS_ONEDAY_BEFORE_PHYSICAL";
    //用户体检预约日前一天，系统自动发出检前提醒通知邮件&体检须知
    public static final String EMAIL_ONEDAY_BEFORE_PHYSICAL="EMAIL_ONEDAY_BEFORE_PHYSICAL";
    //用户电子体检报告通知，一旦系统生成用户报告，即发出查询通知短信。
    public static final String SMS_UP_PHYSICAL_PREPORT="SMS_UP_PHYSICAL_PREPORT";
    //用户电子体检报告，一旦系统生成用户报告，即发出邮件查询通知。
    public static final String EMAIL_UP_PHYSICAL_REPORT="EMAIL_UP_PHYSICAL_REPORT";
    //购买第三方电子卡券OTO的发送短信
    public static final String SMS_THIRD_OTO_ELECTRONIC="SMS_THIRD_OTO_ELECTRONIC";
    //用户纸质体检报告通知，一旦物流单号生成并发货后，即发出报告物流短信通知
    public static final String SMS_PHYSICAL_REPORT_SEND="SMS_PHYSICAL_REPORT_SEND";
   //用户纸质体检报告通知，一旦物流单号生成并发货后，即发出报告物流邮件通知
    public static final String EMAIL_PHYSICAL_REPORT_SEND="EMAIL_PHYSICAL_REPORT_SEND";
    //易到用车领取卡券
    public static final String GET_CARD_VOUCHER="GET_CARD_VOUCHER";


	//HR角色管理菜单ID
	public static final Long MENU_ADMIN_ROLE_PERMISSION = 10000017L;
	//HR管理帐号管理菜单ID
	public static final Long MENU_ADMIN_USER_PERMISSION = 10000015L;
	//HR帐号密码设置ID
	public static final Long MENU_ADMIN_PASSWORD_PERMISSION = 10000018L;

	//福利管理
	public static final Long MENU_SHOW_WELFARE = 9999999L;
	//激励管理
	public static final Long MENU_SHOW_EXCITATION = 10000004L;

	//企业开设功能
	public static final int COMPANY_FUNCTION_SHOW_LOGO = 1;
	public static final int COMPANY_FUNCTION_SHOW_STAFF_LEVEL = 4;
	public static final int COMPANY_FUNCTION_INNER_COMPANY = 6;
	public static final int COMPANY_FUNCTION_SHOW_WELFARE = 9999999;
	public static final int COMPANY_FUNCTION_SHOW_EXCITATION = 10000004;
	public static final int COMPANY_FUNCTION_SHOW_REPORT = 10000010;

	//HR首页链接控制
	public static final long COMPANY_INDEX_INFOMATION = 10000007;
	public static final long COMPANY_INDEX_QUESTIONNAIRE = 10000009;
	public static final long COMPANY_INDEX_DEPARTMENT = 10000012;
	public static final long COMPANY_INDEX_STAFF = 1027;
	public static final long COMPANY_INDEX_PERMISSION = 10000017;
	public static final long COMPANY_INDEX_BUY_POINTS = 10000000;
	public static final long COMPANY_INDEX_DISTRIBUTE = 10000001;

	/** 企业来源*/
	// 在线签约
	public static final int ONLINE_CONTRACT = 1;
	// 申请注册
	public static final int APPLY_REGISTRATION = 2;
	// 后端申请
	public static final int BACK_APPLY = 3;

	/** 企业/供应商审核状态**/
	//待审核
	public static final int VERIFY_STATUS_ING = 0;
	//草稿
	public static final int VERIFY_STATUS_DRAFT = 1;
	//审核未通过
	public static final int VERIFY_STATUS_FAIL = 2;
	//审核通过
	public static final int VERIFY_STATUS_SUCCESS = 3;
	//合同过期
	public static final int VERIFY_STATUS_CONTRACT_OUT = 4;
	//终止合作
	public static final int VERIFY_STATUS_COOPERATION_STOP = 5;

	// 预算等级
	public static final int PRODUCT_BUDGET_LEVEL = 1603;
	// 子订单状态
	public static final int SUB_ORDER_STATE = 1400;
	// 支付方式
	public static final int ORDER_PAYMENT_WAY = 1403;

	// 文件上传路径主目录
	public static final String FILE_HOME = "files";

	// 用户状态
	// 未启用
	public static final int USER_STATUS_DISABLED = 0;
	// 启用
	public static final int USER_STATUS_ENABLED = 1;
	// 已冻结
	public static final int USER_STATUS_LOCKED = 2;
	// 已删除
	public static final int USER_STATUS_DELETED = 3;

	// 用户类型
	// IBS运营人员
	public static final int USER_TYPE_IBS_OPERATOR = 1;
	// 企业管理员
	public static final int USER_TYPE_COMPANY_ADMIN = 2;
	// 企业HR
	public static final int USER_TYPE_COMPANY_HR = 3;
	// 供应商管理员
	public static final int USER_TYPE_SUPPLIER_ADMIN = 4;
	// 供应商运营人员
	public static final int USER_TYPE_SUPPLIER_OPERATOR = 5;
	// 企业员工
	public static final int USER_TYPE_COMPANY_EMPLOYEE = 6;

	// 角色code
	// 客户经理
	public static final String ROLE_CODE_AM = "QYAM";

	//生活服务类订单类型  字典编码
	public static final int LIFE_ORDER_TYPE = 1409;

	// 平台类型
	// 运营端
	public static final int PLATEFORM_ADMIN = 1;
	// 官网
	public static final int PLATEFORM_HOME = 2;
	// 供应端
	public static final int PLATEFORM_SUPPLIER = 3;
	// HR（企业）
	public static final int PLATEFORM_HR = 4;
	// 员工端
	public static final int PLATEFORM_EMPLOYEE = 5;

	// 微信
	public static final int PLATEFORM_WEIXIN= 6;
	//第一级分类
	public static final int FIRST_LAYER= 1;
	// 订单类型
	// 购买积分
	public static final int ORDER_TYPE_BUY_POINT = 1;
	// 积分购买
	public static final int ORDER_TYPE_POINT_BUY = 2;
	// 福利兑换
	public static final int ORDER_TYPE_EXCHANGE_WELFARE = 3;
	// 现金购买
	public static final int ORDER_TYPE_CASH_BUY = 4;
	// 年度福利
	public static final int ORDER_TYPE_YEARS_WELFARE = 5;
	// 混合购买
	public static final int ORDER_TYPE_MIXED_BUY = 6;
    //体检预约
	public static final int ORDER_TYPE_PHSYCAL_APPOINTMENT = 7;



	// 用户来源
	// 后台新建
	public static final int IBS_ADMIN_CREATED = 1;
	// HR新建
	public static final int COMPANY_HR_CREATED = 2;
	// 供应商新建
	public static final int COMPANY_SUPPLIER_CREATED = 3;

	// 是否
	public static final int STATUS_YES = 1;
	public static final int STATUS_NO = 0;

	// 退换货类型
	public static final int ORDER_PRODUCT_RETURN = 1;
	public static final int ORDER_PRODUCT_EXCHANGE = 2;

	// 异常订单原因
	//短信
	public static final int EXCEPTION_REASON_SMS = 1;
	//第三方卡密
	public static final int EXCEPTION_REASON_CARDSEND = 2;
	//生成卡密
	public static final int EXCEPTION_REASON_ADDCARD = 3;

	// 异常订单状态
	//已处理
	public static final int EXCEPTION_STATUS_PROCESSED = 1;
	//电子卡券发送失败
	public static final int EXCEPTION_STATUS_ELECTRONIC_DOCUMENT = 2;
	//短信发送失败
	public static final int EXCEPTION_STATUS_SMS_ERROR = 3;
	//充值失败
	public static final int EXCEPTION_STATUS_RECHARGE_ERROR = 4;
    //支付宝回调金额不一致
	public static final int EXCEPTION_STATUS_ALIPAY_RECHAREGE_NOTEQAUL = 5;
	//支付宝回调验证失败
	public static final int EXCEPTION_STATUS_ALIPAY_CHECK_ERROR = 6;

	// 供应商
	public static final int SUPPLIER = 1;
	// 品牌
	public static final int BRAND = 2;
	// 商品分类
	public static final int PRODUCT_CATEGORY = 3;
	// 生活服务
	public static final int LIFE_SERVICE = 4;
	// 商品
	public static final int PRODUCT = 5;
	// 福利套餐
	public static final int WELFARE_PACKAGE = 6;
	// 体检套餐
	public static final int PHYSICAL_PACKAGE = 7;

	/** 订单商品类别 */
	// 购买积分
	public static final int ORDER_PRODUCT_TYPE_POINTS = 0;
	// 福利套餐
	public static final int ORDER_PRODUCT_TYPE_WELFARE = 1;
	// 体检套餐
	public static final int ORDER_PRODUCT_TYPE_PHYSICAL = 2;
	// SKU商品
	public static final int ORDER_PRODUCT_TYPE_SKU = 3;
	// 生活服务
	public static final int ORDER_PRODUCT_TYPE_LIFE_SERVICE = 4;
	// 发积分
    public static final int ORDER_PRODUCT_TYPE_GRANT_POINTS = 5;


	//线上支付渠道
	//支付宝
	public static final int ONLINE_PAY_ALIPAY=1;
	//积分
	public static final int ONLINE_PAY_POINT=2;
	//微信支付
	public static final int ONLINE_PAY_WECHAT=3;
	//银联
	public static final int ONLINE_PAY_UNIONPAY=4;


	/**
	 * 主套餐
	 */
	public static final int MAIN_PACKAGE_TYPE = 0;

	/**
	 * 加项套餐
	 */
	public static final int ADDTIONAL_PACKAGE_TYPE = 1;



	/**  表：IBS_ORDER - ORDER_STATUS 订单状态  */
	//字典表里 订单状态的 parentId
	public static final Long ORDER_STATE_PARENTID_IN_DIC = 50051L;

	// 待支付
	public static final int ORDER_TO_BE_PAID = 1;
	// 待发货
	public static final int ORDER_TO_BE_SHIPPED = 2;
	// 已发货(实物)
	public static final int ORDER_SHIPPED_IN_KIND = 3;
	// 待发放
	public static final int ORDER_TO_BE_ISSUED_VIRTUAL = 4;
	// 已发放(虚拟)
	public static final int ORDER_ISSUED_IN_KIND = 5;
	// 取消订单
	public static final int ORDER_CANCEL = 6;
	// 系统作废
	public static final int ORDER_SYSTEMS_OBSOLETE = 7;
	// 退货
	public static final int ORDER_RETURN = 8;
	// 已结算
	public static final int ORDER_SETTLED = 9;
	// 已发货(虚拟)
	public static final int ORDER_SHIPPED_VIRTUAL = 10;
	// 交易成功
	public static final int ORDER_TRADING_SUCCESS = 11;
	// 待预约
	public static final int ORDER_PENDING_APPOINTMENT = 12;
	// 已预约
	public static final int ORDER_RESERVED = 13;
	// 已到检
	public static final int ORDER_CHECKED = 14;
	// 报告已出
	public static final int ORDER_REPORT_OUT = 15;
	// 报告寄出
	public static final int ORDER_REPORT_SEND = 16;
	// 已付款
	public static final int ORDER_PAID = 17;
	//处理中
	public static final int ORDER_PROCESSING=18;
	//已完成
	public static final int ORDER_COMPLETED=19;
	//已领取（积分）
	public static final int ORDER_RECEIVED=20;
	//已兑换(福利券)
	public static final int ORDER_CONVERTED=21;
	//取消兑换
	public static final int ORDER_CANCEL_EXCHANGE=22;
	//处理失败
	public static final int ORDER_PROCESS_FAILED=23;
	//已退款
	public static final int ORDER_REFUND=24;

	/**  表：IBS_ORDER - ORDER_STATUS 生活服务类订单状态     Start*/
	//待支付
	public static final int Life_Order_TO_BE_PAID=1;
	//处理中
	public static final int Life_Order_PROCESSING=18;
	//处理失败
	public static final int Life_Order_PROCESS_FAILED=23;
	//已退款
	public static final int Life_Order_REFUND=24;
	//交易成功
	public static final int Life_Order_TRADING_SUCCESS=11;
	//取消订单
	public static final int Life_Order_CANCEL=6;
	//系统作废
	public static final int Life_Order_SYSTEMS_OBSOLETE=7;
	//已结算
	public static final int Life_Order_SETTLED=9;

	/**  表：IBS_ORDER - ORDER_STATUS 生活服务类订单状态     End*/

	// 退货订单状态
	// 待审核
	public static final int CHANGE_ORDER_PENDING = 1;
	// 审核通过
	public static final int CHANGE_ORDER_AGREE = 2;
	// 拒绝
	public static final int CHANGE_ORDER_REFUSE = 3;
	// 待收货
	public static final int CHANGE_ORDER_INBOUND = 4;
	// 已发货（换货）
	public static final int CHANGE_ORDER_SHIPPED = 5;
	// 已收货
	public static final int CHANGE_ORDER_RECEIVED = 6;
	// 已退款（退货）
	public static final int CHANGE_ORDER_REFUNDED = 7;
	// 已结算
	public static final int CHANGE_ORDER_SETTLED = 8;
	// 已完成
	public static final int CHANGE_ORDER_FINISHED = 9;

	// 退货订单状态操作选择列表类型
	// 全部
	public static final int CHANGE_ORDER_TYPE_ALL = 1;
	// 待审核
	public static final int CHANGE_ORDER_TYPE_PENDING = 2;
	// 待收货
	public static final int CHANGE_ORDER_TYPE_INBOUND = 3;
	// 已拒绝
	public static final int CHANGE_ORDER_TYPE_REFUSE = 4;
	// 待发货
	public static final int CHANGE_ORDER_TYPE_RECEIVING = 5;
	// 已完成
	public static final int CHANGE_ORDER_TYPE_FINISH = 6;

	// 确认收货
	// 可继续销售（商品库存+1）
	public static final int CHANGE_ORDER_CONTINUE_SELL = 1;
	// 不可继续销售
	public static final int CHANGE_ORDER_NOT_CONTINUE_SELL = 2;

	// 订单来源
	// 企业HR端
	public static final int ORDER_SOURCE_HR = 1;
	// 企业员工端
	public static final int ORDER_SOURCE_STAFF = 2;
	// 官网体验区
	public static final int ORDER_SOURCE_HOME = 3;
	// 客服下单
	public static final int ORDER_SOURCE_ADMIN = 4;
	// 微信下单
	public static final int ORDER_SOURCE_WEIXIN = 5;

	// 是否可以退換貨
	// 可退换貨
	public static final int ORDER_RETURN_EXCHANGE_GOODS = 1;
	// 不可
	public static final int ORDER_NO_RETURN_EXCHANGE_GOODS = 0;




	// 商品类型

	// 普通商品
	// 实体商品
	public static final int PRODUCT_TYPE_PHYSICAL_SKU = 1;
	// 实体卡券
	public static final int PRODUCT_TYPE_PHYSICAL_CARD_RELL = 2;
	// 电子卡券
	public static final int PRODUCT_TYPE_ELECTRON_CARD_RELL = 3;
	// IBS福利套餐
	// 福利实体兑换券
	public static final int PRODUCT_TYPE_PHYSICAL_EXCHANGE_RELL = 21;
	// 福利电子兑换券
	public static final int PRODUCT_TYPE_ELECTRON_EXCHANGE_RELL = 22;
	// 体检商品
	// 体检实体兑换券
	public static final int PHYSICAL_MATERIAL_EXCHANGE = 31;
	// 体检电子兑换券
	public static final int PHYSICAL_ELECTRONICS_EXCHANGE = 32;
	// 生活服务
	public static final int PRODUCT_TYPE_LIFE_SERVICE = 41;

	// 子订单类型
	// 实物
	public static final int SUB_ORDER_TYPE_PHYSICAL = 1;
	// 虚拟
	public static final int SUB_ORDER_TYPE_ELECTRON = 2;

	// 付款方式
	// 线下付款
	public static final int PAY_WAY_OFF_LINE = 1;
	// 线上付款
	public static final int PAY_WAY_ON_LINE = 2;

	// 线上支付渠道
	// 积分支付
	public static final int PAY_WAY_ON_LINE_INTEGRAL = 1;
	// 支付宝支付
	public static final int PAY_WAY_ON_LINE_ALIPAY = 2;
	// 积分+支付宝支付
	public static final int PAY_WAY_ON_LINE_INTEGRAL_ALIPAY = 3;

	// 订单更改状态subOrder表的orderEditState字段
	// 更改收货地址
	public static final int CHANGE_ORDER_RECEIVE_ADDRESS = 1;
	// 无
	public static final int NOT_CHANGE_ORDER_RECEIVE_ADDRESS = 2;
	//更改已经处理
	public static final int CHANGE_ORDER_RECEIVE_ADDRESS_HANDLED=0;


	// 状态
	// 有效
	public static final int EFFECTIVE = 1;
	// 无效
	public static final int INVALID = 2;

	// 公告类型
	// 公告
	public static final int HR_NOTICE = 1;
	// 活动
	public static final int HR_ACTIVITY = 2;

	// 套餐上架状态 0：补货中 1：待上架 2：上架中 3：已下架
	public static final int REPLENISHMENTI_ING = 0;
	public static final int SHELVES_WAIT = 1;
	public static final int SHELVES_ING = 2;
	public static final int SHELF_OFF = 3;
	public static final int PACKAGE_EFFECTIVE = 4;
	public static final int PACKAGE_INVALID  = 5;

	//登录页面
	public static final String HOME_LOGIN_BANNER = "02_02";

	// 员工端的首页的福利套餐编码
	public static final String EMPLOYEE_HOME_WELFARE_PACKAGE = "05_05";
	// 体验专区
	public static final String HOME_EXPERIENCE_BANNER = "02_04";
	// 体验专区(more)
	public static final String HOME_EXPERIENCE_BANNER_MORE = "02_09";

	// 体验专区	 左、中、右   广告
	public static final String HOME_EXPERIENCE_RCMD_AD_LEFT = "02_06";
	public static final String HOME_EXPERIENCE_RCMD_AD_MIDDLE = "02_07";
	public static final String HOME_EXPERIENCE_RCMD_AD_RIGHT = "02_08";
	//我要推荐
	public static final String HOME_RECOMMENDATION_AD = "02_17";
	//联系我们
	public static final String HOME_CONTACTUS_AD = "02_15";
	//企业申请
	public static final String HOME_COMPANY_APPLY_AD = "02_03";
	//i体检
	public static final String HOME_COMPANY_PHCHCK_AD = "02_19";
	//订单查询
	public static final String HOME_ORDER_QUERY = "02_12";
	//当季推荐套餐
	public static final String HOME_RECMD_PACKAGE = "02_09";
	//其他热门主题
	public static final String HOME_OTHER_TOPIC = "02_14";

	// 套餐类型
	public static final int EMPLOYEE_HOME_WELFARE_PACKAGE_TYPE = 1;

	// 信息发布状态
	// 草稿
	public static final int INFOMATION_DRAFT = 1;
	// 发布中
	public static final int INFOMATION_PUBLISH = 2;
	// 已过期
	public static final int INFOMATION_DELAY = 3;

	// 问卷调查状态(草稿:1,投票中:2,投票已锁定:3,已结束:4)
	// 草稿
	public static final long QUESTION_DRAFT = 1;
	// 投票中
	public static final long QUESTION_VOTE = 2;
	// 投票已锁定
	public static final long QUESTION_VOTE_LOCK = 3;
	// 已结束
	public static final long QUESTION_END = 4;

	// 福利套餐类型
	// 项目大类
	public static final int WELFARE_PACKAGE_PARENT_ITEM = 1;
	// 项目分类
	public static final int WELFARE_PACKAGE_SUB_ITEM = 2;

	// 平台消息
	// 全平台
	public static final String PLATFORM_NOTICE_ALL_USER = "all";

	// 购物车商品类别
	public static final int CART_PRODUCT_TYPE_PRODUCT = 1;// sku商品
	public static final int CART_PRODUCT_TYPE_PACKAGE = 2;// 套餐

	/** 项目类型 1：福利 2：激励 */
	// 福利
	public static final int WELFAREITEM_TYPE_WELFARE = 1;
	// 激励
	public static final int WELFAREITEM_TYPE_EXCITATION = 2;

	/** 项目级别 1:项目大类 2:项目分类 */
	// 项目大类
	public static final int WELFAREITEM_GRADE_CLASS = 1;
	// 项目分类
	public static final int WELFAREITEM_GRADE_CLASSIFY = 2;

	// 用户公告标识(1:未读,2:已读,3:不再显示)
	//
	public static final int USER_INFOMATION_FLAG_UNREAD = 1;
	//
	public static final int USER_INFOMATION_FLAG_READ = 2;
	//
	public static final int USER_INFOMATION_FLAG_NOT_SHOW = 3;

	/** 套餐表套餐类型标识 **/
	// 福利套餐
	public static final int WELFARE_PACKAGE_TYPE_WELFARE = 0;
	// 体检套餐
	public static final int WELFARE_PACKAGE_TYPE_PHYSICAL = 1;

	// 未读
	public static final int UNREAD = 1;
	// 已读
	public static final int READ = 2;


	// 验证码类型
	// 修改手机
	public static final int VALIDATE_CODE_TYPE_UPDATE_MOBILE = 1;
	// 绑定手机
	public static final int VALIDATE_CODE_TYPE_BIND_MOBILE = 2;
	// 修改支付密码
	public static final int VALIDATE_CODE_TYPE_UPDATE_PAY_PASSWORD = 3;
	// 礼品兑换虚拟商品下载卡密
	public static final int VALIDATE_CODE_TYPE_DOWNLOAD_CARDINFO = 4;
	//修改邮箱
	public static final int VALIDATE_CODE_TYPE_UPDATE_EMAIL = 5;
	//找回登陆密码
	public static final int VALIDATE_CODE_TYPE_RETRIEVE_LOGIN_PASSWORD = 5;
	//找回支付密码
	public static final int VALIDATE_CODE_TYPE_RETRIEVE_PAYMENT_PASSWORD = 6;
	//重发电子券卡密
	public static final int VALIDATE_CODE_TYPE_RESET_ELECTRON = 7;
    //易到用车，领取卡密
	public static final int VALIDATE_CODE_TYPE_RECEIVE_CARD=8;
	//微信端-送礼方案
	public static final int VALIDATE_CODE_TYPE_GIFT_COLLECT = 9 ;
	
	//HR端订单发放类型
	//在线发放1
	public static final int ORDER_GRANT_ONLINE = 1 ;
	//线下发放2
	public static final int ORDER_GRANT_OFFLINE = 2 ;




	/***************************员工端  Start**********************************/

	/**收货地址是否默认 **/
	//默认收货地址标志位
	public static final int GOODS_RECEIPT_ADDR_DEFAULT = 1;
	//非默认收货地址标志位
	public static final int GOODS_RECEIPT_ADDR_NON_DEFAULT = 2;

	/**激励活动名目类型 **/
	//运营端推荐名目类的
	public static final int ACTIVITY_ITEM_TYPE_RECOMMEND = 1;
	//HR自定义名目类的
	public static final int ACTIVITY_ITEM_TYPE_CUSTOM = 2;

	/**激励活动是否可报名 **/
	//普通激励活动，不可报名
	public static final int ACTIVITY_TYPE_NO_REGISTER = 1;
	//可报名激励活动
	public static final int ACTIVITY_TYPE_REGISTER = 2;
	//未报名
	public static final int ACTIVITY_TYPE_NOT_REGISTERED = 3;
	//已报名
	public static final int ACTIVITY_TYPE_REGISTERED = 4;

	/**激励活动 奖励类型 **/
	//单项奖励
	public static final int SINGLE_REWARD_TYPE = 1;
	//多项奖励
	public static final int MULTITERM_REWARD_TYPE = 2;

	//未领取
	public static final short NOT_RECEIVE = 0;
	//领取
	public static final short RECEIVE = 1;
	//待确认
	public static final short UNCONFORM = 2;

	//未删除
	public static final short NOT_DELETE = 0;
	//删除
	public static final short DELETE = 1;
	/***************************员工端  End**********************************/


	//订单投诉状态
	//已投诉
	public static final int COMPLAINT_STATUS_OPEN = 1;
	//处理中
	public static final int COMPLAINT_STATUS_DISPOSE = 2;
	//已结案
	public static final int COMPLAINT_STATUS_CLOSE = 3;

	//体检套餐供应商名称
	//爱康国宾
	public static final String PHYSICAL_SUPPLIER_AK = "爱康国宾";
	//美年大健康
	public static final String PHYSICAL_SUPPLIER_MN = "美年大健康";

	/** 供应商 类型  */
	//体检
	public static final int SUPPLIER_TYPES_PHYSICAL = 1;
	//保险
	public static final int SUPPLIER_TYPES_INSURANCE = 2;
	//生活服务类
	public static final int SUPPLIER_TYPES_LIFE_SERVICE = 3;
	//其他
	public static final int SUPPLIER_TYPES_OTHER = 4;

	/** 套餐类型    表：IBS_WELFARE_PACKAGE --WP_CATEGORY_TYPE 字段   add by huazi  */
	//弹性套餐
	public static final int WELFARE_PACKAGE_WP_CATEGORY_TYPE_ELASTIC = 1;
	//固定套餐
	public static final int WELFARE_PACKAGE_WP_CATEGORY_TYPE_FIXED=2;


	/** 套餐类型    表：IBS_WELFARE_PACKAGE --STOCK_TYPE 字段   add by huazi  */
	//实体兑换券
	public static final int WELFARE_PACKAGE_WP_STOCK_TYPE_ENTITY = 1;
	//电子兑换券
	public static final int WELFARE_PACKAGE_WP_STOCK_TYPE_ELECTRON =2;

	//性别
	//男
	public static final int SEX_MAN = 1;
	//女
	public static final int SEX_WOMAN = 0;

	//婚姻状况
	//已婚
	public static final int IS_MARRIED = 1;
	//未婚
	public static final int IS_UNMARRIED = 0;




	/** 支付方式 */
	public static final int ONLINE_PAY = 1;//线下支付
	public static final int OFFLINE_PAY = 2;//线上支付

















	/** --------------字典数据常量---------------- */
	//子订单状态 字典ID
	public static final int SUB_ORDER_STATUS_CONSTANT = 1400;
	//积分 发放对象 字典ID
	public static final int POINTS_GRANT_OBJECT_CONSTANT = 1220;
	//性别 字典ID
	public static final int SEX_CONSTANT = 100;
	//投诉处理结果
	public static final int COMPLAINT_STATUS = 1118;
	//积分发放状态
	public static final int GRANT_POINTS_STATUS = 1125;



	/**
	 * 离职后员工账号状态,1是有效,0是冻结
	 */
	public static final int STAFF_QUIT_TYPE_NORMAL = 1;
	public static final int STAFF_QUIT_TYPE_BLOCKED = 0;

	/**
	 * 员工离职状态，1在职，2离职
	 */
	public static final int STAFF_STATUS_ON = 1;
	public static final int STAFF_STATUS_OFF = 2;

	/**
	 * 卡号状态，0 待激活 ，1激活，2冻结，3已过期，4已使用， 5已作废，6已删除, 7待发放
	 */
	public static final int CARD_TO_ACTIVATION = 0;
	public static final int CARD_ACTIVATION = 1;
	public static final int CARD_FREEZE = 2;
	public static final int CARD_EXPIRED = 3;
	public static final int CARD_USED = 4;
	public static final int CARD_VOID = 5;
	public static final int CARD_DELETED = 6;
	public static final int CARD_SEND=7;

	/**
	 * 广告、新闻公告状态，1草稿 ，2已发布，3待审核，4审核不通过，5待发布，6已下线
	 */
	public static final int ADVERT_DERFT = 1;
	public static final int ADVERT_PUBLISHED = 2;
	public static final int ADVERT_TO_VERIFY = 3;
	public static final int ADVERT_NO_VERIFY = 4;
	public static final int ADVERT_TO_PUBLISH =5;
	public static final int ADVERT_DOWN =6;

	//生活服务类
	//手机充值
	public static final int LIFE_SERVICE_PHONE_RECHARGE=1;
	//交通罚款
	public static final int LIFE_SERVICE_TRAFFIC_FINES=2;
	//信用卡还款
	public static final int LIFE_SERVICE_CREDIT_PAYMENT=3;
	//水电煤缴费
	public static final int LIFE_SERVICE_WATER_EXPEND=4;
	//游戏充值
	public static final int LIFE_SERVICE_GAME_RECHARGE=5;
	//手机流量包
	public static final int LIFE_SERVICE_PHONE_FLOWPACK=6;
	//q币值
	public static final int LIFE_SERVICE_QB_RECHARGE=7;
	//支付宝充值
	public static final int LIFE_SERVICE_ALIPAY_RECHARGE=8;


	/***************************微信端  Start**********************************/
	//福利兑换完成，虚拟商品或套餐，发送虚拟卡券的卡密
	public static final String SMS_MOBILE_VIRTUAL_CARD_WEIXIN = "WEIXIN_SEND_VIRTUAL_CARDINFO" ;

	//体检门店
	public static final int SHOP_TYPE_PHYSICAL = 1;

	/******************商品电子卡券来源**************************/
	//ICS卡券
	public static final int PRODUCT_STOCK_SOURCE_ICS=1;
	//第三方OTO卡
	public static final int PRODUCT_STOCK_SOURCE_THIRD_OTO=2;

	/******************商品电子卡券类型**************************/
	//IbS卡券
	public static final int PRODUCT_TYPE_IBS=1;
	//第三方OTO卡
	public static final int PRODUCT_TYPE_THIRD_OTO=2;

	//身份类型
	public static final int IDENTITY_TYPE=1;//身份证
	public static final int OFFICER_TYPE=2;//军官证
	public static final int PASSPORT_TYPE=3;//护照

	/**
	 * 表示针对所有企业
	 */
	public static final int ALL_COMPANY=0;
	/*
	 * 体检报告是否已发信息，邮件
	 */
	public static final int IS_SEND_REPORT_MESSAGE=1;
	public static final int NO_SEND_REPORT_MESSAGE=0;

	public static final int IS_SEND_REPORT_EMAIL=1;
	public static final int NO_SEND_REPORT_EMAIL=0;

	/**
	 * 体检预约是否取消
	 */
	public static final int PHYSICAL_SUBSCRIBE_CANCEL = 1;
	public static final int PHYSICAL_SUBSCRIBE_NOT_CANCEL = 0;

	//美年到检状态
	public static final String PHYSICAL_NO_CHECK = "未到检";

	public static final String PHYSICAL_CHECKED = "已到检";

	public static final String REPORT_NO_UP = "未出报告";

	public static final String REPORT_UPED = "出报告";

	//体检公司编号
	public static final String PHYSICAL_COMPANY_CODE = "2016545";




	/** 成功失败标志（1：成功；0：失败） */
	public static final String RESULT_CODE_SUC="1";
	public static final String RESULT_CODE_FAILURE="0";






	/******************begin 微信端消息推送模板类型**************************/
	//订单发货通知
	public static final int ORDER_DELIVERY_NOTICE_MSG = 1 ;
	//卡密发送通知
	public static final int VIRTUAL_CARD_NOTICE_MSG = 2 ;
	//密码重置提醒
	public static final int PASSWORD_RESET_MSG = 3 ;
	//体检预约提醒
	public static final int PHYSILCAL_APPOINTMENT_MSG = 4;
	//报告完成通知
	public static final int REPORT_FINISH_MSG = 5 ;
	//账号锁定提醒
	public static final int ACCOUNT_LOCKED_MSG = 6 ;
	//到期提醒通知
	public static final int WELFARE_EXPIRED_REMINDER_MSG = 7 ;
	//积分变动通知
	public static final int WELFARE_RECEIVE_POINT_MSG = 8 ;

	//微信参数字体颜色值
	public static final String WEIXIN_FONT_COLOR = "#2828FF" ;
	//微信参数字体颜色值
	public static final String WEIXIN_FONT_SPECIAL_COLOR = "#000000" ;

	/******************end 微信端消息推送模板类型**************************/

	
	/** 礼品兑换或体检预约 详情界面 ，点击返回按钮，来源界面标识     */
	//礼品兑换-卡密首页
	public static final int GO_BACK_NORMAL = 0 ;
	//我的福利
	public static final int GO_BACK_MY_WELFARE = 1 ;
	//礼品领取中心-列表
	public static final int GO_BACK_GIFT_CENTER = 2 ;
	//礼品领取中心-首页
	public static final int GO_BACK_GIFT_CENTER_INDEX = 3 ;
	//我的福利-体检
	public static final int GO_BACK_MY_WELFARE_PHYSICAL = 4 ;
	//订单列表
	public static final int GO_BACK_ORDER_INFO = 5 ;
	
	
	// 体检报告类型  ：美年
	public static final int PHYSICAL_REPORT_TYPE_MEINIAN = 1;
	// 体检报告类型  ：爱康	
	public static final int PHYSICAL_REPORT_TYPE_AIKANG = 2;
	//体检报告类型  ：其他
	public static final int PHYSICAL_REPORT_TYPE_OTHER = 3;
	
}
