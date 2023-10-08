import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence ");
		String s = sc.nextLine().toLowerCase();
		//System.out.println(s);
	
		int track_char[] = new int[26];
		int count = 0;
		
		for (int i=0;i<s.length();i++) {
			int idx = s.charAt(i)-97;
			
			if (idx>=0 && idx<=25 && track_char[idx]==0){
				track_char[idx] = 1;
				count += 1;
			}
		
		 
	}
		if (count==26) 
			 System.out.println("Given string '"+ s + "' is a pangram");
		 else
			 System.out.println("Given string '"+ s + "' is not a pangram");
	}

}
