package com.zantung.pheptinh.model;

import java.io.Serializable;

public class ThiTiengAnh implements Serializable {
    private String ten_thi, id_thi;

    public ThiTiengAnh(String ten_thi, String id_thi) {
        this.ten_thi = ten_thi;
        this.id_thi = id_thi;
    }

    public ThiTiengAnh() {
    }

    public String getTen_thi() {
        return ten_thi;
    }

    public void setTen_thi(String ten_thi) {
        this.ten_thi = ten_thi;
    }

    public String getId_thi() {
        return id_thi;
    }

    public void setId_thi(String id_thi) {
        this.id_thi = id_thi;
    }
}
