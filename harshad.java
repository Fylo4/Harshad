package harshad;

//A number is said to be Harshad if it's exactly divisible by the sum of its digits

public class harshad {
	static boolean isHarshad(int n) {
		//First get sum of digits
		int temp = n, sum = 0;
		while(temp > 0) {
			sum += temp%10;
			temp /= 10;
		}
		//Next, test divisibility
		return n%sum == 0;
	}
	public static void main(String[] args) {
		int[] testCases = new int[] {75, 171, 481, 89, 516, 200};
		
		for(int n : testCases) {
			System.out.println("isHarshad("+n+") -> "+isHarshad(n));
		}
	}
}
