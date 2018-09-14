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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin-基本信息.css" />
<style>
	.name_bt{
	font-size: 25px;
    margin-left: 30px;
    margin-top: 20px;
	}
	#main{
    padding-top: 20px;
	}
</style>
</head>
	<div class="name_bt">基本信息</div>
	<div id="main">
		<div id="menu">
			<form action="${pageContext.request.contextPath}/GlyxxbServlet" method="post" name="updateAdmin">
				<div id="a1">
					账&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="zh" readonly="readonly" value="${glyxx.zh}"
						style="border-radius: 5px; width: 300px; height: 30px; border: solid 1px #808080;" />
				</div>
				<br />
				<br />
				<div id="a2">
					密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text" class="Ajbxx" name="pwd" readonly="readonly" 
						style="border-radius: 5px; width: 300px; height: 30px; border: solid 1px #808080;" />
				</div>
				<br />
				<br />
				<div id="a3">
					昵&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="Ajbxx" name="yhm" readonly="readonly" value="${glyxx.yhm}"
						style="border-radius: 5px; width: 300px; height: 30px; border: solid 1px #808080;" />
				</div>
				<br />
				<br />
				<div id="a4">
					联&nbsp;系&nbsp;方&nbsp;式：<input type="text" class="Ajbxx"  name="lxfs" readonly="readonly" value="${glyxx.lxfs}"
						/style="border-radius: 5px; width: 300px; height: 30px; border: solid 1px #808080;">
				</div>
				<br />
				<br />
				<div id="a5">
					<input type="button" name="" id="qd" value="确定"
						style="background-color: whitesmoke; width: 60px; height: 35px; border: solid 1px #808080; border-radius: 5px;" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" name="" id="xiu"  value="修改"
						style="background-color: whitesmoke; width: 60px; height: 35px; border: solid 1px #808080; border-radius: 5px;" />
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
	<script type="text/javascript">
		$(function (){
			$("#xiu").click(function(){
				var a= document.getElementById("xiu").value;
				if("修改"==a){
					$(".Ajbxx").removeAttr("readonly");
				}
			});
			$("#qd").click(function(){
				$(".Ajbxx").attr("readonly","readonly");
				updateAdmin.submit();
			});
		});
	</script>
</html>
