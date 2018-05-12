<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<a href="/chitiet" id="testthea">Qua sang chi tiết</a>
	${hoten}
<!-- để dùng được modelattribute thì tên các trường phải giống với tên thuộc tính của đối tượng (phải truyền tất cả các thuộc tính với kiểu dữ liệu nguyên thủy) -->
	<p>Đây là đoạn văn có chứa CSS </p>
</body>
</html>