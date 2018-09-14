<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<table border="1px" cellspacing="0" cellpadding="1px" width="600px">
			<c:choose>
				<c:when test="${not empty list}">
					<tr>
						<th>序号</th>
						<th>账户</th>
						<th>用户名</th>
						<th>性别</th>
						<th>联系方式</th>
						<th>注册时间</th>
					</tr>
					<c:forEach items="${list}" var="user" varStatus="st">
						<tr>
							<td>${st.index + pager.startRowNum}</td>
							<td>${user.zh}</td>
							<td>${user.yhm}</td>
							<td>${user.xb}</td>
							<td>${user.lxfs}</td>
							<td>${user.zcsj }</td>
						</tr>
					</c:forEach>
						<tr>
							<td colspan="6">
								<jsp:include page="pager.jsp">
									<jsp:param name="path" 
									value="${pageContext.request.contextPath}/YhxxbServlet?m=listAll"/>
								</jsp:include>
							</td>
						</tr>
				</c:when>
			</c:choose>
		</table>
	</body>
</html>
