package com.seetha.advjava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Unit test for Student App.
 */
public class StudentTest
{
    Student student1;
    @Before
    public void setup() {
        /* creating baseline and introducing Dependency injection
         * All the variables for the object construction are initialized
         * and none of the class variables are initialised in the
         * constructor.
         */
        student1 = new Student("Sahana", "Hegde", 3, true);
    }
    @Test
    public void testConstruction() {
        assertEquals("Asserting First Name", "Sahana",student1.getFirstName());
        assertEquals("Asserting Last Name", "Hegde", student1.getLastName());
    }
    @Test
    public void testChangeState() {
        //Initially the student requires ESL and hence set to true
        assertTrue("Inital ESL state is true", student1.getESLState());
        /*Now change ESL to false and verify the change
         * is reflected.
         */
        //If student doesn't need ESL anymore, change the value
        student1.setESLState(false);
        assertFalse("ESL is no longer needed", student1.getESLState());
    }
    @Test
    public void testPositive() {
        int futureGrade = student1.incGrade(5);
        assertEquals("Asserting if adding grade is correct",8, futureGrade);
    }
    @Test
    public void testNegative() {
        int pastGrade = student1.dcrGrade(3);
        assertEquals("Asserting if subtracting grade is correct",0, pastGrade);
    }
    /*Testing Positve - True if student will be in school */
    @Test
    public void testInCollege() {

        assertTrue("Asserting if student will be in college", student1.willBeInCollege(10));
    }
    /*Testing Negative - False if student wasn't in school */
    @Test
    public void testWasInSchool() {

        assertFalse("Asserting if student was in school", student1.wasNotInSchool(5));
    }

}
