<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${ten}<br>
${tuoi}
<!-- c: out tương đương với tag = trong jsp -->
<c:out value="${ten}"/><br>
<c:out value="${tuoi}"/>

<!-- c:set <%! %>  set thuộc tính tenNhanVien cho đối tượng nhanvien lấy từ bean với giá trị là value-->
<jsp:useBean id="nhanvien" class="com.hoangnv.entity.NhanVien"/>
<c:set value="HoangNV" target="${nhanvien}" property="tenNhanVien" />
<c:out value="${nhanvien.tenNhanVien }"/>

<!-- c:set khai báo biến hoten và in ra biến đó giống declare ex -->
<c:set var="hoten" value="${ten} hoàng đẹp trai"/>
<c:out value="${hoten}"/>

<!-- c:reomve xóa đi biến (vd: biến hoten vừa tạo ở trên) -->
<c:remove var="hoten"/>
<c:out value="${hoten}"/>
<!-- c:if -->
<c:if test='${ten=="Nguyen Van Hoang" ||tuoi==18 }'>
hàm thực hiện tron if
</c:if>

<!-- c:catch nếu gặp lỗi xử lý web sẽ hiện lỗi chứ không hiện giao diện. để trong catch thì có lỗi nó vẫn hiện giao diện -->
<c:catch var="exception">
<% int a=5/0; %>
</c:catch>
<c:if test="${exception!=null }">
Lỗi : ${exception.message}
</c:if>

<!-- c:choose giống switch  when giống case otherwise giống default -->
<c:set var="dk" value="100"/>
<c:choose>
<c:when test="${dk<=100}">
số này nhỏ hơn 100
</c:when>
<c:when test="${dk<200}">
số này nhỏ hơn 200
</c:when>
<c:otherwise>
số này không trong khoảng
</c:otherwise>

</c:choose>

<!-- foreach -->
<c:forEach items="${listnhanvien}" var="item">
<c:out value="${item.getTenNhanVien()}"></c:out>

</c:forEach>

<!--fortokens dùng để cắt chuỗi như hàm split trong js cắt chuỗi theo chuỗi trong delims vd: cắt chuỗi theo dấu , cứ gặp , là cắt  -->
<!-- nếu chuyền một chuỗi nhiều kí tự vào delims thì nó sẽ cắt chuỗi bởi mỗi kí tự của chuỗi đó chứ không phải là cả chuỗi đó -->
<c:forTokens items="hoàng , đẹp trai, nhất xóm" delims="," var="item">
<c:out value="${item}"/><br>
</c:forTokens>
</body>
</html>