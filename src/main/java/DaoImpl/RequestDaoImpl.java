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
import java.sql.SQLException;

public class RequestDaoImpl implements RequestDao{

    @Override
    public String register(Request request) {
        
    String resultado = "";
    String sql = "INSERT INTO request (id_employees, date_request, comment, date_start, date_final, id_tipe_request) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
         
        // Configura los parámetros del PreparedStatement
        ps.setInt(1, request.getIdEmployees());
        ps.setDate(2, (Date) request.getDatarequest());
        ps.setString(3, request.getComment());
        ps.setDate(4, (Date) request.getDateStart());
        ps.setDate(5, (Date) request.getDateFinal());
        ps.setInt(6, request.getIdTypeRequest());
        
        // Ejecuta la sentencia
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            resultado = "Registro exitoso";
        } else {
            resultado = "No se pudo registrar";
        }
    } catch (SQLException e) {
        e.printStackTrace();
        resultado = "Error en la base de datos: " + e.getMessage();
    }
    
    return resultado;
        
    }

    @Override
    public ArrayList<Request> searchAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public Request read(int clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
