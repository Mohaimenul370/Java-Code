/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

/**
 *
 * @author mahad
 */

import java.io.*;

public class Student extends Patron {
    String studentId, guardianName, guardianContactNo;
    void setStudentId(String studentId){
        this.studentId = studentId;
    }
    void setGuardianName(String guardianName){
        this.guardianName = guardianName;
    }
    void setGuardianContactNo(String guaradianContactNo){
        this.guardianContactNo = guaradianContactNo;
    }
    int getId() {
        return Integer.parseInt(studentId);
    }
    String getStudentId(){
        return studentId;
    }
    String getGuardianName(){
        return guardianName;
    }
    String getGuardianContactNo(){
        return guardianContactNo;
    }
    void showInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getStudentId());
        System.out.println("Guardian Name: "+ getGuardianName());
        System.out.println("Guardian Contact No "+ getGuardianContactNo()+"\n");        
    }
    public void borrow(Patron p, Book b) throws IOException {
        FileWriter fw = new FileWriter(p.getId()+".txt", true);
        fw.write("\nBorrowed Books: "+b.getTitle()+" id: "+b.getBookId());
        fw.close();
    }
    public void returnBook(Patron p, Book b){
        System.out.println("Thanks for returing book");
    }
    public void fine(Patron p, double amount) throws IOException {
        FileWriter fw = new FileWriter(p.getId()+".txt", false);
        fw.write("fine: "+amount);
        fw.close();
    }
}