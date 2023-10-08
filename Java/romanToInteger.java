import java.util.Scanner;

public class romanToInteger {
	
	public static int romanToInt(char val) {
		if (val=='I') return 1;
		if (val=='V') return 5;
		if (val=='X') return 10;
		if (val=='L') return 50;
		if (val=='C') return 100;
		if (val=='D') return 500;
		if (val=='M') return 1000;
		
		return 0;
	}
	
	public static int convert(String s) {
		int ans = 0;
		int n = s.length();
		
		for (int i=0;i<n;i++) {
			int num1 = romanToInt(s.charAt(i));
			if (i+1<n) {
				int num2 = romanToInt(s.charAt(i+1));
				if (num1>=num2)
					ans = ans + num1;
				else {
					ans = ans + num2 - num1;
					i++;
				}
			}
			else
				ans = ans + num1;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a valid roman number ");
		String s = sc.next();
		
		System.out.print(convert(s));
	}

}
