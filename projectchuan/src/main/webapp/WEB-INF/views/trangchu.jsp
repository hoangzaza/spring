<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp" />
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resource/css/trangchu.css"/> '>
</head>
<body>
	<div class="container-fuild" id="header">
		<nav class="navbar navbar-expand-lg navbar-light bg-light none-nav">
		<a class="navbar-brand" href="#"><span id="brand">Navi </span>
			Shop</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto nav-center">
				<li class="nav-item active"><a class="nav-link" href="#">TRANG
						CHỦ <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Dropdown </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="#">DỊCH VỤ</a></li>
				<li class="nav-item"><a class="nav-link" href="#">LIÊN HỆ</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item">
				<c:choose>
				<c:when test="${tendangnhap!=null }">
				<a class="nav-link circle-avatar" href="#">${chucaidau}</a>
				</c:when>
				<c:otherwise>
				<a class="nav-link" href="dangnhap/">ĐĂNG NHẬP</a>
				</c:otherwise>
				
				</c:choose>
				
				
				</li>
				<li class="nav-item"><a class="nav-link" href="#"> <img style="margin-top: 10px"
						alt="icon cart"
						src='<c:url value="/resource/images/icon_cart.png"/> '>
				</a></li>
			</ul>

		</div>
		</nav>
		<div class="event_header container wow bounceIn">
			<span>Từ ngày 20/5-23/5/2018</span><br /> <span id="content-event">Mua
				1 tặng 1</span><br />
			<button>XEM NGAY</button>

		</div>

	</div>
	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 wow fadeInLeft data-wow-duration="1s">
				<img alt="icon chat luong"
					src='<c:url value="/resource/images/icon_quality.png"/>'><br>
				<span style="font-size: 32px; font-weight: 500">CHẤT LƯỢNG</span><br>
				<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng
					sản phẩm tốt nhất</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4 wow fadeInDown" data-wow-duration="1s" data-wow-delay="1s">
				<img alt="icon chat luong"
					src='<c:url value="/resource/images/icon_pig.png"/>'><br>
				<span style="font-size: 32px; font-weight: 500">TIẾT KIỆM CHI
					PHÍ</span><br> <span>Cam kết giá rẻ nhất Việt Nam giúp các bạn
					tiết kiệm hơn 20% cho từng sản phẩm</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4 wow fadeInRight" data-wow-duration="1s" data-wow-delay="2s">
				<img alt="icon chat luong"
					src='<c:url value="/resource/images/icon_delivery.png"/>'><br>
				<span style="font-size: 32px; font-weight: 500">GIAO HÀNG</span><br>
				<span>Cam kết giao hàng tận nơi trong ngày. Để mang sản phẩm
					đến cho khách hàng nhanh nhất</span>
			</div>
		</div>
	</div>
	<div id="text-hot" class="container">
		<span>SẢN PHẨM HOT</span>
		<div class="row" style="margin-top: 48px">
			
			<c:forEach var="sanpham" items="${listsanpham}">
			<div class="col-md-3 col-sm-6">
				<a href="chitiet/${sanpham.getMaSanPham()}">
				<div class="card sanpham wow zoomIn">
					<img class="card-img-top" alt="hình sản phẩm" style="width:100%"
						src='<c:url value="/resource/images/sanpham/${sanpham.getHinhSanPham()}"/>'>
					<div class="card-body">
						<span>${sanpham.getTenSanPham()}</span><br> 
						<span class="price">${sanpham.getGiaTien()} VND</span>
					</div>
				</div>
				</a>
			</div>
			
			</c:forEach>
		</div>
	</div>


	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-md-4 col-sm-4">
				<p><span class="title-footer">THÔNG TIN SHOP</span></p>
				<span>Navi là một thương hiệu thời trang đầy uy tín luôn đảm bảo chất lượng sản phẩm tốt nhất cho khách hàng</span>
			</div>

			<div class="col-md-4 col-sm-4">
				<p><span class="title-footer">LIÊN HỆ</span></p>
				<span>Số 1, Đại Cồ Việt, Quận Hai Bà Trưng Hà Nội</span>
				<span>20141797@student.hust.edu.vn</span><br>
				<span>0944077026</span>
			</div>

			<div class="col-md-4 col-sm-4">
			<p><span class="title-footer">GÓP Ý</span></p>
			<form action="" method="post">
			<input name="tenNhanVien" class="text-input" type="text" placeholder="Email">
			<textarea name="tuoi" class="text-input" rows="4" cols="50" placeholder="Nội dung"></textarea>
			<button class="material-button">ĐỒNG Ý</button>
			</form>
			
			</div>

		</div>

	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>