package com.seetha.advjava;

/**
 * Student Class
 *
 * @author Seetha Hegde
 */
public class Student 
{

    String firstName;
    String lastName;
    int currentGrade;
    boolean requiresESL;
    static final int highestGrade=12;
    //Using value 0 for kindergarten
    static final int lowestGrade=0;
    /*Creates Student class instance
    * @param firstName   First name
    * @param lastName    Last name
    * @param currentGrade   Current grade
    * @param requiresESL    indicates if student requires ESL
    *                       ESL is English as a second language
    *
     */
    public  Student(String f_name, String l_name, int grade, boolean reqESL) {

        this.firstName = f_name;
        this.lastName = l_name;
        this.currentGrade = grade;
        this.requiresESL = reqESL;
    }
    /*
     * @return Returns current grade of the student
     */
    public int getGrade() {

        return currentGrade;
    }
    /*
     * @return First name of the student
     */
    public String getFirstName() {

        return firstName;
    }
    /*
     * @return Last name of the student
     */
    public String getLastName() {

        return lastName;
    }
    /*
     * @return Returns true if the student will be in college
     * in "years" specified in the argument
     */
    public boolean willBeInCollege(int years) {

        return ((incGrade(years) > highestGrade)? true : false);
    }
    /*
     * @return Returns true if the student was not in school
     * in "years" specified in the argument
     */
    public boolean wasNotInSchool(int years) {

        return (( dcrGrade(years) >= lowestGrade)? true : false);
    }
    public int incGrade(int years) {
        return(currentGrade+years);
    }
    public int dcrGrade(int years) {
        return(currentGrade-years);
    }
    public void setESLState(boolean state) {
        requiresESL=state;
    }
    public boolean getESLState() {
        return requiresESL;
    }
}
