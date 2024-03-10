<%--
  Created by IntelliJ IDEA.
  User: mr.quyen
  Date: 30/03/2023
  Time: 2:51 SA
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
        <a href="/sinh-vien/view-add">ADD</a>
    </button>
    <table>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Tuổi</th>
            <th>Địa chỉ</th>
            <th>Giới tính</th>
            <th>action</th>
        </tr>
        <tbody>
        <c:forEach items="${list}" var="sv" varStatus="i">
            <tr>
                <td>${i.index}></td>
                <td>${sv.ten}</td>
                <td>${sv.tuoi}</td>
                <td>${sv.diaChi}</td>
                <td>
                    <c:if test="${sv.gioiTinh=='true'}">Nam</c:if>
                    <c:if test="${sv.gioiTinh=='false'}">Nữ</c:if>
                </td>
                <td>
                    <button>
                        <a href="/sinh-vien/detail?ma=${sv.ma}">detail</a>
                    </button>

                    <button>
                        <a href="/sinh-vien/view-update?ma=${sv.ma}">update</a>
                    </button>
                    <button>
                        <a href="/sinh-vien/remove?ma=${sv.ma}">remove</a>
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

