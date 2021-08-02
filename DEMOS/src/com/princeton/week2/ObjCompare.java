package com.princeton.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ObjCompare {

	public static void main(String[] args) {
		ArrayList<Student> S = new ArrayList<>();
        S.add(new Student(2,"Mark", 30));
        S.add(new Student(1,"Watson", 50));
        S.add(new Student(3,"Stacy", 20));

        System.out.println("before sorting...");
        for(Student student: S){
            System.out.println(student);
        }
        //Collections.sort(students);
        //Collections.sort(students, new SortByAge());
        Collections.sort(S, new SortByName());
        System.out.println("after sorting...");
        for(Student student: S){
            System.out.println(student);
        }
	}

}
class Student implements Comparable<Student>{
    int rollNumber;
    String name;
    int age;
    
    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        if(rollNumber > other.rollNumber)
            return 1;
        else if(rollNumber < other.rollNumber)
            return -1;
        else
            return 0;
    }
	
}


class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.age > s2.age)
            return 1;
        else if(s1.age < s2.age)
            return -1;
        else
            return 0;
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return  s1.name.compareTo(s2.name);
    }


}

