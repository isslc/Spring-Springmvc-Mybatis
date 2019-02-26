<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%
    //权限验证
    if (session.getAttribute("currentUser") == null) {
        response.sendRedirect("../login.html");
        return;
    }
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/font-awesome/css/font-awesome.min.css">
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo"><a href="/admin" style="color:#009688;">
            陈思龙的博客
        </a>
        </div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="/" target="_blank">前台</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">新建</a>
                <dl class="layui-nav-child">
                    <dd><a href="/admin/article/insert">文章</a></dd>
                    <dd><a href="/admin/page/insert">页面</a></dd>
                    <dd><a href="/admin/category/insert">分类</a></dd>
                    <dd><a href="/admin/notice/insert">公告</a></dd>
                    <dd><a href="/admin/link/insert">链接</a></dd>
                </dl>
            </li>
        </ul>
           <ul class="layui-nav layui-layout-right">
               <li class="layui-nav-item">

                   <dl class="layui-nav-child">
                       <dd><a href="#">基本资料</a></dd>
                   </dl>
               </li>
               <li class="layui-nav-item">
                   <a href="/admin/logout">退了</a>
               </li>
           </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">文章</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/article">全部文章</a></dd>
                        <dd><a href="/admin/article/insert">写文章</a></dd>
                        <dd><a href="/admin/category">全部分类</a></dd>
                        <dd><a href="/admin/tag">全部标签</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">页面</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/page">全部页面</a></dd>
                        <dd><a href="/admin/page/insert">添加页面</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">
                        链接
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/link">全部链接</a></dd>
                        <dd><a href="/admin/link/insert">添加链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">公告</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/notice">全部公告</a></dd>
                        <dd><a href="/admin/notice/insert">添加公告</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="/admin/comment">
                        评论
                    </a>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">
                        用户
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/user">全部用户</a></dd>
                        <dd><a href="/admin/user/insert">添加用户</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">设置</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/admin/menu">菜单</a></dd>
                        <dd><a href="/admin/options">主要选项</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <rapid:block name="content">

            </rapid:block>
        </div>
    </div>


</div>

<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/plugin/layui/layui.all.js"></script>
<script src="${pageContext.request.contextPath}/static/js/back.js"></script>


</body>
</html>