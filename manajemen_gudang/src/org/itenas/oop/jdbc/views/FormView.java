package org.itenas.oop.jdbc.views;

import java.util.Scanner;

import org.itenas.oop.jdbc.bean.DataBarang;
import org.itenas.oop.jdbc.dao.DataBarangDAO;
import org.itenas.oop.jdbc.daoimpl.DataBarangDAOImpl;

public class FormView {
	public static void formInsertDataBarang() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		DataBarang dataBarang = new DataBarang();
		DataBarangDAO operation = new DataBarangDAOImpl();
		System.out.println("              *****************************************                  ");
        System.out.println("              | Form Insert Data Barang               |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | Kode Barang			 :");
        dataBarang.setId_barang(scanner.nextLine());
        System.out.print("              | Nama Barang            :");
        dataBarang.setNama_barang(scanner2.nextLine());
        System.out.print("              | Jenis Barang           :");
        dataBarang.setJenis_barang(scanner2.nextLine());
        System.out.print("              | Harga Barang           :");
        dataBarang.setHarga_barang(scanner2.nextInt());
        System.out.print("              | Stock                  :");
        dataBarang.setStock(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.saveDataBarang(dataBarang);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			DataBarangView.displayMenuDataBarang();
		}
	}
	
	public static void formUpdateDataBarang() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int nip;
		char back;
		DataBarang dataBarang = new DataBarang();
		DataBarangDAO operation = new DataBarangDAOImpl();
		System.out.print("Masukkan NIP dari data yang akan diupdate: ");
		nip = scanner.nextInt();
		System.out.println();
		System.out.println("              *****************************************                  ");
        System.out.println("              | Form Update Data Karyawan Tetap        |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | Kode Barang			 :");
        dataBarang.setId_barang(scanner.nextLine());
        System.out.print("              | Nama Barang            :");
        dataBarang.setNama_barang(scanner2.nextLine());
        System.out.print("              | Jenis Barang           :");
        dataBarang.setJenis_barang(scanner2.nextLine());
        System.out.print("              | Harga Barang           :");
        dataBarang.setHarga_barang(scanner2.nextInt());
        System.out.print("              | Stock                  :");
        dataBarang.setStock(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.updateDataBarang(dataBarang);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			DataBarangView.displayMenuDataBarang();
		}
	}
	
	public static void formDeleteDataBarang() {
		Scanner scanner = new Scanner(System.in);
		String id_barang;
		DataBarang dataBarang = new DataBarang();
		DataBarangDAO operation = new DataBarangDAOImpl();
		System.out.print("Masukkan Kode Barang dari data yang akan dihapus: ");
		id_barang = scanner.nextLine();
		dataBarang.setId_barang(id_barang);;
		operation.deleteDataBarang(dataBarang);	
	}
	

	public static void formSearchDataBarangByJenisbarang() {
		Scanner scanner = new Scanner(System.in);
		String nama;
		DataBarang dataBarang = new DataBarang();
		DataBarangDAO operation = new DataBarangDAOImpl();
		System.out.print("Masukkan jenis barang dari data yang akan dicari: ");
		nama = scanner.nextLine();
		dataBarang.setNama_barang(nama);
		operation.getDataBarangByNamabarang(nama);	
	}
}
