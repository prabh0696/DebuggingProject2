package logic.model;

/**
 * This is the Code to sort students based on Total marks of 5 Subjects
 * & Show Students in ascending order according to their marks.
 * @author hp
 * @version 2020.1.2
 */

/**
 * We Have Used the concept of Comparable Interface
 * to order user-defined class objects
 *It contains only one method compareTo(Object)
 */
public class Student implements Comparable<Student>{
    //Below We Have declared variables
     public String Name;
     Double Subject1;
     Double Subject2;
     Double Subject3;
     Double Subject4;
     Double Subject5;
     Double TotalMarks;

    /**
     *
     * @param name This is used for Student Name
     * @param subject1 This is used for Subject1 Marks
     * @param subject2 This is used for Subject2 Marks
     * @param subject3 This is used for Subject3 Marks
     * @param subject4 This is used for Subject4 Marks
     * @param subject5 This is used for Subject5 Marks
     */
    public Student(String name, Double subject1, Double subject2, Double subject3, Double subject4, Double subject5) {
        Name = name;
        Subject1 = subject1;
        Subject2 = subject2;
        Subject3 = subject3;
        Subject4 = subject4;
        Subject5 = subject5;
    }

    /**
     * This is the function to Calculate Total marks of each student
     * @return TotalMarks
     */
    public Double TotalMarks() {
          TotalMarks=Subject1+Subject2+Subject3+Subject4+Subject5;
        return TotalMarks;
    }

    /**
     * This is compareTo(Student s) method to sort
     * the students based on their TotalMarks.
     * compareTo() is used to compare the each student's
     * TotalMarks with all other student's TotalMarks.
     * @param s
     * @return Integer
     */
    @Override
    public int compareTo(Student s) {
        /*
        This if statement returns 0 if current student's TotalMarks
        is equal to Other Specified Students TotalMarks.
         */
        if(TotalMarks()==s.TotalMarks())
        return 0;
        /*
        This else if statement returns 1 if current student's TotalMarks
        is greater than Other Specified Students TotalMarks.
         */
        else if(TotalMarks()>s.TotalMarks())
            return 1;
        /*
        AtLast else statement returns -1 if current student's TotalMarks
        is less than the  Other Specified Students TotalMarks.
         */
        else
            return -1;
    }
}
