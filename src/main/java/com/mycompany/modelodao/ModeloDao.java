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
import java.sql.Timestamp;

public class ModeloDao {

    public static void main(String[] args) {
       
       
       
       RequestDao RequestDao = new RequestDaoImpl();
        Request request = new Request(
            1,                                 // id
            101,                               // idEmployees
            5,                                 // idTypeRequest
            Date.valueOf("2024-09-17"),  // dateStart
            new Timestamp(System.currentTimeMillis()),  // datarequest (timestamp actual)
            new Timestamp(System.currentTimeMillis() + 86400000), // dateFinal (un día después)
            "las vacaciones se dieron papa"            // comment
        );
        String result = RequestDao.register(request);
        System.out.println(result);
    }

    
    /*   
    RequestDao RequestDao = new RequestDaoImpl();
    Request rql = RequestDao.read(119);
    System.out.println(rql.toString());
    }  
    */
}
