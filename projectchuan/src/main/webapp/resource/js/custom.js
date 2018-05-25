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
	
	
	$("#dangnhap").click(function(){
		$(".container-login-form").show();
		$("#dangnhap").addClass("actived");
		$("#dangky").removeClass("actived");
		
		$(".container-signup-form").hide();
	});
	$("#dangky").click(function(){
		$("#dangnhap").removeClass("actived");
		$("#dangky").addClass("actived");
		$(".container-login-form").hide();
		$(".container-signup-form").show();
	});
})