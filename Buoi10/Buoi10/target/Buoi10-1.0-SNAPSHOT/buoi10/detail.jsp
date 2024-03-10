<%--
  Created by IntelliJ IDEA.
  User: mr.quyen
  Date: 30/03/2023
  Time: 3:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/giang-vien" method="post">
    <div class="mb-3">
        <label class="form-label"> Ma</label>
        <input type="text" class="form-control" name="ma" value="${sv.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label"> Tên</label>
        <input type="text" class="form-control" name="ten" value="${sv.ten}">
    </div>
    <div class="mb-3">
        <label class="form-label"> Tuổi</label>
        <input type="number" class="form-control" name="tuoi" value="${sv.tuoi}">
    </div>
    <div class="mb-3">
        <label class="form-label">Giới tính</label>
        <input type="radio" class="form-control" value="true" name="gioiTinh" ${sv.gioiTinh=='true'?"checked":""} >Nam
        <input type="radio" class="form-control" value="false"
               name="gioiTinh" ${sv.gioiTinh== 'false'?"checked":""} >Nữ
    </div>
    <div class="mb-3">
        <label class="form-label">Địa chỉ</label>
        <input type="text" class="form-control" name="diaChi" value="${sv.diaChi}">
    </div>
<%--    <button type="submit" class="btn btn-outline-primary">ADD</button>--%>
</form>

</body>
</html>
