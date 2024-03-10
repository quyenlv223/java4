package com.example.Buoi10.Buoi10.service.impl;

import com.example.Buoi10.Buoi10.entity.SinhVien;
import com.example.Buoi10.Buoi10.repository.SinhVienRepository;
import com.example.Buoi10.Buoi10.service.SinhVienService;

import java.util.List;

public class SinhVienServiceimpl implements SinhVienService {
    SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public List<SinhVien> getAll() {
        return sinhVienRepository.GetAll();
    }


    @Override
    public SinhVien getOne(String ma) {

        return sinhVienRepository.GetOne(ma);
    }

    @Override
    public Boolean Remove(String ma) {
        SinhVien sinhVien = sinhVienRepository.GetOne(ma);
        return sinhVienRepository.remove(sinhVien);
    }

    @Override
    public Boolean add(SinhVien sinhVien) {
        return sinhVienRepository.ADD(sinhVien);
    }

    @Override
    public Boolean update(String ma) {
        SinhVien sinhVien = sinhVienRepository.GetOne(ma);
        return sinhVienRepository.update(sinhVien);
    }


}
