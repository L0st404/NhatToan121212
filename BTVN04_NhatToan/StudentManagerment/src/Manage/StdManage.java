package Manage ;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class StdManage {
    private static ArrayList <Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void AddStudent(){
      System.out.println("Nhap ten sinh vien: ");
      String name = sc.nextLine();
      System.out.println("Nhap ID sinh vien: ");
      int id = Integer.parseInt(sc.nextLine());
      System.out.println("Nhap GPA sinh vien: ");
      Double gpa = Double.parseDouble(sc.nextLine());
      Student student = new Student(name, id, gpa);
      studentList.add(student);
    }
    public void EditStudent(){
      System.out.println("Nhap id sinh vien can sua: ");
      int id = Integer.parseInt(sc.nextLine());
      for (Student student : studentList){
        if (student.getId() == id){
            System.out.println("Nhap ten sinh vien moi: ");
            String name = sc.nextLine();
            System.out.println("Nhap id sinh vien moi: ");
            int idNew = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap GPA sinh vien moi: ");
            double gpa = Double.parseDouble(sc.nextLine());
            student.setName(name);
            student.setId(idNew);
            student.setGpa(gpa);
            System.out.println("Thanh cong! ");
            return;
        }
      }
      System.out.println("Khong tim thay sinh vien. Vui long kiem tra lai !");
    }
    public void DeleteStudent(){
        System.out.println("Nhap ID cua sinh vien can xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for(Student student : studentList){
            if(student.getId() == id){
                studentList.remove(student);
                System.out.println("Da xoa sinh vien thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien. Vui long kiem tra lai !");
    }
    public void SearchStudent(){
        System.out.println("Nhap ID cua sinh vien can tim: ");
        int id = Integer.parseInt(sc.nextLine());
        for(Student student : studentList){
            if(student.getId() == id){
                System.out.println("Sinh vien co ma ID tren la: " + student);
            }
        }
        System.out.println("Khong tim thay sinh vien. Vui long kiem tra lai !");
    }
    public void SortStudent(){
        System.out.println("1.Tang dan");
        System.out.println("2. Giam dan");
        int n = studentList.size();
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1){
            for (int i = 0; i<=n; i++){
                for (int j = 0; j < n - i - 1; j++) {
                    if (studentList.get(j).getGpa() > studentList.get(j + 1).getGpa()) {
                        Student temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }
        if (choice == 2){
            for (int i = 0; i<=n; i++){
                for (int j = 0; j < n - i - 1; j++) {
                    if (studentList.get(j).getGpa() < studentList.get(j + 1).getGpa()) {
                        Student temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }
     }
     public void ShowStudent(){
        for (Student student : studentList){
            System.out.println(student);
        }
     }

        

    











    }




