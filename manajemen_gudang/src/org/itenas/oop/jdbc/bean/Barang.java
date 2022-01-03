
package org.itenas.oop.jdbc.bean;

abstract class Barang{
	String id_barang;
	String nama_barang;
	String jenis_barang;
	int stock;
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getId_barang() {
		return id_barang;
	}
	public void setId_barang(String id_barang) {
		this.id_barang = id_barang;
	}
	public String getNama_barang() {
		return nama_barang;
	}
	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}
	public String getJenis_barang() {
		return jenis_barang;
	}
	public void setJenis_barang(String jenis_barang) {
		this.jenis_barang = jenis_barang;
	}
	
	
	
}
