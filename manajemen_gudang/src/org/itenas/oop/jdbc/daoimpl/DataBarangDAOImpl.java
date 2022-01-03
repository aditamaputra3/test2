package org.itenas.oop.jdbc.daoimpl;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.itenas.oop.jdbc.bean.DataBarang;
import org.itenas.oop.jdbc.dao.DataBarangDAO;
import org.itenas.oop.jdbc.utils.DatabaseUtil;
import org.itenas.oop.jdbc.views.TableView;

public class DataBarangDAOImpl implements DataBarangDAO {
	
	@Override
	public DataBarang getDataBarangByIdbarang(String id_barang) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getDataBarangByNamabarang(String nama_barang) {
		DatabaseUtil db = new DatabaseUtil();
		DataBarang dataBarang = new DataBarang();
		try {
			db.connect();
 
            String query = "SELECT * FROM data_barang WHERE nama_barang = '"+nama_barang+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	dataBarang.setId_barang(rs.getObject(1).toString());
                    	dataBarang.setNama_barang(rs.getObject(2).toString());
                    	dataBarang.setJenis_barang(rs.getObject(3).toString());
                    	dataBarang.setHarga_barang(Integer.parseInt(rs.getObject(4).toString()));
                    	dataBarang.setStock(Integer.parseInt(rs.getObject(5).toString()));
                    }
                } while (rs.next());
                
            } else {
            	dataBarang.setNama_barang(nama_barang);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleDataBarang(dataBarang);
	}


	@Override
	public String getNamaBarangByIdbarang(String id_barang) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<DataBarang> getAllDataBarang() {
		List<DataBarang> listDataBarang = new ArrayList<DataBarang>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			 
            String query = "SELECT * FROM data_barang";
         
            ResultSet rs = db.readData(query);
 
            // process query results
            while (rs.next()) {
 
            	DataBarang dataBarang = new DataBarang();
            	
            	dataBarang.setId_barang(rs.getObject(1).toString());
            	dataBarang.setNama_barang(rs.getObject(2).toString());
            	dataBarang.setJenis_barang(rs.getObject(3).toString());
            	dataBarang.setHarga_barang(Integer.parseInt(rs.getObject(4).toString()));
            	dataBarang.setStock(Integer.parseInt(rs.getObject(5).toString()));
                
                listDataBarang.add(dataBarang);
 
            } 
            //close db connection
            db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
		return listDataBarang;
	}


	@Override
	public void saveDataBarang(DataBarang dataBarang) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO data_barang VALUES ("
	                     + "'" + dataBarang.getId_barang()   +"',"
	                     + "'" + dataBarang.getNama_barang() +"',"
	                     + "'" + dataBarang.getJenis_barang()+"',"
	                     + "'" + dataBarang.getHarga_barang()+"',"
	                     + "'" + dataBarang.getStock()       +"'"
	                     + ")";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
	}

	@Override
	public void updateDataBarang(DataBarang dataBarang) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE data_barang SET nama_barang='"+dataBarang.getNama_barang()+"',"
					+ " jenis_barang='"+dataBarang.getJenis_barang()+"',"
					+ " harga_barang="+dataBarang.getHarga_barang()+","
					+ " stock="+dataBarang.getStock()+" WHERE id_barang='"+dataBarang.getId_barang()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public void deleteDataBarang(DataBarang dataBarang) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM data_barang WHERE id_barang='"+dataBarang.getId_barang()+"'";
			db.executeQuery(query);
			TableView.displayTabelDataBarang(getAllDataBarang());
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}


	
}
