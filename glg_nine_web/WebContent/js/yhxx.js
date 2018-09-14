function checkXg(){
	var a= document.getElementById("xiugai").value;

	if("修改"==a){
		
		$("#lxfs").removeAttr("readonly");
		$("#xiugai").attr("value","保存");	
		$("#xiugai").text("保存");
	}else{
		if(checkYhm()&&checkLxfs()){
			$("#xiugai").attr("value","修改");
			$("#xiugai").text("修改");
			
		   $("#lxfs").attr("readonly","readonly");
			grbh_form.submit();
		}	
		
	}	
}

function checkYhm(){
	if(document.getElementById("xiugai").value=="保存"){
	var span=document.getElementById("yhmspan");
	var yhm= $("#yhm").val();
	if(""==yhm){
		span.innerHTML="用户名不能为空";
		return false; 
	}else if(yhm.length>8){
		span.innerHTML="不能超过8位"
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
}}

function checkLxfs(){
	if(document.getElementById("xiugai").value=="保存"){
	var span =document.getElementById("lxfsspan");
	var lxfs=$("#lxfs").val();
	var a=/^0?(13|14|15|18|17)[0-9]{9}$/
   if(a.test(lxfs)){
   	span.innerHTML="*";
   	return true;
   }else{
   	span.innerHTML="联系方式有误";
   	return false;
   }
}
}

function checkGrxx() {
	var a= document.getElementById("xiugai").value;
	if(a=="保存"){
		$("#xiugai").attr("value","修改");
		$("#xiugai").text("修改");
		
		$("#lxfs").attr("readonly","readonly");
		document.getElementById("yhmspan").innerHTML="";
		document.getElementById("lxfsspan").innerHTML="";
	}
}

function checkYmm(){
	var ymm=document.getElementById("ymm").value;
	var span=document.getElementById("ymmspan");
	 if(ymm.length<8){
		span.innerHTML="长度不能小于8";
		return false;
	}else if(ymm.length>20){
		span.innerHTML="长度不能大于20";
		return false;
	}else{
		span.innerHTML="*";
		return true;
}}

function checkXmm(){
	var xmm=document.getElementById("xmm").value;
	var span=document.getElementById("xmmspan");
	 if(xmm.length<8){
		span.innerHTML="长度不能小于8";
		return false;
	}else if(xmm.length>20){
		span.innerHTML="长度不能大于20";
		return false;
	}else{
		span.innerHTML="*";
		return true;
}}



function checkRemm(){
	var xmm=document.getElementById("xmm").value;
	var remm=document.getElementById("remm").value;
	var span=document.getElementById("remmspan");
	 if(remm.length<8){
		span.innerHTML="长度不能小于8";
		return false;
	}else if(remm.length>20){
		span.innerHTML="长度不能大于20";
		return false;
	}else if(xmm!=remm){
		span.innerHTML="密码输入不一致";
		return false;
	}else{
		span.innerHTML="*";
		return true;
}}

function checkGgmm(){
	if(checkXmm()&&checkRemm()&&checkYmm){
		xgmm_form.submit();
	}
}


$(function(){
	$("#xiugai").click(checkXg);
	$("#top_user_grxx").click(checkGrxx);
	$("#yhm").blur(checkYhm);
	$("#lxfs").blur(checkLxfs);
	$("#ymm").blur(checkYmm);
	$("#xmm").blur(checkXmm);
	$("#remm").blur(checkRemm);
	$("#ggmm").click(checkGgmm);
});

