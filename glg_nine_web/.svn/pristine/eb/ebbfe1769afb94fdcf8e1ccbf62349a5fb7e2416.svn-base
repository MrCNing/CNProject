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

function checkLxfs(){
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


function checklogin_sub(){
	if(checkPwd()&&checkLxfs()){
		update.submit();
	}
}

window.onload=function(){
	$("#pwd").blur(checkPwd);
	$("#lxfs").blur(checkLxfs);
	$("#ups").click(checklogin_sub)
}
