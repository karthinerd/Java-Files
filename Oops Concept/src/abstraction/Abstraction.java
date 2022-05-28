package abstraction;
 abstract class Pubg{
	 public abstract void game();
 }
 class mobile extends Pubg{
	 public void game(){
		 System.out.println("NO.1 Game");
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
	mobile videogame = new mobile();
	videogame.game();
}}
