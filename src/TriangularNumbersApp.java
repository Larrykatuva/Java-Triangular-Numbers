import java.util.Scanner;

public class TriangularNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		
		int n = number.nextInt();
		
		System.out.println(triangle(n));

	}
	
	public static int triangle(int n) {
		System.out.println("Entering: n = " + n);
		if(n == 1) {
			System.out.println("Returning 1");
			return 1;
		}else {
			 int temp = n + triangle(n-1);
			 System.out.println("Returning " + temp);
			return temp;
		}
	}
}
