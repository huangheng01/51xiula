package com.trq.aliwey.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.jranuan.aop.Clear;
import com.jranuan.core.ActionKey;
import com.jranuan.ext.kit.ConfigPropKit;
import com.jranuan.ext.kit.TimeKit;
import com.jranuan.ext.route.ControllerBind;
import com.jranuan.kit.StrKit;
import com.trq.aliwey.controller.BaseController;
import com.trq.aliwey.interceptor.LoginInterceptor;
import com.trq.aliwey.utils.StringTools;
import com.trq.aliwey.utils.ZhimaApi;

/**
 * 
 * <pre>
 * [概 要] LoginController 定义
 * 
 * [详 细] 登录控制器
 * 
 * [备 考] 无
 * 
 * [环 境] JavaSE 1.7
 * 
 * @author tan.p
 * @date 2016年4月6日上午11:14:15
 * @version 1.0
 * </pre>
 */
@Clear({ LoginInterceptor.class })
@ControllerBind(path = "login")
public class LoginController extends BaseController {

	// 登录页面
	@ActionKey("login")
	public void index() {

		this.display();
	}
	
}
