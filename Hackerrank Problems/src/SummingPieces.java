import java.util.Scanner;
public class SummingPieces {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; i++){
			nums[i] = scan.nextInt();
		}
		
		System.out.println(allValues(nums)%(1000000000 + 7));
	}
	
	static long allValues(int[] nums){
		long out = 0;
		
		if(nums.length == 1){
			return nums[0];
		} else{
			for(int i = 0; i < nums.length; i++){
				out += sumPiece(nums) + allValues(subArray(nums, 0, i));
			}
		}
		
		return out;
	}
	
	static int[] subArray(int[] nums, int start, int end){
		int[] out = new int[end - start];
		for(int i = start; i < end; i++){
			out[i-start] = nums[i];
		}
		return out;
	}
	
	static int sumPiece(int[] piece){
		int sum = 0;
		for(int el : piece){
			sum += el;
		}
		return sum * piece.length;
	}

}
