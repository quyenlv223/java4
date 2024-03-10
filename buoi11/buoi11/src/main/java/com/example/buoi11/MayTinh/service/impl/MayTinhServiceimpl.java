package com.example.buoi11.MayTinh.service.impl;

import com.example.buoi11.MayTinh.Entity.MayTinh;
import com.example.buoi11.MayTinh.repository.MayTinhRepository;

import java.util.List;

public class MayTinhServiceimpl implements com.example.buoi11.MayTinh.service.MayTinhService {
    MayTinhRepository mayTinhRepository = new MayTinhRepository();

    @Override
    public List<MayTinh> getAll() {
        return mayTinhRepository.getAll();
    }

    @Override
    public MayTinh getOne(String ma) {
        return mayTinhRepository.getOne(ma);
    }

    @Override
    public Boolean remove(String ma) {
        MayTinh mayTinh= mayTinhRepository.getOne(ma);
        return mayTinhRepository.delete(mayTinh);
    }

    @Override
    public Boolean update(MayTinh mayTinh) {


        return mayTinhRepository.upadate(mayTinh);
    }

    @Override
    public Boolean ADD(MayTinh mayTinh) {
        return mayTinhRepository.ADD(mayTinh);
    }
}
