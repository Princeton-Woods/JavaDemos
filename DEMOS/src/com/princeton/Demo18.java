package com.princeton;

class Student{
    private int id;
    private String name = "Princeton";
    private int hallPass = 40;

    public Student(int id) throws Exception {
        if(id < 0) {
            throw new Exception("cant verify id");
        }
        this.id = id;
    }
    public int getId() {   return id;  }
    public String getName() {   return name;  }
    public int getHallPass() {   return hallPass;  }

    public void setId(int id) throws Exception {
        if(id < 0) {
            throw new Exception("cant verify id");
        }
        this.id = id;
    }
}

public class Demo18 {

    public static void main(String[] args) throws Exception {
        Student student = new Student(5);
        student.setId(5);

        System.out.println(student.getId());

        System.out.println("ID: "+ student.getId());
        System.out.println("Name: "+ student.getName());
        System.out.println("Passmark: "+ student.getHallPass());
    }
}
