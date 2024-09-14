/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.modelodao;

import Dao.RequestDao;
import DaoImpl.RequestDaoImpl;
import Model.Conexion;
import Model.Request;
import java.sql.Connection;
import java.sql.Date;

public class ModeloDao {

    public static void main(String[] args) {
       
        
       /* Connection con = Conexion.getConnection();
        
        if (con != null){
            System.out.println("Exitoso");
        
        }*/
       
       RequestDao RequestDao = new RequestDaoImpl();
       Request request = new Request(
            115,                          // id
            40,                        // idEmployees
            8,                          // idTypeRequest
            Date.valueOf("2024-09-12"),  // datarequest
            Date.valueOf("2024-09-17"),  // dateStart
            Date.valueOf("2024-09-20"),  // dateFinal
            "Vacaciones solicitadas"     // comment
        );
        String result = RequestDao.register(request);
        System.out.println(result);
    }
}
