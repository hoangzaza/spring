<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- file này chứa đường dẫn tới các file css dùng chung. đỡ phải import nhiều lần -->



<!-- import thư viện jstl để cho nó lấy được đường dẫn tuyệt đối, nếu lấy đương dẫn tương đối thì thay đổi url no sẽ không đúng nữa -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- page này sẽ lưu tất cả các file css js tham chiếu đến -->

<link rel="stylesheet" type="text/css"
	href='<c:url value="/resource/css/bootstrap.min.css"/> '>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resource/css/animate.css"/> '>