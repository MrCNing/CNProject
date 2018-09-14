<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script src="js/laydate.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			laydate.render({
	     		 elem: '#test6'
	      		,range: true
	    	});
		</script>
	</head>
	<body>
		<div id="">
			<form action="${pageContext.request.contextPath }/DdclServlet?m=add&fjbh=${param.fjbh}&grbh=${user.grbh}" method="post" name="">
				预订时间：<input type="text" class="demo-input" placeholder="日期范围" id="test6" name="ydsj"><br />
				联系方式：<input type="text" name="lxfs" /><br />
				入住人数：
				<select name="rzrs">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
				</select><br />
				姓名：<input type="text" name="xm" /><br />
				性别：
				<select name="xb">
					<option value="男">男</option>
					<option value="女">女</option>
				</select><br />
				身份证号：<input type="text" name="sfzh" /><br />
				<input type="reset" value="清空"/>
				<input type="submit" value="提交"/>
								
			</form>
			<hr />
			<form action="${pageContext.request.contextPath }/DdclServlet?m=delete" method="post" name="">
				<input type="text" name="ddbh"  />
				<input type="submit" value="删除"/>
			</form>
		</div>
	</body>
</html>