function checkZh(){	
	var s=/^(^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$)$/
	var span=document.getElementById("zhspan")
	if($("#zh").val().length>20){
		span.innerHTML="长度不能超过20";
		return false;
	}
	if(s.test($("#zh").val())){
		span.innerHTML="*";
		return true;
	}else{
		span.innerHTML="格式不对";
		return false;
	}
}
function checkYhm(){
	
	var span=document.getElementById("yhmspan");
	var yhm= $("#yhm").val();
	if(""==yhm){
		span.innerHTML="用户名不能为空";
		return false; 
	}else if(yhm.length>8){
		span.innerHTML="长度不能超过8"
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
}

function checkPwd(){
	var span=document.getElementById("pwdspan");
	var pwd=$("#pwd").val();
	 if(pwd.length<8){
		span.innerHTML="长度不能小于8";
		return false;
	}else if(pwd.length>20){
		span.innerHTML="长度不能大于20";
		return false;
	}else{
		span.innerHTML="*";
		return true;
}}
function checkPwd2(){
	var span=document.getElementById("pwd2span");
	var pwd=$("#pwd").val();
	 if(pwd.length<8){
		span.innerHTML="长度不能小于8";
		return false;
	}else if(pwd.length>20){
		span.innerHTML="长度不能大于20";
		return false;
	}
	 if($("#pwd2").val()==$("#pwd").val()){
		span.innerHTML="*";
		return true;
}else{
	span.innerHTML="密码输入不同";
		return false;
}
}
function checklogin_sub(){
	if(checkZh()&&checkYhm()&&checkPwd()&&checkPwd2()){
		submitForm.submit();
	}
}

window.onload=function(){
	$("#zh").blur(checkZh);
	$("#yhm").blur(checkYhm);
	$("#pwd").blur(checkPwd);
	$("#pwd2").blur(checkPwd2);
	$("#login_sub").click(checklogin_sub)
}
