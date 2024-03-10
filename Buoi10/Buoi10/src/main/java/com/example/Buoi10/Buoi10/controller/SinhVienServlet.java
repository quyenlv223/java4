package com.example.Buoi10.Buoi10.controller;

import com.example.Buoi10.Buoi10.entity.SinhVien;
import com.example.Buoi10.Buoi10.service.SinhVienService;
import com.example.Buoi10.Buoi10.service.impl.SinhVienServiceimpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SinhVienServlet", value = {
        "/sinh-vien/hien-thi",
        "/sinh-vien/search",
        "/sinh-vien/remove",
        "/sinh-vien/detail",
        "/sinh-vien/view-update",
        "/sinh-vien/update",
        "/sinh-vien/view-add",
        "/sinh-vien/add"
}
)
public class SinhVienServlet extends HttpServlet {
    List<SinhVien> listsv = new ArrayList<>();
    SinhVienService sinhVienService = new SinhVienServiceimpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/hien-thi")) {
            this.hienthi(request, response);
        } else if (uri.contains("/search")) {
            this.search(request, response);
        } else if (uri.contains("/remove")) {
            this.remove(request, response);
        } else if (uri.contains("/detail")) {
            this.detail(request, response);
        } else if (uri.contains("/view-update")) {
            this.viewupdate(request, response);
        } else if (uri.contains("/view-add")) {
            this.viewadd(request, response);
        } else {
            this.hienthi(request, response);
        }
    }

    private void viewadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buoi10/add.jsp").forward(request, response);
    }

    private void viewupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        SinhVien sv = sinhVienService.getOne(ma);
        request.setAttribute("sv", sv);
        request.getRequestDispatcher("/buoi10/viewupdate.jsp").forward(request, response);
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        SinhVien sv = sinhVienService.getOne(ma);
        request.setAttribute("sv", sv);
        request.getRequestDispatcher("/buoi10/detail.jsp").forward(request, response);
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ma");
//        SanPham lop = sanPhamRepository.getOne(Long.valueOf(id));
        sinhVienService.Remove(id);
        listsv = sinhVienService.getAll();
        request.setAttribute("list", listsv);
        request.getRequestDispatcher("/buoi10/trangchu.jsp").forward(request, response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listsv = sinhVienService.getAll();
        request.setAttribute("list", listsv);
        request.getRequestDispatcher("/buoi10/trangchu.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/add")) {
            this.add(request, response);
        } else if (uri.contains("/update")) {
            this.update(request, response);
        }


    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ten = request.getParameter("ten");
        String tuoi = request.getParameter("tuoi");
        String diaChi = request.getParameter("diaChi");
        String gioiTinh = request.getParameter("gioiTinh");
//        SinhVien sv = new SinhVien(ten, Long.parseLong(tuoi), diaChi, Boolean.parseBoolean(gioiTinh));
        SinhVien sinhVien = SinhVien.builder()
                .ten(ten)
                .tuoi(Long.parseLong(tuoi))
                .diaChi(diaChi)
                .gioiTinh(Boolean.parseBoolean(gioiTinh))
                .build();
        String ma = request.getParameter("ma");
        SinhVien sv = sinhVienService.getOne(ma);
//        sinhVienService.update(sinhVien);
        response.sendRedirect("/sinh-vien/hien-thi");
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ten = request.getParameter("ten");
        String tuoi = request.getParameter("tuoi");
        String diaChi = request.getParameter("diaChi");
        String gioiTinh = request.getParameter("gioiTinh");
//        SinhVien sv = new SinhVien(ten, Long.parseLong(tuoi), diaChi, Boolean.parseBoolean(gioiTinh));
        SinhVien sinhVien = SinhVien.builder()
                .ten(ten)
                .tuoi(Long.parseLong(tuoi))
                .diaChi(diaChi)
                .gioiTinh(Boolean.parseBoolean(gioiTinh))
                .build();
        sinhVienService.add(sinhVien);
        response.sendRedirect("/sinh-vien/hien-thi");

    }
}
