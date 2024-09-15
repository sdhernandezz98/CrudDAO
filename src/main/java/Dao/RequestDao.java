/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Model.Request;
import java.util.ArrayList;

/**
 *
 * @author XPG
 */
public interface RequestDao {
    public String register(Request request);
    public ArrayList<Request> searchAll();
    public String delete(Request request);
    public String update(Request request);
    public Request read(int id);
}