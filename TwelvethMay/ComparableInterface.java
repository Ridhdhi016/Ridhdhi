//Program to Demonstrate use of Comparable interface

import java.util.*;
public class ComparableInterface {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(109,"Nensy",23));  
		al.add(new Student(106,"Mansi",22));  
		al.add(new Student(102,"Ekta",21));  
		System.out.println("Display student's details sorted by rollno: ");
		  
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}
