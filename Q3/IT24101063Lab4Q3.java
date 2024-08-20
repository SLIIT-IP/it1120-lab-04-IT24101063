import java.util.Scanner;
	public class IT24101063Lab4Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		String message;
		message = (number>0) ? "Positive" : (number<0) ? "Negative" : "Zero";
		
		System.out.println("The number is: " +message); 
	}
}