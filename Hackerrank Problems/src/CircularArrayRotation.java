import java.util.*;

public class CircularArrayRotation {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int shift = scan.nextInt();
		int queries = scan.nextInt();
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++){
			nums[i] = scan.nextInt();
		}
		
		int[] shifted = new int[N];
		
		for(int i = 0; i < nums.length; i++){
			shifted[(i+shift) % N] = nums[i];
		}
		
		while(queries-- > 0){
			System.out.println(shifted[scan.nextInt()]);
		}
	}

}
