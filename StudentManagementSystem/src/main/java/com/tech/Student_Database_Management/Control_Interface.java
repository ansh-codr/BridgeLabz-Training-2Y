package com.tech.Student_Database_Management;

import java.util.Scanner;

public class Control_Interface {
  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    Add_Student addStudent=new Add_Student();
    View_All viewAll=new View_All();
    Update_Student updateStudent=new Update_Student();
    Delete_Student deleteStudent=new Delete_Student();
    Add_Result addResult=new Add_Result();
    View_Result viewResult=new View_Result();
    Delete_Results deleteResults=new Delete_Results();
    boolean run=true;
    while(run){
      System.out.println("1 Add Student");
      System.out.println("2 View All Students");
      System.out.println("3 Update Student");
      System.out.println("4 Delete Student");
      System.out.println("5 Add Result");
      System.out.println("6 View All Results");
      System.out.println("7 Delete Result");
      System.out.println("8 Exit");
      String choice=sc.nextLine();
      switch(choice){
        case "1":
          addStudent.AddStudent(sc);
          break;
        case "2":
          viewAll.ViewStudents();
          break;
        case "3":
          updateStudent.UpdateStudent(sc);
          break;
        case "4":
          deleteStudent.DeleteStudent(sc);
          break;
        case "5":
          addResult.AddResult(sc);
          break;
        case "6":
          viewResult.ViewResults();
          break;
        case "7":
          deleteResults.DeleteResult(sc);
          break;
        case "8":
          run=false;
          System.out.println("Bye");
          break;
        default:
          System.out.println("Wrong choice");
      }
    }
    sc.close();
  }
}
