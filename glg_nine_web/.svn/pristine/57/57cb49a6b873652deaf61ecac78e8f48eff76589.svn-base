<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- 维护信息  -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<script src="${pageContext.request.contextPath }/lib/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath }/lib/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin_ddnr.css" />
		<style>
			.modal-body div{
				margin-bottom: 20px;
			}
			
			.modal-body input{
				margin-right:20px;
			}
			#reDdzt{
				width: 100px;
				height: 25px;
			}
			#xxsg{
				width: 2700px;
				height: 420px;
				margin-top: 5px;
			}
			.float1{float: left;margin-left: 150px;}
			.float1,.float2{
				
				margin-right:20px;
				font-size: 15px;
				}
				.float1 input,.float2 input{
					margin-bottom: 3px;
					padding: 3px;
				}
				
			.ptss{margin-left: 80px;margin-top: 30px;}
			.ptss span{font-size: 20px;margin-left: -320px;}
			.ptss input{
				margin: 10px;
			}
			.ptss_sel{
				margin-left: 80px;
			}
			
			.room_img{
				margin-top: 10px;
				margin-left: 50px;
				font-size: 20px;
			}
				
			.upload{
				margin-top: 30px;
				margin-left: 300px;
				padding: 5px 10px;
				cursor: pointer;
			}
			
			#top{
			font-size:25px;
			padding:20px 0px 15px 30px;
			}
			
		</style>
	</head>
	<body>
	
	<div id="main">
		<div id="main1">
			<div id="top">
			维护信息
			</div>
			<div id="select">
				<form action="${pageContext.request.contextPath}/XxglServlet?m=listOne&flag=whxx&pageNo=1" method="post" name="">
					<table width="100%" cellspacing="0">
						<tr>
							<td>城市</td>
							<td><input id="reCs" name="cs" placeholder="可模糊"  value="${param.cs}" /></td>
							<td>房源介绍</td>
							<td><input id="reFyjs" name="fyjs" placeholder="可模糊" value="${param.fyjs}" /></td>
						</tr>
						<tr id="tr_input" >
							<td colspan="4" id="">
								<input type="submit" value="查询" />
								<input id="mhReset" type="button" value="重置"/>
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div id="main2">
				<form action="" method="post">
					<table width="100%" border="1" cellspacing="0px" bordercolor="#ADADAD">
						<tr>
							<th width="10%">序号</th>
							<th width="25%">房源介绍</th>
							<th width="10%">城市</th>
							<th width="10%">价钱</th>
							<th width="10%">可住人数</th>
							<th width="15%">联系方式</th>
							<th width="20%">操作</th>
						</tr>
						<c:if test="${not empty fjList}">
							<c:forEach items="${fjList}" var="user" varStatus="st">
								<tr>
									<td>${st.index + pager.startRowNum }</td>
									<td>${user.fyjs}</td>
									<td>${user.cs }</td>
									<td>${user.jq }</td>
									<td>${user.kzrs }</td>
									<td>${user.lxfs }</td>
									<td>
										<a href="" data-toggle="modal" data-target="#myModa_xxsg${st.index}">详情</a>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/XxglServlet?m=delete&fjbh=${user.fjbh}">删除</a>
									</td>
								</tr>
							</c:forEach>
						</c:if>
						<tr>
							<td colspan="7">
								<jsp:include page="pager.jsp">
									<jsp:param name="path" value="${pageContext.request.contextPath}/XxglServlet?m=listOne&flag=whxx&cs=${param.cs}&fyjs=${param.fyjs}"/>
								</jsp:include>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	
	<c:if test="${not empty fjList}">
		<c:forEach items="${fjList}" var="fj" varStatus="st" >
			 <div class="modal fade" id="myModa_xxsg${st.index}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog " style="width: 900px;">
				<form action="${pageContext.request.contextPath}/XxglServlet?m=update&fjbh=${fj.fjbh}&fjtp=${fj.fjtp}" method="post"  name="infoForm"  >
					<div class="modal-content" >
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
									&times;
								</button>
								<h4 class="modal-title" id="myModalLabel">
									房间信息
								</h4>
							</div>
				<div class="modal-body" >
						<div id="xxsg">
							<div class="float1" >
										<div>房源介绍：<input type="text" name="fyjs" class="fyjs" value="${fj.fyjs }" /><span class="fyjsspan"></span></div>
										<div>价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;钱：<input type="text" name="jq" class="jq" value="${fj.jq }"  /><span class="jqspan"></span></div>
									<!-- 房间图片：<input type="file" name="fjtp" class="fjtp" /><span class="fjtpspan"></span><br /> -->
										<div> 城&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市：
									    <input type="text"  value="${fj.cs }"  size="19" class="homecity_name" name="cs" mod="address|notice" mod_address_source="hotel" mod_address_suggest="@Beijing|北京|53@Shanghai|上海|321@Shenzhen|深圳|91@Guangzhou|广州|80@Qingdao|青岛|292@Chengdu|成都|324@Hangzhou|杭州|383@Wuhan|武汉|192@Tianjin|天津|343@Dalian|大连|248@Xiamen|厦门|61@Chongqing|重庆|394@" mod_address_reference="cityclass" mod_notice_tip="中文/拼音" />
									    <input id="cityid" name="cityid" type="hidden" value="{$cityid}" />
									 </div>
									  <div class="jsContainer" class="jsContainer" style="height:0">
										  <div class="tuna_alert" style="display:none;position:absolute;z-index:999;overflow:hclassden;"></div>
										  <div class="tuna_jmpinfo" style="visibility:hclassden;position:absolute;z-index:120;"></div>
										</div>
									<div>具体地址：<input type="text" name="jtdz" class="jtdz" value="${fj.jtdz }"  /><span class="jtdzspan"></span>
										
									</div>
									<div>联系方式：<input type="text" name="lxfs" class="lxfs" value="${fj.lxfs }"  /><span class="lxfsspan"></span>
										
									</div>
									<div style="margin-bottom: 10px;margin-top: 10px;">可住人数：
									<select name="kzrs">
										<option value="1" ${fj.kzrs=="1"?"selected='selected'":""} >1</option>
										<option value="2" ${fj.kzrs=="2"?"selected='selected'":""} >2</option>
										<option value="3" ${fj.kzrs=="3"?"selected='selected'":""} >3</option>
										<option value="4" ${fj.kzrs=="4"?"selected='selected'":""} >4</option>
										<option value="5" ${fj.kzrs=="5"?"selected='selected'":""} >5</option>
										<option value="6" ${fj.kzrs=="6"?"selected='selected'":""} >6</option>
										<option value="7" ${fj.kzrs=="7"?"selected='selected'":""} >7</option>
									</select>
									</div>
										<div>
											床&nbsp;&nbsp;类&nbsp;&nbsp;型：
											<select name="clx">
												<option value="大床：1张" ${fj.clx="大床：1张"?"selected=='selected'":""}>大床：1张</option>
												<option value="大床：2张" ${fj.clx="大床：2张"?"selected=='selected'":""}>大床：2张</option>
												<option value="大床：3张" ${fj.clx="大床：3张"?"selected=='selected'":""}>大床：3张</option>
												<option value="标准床：1张" ${fj.clx="标准床：1张"?"selected=='selected'":""}>标准床：1张</option>
												<option value="标准床：2张" ${fj.clx="标准床：2张"?"selected=='selected'":""}>标准床：2张</option>
												<option value="标准床：3张" ${fj.clx="标准床：3张"?"selected=='selected'":""}>标准床：3张</option>
											</select>
										</div>
								</div>
								
							<div class="float2">
								<div>
								接待时间：
								<input type="text" class="demo-input" placeholder="时间范围" class="test6" name="jdsj" value="${fj.jdsj }" ><span class="test6span"></span>
								</div>	
								
								<div>
									入住时间：
								<input type="text" class="demo-input" placeholder="" class="test7" name="rzsj" value="${fj.rzsj }" ><span class="test7span"></span>
								</div>
								<div>
									退房时间：
								<input type="text" class="demo-input" placeholder="" class="test8" name="tfsj" value="${fj.tfsj }" ><span class="test8span"></span>
								</div>
								<div>
									最少入住：<input type="text" name="zsrzts" class="zsrzts" value="${fj.zsrzts }"  /><span class="fzsrztsspan"></span>
								</div>
								<div>
									最多入住：<input type="text" name="zdrzts" class="zdrzts" value="${fj.zdrzts }"  /><span class="zdrzts"></span>
								</div>
								<div>
									收费说明：
								<textarea name="sfsm" style="width: 255px;" >${fj.sfsm }</textarea>
								</div>
									
								</div>
							<div class="ptss">
									<span>
										配套设施：
									</span><br />
								<div class="ptss_sel">
									<input type="checkbox" name="func" value="kt" ${fj.kt=="1"?"checked='checked'":""} />空调
									<input type="checkbox" name="func" value="bx" ${fj.bx=="1"?"checked='checked'":""}  />冰箱
									<input type="checkbox" name="func" value="ds" ${fj.ds=="1"?"checked='checked'":""}  />电视
									<input type="checkbox" name="func" value="xyj" ${fj.xyj=="1"?"checked='checked'":""}  />洗衣机
									<input type="checkbox" name="func" value="wx" ${fj.wx=="1"?"checked='checked'":""}  />无线wifi<br />
									<input type="checkbox" name="func" value="dn" ${fj.dn=="1"?"checked='checked'":""}  />电脑
									<input type="checkbox" name="func" value="zc" ${fj.zc=="1"?"checked='checked'":""}  />早餐
									<input type="checkbox" name="func" value="zf" ${fj.zf=="1"?"checked='checked'":""}  />做饭
									<input type="checkbox" name="func" value="wsj" ${fj.wsj=="1"?"checked='checked'":""}   />卫生间
									<input type="checkbox" name="func" value="rs" ${fj.rs=="1"?"checked='checked'":""}  />24小时热水
								</div>
								</div>
								<!-- <input type="submit" value="提交"/> -->
							
							<!-- 提交图片时隐藏跳转界面 -->
							<iframe class="rfFrame" name="rfFrame" src="about:blank" style="display:none;"></iframe>
						</div>
					
							
							</div>
							<div class="modal-footer" style="text-align: center;">
								<button type="button" class="btn btn-default" data-dismiss="modal" value="拒绝"  style=";margin-right: 10px;">
									&nbsp;&nbsp;&nbsp;&nbsp;关闭&nbsp;&nbsp;&nbsp;&nbsp;
								</button>
								<button  type="submit" class="btn btn-primary" style="margin-left: 10px;">
									&nbsp;&nbsp;&nbsp;&nbsp;修改&nbsp;&nbsp;&nbsp;&nbsp;
								</button>
							</div>
					</div><!-- /.modal-content -->
							</form>
				</div><!-- /.modal -->
			</div>
		
		</c:forEach>
	</c:if>
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
	//页面加载完成后触发操作是否成功事件
		$(function(){
			if('${param.status}' == "success"){
				$("#success").click();
			}else if('${param.status}' == "failed"){
				$("#failed").click();
			}
		});
	</script>
	
	<script type="text/javascript">
		//重置模糊选项的两个框
		function reMh(){
			$("#reCs").val("");
			$("#reFyjs").val("");
		}
		
		//设置模态框中的属性全部可读
		function readOnly(){
			$("[name='ddnr_form'] input").each(function(){
				$(this).attr("readonly","readonly");
			});
		}
		
		$(function(){
			$("#mhReset").click(reMh);
			readOnly();
		});
	</script>
</html>
