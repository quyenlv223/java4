<%--
  Created by IntelliJ IDEA.
  User: mr.quyen
  Date: 31/03/2023
  Time: 8:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/may-tinh/update" method="post">
    <%--    <div class="mb-3">--%>
    <%--        <label class="form-label"> Ma</label>--%>
    <%--        <input type="text" class="form-control" name="ma" value="${sv.ma}">--%>
    <%--    </div>--%>
    <div class="mb-3">
        <label class="form-label"> Tên</label>
        <input type="text" class="form-control" name="ten" value="${sv.ten}">
    </div>
    <div class="mb-3">
        <label class="form-label"> Gia</label>
        <input type="number" class="form-control" name="gia" value="${sv.gia}">
    </div>
    <div class="mb-3">
        <label class="form-label"> Bo nho</label>
        <input type="text" class="form-control" name="boNho" value="${sv.boNho}">
    </div>
    <div class="mb-3">
        <label class="form-label">Màu SẮc</label>
        <input type="radio" class="form-control" value="true" name="gioiTinh" ${sv.mauSac=='true'?"checked":""} >Đen
        <input type="radio" class="form-control" value="false"
               name="gioiTinh" ${sv.mauSac== 'false'?"checked":""} >Bạc
    </div>
    <div class="mb-3">
        <label class="form-label"> Hãng </label>
        <input type="text" class="form-control" name="hang" value="${sv.hang}">
    </div>
    <div class="mb-3">
        <label class="form-label"> Miêu  TẢ </label>
        <input type="text" class="form-control" name="mieuTa" value="${sv.mieuTa}">
    </div>

    <button type="submit" class="btn btn-outline-primary">update</button>
</form>
</body>
</html>
