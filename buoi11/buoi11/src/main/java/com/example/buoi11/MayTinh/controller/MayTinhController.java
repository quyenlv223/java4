package com.example.buoi11.MayTinh.controller;

import com.example.buoi11.MayTinh.Entity.MayTinh;
import com.example.buoi11.MayTinh.repository.MayTinhRepository;
import com.example.buoi11.MayTinh.service.MayTinhService;
import com.example.buoi11.MayTinh.service.impl.MayTinhServiceimpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MayTinhController", value = {
        "/may-tinh/hien-thi",
        "/may-tinh/view-add",
        "/may-tinh/add",
        "/may-tinh/view-update",
        "/may-tinh/remove",
        "/may-tinh/xap-xep",
        "/may-tinh/update"

})
public class MayTinhController extends HttpServlet {
    private List<MayTinh> listmt = new ArrayList<>();
    private MayTinhService mayTinhService = new MayTinhServiceimpl();
    private MayTinhRepository mayTinhRepository = new MayTinhRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/hien-thi")) {
            this.hienthi(request, response);
        } else if (uri.contains("/view-add")) {
            this.viewadd(request, response);
        } else if (uri.contains("/view-update")) {
            this.viewupdate(request, response);
        } else if (uri.contains("/remove")) {
            this.remve(request, response);
        } else {
            this.hienthi(request, response);
        }

    }

    private void remve(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        mayTinhService.remove(ma);
//        MayTinh mayTinh = mayTinhRepository.getOne(ma);
//        mayTinhRepository.delete(mayTinh);
        listmt = mayTinhService.getAll();
        request.setAttribute("list", listmt);
        request.getRequestDispatcher("/buoi11/trangchu.jsp").forward(request, response);

    }

    private void sapxep(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String ma =  request.getParameter("ma");
     MayTinh mayTinh = mayTinhService.getOne(ma);
     request.setAttribute("sv",mayTinh);
        request.getRequestDispatcher("/buoi11/viewupdate.jsp").forward(request, response);

    }

    private void viewadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buoi11/viewadd.jsp").forward(request, response);

    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listmt = mayTinhService.getAll();
        request.setAttribute("list", listmt);
        request.getRequestDispatcher("/buoi11/trangchu.jsp").forward(request, response);
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

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String gia  = request.getParameter("gia");
        String boNho = request.getParameter("boNho");
        String mauSac = request.getParameter("mauSac");
        String hang = request.getParameter("hang");
        String mieuTa = request.getParameter("mieuTa");
        MayTinh mayTinh  =  MayTinh.builder()
                .ten(ten)
                .gia(Double.parseDouble(gia))
                .boNho(boNho)
                .mauSac(Boolean.parseBoolean(mauSac))
                .hang(hang)
                .mieuTa(mieuTa)
                .build();
        mayTinhService.update(mayTinh);
        listmt = mayTinhService.getAll();
        request.setAttribute("list", listmt);
        request.getRequestDispatcher("/buoi11/trangchu.jsp").forward(request, response);

    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String gia  = request.getParameter("gia");
        String boNho = request.getParameter("boNho");
        String mauSac = request.getParameter("mauSac");
        String hang = request.getParameter("hang");
        String mieuTa = request.getParameter("mieuTa");
        MayTinh mayTinh  =  MayTinh.builder()
                .ten(ten)
                .gia(Double.parseDouble(gia))
                .boNho(boNho)
                .mauSac(Boolean.parseBoolean(mauSac))
                .hang(hang)
                .mieuTa(mieuTa)
                .build();
        mayTinhService.ADD(mayTinh);
        listmt = mayTinhService.getAll();
        request.setAttribute("list", listmt);
        request.getRequestDispatcher("/buoi11/trangchu.jsp").forward(request, response);

    }
}
