$(document).ready(function(){
	$("#a1").click(function(){
		$("#a2").slideToggle(300);
	});
});
$(document).ready(function(){
	$("#a3").click(function(){
		$("#a4").slideToggle(300);
	});
});
$(document).ready(function(){
	$("#a5").click(function(){
		$("#a6").slideToggle(300);
	});
});
$(document).ready(function(){
	$("#a7").click(function(){
		$("#a8").slideToggle(300);
	});
});
$(function(){
	function calcPage(){
		//设定页面容器的高宽等于文档(视口)的高宽
		$("#main").height($(document).outerHeight(true));
		$("#main").width($(document).outerWidth(true));
	
		//动态计算main_main边内容展示区的高度
		$("#main_main").height(
			$("#main").height() - $("#top").height()
		);
		
	}
	calcPage();
	
	//动态计算页面控件大小(当页面调整大小时)
	$(window).resize(function(){
		calcPage();
	});
	//动态计算页面控件大小(当出现滚动条时)
	$(window).scroll(function(){
		calcPage();
	});
	
	
	
	
	
	
	
	/*--------------- 左侧 - 菜单效果:begin ---------------*/
	$("#menu>div>p").each(function(i,e){
		$(e).click(function(){
			if($(this).find("span").html() == "∧"){
				$(this).find("span").html("∨");
			}else{
				$(this).find("span").html("∧");
			}
			$(this).next().slideToggle("slow");
		});
	});
	/*--------------- 左侧 - 菜单效果:end ---------------*/
});


		
$(function(){
	
	$("#top_close").click(function(){
			/**退出系统**/
			if(confirm("您确定要退出本系统吗？")){
				window.location.href = "login.html";
			}
		
	})

		
		/**获得当前日期**/
		function  getDate01(){
			var time = new Date();
			var myYear = time.getFullYear();
			var myMonth = time.getMonth()+1;
			var myDay = time.getDate();
			if(myMonth < 10){
				myMonth = "0" + myMonth;
			}
			document.getElementById("yue_fen").innerHTML =  myYear + "." + myMonth;
			document.getElementById("day_day").innerHTML =  myYear + "." + myMonth + "." + myDay;
		}
		
			getDate01();
			
			
			
	
})
