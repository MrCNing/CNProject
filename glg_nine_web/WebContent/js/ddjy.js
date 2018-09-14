function checkYdsj(){
	//var ddydsj= $("#yudingshijian"+${st.index});
	
	var span=$();
	if(""==ddydsj){
		span.text("预定时间不能为空");
		aaa=false;
		return false;
	}else{
		
		span.innerHTML="*";
		aaa=true;
		return true;
	}
}

function checkLxfs(){
	var span = $(this).parent().next(".dg_form_eorr").find("span");
	
    var lxfs = $(this).val();
    
	var a=/^0?(13|14|15|18|17)[0-9]{9}$/
   if(a.test(lxfs)){
	   alert(lxfs);
	   bbb = true;
   	span.innerHTML="*";
   	return true;
   }else{
	   bbb=false;
	   span.test("联系方式有误");
	   alert(span);
   	return false;
   
}
}

function checkRzrs() {
	var rzrs = $(this).val();
	var span=$(this);
	var a=/^\d$/;
	
	if (""==rzrs) {
		ccc=false;
		span.innerHTML="入住人数不能为空";
		return false;
	}else if (a.test(rzrs)) {
		ccc=true;

		span.innerHTML="*";
		return true;
	}else{
		ccc=false;
		span.innerHTML="请输入数字";
		return false;
	}
}

function checkXm() {
	var xm = $(this).val();
	var span=$(this);
	var a=/^[\u4E00-\u9FA5]{1,4}$/;
	if (""==xm) {
		ddd=false;
		span.innerHTML="姓名不能为空";
		return false;
	}else if(a.test(xm)){
		ddd=true;

		span.innerHTML="*";
		return true;
	}else{
		ddd=false;
		span.innerHTML="姓名要为汉字";
			return false;
	}
}

function checkSfzh() {
	var sfzh = $(this).val();
	var span=$(this);
	var a=/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
	if (""==sfzh) {
		fff=false;
		span.innerHTML="姓名不能为空";
		return false;
	}else if(a.test(sfzh)){

		span.innerHTML="*";
		fff=true;
		return true;
	}else{
		fff=true;
		span.innerHTML="身份证号输入错误";
			return false;
	}
   return false;
}

function checkDdtj() {
		if (aaa&&bbb&&ccc&&ddd&&fff) {
		dd_form.submit();
		}
}

//function checkDg() {
//	dd_form.reset();
//	document.getElementById("ddydsjspan").innerHTML="";
//	 document.getElementById("ddlxfsspan").innerHTML="";
//	document.getElementById("ddrzrsspan").innerHTML="";
//	document.getElementById("ddxmspan").innerHTML="";
//	document.getElementById("ddsfzhspan").innerHTML="";
//}



$(function(){
	
	$(".demo-input").blur(checkYdsj);
	$(".ddlxfs").blur(checkLxfs);
	$(".ddrzrs").blur(checkRzrs);
	$(".ddxm").blur(checkXm);
	$(".ddsfzh").blur(checkSfzh);
	$(".ddtj").click(checkDdtj);
	var aaa = false;
	var bbb= false;
	var ccc= false;
	var ddd=false;
	var fff=false;
//	$(".dg").click(checkDg);
});
