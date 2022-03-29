/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3jackframbes;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author jfram
 */
public class Simulation {

    private VisitorLog log; // log containing visitors 
    private int numCustomers;
    private int numVisits;
    private int year;

    /**
     * basic constructor
     *
     * @param nC numCustomers
     * @param nV numVisits
     * @param y year
     */
    public Simulation(int nC, int nV, int y) {
        log = new VisitorLog();
        numCustomers = nC;
        numVisits = nV;
        year = y;
    }
    /**
     * starts the simulation running it the specified amount of times
     */
    public void doSimulation()
    {
        Random rand = new Random();
        Customer[] customers;
        customers = new Customer[numCustomers];
        for (int i=0;i<numCustomers;i++)
        {
            String name = generateName();
            String id = generateStudentID();
            Customer cu = new Customer(name,id,"noone@xavier.edu");
            customers[i] = cu;
        }
        for (int i=0;i<numVisits;i++)
        {
            int number = rand.nextInt(numCustomers);
            Visit v = new Visit(customers[number],"01/01/yy",generateTime());
            log.addVisit(v);
        }
        log.reportAllVisits();
    }
    /**
     * generates a random name for a fake student
     * @return a 5 character name
     */
    private String generateName() {
        int r = 0;
        String name = "";
        Random rand = new Random();
        String[] alf;
        alf = new String[26];
        int counter = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            String character = Character.toString(c);
            alf[counter]= character;
            counter++;
        }
        for (int i = 0; i < 5; i++) {
            r = rand.nextInt(26);
            String letter;
            if (i==0)
            {
                letter = alf[r].toUpperCase();
            }
            else
            {
                letter = alf[r];
            }
            name = name + letter;
        }
        return name;
    }
    /**
     * generates a random id where the first three characters are 0
     * @return id
     */
    private String generateStudentID()
    {
        String id = "";
        for (int i=0;i<10;i++)
        {
            Random rand = new Random();
            if (i<4)
            {
                id = id+0;
            }
            else
            {
                id = id + rand.nextInt(10);
            }     
        }
        return id;
    }
    /**
     * generates a random time hh:mm
     * @return time hh:mm
     */
    private String generateTime()
    {
        Random rand = new Random();
        String time;
        int h = rand.nextInt(24);
        int m = rand.nextInt(60);
        String minute = ""+m;
        String hour=""+h;
        if (h<10)
        {
           hour = "0"+h;
        }
        if (m<10)
        {
            minute = "0"+m;
        }
        time = hour+"   :"+m;
        return time;
    }    
    private String generateEmail(String name)
    {
        Random rand = new Random();
        String email = name;
        int number = rand.nextInt(100);
        email = email+number+"@xavier.edu";
        return email;
    }
    private String generateDate()
    {
        Random rand = new Random();
        String date = "";
        int mm;
        int dd;
        int yy;
        mm = rand.nextInt(12);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        dd = rand.nextInt(days[mm]);
        yy = 22;
        if (mm==0)
        {
            mm++;
        }
        if (dd==0)
        {
            dd++;
        }
        return mm+"/"+dd+"/"+yy;  
    }
    private void analyzeLog(int [] counts)
    {
        int length = counts.length;
        for (int i=0;i<length;i++)
        {
           counts[i]=0; 
        }
        log.setStart();
        if (length==24)
        {
           for (int i=0;i<length;i++)
           {
              
           }
        }
        
    }
}