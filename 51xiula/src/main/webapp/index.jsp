<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String basePath = com.jranuan.ext.kit.ConfigPropKit.get("basePath");
String redirectURL = basePath+"/web/login/login";
response.sendRedirect(redirectURL);
%>