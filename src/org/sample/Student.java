package org.sample;

public class Student {
public Student() {
	System.out.println("default constructor");
}
public  Student(String name) {
	System.out.println(name);
}
public  Student(int id) {
System.out.println(id);
}
public static void main(String[] args) {
	Student x=new Student(10);
	Student x1=new Student();
	Student x2=new Student("abc");
}
}
