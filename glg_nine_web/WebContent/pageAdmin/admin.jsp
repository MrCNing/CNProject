<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet"  type="text/css"  href="${pageContext.request.contextPath}/css/admin.css" />
		<link rel="icon" href="img/logotitle.ico" type="image/x-icon" />
		<title>心怡短租-管理员界面</title>
	</head>
	<body>
		<div id="main">
		 <div id="top">
			<div id="top_logo">
				<img alt="logo" src="${pageContext.request.contextPath}/img/index/top/logo.jpg" width="274" height="49" style="vertical-align:middle;">
			</div>
			<div id="top_links">
				<div id="top_op">
					<ul>
						<li style="width:150px">
							
						</li>
						<li>
							<img alt="事务月份" src="${pageContext.request.contextPath}/img/index/top/month.jpg">
							<span id="yue_fen"></span>
						</li>
						<li>
							<img alt="今天是" src="${pageContext.request.contextPath}/img/index/top/date.jpg">
							<span id="day_day"></span>
						</li>
					</ul> 
				</div>
				<div id="top_close">
					<a href="${ pageContext.request.contextPath }/dengluServlet?m=leave"  target="_parent">
						<img alt="退出系统" title="退出系统" src="${pageContext.request.contextPath}/img/index/top/close.jpg" style="position: relative; top: 10px; left: 25px;">
					</a>
				</div>
			</div>
		</div>

		<div id="main_main">
			
		<div id="left">
			<div id="photo">
			<div>
				<img  id="yhtx" src="/glg_nine_web/upload/${glyadmin.tx}" style="width: 60px;height: 60px;border-radius:50% ;cursor:pointer;margin-top:-30px;"/>
				<p>${glyxx.yhm}</p>
			</div>
		</div>
			<div id="menu">
			<div id="a1">
			<p >个人信息<span>∨</span></p>
			</div>
			<div id="a2" style="background-color:#303030;">
				<div><a href="admin_jbxx.jsp" target="content">-&nbsp;基本信息</a></div>
			</div>
			<div id="a3" >
				<p>用户管理<span>∨</span></p>
			</div>
			<div id="a4" style="background-color:#303030;">
				<div><a href="${pageContext.request.contextPath}/YhxxbServlet?m=listAll&flag=ckyh" target="content">-&nbsp;查看用户</a></div>
				<div><a href="addUser.jsp" target="content">-&nbsp;增加用户</a></div>
				<div><a href="${pageContext.request.contextPath}/YhxxbServlet?m=listAll&flag=sgyh" target="content">-&nbsp;删改用户</a></div>
			</div>
			<div id="a5">
				<p>订单处理<span>∨</span></p>
			</div>
			<div id="a6" style="background-color:#303030;">
				<div><a href="${pageContext.request.contextPath}/DdclServlet?m=listOne&flag=ddnr&pageNo=1" target="content">-&nbsp;订单内容</a></div>
				<div><a  href="${pageContext.request.contextPath}/DdclServlet?m=listClr&flag=cljl&pageNo=1" target="content">-&nbsp;处理记录</a></div>
			</div>
			<div id="a7">
				<p>信息管理<span>∨</span></p>
			</div>
			<div id="a8"style="background-color:#303030;">
				<div><a href="admin_fbxx.jsp" target="content">-&nbsp;发布信息</a></div>
				<div><a href="${pageContext.request.contextPath}/XxglServlet?m=listOne&flag=whxx&pageNo=1"  target="content">-&nbsp;维护信息</a></div>
			</div>
		     </div>
			</div>
		<div id="right">
			<iframe src="welcome.html" name="content" style="border-width:0;margin-top:0;padding: 0;" width="100%" height="99%" scrolling="no"  frameborder="no"></iframe>
		</div>
		</div>
		</div>
	</body>
	
	<!-- 个人头像上传（隐藏状态） -->
	<form style="display:none" action="${pageContext.request.contextPath}/ImageUploadServlet?m=updateAdminPic" method="post" enctype="multipart/form-data" id="form1">
		<input type="file" name="yhtx" id="pic"/>
	</form>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin.js" ></script>
<script>
		$(function(){
			$("#yhtx").click(function(){
				$("#pic").click();//点击管理员头像时，触发文件域的点击事件，打开文件选择窗口
			});
			
			$("#pic").change(function(){//选择本地图片，点击打开【保存】时，触发change事件，进行图片校验
				var reg = /\.(png|jpg|jpeg|bmp)$/;//支持的图片格式
				var tx = $.trim($("#pic").val());
				if(tx == ""){
					alert("请选择图片");
				}else if(reg.test(tx) == false){
					alert("图片格式不正确（支持png、jpg、jpeg、 bmp等格式）");
				}else{
					$("#form1").submit();
				}
			});
			
			var pic = "${param.pic}";
			if("" != pic){
				switch(pic){
				case "0":
					alert("上传失败");
					break;
				case "1":
					alert("不是图片文件");
					break;
				case "2":
					alert("图片太大，最多只能是4M");
					break;
				default:
					$("#yhtx").attr("src","${pageContext.request.contextPath}/upload/"+pic);
				}
			}
		});
	</script>
</html>