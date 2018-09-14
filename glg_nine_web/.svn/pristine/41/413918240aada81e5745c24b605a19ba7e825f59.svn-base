<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%    String n="1";
       n = request.getParameter("n");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>心怡短租--登录</title>
<link href="css/login_css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/denglu.js"></script>
<script src="${pageContext.request.contextPath }/lib/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath }/lib/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/css/bootstrap.min.css"/>

	 
</script>
</head>
<body>
	<div id="login_center">
		<div id="login_area">
			<div id="login_box">
			<a href="${pageContext.request.contextPath }/XxglServlet?m=listAll&flag=first"><div class="index" style="width: 300px;height: 300px;background-color: rgba(0,0,0,0.0);position: absolute;top: 50px;left: 60px;">
			</div></a>
				<div id="login_form">
					<form id="submitForm" action="${ pageContext.request.contextPath }/dengluServlet?m=login" method="post"name="login_sub">
						
						<div id="bt"  class="sty_txt2">
							<h1 >login</h1>
						</div>

						
						<div id="login_tip">
						<%if("1".equals(n)){ %>
							<span id="login_err" class="sty_txt2 ""></span>
							<% }else if("0".equals(n)){ %>
							<span id="login_err2" class="sty_txt2" style="margin-left:40px" >账号或密码错误</span>
							<%} %>
						</div>
						<div>
							 账&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="userEntity.userCode" class="username" id="zh" value="${cookie.zh.value}"/><span id="zhspan"style="font-family: '微软雅黑';font-size: 9px;color: red;" ></span>
						</div>
						<div>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userEntity.password" class="pwd" id="pwd"  value="${cookie.pwd.value }"/><span id="pwdspan"style="font-family: '微软雅黑';font-size: 9px;color: red;" ></span>
						</div>
						<div>
							<input type="checkbox" name="remeberme" id="remeberme" value="" style="margin-top: 20px;margin-left: 60px;"/>记住我
							<a href="register.jsp" style="text-decoration:none;color:#000000;margin-left:90px">注册--></a>
						</div>
						
						
						
						<div id="btn_area">
							<input type="button" class="login_btn" id="login_sub"  value="登  录">
							<input type="reset" class="login_btn" id="login_ret" value="重 置">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<a id="success" data-toggle="modal" data-target="#myModa_OK"></a>
	<a id="failed" data-toggle="modal" data-target="#myModa_NO"></a>
	
	<div class="modal fade" id="myModa_OK" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog " style=" margin-top:200px;width:300px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					系统消息
				</h4>
			</div>
			<div class="modal-body" style="text-align: center;overflow: visible;height:100px">
				<p style="font-size:20px;margin-top:20px;"><img alt="" style="width:25px;height:25px;" src="${pageContext.request.contextPath }/img/succee.png">&nbsp;&nbsp;操作成功！</p>


			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	</div>
	
	<div class="modal fade" id="myModa_NO" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog " style=" margin-top:200px;width:300px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel">
						系统消息
					</h4>
				</div>
				<div class="modal-body" style="text-align: center;overflow: visible;height:100px">
					<p style="font-size:20px;margin-top:20px;"><img alt="" style="width:25px;height:25px;" src="${pageContext.request.contextPath }/img/fail.png">&nbsp;&nbsp;操作失败！</p>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
</body>
	
	<script type="text/javascript">
		$(function(){
			if('${param.status}' == "success"){
				$("#success").click();
			}else if('${param.status}' == "failed"){
				$("#failed").click();
			}
		});
	</script>
</html>