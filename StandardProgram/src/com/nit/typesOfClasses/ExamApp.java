/*You are developing a Smart Exam Result Evaluation System for an international online learning platform.

The system calculates a student’s final score and determines pass or fail status.
A local inner class should be used inside a method because the evaluation logic is required only during result processing.

Class Details

Create a class named ExamSystem.

Data Members
String studentName // name of the student
int theoryMarks // marks obtained in theory exam
int practicalMarks // marks obtained in practical exam

Method
void evaluateResult()

Inside this method, create a local inner class named ResultEvaluator.

Local Inner Class Method
void printResult()

Logic
totalMarks = theoryMarks + practicalMarks
If totalMarks ≥ 50 → "Pass"
Else → "Fail"

Main Class Details

Create a class named ExamApp.....

Inside main:
Use Scanner to read:
Student name
Theory marks
Practical marks

Create an ExamSystem object.
Call evaluateResult() to display total marks and result.*/
package com.nit.typesOfClasses;
import java.util.*;

public class ExamApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName=sc.nextLine();
        int theoryMarks=sc.nextInt();
        int practicalMarks=sc.nextInt();

        if(theoryMarks>50){
            System.out.println("Error: Theory marks must be between 0 and 50");
            System.exit(0);
        }
        ExamSystem es = new ExamSystem(studentName, theoryMarks, practicalMarks);
        es.evaluateResult();
    }
}
class ExamSystem{
    public String studentName;
    public int theoryMarks;
    public int practicalMarks;

    public ExamSystem(String studentName, int theoryMarks, int practicalMarks){
        this.studentName=studentName;
        this.theoryMarks=theoryMarks;
        this.practicalMarks=practicalMarks;
    }
    public void evaluateResult(){
        class ResultEvaluator{
            void printResult(){
                int totalMarks = theoryMarks+practicalMarks;

        System.out.println("Student: "+studentName);
        System.out.println("Total marks: "+totalMarks);

        if(totalMarks>=50){
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
      }
    }

    ResultEvaluator re = new ResultEvaluator();
    re.printResult();
}
}