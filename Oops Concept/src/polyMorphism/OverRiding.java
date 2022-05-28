package polyMorphism;

import java.util.Scanner;

class ExamHall{
	public void College(int no,String Hod) {
		System.out.println("Total staffs : " + no  + " " +"Name of Inveligator : " + Hod);
	}
}
class Exam extends ExamHall{
	public void College(int num,String Subjectname) {
		System.out.println("Number of Students : " + num  + "Name of Exam : " + Subjectname );
	}
}
public class OverRiding extends Exam {

	public static void main(String[] args) {
		OverRiding Classroom = new OverRiding();
		Scanner input = new Scanner(System.in); 
		int a;
		String name;
		a=input.nextInt();
		name=input.next();
	Classroom.College(a,name);
	a=input.nextInt();
	name=input.next();
	Classroom.College(a,name);
	}

}
