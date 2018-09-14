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

function checklogin_sub(){
	if(checkZh()&&checkPwd()){
		submitForm.submit();
	}
}







window.onload=function(){
	$("#zh").blur(checkZh);
	$("#pwd").blur(checkPwd);
	$("#login_sub").click(checklogin_sub);

}
