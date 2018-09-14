<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/XxglServlet" method="post">
		无线wifi<input type="checkbox" name="func" value="wx" />
		空调<input type="checkbox" name="func" value="kt" />
		冰箱<input type="checkbox" name="func" value="bx" />
		洗衣机<input type="checkbox" name="func" value="xyj" />
		电视<input type="checkbox" name="func" value="ds" /><br />
		<input type="submit" value="提交"/>
	</form>
</body>
</html>