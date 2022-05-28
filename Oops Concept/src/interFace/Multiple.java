package interFace;
interface Tamil{
	public void SectionA();
	}
interface English{
	public void SectionB();
}
class School implements Tamil,English{
	public void SectionA() {
		System.out.println("Hi Tamil");
	}
	public void SectionB() {
		System.out.println("Hi English");
	}
}
public class Multiple {

	public static void main(String[] args) {
		School MM= new School();
		MM.SectionA();
		MM.SectionB();

	}

}
