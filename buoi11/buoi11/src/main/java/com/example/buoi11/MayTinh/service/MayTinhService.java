package com.example.buoi11.MayTinh.service;

import com.example.buoi11.MayTinh.Entity.MayTinh;

import java.util.List;

public interface MayTinhService {
    List<MayTinh> getAll();
    MayTinh getOne(String ma);
    Boolean remove(String ma);
    Boolean update( MayTinh mayTinh);
    Boolean ADD(MayTinh mayTinh);
}
