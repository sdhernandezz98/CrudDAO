/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


public class Request {
    private int id,idEmployees,idTypeRequest;
    private Date datarequest,dateStart,dateFinal;
    private String comment;

    public Request(int id, int idEmployees, int idTypeRequest, Date datarequest, Date dateStart, Date dateFinal, String comment) {
        this.id = id;
        this.idEmployees = idEmployees;
        this.idTypeRequest = idTypeRequest;
        this.datarequest = datarequest;
        this.dateStart = dateStart;
        this.dateFinal = dateFinal;
        this.comment = comment;
    }

    public Request() {
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public int getIdTypeRequest() {
        return idTypeRequest;
    }

    public void setIdTypeRequest(int idTypeRequest) {
        this.idTypeRequest = idTypeRequest;
    }

    public Date getDatarequest() {
        return datarequest;
    }

    public void setDatarequest(Date datarequest) {
        this.datarequest = datarequest;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(Date dateFinal) {
        this.dateFinal = dateFinal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", idEmployees=" + idEmployees + ", idTypeRequest=" + idTypeRequest + ", datarequest=" + datarequest + ", dateStart=" + dateStart + ", dateFinal=" + dateFinal + ", comment=" + comment + '}';
    }
    
    
    
}
