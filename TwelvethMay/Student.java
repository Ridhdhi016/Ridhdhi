class Student implements Comparable<Student>{
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){ 
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}
	  
	public int compareTo(Student st){  
		if(rollno==st.rollno)  
			return 0; 
		else if(rollno>st.rollno)  
			return 1;  
		else  
			return -1; 
	}
}
	

