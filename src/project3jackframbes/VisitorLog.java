package project3jackframbes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jfram
 */
public class VisitorLog {

    private ArrayList<Visit> visits;
    private Iterator<Visit> iter;

    /**
     * basic constructor and sets the iterator the visits.iterator()
     */
    public VisitorLog() {
        visits= new ArrayList<Visit>();
        iter = visits.iterator();
    }

    /**
     * adds a new visit to visits
     *
     * @param v one visit
     */
    public void addVisit(Visit v) {
        visits.add(v);
    }

    /**
     * returns the number of visits total
     *
     * @return visits.size()
     */
    public int getNumberOfVisits() {
        return visits.size();
    }

    /**
     * returns the number of visits in a given month and year
     *
     * @param month what month they would like in int
     * @param year what year they would like in int
     * @return number of visits in given month and year
     */
    public int getNumberOfVisits(int month, int year) {
        int count = 0;
        for (Visit v : visits) {
            if (v.getMonth() == month) {
                if (v.getYear() == year) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * returns the number of visits by a certain customer
     *
     * @param c
     * @return
     */
    public int getNumberOfVisits(Customer c) {
        String id = c.getStudentID();
        int count = 0;
        for (Visit v : visits) {
            Customer cus = v.getVisitor();
            String tid = cus.getStudentID();
            String name = cus.getName();
            if (c.equals(tid)) {
                count++;
            }
        }
        return count;
    }

    /**
     * returns all visits if there are any
     */
    public void reportAllVisits() {
        int count = 0;
        for (int i = 0; i < visits.size(); i++) {
            Visit v = visits.get(i);
            if (count == 0) {
                System.out.println("These are all of the visits");
            }
            System.out.println(v.getVisitor());
            count++;
        }
        if (count == 0) {
            System.out.println("There are no visitors yet");
        }
    }

    /**
     * The number of total visits in a given month and year
     *
     * @param month month number in int
     * @param year year number in int
     */
    public void reportVisitsInMonth(int month, int year) {
        int count = 0;
        for (Visit v : visits) {
            if (month == v.getMonth()) {
                if (year == v.getYear()) {
                    if (count == 0) {
                        System.out.println("These are all the visits in: " + month + ":" + year);
                    }
                    System.out.println(v.getVisitor());
                    count++;
                }
            }
        }
        System.out.println("There were a total of " + count + " visits");
    }

    /**
     * reports all visits by a given student
     *
     * @param c the Customer
     */
    public void reportAllVisits(Customer c) {
        int count = 0;
        String id = c.getStudentID();
        for (Visit v : visits) {
            Customer cus = v.getVisitor();
            String tid = cus.getStudentID();
            String name = cus.getName();
            if (id.equals(tid)) {
                if (count == 0) {
                    System.out.println("These are all of the visits by " + name);
                }
                System.out.println(v.getVisitor());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There were no visits by this person");
        }
    }

    public void setStart() {
        iter = visits.iterator();
    }

    public Visit next() {
        if (iter.hasNext()) {
            Visit v = iter.next();
            return v;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        return iter.hasNext();
    }
}
