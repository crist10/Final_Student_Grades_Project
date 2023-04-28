import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentData { //StudentData will include methods to obtain information and decide letter grade each student
    private Student[] a; //Student object array that will hold values for each student
    private int nElems; //integer number elements that will decide how many students will be in the array



    public StudentData(int size)  { //constructor for Student Data size for the array Student
        a= new Student[size];
    }
    public int size() { //public method that will determine size for an array Student
        return nElems;
    }
    public void insert(String name, int qGrade,int aGrade, int eGrade, int pGrade, int fin, char letterGrade) { //insert method for object Student that will send 7 variables to Student class
        a[nElems]= new Student(name, aGrade, eGrade, pGrade, qGrade, fin, letterGrade);
        nElems++;
    }

    public void readFromFile() throws FileNotFoundException { //public method that will read information of students from text file called Student.txt

        Scanner input = new Scanner(new File("C:\\Users\\criss\\Desktop\\students.txt")); //an object will be made through scanner class which will import data from a text file



        while (input.hasNextLine()) { //using while loop to read each line

            String test = input.nextLine();
            String[] studentData = test.split(","); //using an array string to split each line into sections

            String name=studentData[0]; // splits the name through string array
            int aGrade=Integer.parseInt(studentData[1]); //splits  grade through string array and converting to integer
            int eGrade=Integer.parseInt(studentData[2]);//splits  grade through string array and converting to integer
            int pGrade=Integer.parseInt(studentData[3]);//splits  grade through string array and converting to integer
            int qGrade=Integer.parseInt(studentData[4]);//splits  grade through string array and converting to integer
            int fin = aGrade+eGrade+pGrade+qGrade; // adds all grade together for final numerical grade
            char letterGrade = 0;
            if(fin>=90 && fin<=100) { //if statements to determine each letter grade for each student
                letterGrade = 'A';
            }
            else if(fin >= 80 && fin<=89 ) {
                letterGrade = 'B';
            }
            else if(fin >= 70 && fin <= 79) {
                letterGrade = 'C';
            }
            else if(fin >= 60 && fin <=69) {
                letterGrade = 'D';
            }
            else {
                letterGrade = 'F';
            }
            insert(name,  aGrade,  eGrade,  pGrade,  qGrade, fin, letterGrade); //this insert will insert values into the array students
        }
        input.close();

    }
    public void displayLetter() { //public method will display the quantity number of each letter grade from A to F
        int A = 0, B = 0, C = 0, D = 0, F = 0;
        for(int i=0;i<nElems;i++) { //for loop to access the student array
            if(a[i].getGrade()=='A') { //if statements to increase quantity for each letter grade
                A++;
            }
            else if(a[i].getGrade()=='B') {
                B++;
            }
            else if(a[i].getGrade()=='C') {
                C++;
            }
            else if(a[i].getGrade()=='D') {
                D++;
            }
            else {
                F++;
            }
        }
        System.out.println("Number of A's: " +A+ ", Number of B's: " +B+ ", Number of C's: "+C+ ", Number of D's: "+D+", Number of F's: "+F);
    }

    public void bubbleSort () //public method that will sort each student's name in alphabetical order via bubble sorting
    {
        int out , in ; //integer values for out and in
        for( out = nElems -1; out >0; out --) //for loop to go from the end of the array
        {
            for( in =0; in < out ; in ++) //for loop to determine to access the array
            {
                if( a [ in ].getName().compareTo( a [ in +1].getName())>0 ) //if statement to compare each name in alphabetical order
                {
                    Student temp = a [ in ]; //will create variable student and hold a temporary place in array
                    a [ in ] = a [ in +1];  //will equal to the next value from the array
                    a [ in +1] = temp ; //will put the value temp to the next value in array
                }
            }
        }
    }



    public void display() { //public method display will display each student and their final letter grade by calling it from the student class and using a for loop to access the array of Student
        for(int j=0; j<nElems; j++) //for loop to access student array
        {
            a[j].displayStu();  //will display each student

        }

    }

}