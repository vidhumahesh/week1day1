package week1.day1;

public class FibonacciSeries {

	static int input = 8;
	static int firstNum = 0, secNum = 1;

	public static void main(String[] args) {

		for (int count = 0 ; count < input; count++) {

			System.out.println("Fibonacci Series : " + firstNum);
			int sum = secNum + firstNum;
			firstNum = secNum;
			secNum = sum;

		}
	}

}
