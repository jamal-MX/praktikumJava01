package helper;

import Model.Matakuliah;

import java.sql.*;
import java.util.ArrayList;

public class MyConnection<matakuliahList> {
    public static  void main(String[] args){
        Matakuliah matakuliah;
        ArrayList<Matakuliah>matakuliahList = new ArrayList<>();
        MyConnection myConnection = new MyConnection();
        Connection con = myConnection.getConnection();

        String selectQuery = "select * FROM matakuliah"
        Statement statement;
        ResultSet resultSet;

     try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()){
                matakuliah = new Matakuliah(
                        resultSet.getInt("id_matakuliah"),
                        resultSet.getString("nama_matakuliah"),
                        resultSet.getString("singkatan_matakuliah"),
                        resultSet.getString("nama_dosen"),
                        resultSet.getString("kontak_dosen"),
                        resultSet.getBoolean("aktif")
                );
               matakuliahList.add(matakuliah);
         }
        } catch (SQLException e) {
         e.printStackTrace();
     }
        }
        for (Matakuliah value : matakuliahList){
            System.out.print(value.getIdMatakuliah());
            System.out.print("\t");
            System.out.print(value.getSingkatanMatakuliah());
            System.out.print(value.getNamaDosen());
            System.out.print();


    }
    }


