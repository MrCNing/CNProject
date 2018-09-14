
function checkFyjs(){
	
	var a=document.getElementById("fyjs").value;
	var span=document.getElementById("fyjsspan");
	if(""==a){
		span.innerHTML="房源介绍不能为空";
		return false;
	}else if(a.length>80){
		span.innerHTML="最多80个字";
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
	
}
function checkJq(){
	var jq=document.getElementById("jq").value;
	var span=document.getElementById("jqspan");
	var a=/^\d{1,8}$/;
	if (a.test(jq)) {
		span.innerHTML="*";
		return true;
	}else{
		span.innerHTML="请输入正确价格";
		return false;
	}
}

function checkCs(){
	var City=document.getElementById("cityid").value;
	var span=document.getElementById("CSspan");
	if(""==City){
		span.innerHTML=="城市不能为空";
		return false;
	}else{
		span.innerHTML=="*";
		return true;
	}
}

function checkJtdz(){
	
	var jtdz=document.getElementById("jtdz").value;
	var span=document.getElementById("jtdzspan");
	if(jtdz.length==""){
		span.innerHTML="具体地址不能为空";
		return false;
	}else if(jtdz.length>80){
		span.innerHTML="地址长度不能超过80";
	}else{
		span.innerHTML="*";
		return true;
	}
}

function checkLxfs(){
	var lxfs=document.getElementById("lxfs").value;
	var span=document.getElementById("lxfsspan");
	var a=/^0?(13|14|15|18|17)[0-9]{9}$/
   if(a.test(lxfs)){
   	span.innerHTML="*";
   	return true;
   }else{
   	span.innerHTML="联系方式有误";
   	return false;
   }
}

function checkJdsj(){
	var lxfs=document.getElementById("test6").value;
	var span=document.getElementById("test6span");
	if(""==lxfs){
		span.innerHTML="接待时间不能为空";
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
}

function checkZsrzts(){
	var zsrzts=document.getElementById("zsrzts").value;
	var span=document.getElementById("zsrztsspan");
	var a=/^\d{1,3}$/;
	
	   if(""==zsrzts){
		span.innerHTML="最少入住天数不能为空";
		return false;
	} else if(a.test(zsrzts)){
		span.innerHTML="*";
		return true;
	}else {
		span.innerHTML="天数最多为3位数";
		return false;;
	}
}

function checkZdrzts(){
	var zsrzts=document.getElementById("zsrzts").value;
	var zdrzts=document.getElementById("zdrzts").value;
	var span=document.getElementById("zdrztsspan");
	var zsrzts1= parseInt(zsrzts);
	var zdrzts1=parseInt(zdrzts);
	var b=zdrzts1-zsrzts1;
	
	
	var a=/^\d{1,3}$/;
	if(""==zdrzts){
		span.innerHTML="最大入住天数不能为空";
		return false;
       }else if(b<=0){
       	
       	span.innerHTML="最大入住天数必须大于最小入住天数";
       	return false;
       }else if(a.test(zdrzts)){
       	span.innerHTML="*";
       	return true;
       }else{
       	span.innerHTML="最大入住时间最多为3位数";
       	return false;
       }
	
}

function checkYdsj(){
	var ydsj=document.getElementById("test7");
	var span=document.getElementById("test7span");
	if(""==ydsj){
		span.innerHTML="预定时间不能为空";
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
}

function checkSfsm(){
	var sfsm=document.getElementById("sfsm");
	var span=document.getElementById("sfsmspan");
	if(""==sfsm){
		span.innerHTML="收费说明不能为空";
		return false;
	}else{
		span.innerHTML="*";
		return true;
	}
}

function checkTj(){
	if(checkFyjs()&&checkJq()&&checkJtdz()&&checkLxfs()&&checkJdsj()
	&&checkZsrzts()&&checkZdrzts()&&checkYdsj()&&checkSfsm()){
		tj.submit();
	}else{
		alert();
	}
}

window.onload=function(){
	$("[name='fyjs']").blur(checkFyjs);
	$("[name='jq']").blur(checkJq);
	$("[name='homecity_name']").blur(checkCs);
	$("[name='jtdz']").blur(checkJtdz);
	$("[name='lxfs']").blur(checkLxfs);
	$("[name='jdsj']").blur(checkJdsj);
	$("[name='zsrzts']").blur(checkZsrzts);
	$("[name='zdrzts']").blur(checkZdrzts);
    $("[name='sfsm']").blur(checkSfsm);
    $("[name='tj']").click(checkTj);
}
