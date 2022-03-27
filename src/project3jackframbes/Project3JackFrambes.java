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
    }

}
