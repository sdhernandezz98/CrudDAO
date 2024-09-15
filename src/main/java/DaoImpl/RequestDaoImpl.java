/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.RequestDao;
import Model.Request;
import java.util.ArrayList;
import Model.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class RequestDaoImpl implements RequestDao{

    @Override
    public String register(Request request) {
        
    String result = "";
    String sql = "INSERT INTO request (id_employees, date_request, comment, date_start, date_final, id_tipe_request) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
         
        // Configura los parámetros del PreparedStatement
        ps.setInt(1, request.getIdEmployees());
        ps.setTimestamp(2, (Timestamp) request.getDatarequest());
        ps.setString(3, request.getComment());
        ps.setDate(4, (Date) request.getDateStart());
        ps.setTimestamp (5, (Timestamp) request.getDateFinal());
        ps.setInt(6, request.getIdTypeRequest());
        
        // Ejecuta la sentencia
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            result = "Registro exitoso";
        } else {
            result = "No se pudo registrar";
        }
    } catch (SQLException e) {
        e.printStackTrace();
        result = "Error en la base de datos: " + e.getMessage();
    }

    return result;
        
    }



    @Override
    public String delete(Request request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(Request request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Request read(int id) {
        Request rql = null;
        String sql = "SELECT * FROM request WHERE id = ?;";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
         
        // Configura los parámetros del PreparedStatement
        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()) {
            //int oid = rs.getInt("id");
            int id_employees = rs.getInt("id_employees");
            Timestamp date_request = rs.getTimestamp("date_request");
            String comment = rs.getString("comment");
            Date date_start = rs.getDate("date_start");
            Timestamp date_final = rs.getTimestamp("date_final");
            int id_tipe_request = rs.getInt("id_tipe_request");
            
        rql = new Request(id, id_employees, id_tipe_request,  date_start, date_request, date_final, comment);

        }

    } catch (SQLException e) {
        e.printStackTrace();
        
    }
      
     return rql;   
}

    
    
}
