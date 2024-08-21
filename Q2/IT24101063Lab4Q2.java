import java.util.Scanner;
	public class IT24101063Lab4Q2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter exam marks (out of 100): ");
		int examMarks = input.nextInt();
		if (0 > examMarks)
		{System.out.print("Inavalid input for exam marks. Terminating program.");}
		else if (examMarks > 100)
		{System.out.print("Inavalid input for exam marks. Terminating program.");}

		System.out.print("Please enter lab submission marks (out of 100): ");
		int labMarks = input.nextInt();
		if (0 > labMarks)
		{System.out.print("Inavalid input for lab submission marks. Terminating program.");}
		else if (labMarks > 100)
		{System.out.print("Inavalid input for lab submission marks. Terminating program.");}

		System.out.print("Please enter the percentage given for the exam: ");
		int percentageExam = input.nextInt();
		System.out.print("Please enter the percentage given for the lab submission: ");
		int percentageLab = input.nextInt();
		
		if(percentageExam + percentageLab == 100)
		{ double finalMark = (examMarks * percentageExam + labMarks * percentageLab)/10000; 
		System.out.print("Final Exam Mark is: " +finalMark);}
		else
		{System.out.print("The percentages must add up to 100. Terminating program.");}
	}
}
