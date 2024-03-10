package com.example.Buoi10.Buoi10.service;

import com.example.Buoi10.Buoi10.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    List<SinhVien> getAll();
    SinhVien getOne( String ma);
    Boolean Remove(String ma);
    Boolean add(SinhVien sinhVien);
    Boolean update(String ma);

}
