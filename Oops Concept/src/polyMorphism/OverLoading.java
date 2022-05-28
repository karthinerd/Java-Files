/**
 * 
 */
package polyMorphism;
class Staffroom{
	public void College(int no,String Hod) {
		System.out.println("Total staffs : " + no  + " " +"Name of HOD : " + Hod);
	}
}
class Classroom extends Staffroom{
	public void College(int num,String Classname,float Percentage) {
		System.out.println("Number of Students : " + num  + " " +"Name of Department : " + Classname + " " + "Total Marks in Percentage : " + Percentage);
	}
}
public class OverLoading extends Classroom {

	public static void main(String[] args) {
	OverLoading Classroom = new OverLoading();
	Classroom.College(5,"Karthi");
	Classroom.College(36,"Microbiology",95);
	}

}
