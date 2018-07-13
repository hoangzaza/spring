$(document).ready(function(){
	
	
	$("#btnDangNhap").click(function(){
		var tendangnhap=$("#tendangnhap").val();
		var matkhau=$("#matkhau").val();
		$.ajax({
			url:"http://localhost:8080/projectchuan/api/KiemTraDangNhap",
			type:"get",
			data:{
				tendangnhap:tendangnhap,
				matkhau:matkhau
			},
			success:function(value){
				if(value=="true"){
				duongdanhientai=window.location.href;
				trangchu=duongdanhientai.replace("dangnhap/","");
				window.location=trangchu;
				} else {
					$("#ketqua").text("Đăng nhập thất bại");
				}
			}
		})
	});
	
	
	$(".btn-giohang").click(function(){
		var tenmau=$(this).parent().parent().find(".mau").text();
		var mamau=$(this).parent().parent().find(".mau").attr("data-mamau");
		var masize=$(this).parent().parent().find(".size").attr("data-masize");
		var tensize=$(this).parent().parent().find(".size").text();
		var tensp=$("#tensp").text();
		var giatien=$("#giasp").attr("data-gia");
		alert(content);
		$.ajax({
			url:"http://localhost:8080/projectchuan/api/ThemGioHang",
			type:"get",
			data:{
				
			}
			
			
		})
	})
	
	
	$("#dangnhap").click(function(){
		$(".container-login-form").show();
		$("#dangnhap").addClass("actived");
		$("#dangky").removeClass("actived");
		
		$(".container-signup-form").css("display","none");
	});
	$("#dangky").click(function(){
		$("#dangnhap").removeClass("actived");
		$("#dangky").addClass("actived");
		$(".container-login-form").hide();
		$(".container-signup-form").css("display","block");
	});
})