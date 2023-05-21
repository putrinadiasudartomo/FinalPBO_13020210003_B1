package koneksi;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zidan bsa
 */
public class konekk {
     Connection connect = null;
public static Connection koneksi(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/rental_camera","root","");
        return koneksi;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}   
}
