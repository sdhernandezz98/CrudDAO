/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Timestamp;
import java.util.Date;


public class Request {
    private int id,idEmployees,idTypeRequest;
    private Date dateStart;
    private Timestamp datarequest, dateFinal;
    private String comment;

    public Request(int id, int idEmployees, int idTypeRequest, Date dateStart, Timestamp datarequest, Timestamp dateFinal, String comment) {
        this.id = id;
        this.idEmployees = idEmployees;
        this.idTypeRequest = idTypeRequest;
        this.dateStart = dateStart;
        this.datarequest = datarequest;
        this.dateFinal = dateFinal;
        this.comment = comment;
    }

    public Request() {
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", idEmployees=" + idEmployees + ", idTypeRequest=" + idTypeRequest + ", dateStart=" + dateStart + ", datarequest=" + datarequest + ", dateFinal=" + dateFinal + ", comment=" + comment + '}';
    }


    public int getId() {
        return id;
    }

    public int getIdEmployees() {
        return idEmployees;
    }

    public int getIdTypeRequest() {
        return idTypeRequest;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Timestamp getDatarequest() {
        return datarequest;
    }

    public Timestamp getDateFinal() {
        return dateFinal;
    }

    public String getComment() {
        return comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public void setIdTypeRequest(int idTypeRequest) {
        this.idTypeRequest = idTypeRequest;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setDatarequest(Timestamp datarequest) {
        this.datarequest = datarequest;
    }

    public void setDateFinal(Timestamp dateFinal) {
        this.dateFinal = dateFinal;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
