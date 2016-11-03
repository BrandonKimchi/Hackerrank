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
		
		while(queries-- > 0){
			System.out.println(nums[(scan.nextInt() + shift -1)%nums.length]);
		}
	}

}
