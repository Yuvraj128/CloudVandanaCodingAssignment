import java.util.Arrays;
import java.util.Random;

public class shuffleArray {
	
	public static void shuffle_array(int arr[]) {
		for (int i=arr.length-1;i>=1;i--) {
			Random random = new Random();
			int r_idx = random.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[r_idx];
			arr[r_idx] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Original array is "+ Arrays.toString(arr));
		shuffle_array(arr);
		System.out.print("Shuffled array is "+ Arrays.toString(arr));
	}

}
