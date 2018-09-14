<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="${pageContext.request.contextPath }/lib/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath }/lib/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/css/bootstrap.min.css"/>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin-删除，修改.css" />
	<style type="text/css">
	#top{
	font-size:25px;
	padding:20px 0px 0px 30px;
	bgckgrounp:#ADADAD;
	}
	</style>
</head>
<body>
	<div id="top">删改用户</div>
	<div id="main1">
		<form
			action="${pageContext.request.contextPath}/YhxxbServlet?m=listAll&flag=sgyh"
			method="post" name="form1">
			<table width="100%" cellspacing="0">
				<tr>
					<td>账户</td>
					<td><input name="zh" value="${param.zh}" /></td>
					<td>用户名</td>
					<td><input name="yhm" value="${param.yhm}" /></td>
					<td>注册时间</td>
					<td><input name="zcsj" value="${param.zcsj }" /></td>
				</tr>
				<tr id="tr_input">
					<td colspan="6" id="">
					<input type="submit" value="查询" />
				    <input type="button" value="清空" id="doClear" />
				    </td>
				</tr>
			</table>
		</form>
	</div>
	<br />
	<div id="main2">
		<form action="" method="post">
			<table width="100%" border="1" cellspacing="0px"
				bordercolor="#ADADAD">
				<c:choose>
					<c:when test="${not empty list}">
						<tr>
							<th>序号</th>
							<th>账户</th>
							<th>用户名</th>
							<th>性别</th>
							<th>联系方式</th>
							<th>注册时间</th>
							<th>修改</th>
							<th>删除</th>
						</tr>
						<c:forEach items="${list}" var="user" varStatus="st">
							<tr>
								<td>${st.index + pager.startRowNum}</td>
								<td>${user.zh}</td>
								<td>${user.yhm}</td>
								<td>${user.xb}</td>
								<td>${user.lxfs}</td>
								<td>${user.zcsj }</td>
								<td><a
									href="${pageContext.request.contextPath}/pageAdmin/UpdateUser.jsp?zh=${user.zh}&yhm=${user.yhm}&xb=${user.xb}&lxfs=${user.lxfs}&zcsj=${user.zcsj}">修改</a>
								</td>
								<td><a
									href="${pageContext.request.contextPath}/YhxxbServlet?grbh=${user.grbh }&m=delete">删除</a>
								</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="8"><jsp:include page="pager.jsp">
									<jsp:param name="path"
										value="${pageContext.request.contextPath}/YhxxbServlet?m=listAll&flag=sgyh" />
								</jsp:include></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="5">无满足条件的记录！</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</table>
		</form>
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
		$(function() {
			$("#doClear").click(function() {
				$('[name="zh"]').val("");
				$('[name="yhm"]').val("");
				$('[name="zcsj"]').val("");
			});
		});
	</script>
</html>