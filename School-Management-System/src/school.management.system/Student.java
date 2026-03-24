package school.management.system;

/*
This class  is responsible for keeping the 
track of students fees, name, grade & fees paid

*/

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * 
     * To creare a new student by initializing.
     * Fees for every student is $30, 000.
     * Fees pain initially is 0. 
     */
    public Student( int id, String name, int grade, int feesPaid, int feesTotal){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name =  name;
        this.grade=grade;
    }
    // Not goint to alter student's name, student's id.
}
