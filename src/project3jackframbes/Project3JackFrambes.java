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
        VisitorLog Log = new VisitorLog();
        Simulation s = new Simulation(5,15,21); 
        s.doSimulation();
        Customer Jack = new Customer("Jack", "000456780", "frambesj@xavier.edu");
        Customer Tom = new Customer("Tom", "00065a321", "ThomasTom@@xavier.edu");
        Customer Ashley = new Customer("Ashley", "00012345", "AshnessAshley@xavier.e");
        Visit J = new Visit(Jack,"03/25/2022","23:17");
        Visit T = new Visit(Tom,"03/20/2022","17:20");
        Visit A = new Visit(Ashley,"02/01/2022","08:59");
        Visit AB = new Visit(Ashley,"03/01/2022","09:59");
        Log.addVisit(A);Log.addVisit(T);Log.addVisit(J);Log.addVisit(AB);
        System.out.println(Log.getNumberOfVisits());
        System.out.println(Log.getNumberOfVisits(Tom));
        System.out.println(Log.getNumberOfVisits(03, 2022));
        Log.reportAllVisits();
        Log.reportAllVisits(Ashley);
        Log.reportVisitsInMonth(02, 2022);
    }

}
