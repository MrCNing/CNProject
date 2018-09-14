<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<script src="${pageContext.request.contextPath }/lib/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath }/lib/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin-增加用户.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/addUser.js"></script>
	<style type="text/css">
	.name_bt{
	font-size:25px;
	margin:20px 0px 20px 30px;
	}
	</style>
	<body>
		<div id="main">
			<div class="name_bt">增加用户</div>
			<div id="main1">
			<form action="${pageContext.request.contextPath}/YhxxbServlet?m=add" method="post" name="add">
				<div id="menu">
				<div id="a1">
					账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号&nbsp;：<input type="text" value="" name="zh" id="zh" style="border-radius:5px ;width: 300px;height: 30px;border: solid 1px #808080;"/>
				<span id="zhspan"style="font-family: '微软雅黑';font-size: 9px;" ></span>
				</div><br /><br />
				<div id="a2">
					用&nbsp;&nbsp;&nbsp;户&nbsp;&nbsp;&nbsp;名：<input type="text" value="" name="yhm" id="yhm" style="border-radius:5px ;width: 300px;height: 30px;border: solid 1px #808080;"/>
				<span id="yhmspan"style="font-family: '微软雅黑';font-size: 9px;" ></span>
				</div><br /><br />
				<div id="a3">
					密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;：<input type="text" value="" name="pwd" id="pwd" style="border-radius:5px ;width: 300px;height: 30px;border: solid 1px #808080;"/>
					<span id="pwdspan" style="font-family: '微软雅黑';font-size: 9px;" ></span>
				</div><br /><br />
				<div id="a4">
					性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;：
					&nbsp;&nbsp;&nbsp;
					<input type="radio" value="男" name="xb" checked="checked"/>男
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" value="女" name="xb" />女
				</div><br /><br />
				<div id="a5">
					联系方式&nbsp;&nbsp;：<input type="text" value="" id="lxfs" name="lxfs" id="lxfs" style="border-radius:5px ;width: 300px;height: 30px;border: solid 1px #808080;">
				<span id="lxfsspan" style="font-family: '微软雅黑';font-size: 9px;" ></span>
				</div><br /><br />
				<div id="a6">
					<input type="button" name="" id="login_sub" value="确定"style="background-color: whitesmoke;width: 60px;height: 35px;border: solid 1px #808080;border-radius:5px ;" />
				 </div>
				</div>
			</form>
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