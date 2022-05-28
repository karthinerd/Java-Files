
package inheritence;
 class Androidphone{
	 public void Oneplus() {
		 System.out.println("One of the Best Android  Mobile");
	 }
 }
class Gamingphone extends Androidphone{
	public void ROG() {
		System.out.println("One of the Best Gaming Phone");
	}
}
 class Iosphone extends Gamingphone {
	public void Apple() {
		System.out.println("One of the Best IOS Mobile");
	}
}
	public class MultiLevel {
	public static void main(String[] args) {
		Iosphone phone = new Iosphone();
        phone.Oneplus();
        phone.ROG();
        phone.Apple();
	}

}
