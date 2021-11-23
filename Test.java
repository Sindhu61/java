    class Student {

	String name;				 									
	int rollNo;															
	String collegeName;													
	String collegeLocation;       										
	String dept;														
	String gender;
	int age;	
	
	public Student(String dept, int rollNo){
                                    this.dept = dept;
	            this.rollNo = rollNo;
	}

	public Student(String collegeName,String gender){
		this("CSE", 17);
		this.collegeName = collegeName;
		this.gender=gender;
	}

	public Student(String name,String collegeLocation,int age){
		this("Ashoka Women's College","female");  
		this.name = name;
		this.collegeLocation=collegeLocation;
		this.age=age;
	}
}

public class Test{
	public static void main(String[] args){   
		Student s1 = new Student("sindhu","Dupadu",18);
		System.out.println(s1.name);  
		System.out.println(s1.collegeName); 
		System.out.println(s1.collegeLocation); 
		System.out.println(s1.rollNo); 
		System.out.println(s1.gender); 
        System.out.println(s1.dept);
		System.out.println(s1.age); 

	}
}
 OUTPUT:

PS C:\517> javac Test.java
PS C:\517> java Test      
sindhu
Ashoka Women's College
Dupadu
17
female
CSE
18