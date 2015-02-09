/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Spike
 */
public class Main {
    public static void main(String[] args) {
    
        Course AJC = new AdvancedJavaCourse("Advanced Java Course","303-103");
        Course IJC = new IntroJavaCourse("Intro to Java Course","103-103");
        Course ITPC = new IntroToProgrammingCourse("Introduction to Programming Course","101-103");
        
        AJC.setCredits(4.0);
        IJC.setCredits(3.0);
        ITPC.setCredits(2.0);
        
        double totalCredits = AJC.getCredits() + IJC.getCredits() + ITPC.getCredits();
        System.out.println("Taking " + totalCredits + " tota credits");
        
        
        //Must decalre object as AdvancedJavaClass to use the prereq property
        AdvancedJavaCourse AJC2 = new AdvancedJavaCourse("Advanced Java Course 2","303-104");
        AJC2.setPrerequisites(IJC.getCourseName());
    }
}
