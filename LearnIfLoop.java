package week2.day1;

public class LearnIfLoop {
	public static void main(String[] args) {
		int number=0;
		if (number<=0 && number>=0 && number<=50) {
			System.out.println("The number is neither positive nor negative");
			
		}else if (number<=0) {
			System.out.println("The number is negative");
			
		}else if (number>=50) {
			System.out.println("The number is positive");
			
			
		}else
			System.out.println("If it neither negative nor positive");
	}

}
