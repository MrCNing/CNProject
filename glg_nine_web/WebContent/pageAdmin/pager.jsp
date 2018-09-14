<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${pager.pageNo == 1}">
		<a href="#">首页</a>
		<a href="#">上一页</a>
	</c:when>
	<c:otherwise>
		<a href="${param.path}&pageNo=1">首页</a>
		<a href="${param.path}&pageNo=${pager.pageNo - 1}">上一页</a>
	</c:otherwise>
</c:choose>

<a href="#">第${pager.pageNo }页/共${pager.totalPages}页</a>

<c:choose>
	<c:when test="${pager.pageNo == pager.totalPages}">
		<a href="#">下一页</a>
		<a href="#">末页</a>
	</c:when>
	<c:otherwise>
		<a href="${param.path}&pageNo=${pager.pageNo + 1}">下一页</a>
		<a href="${param.path}&pageNo=${pager.totalPages}">末页</a>
	</c:otherwise>
</c:choose>