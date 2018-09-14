
		
$(function(){
	
	$("#top_close").click(function(){
			/**退出系统**/
			if(confirm("您确定要退出登录吗？")){
				window.location.href = request.getContextPath()+"/index.jsp";
			}
		
	})

		
		/**获得当前日期**/
		function  getDate01(){
			var time = new Date();
			var myYear = time.getFullYear();
			var myMonth = time.getMonth()+1;
			var myDay = time.getDate();
			var hh = time.getHours();
			var mm = time.getMinutes();
			var ss = time.getSeconds();
			if(myMonth < 10){
				myMonth = "0" + myMonth;
			}
			document.getElementById("yue_fen").innerHTML =  myYear + "." + myMonth;
			document.getElementById("day_day").innerHTML =  myYear + "." + myMonth + "." + myDay;
			
			if(hh<10){
				hh ="0"+hh;
			}
			if(mm<10){
				mm ="0"+mm;
			}
			if(ss<10){
				ss ="0"+ss;
			}
			
			$(".wdtz_time").text(myYear + "-" + myMonth + "-" + myDay+" "+hh+":"+mm+":"+ss);
		}
		
			getDate01();
			
	$("#sideouterPanel").mouseleave(function(){
		$("#sidePanel>div>div").hide();
	});
	
	$("#sidePanel>div").mouseenter(function(){
		$("#sidePanel>div>div").hide();
		$(this).find("div").show();
	})
	
	$("#sidePanel>div>div").mouseleave(function(){
		$(this).hide();
	});

	/*$(".room").click(function(){
		
			
			
		
		setTimeout(function(){
			var map = new BMap.Map("container");		//创建地图
//			var point = new BMap.Point(116.404, 39.915);
//			var point = new BMap.Point("北海");
			map.centerAndZoom("北京", 13);
			//map.setCenter(point);
//			var marker = new BMap.Marker(point);  // 创建标注
//			map.addOverlay(marker);               // 将标注添加到地图中
//			marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
		},500);
		
		});*/
		  
	$("#tj").click(function(){
		$(".modal").modal("hide");
	})
	
	$("#user_tx").hover( function(event){
    $("#top_user").css("display", "block");    
}, function(event){
    $("#top_user").css("display", "none");
} );

$("#top_user").hover( function(event){
    $("#top_user").css("display", "block");    
}, function(event){
    $("#top_user").css("display", "none");
} );

	
});
