package com.trq.aliwey.interceptor;

import java.io.IOException;

import com.jranuan.aop.Interceptor;
import com.jranuan.core.ActionInvocation;
import com.jranuan.ext.kit.ConfigPropKit;
import com.trq.aliwey.controller.BaseController;

/**
 * 
 * <pre>
 * [概 要] WeChatInterceptor 定义
 * 
 * [详 细] 浏览器拦截
 * 
 * [备 考] 无
 * 
 * [环 境] JavaSE 1.7
 * 
 * @author tan.p
 * @date 2016年3月1日下午12:01:16
 * @version 1.0
 * </pre>
 */
public class WeChatInterceptor implements Interceptor {
	
	public void intercept(ActionInvocation ai) {
		BaseController c = (BaseController) ai.getController();
		// 判断是否是微信浏览器
		String ua = c.getRequest().getHeader("user-agent").toLowerCase();
		if(ConfigPropKit.getToBool("weixin.browser", true)){
			if (ua.indexOf("micromessenger") < 0) {
				try {
					c.getResponse().setCharacterEncoding("GB2312");
					c.getResponse().getWriter().print("<script>alert('请在微信浏览器中打开！');</script>");
				} catch (IOException e) {
					
				}
			} else {
				ai.invoke();
			}
		} else {
			ai.invoke();
		}
	}
}
