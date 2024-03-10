package com.example.Buoi10.Buoi10.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

    @Entity
    @Table(name = "sinh_vien")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString

    public class SinhVien {
        @Id
        @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
        @GeneratedValue(generator = "generator")
        @Column(name = "ma")
        private String ma;

        @Column(name = "ten")
        private String ten;

        @Column(name = "tuoi")
        private Long tuoi;

        @Column(name = "dia_chi")
        private String diaChi;

        @Column(name = "gioi_tinh")
        private boolean gioiTinh;


    }


