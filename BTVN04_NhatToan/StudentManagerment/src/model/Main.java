package model;
import Manage.StdManage;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    StdManage stdmn = new StdManage();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
        System.out.println("Menu: ");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student by id");
        System.out.println("4. Search Student by id");
        System.out.println("5. Sort Student by gpa");
        System.out.println("6. Print list Student");
        System.out.println("7.Exit");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
            stdmn.AddStudent();
            break;
            case 2:
            stdmn.EditStudent();
            break;
            case 3:
            stdmn.DeleteStudent();
            break;
            case 4:
            stdmn.SearchStudent();
            break;
            case 5:
            stdmn.SortStudent();
            break;
            case 6:
            stdmn.ShowStudent();
            break;
            case 7:
            System.out.println("Exiting...");
            break;
            default:
            System.out.println("Invalid Input! ");
            break;
        }
    } while (choice != 7);
    
  }








}
