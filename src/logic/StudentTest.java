package logic;

//Below these all are In-Built Libraries
import logic.model.Student;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This is the Code to sort students based on Total marks of 5 Subjects.
 * @author hp
 * @version 2020.1.2
 */
public class StudentTest {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @param Arraylist to store marks of subjects for each student
         */
        ArrayList<Student> s1=new ArrayList<Student>();
        /**
         * Add is method to add data to ArrayList
         */
        s1.add(new Student("David",50.0,70.0,60.0,65.0,72.0));
        s1.add(new Student("James",40.0,20.0,55.0,85.0,95.0));
        s1.add(new Student("Avery",59.0,72.0,64.0,98.0,86.0));
        s1.add(new Student("Jackson",45.0,65.0,78.0,74.0,72.0));
        s1.add(new Student("Ella",65.0,72.0,64.0,71.0,78.0));

        System.out.println("Marks Before Sorting");
        /*
        This is For Each Loop to Display Elements Of Arraylist Before Sorting
         */
        for(Student s:s1){
            System.out.println("Student Name:"+s.Name+" , "+"Total Marks:"+s.TotalMarks());
        }
        /**
         * Collections Class Provides many methods for sorting the elements of collection
         * Sort() is used to sort the elements of ArrayList
         */
        Collections.sort(s1);

         /*
        This is For Each Loop to Display Elements Of Arraylist After Sorting
         */
        System.out.println("\n");
        System.out.println("Marks After Sorting");
        for(Student s:s1){
            System.out.println("Student Name:"+s.Name+" , "+"Total Marks:"+s.TotalMarks());
        }
    }
}