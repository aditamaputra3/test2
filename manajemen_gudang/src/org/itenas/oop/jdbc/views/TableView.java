package org.itenas.oop.jdbc.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.jdbc.bean.DataBarang;
import org.itenas.oop.jdbc.dao.DataBarangDAO;
import org.itenas.oop.jdbc.daoimpl.DataBarangDAOImpl;


public class TableView {
	public static void main(String[] args) {
		DataBarangDAO operation = new DataBarangDAOImpl();
		displayTabelDataBarang(operation.getAllDataBarang());
	}
	
	public static void displayTabelDataBarang(List<DataBarang> listDataBarang) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA KARYAWAN TETAP					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId\t\t|\tNama Barang\t\t\t|      jenis       			|       Stock   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (DataBarang dBarang : listDataBarang) {
			System.out.println("    |\t"+dBarang.getId_barang()+"\t|       "+dBarang.getNama_barang()+"\t        |       "+dBarang.getJenis_barang()+"\t|\t"+dBarang.getStock()+"    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			DataBarangView.displayMenuDataBarang();
		}
	}
	
	public static void displayTupleDataBarang(DataBarang dataBarang) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA KARYAWAN TETAP				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id\t\t: " + dataBarang.getId_barang()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + dataBarang.getNama_barang()+"\t\t\t|");
		System.out.println("    |Jenis\t\t: " + dataBarang.getJenis_barang()+"\t\t|");
		System.out.println("    |Harga\t\t: " + dataBarang.getHarga_barang()+"\t\t|");
		System.out.println("    |Stock\t\t: " + dataBarang.getStock()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			DataBarangView.displayMenuDataBarang();
		}
	}
}
