import java.io.FileNotFoundException;

public class Test{ //Test class will be for testing the whole program

    public static void main(String[] args) throws FileNotFoundException { //main method

        StudentData stu = new StudentData(20);  //Creates an 20 object in student data
        stu.readFromFile(); //using the readFromFile method on main method to read the text file given

        stu.bubbleSort(); //using the bubbleSort method on main method to sort student names alphabetically
        stu.display(); // using display method to display names and letter grades
        stu.displayLetter(); //using displayLetter method to show quantity of each letter grade
    }

}