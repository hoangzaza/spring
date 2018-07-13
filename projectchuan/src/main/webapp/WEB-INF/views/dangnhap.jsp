<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>dang nhap</title>

<!-- jstl đường dẫn tuyệt đối của source -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resource/css/login.css"/> '>
<jsp:include page="header.jsp" />
</head>
<body id="body-login">
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">

				<div id="header-left" class="header-login">
					<span id="text-welcome">Welcome</span> <br /> <span id="text-duoi">Hãy
						tạo nên phong cách của bạn</span>

				</div>
				<div id="bottom-left">
					<!-- url đang là /dangnhap/ thì .. để nó trở về trang chủ -->
					<p>
						<img alt="icon_oval"
							src='<c:url value="/resource/images/icon_oval.png"/>'><span>Luôn
							cập nhật xu hướng thời trang mới nhất</span>
					</p>
					<p>
						<img alt="icon_oval"
							src='<c:url value="/resource/images/icon_oval.png"/>'><span>Giam
							50 % tất cả các mặt hàng cho khách hàng VIP </span>
					</p>
					<p>
						<img alt="icon_oval"
							src='<c:url value="/resource/images/icon_oval.png"/>'><span>Tận
							tình tư vấn để tạo nên phong cách của bạn </span>
					</p>
				</div>
			</div>
			<div id="container-login-right">
				<div id="header-top-right" class="header-login">
					<span class="actived" id="dangnhap">Đăng nhập</span>/<span id="dangky">Đăng ký</span>
				</div>

				<div id="container-center-right">
						<div class="container-login-form" id="container-center-right">
						<input id="tendangnhap" name="tendangnhap" class="input-icon-email"
							placeholder="Email" type="text"><br><p></p>
							<input id="matkhau"
							name="matkhau" class="input-icon-password" placeholder="Mật khẩu"
							type="password"> <br> 
							<input class="button-login" id="btnDangNhap"
							type="submit" value="ĐĂNG NHẬP"> <br>
							</div>
							
							<div class="container-signup-form" id="container-center-right">
							<form action="" method="post">
							<input id="tendangnhapdangky" name="tendangnhapdangky" class="input-icon-email"
							placeholder="Email" type="text"><br><p></p>
							<input id="matkhaudangky"
							name="matkhaudangky" class="input-icon-password" placeholder="Mật khẩu"
							type="password"> <br> <p></p>
							<input id="nhaplaimatkhau"
							name="nhaplaimatkhau" class="input-icon-password" placeholder="Nhập lại mật khẩu"
							type="password"> <br> 
							<input class="button-login" id="btnDangKy"
							type="submit" value="ĐĂNG KÝ"> <br>
							</form>
							</div>
							${kiemtradangnhap}
							<span id="ketqua"></span>
				</div>

				<div id="social-icon">
					<img alt="icon_facebook"
						src='<c:url value="/resource/images/icon_fb.png"/>'> <img
						alt="icon_google"
						src='<c:url value="/resource/images/icon_gg.png"/>'>
				</div>



			</div>

		</div>


	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>