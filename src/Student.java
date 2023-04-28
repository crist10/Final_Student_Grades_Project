


public class Student { //Student class will hold all values for each student
    private String stuName; //String variable for student name
    private int quiz, assign, exam, project, finalnum; //integer values for grades and final grade
    char lettergrade; //character value for letter grade

    public Student(String name, int qGrade,int aGrade, int eGrade, int pGrade, int fin, char letter) { //Constructor that will obtain 7 variables
        stuName=name;
        quiz=qGrade;
        assign=aGrade;
        exam=eGrade;
        project=pGrade;
        finalnum = fin;
        lettergrade = letter;
    }


    public void setName(String name)  { // setter method for String student's name
        stuName=name;
    }
    public String getName() { //getter method for String student's name
        return stuName;
    }
    public void setQuiz(int qGrade) { //setter method for int quiz grade
        quiz=qGrade;
    }
    public int getQuiz() { //getter method for int quiz grade
        return quiz;

    }
    public void setAssign(int aGrade) { //setter method for int assignment grade
        assign=aGrade;
    }
    public int getAssign() { //getter method for int assignment grade
        return assign;
    }
    public void setExam(int eGrade) { //setter method for int exam grade
        exam=eGrade;
    }
    public int getExam() { //getter method for int exam grade
        return exam;
    }
    public void setProject(int pGrade) { //setter method for int project grade
        project=pGrade;
    }
    public int getProject() { //getter method for int project grade
        return project;
    }
    public char getGrade() { //getter method for char final letter grade
        return lettergrade;
    }


    public int getFinal() { //getter method for int final grade for each student
        return finalnum;
    }
    public void displayStu() { //display method that will display the student's name and student's final letter grade
        System.out.println("Name: " + stuName + ", Letter Grade: " +lettergrade);

    }
}
