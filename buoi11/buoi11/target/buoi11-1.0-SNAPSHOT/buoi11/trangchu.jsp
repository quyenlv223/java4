<%--
  Created by IntelliJ IDEA.
  User: mr.quyen
  Date: 31/03/2023
  Time: 8:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<body>
<div class="container">
    <h3 class="text center"> Trang Chủ</h3>
    <button>
        <a href="/may-tinh/view-add">add</a>
    </button>
    <table>
        <tr>
            <th>STT</th>
<%--            <th>Mã</th>--%>
            <th>Tên</th>
            <th>Giá</th>
            <th>Bộ nhớ</th>
            <th>Màu Sắc</th>
            <th>Hãng</th>
            <th>Miêu tả</th>
            <th>action</th>
        </tr>
        <tbody>
        <c:forEach items="${list}" var="sv" varStatus="i">
            <tr>
                <td>${i.index}></td>
<%--                <td>${sv.ma}</td>--%>
                <td>${sv.ten}</td>
                <td>${sv.gia}</td>
                <td>${sv.boNho}</td>
                <td>${sv.mauSac}</td>
                <td>
                    <c:if test="${sv.hang=='1'}">MSI</c:if>
                    <c:if test="${sv.hang=='2'}">ASUS</c:if>
                    <c:if test="${sv.hang=='3'}">ACER</c:if>
                    <c:if test="${sv.hang=='4'}">DELL</c:if>
                </td>
                <td>${sv.mieuTa}</td>
                    <%--                <td>--%>
                    <%--                    <c:if test="${sv.gioiTinh=='true'}">Nam</c:if>--%>
                    <%--                    <c:if test="${sv.gioiTinh=='false'}">Nữ</c:if>--%>
                    <%--                </td>--%>
                <td>
<%--                    <button>--%>
<%--                        <a href="/s/detai?ma=${sv.ma}">detail</a>--%>
<%--                    </button>--%>

                    <button>
                        <a href="/may-tinh/view-update?ma=${sv.ma}">update</a>
                    </button>
                    <button>
                        <a href="/may-tinh/remove?ma=${sv.ma}">remove</a>
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
        crossorigin="anonymous"></script>



</body>
</html>
