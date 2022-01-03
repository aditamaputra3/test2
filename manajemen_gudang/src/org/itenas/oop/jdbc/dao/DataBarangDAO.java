package org.itenas.oop.jdbc.dao;

import java.util.List;

import org.itenas.oop.jdbc.bean.DataBarang;

public interface DataBarangDAO {
    public DataBarang getDataBarangByIdbarang(String id_barang);
    public void getDataBarangByNamabarang(String nama_barang);
    public String getNamaBarangByIdbarang(String id_barang);
    
    public List<DataBarang> getAllDataBarang();
    public void saveDataBarang(DataBarang dataBarang);
    public void updateDataBarang(DataBarang dataBarang);
    public void deleteDataBarang(DataBarang dataBarang);
}
