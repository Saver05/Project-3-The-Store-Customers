/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3jackframbes;

/**
 * 
 * @author jfram
 */
public class Project3JackFrambes {

    /**
     * Main method for the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer Jack = new Customer("Jack", "000456780", "frambesj@xavier.edu");
        Customer Tom = new Customer("Tom", "00065a321", "ThomasTom@xavier.edu");
        Customer Ashley = new Customer("Ashley", "00012345", "AshnessAshley@xavier.edu");
        Visit J = new Visit(Jack,"03/25/2022","23:17");
        Visit T = new Visit(Tom,"03/20/2022","17:20");
        Visit A = new Visit(Ashley,"03/01/2022","08:59");
        System.out.println(J.getDay()+" "+T.getHour()+" "+A.getMinute());
        System.out.println(J.getMonth()+" "+T.getYear()+" "+A.getVisitor());
        System.out.println(J.toString()+" "+T.toString()+" "+A.toString());
    }

}
