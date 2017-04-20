import java.util.*;
import java.io.*;

public class BetweenTwoSets {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		int A[] = new int[n];
		int B[] = new int[m];
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		for(int i = 0; i < m; i++){
			B[i] = scan.nextInt();
		}
		
		//number is a factor of everything in B, and all of A are factors of it
		Arrays.sort(B);
		//first element of b is smallest, so the largest possible value of x
		Arrays.sort(A);
		//last element of A will be smallest possible value of x
		int betweens = 0;
		for(int i = A[A.length-1]; i <= B[0]; i++){
			if(hasFactors(i, A) && isFactor(i, B)){
				betweens++;
			}
		}
		System.out.println(betweens);
		scan.close();
	}
	
	/**
	 * Tests if every element of nums is a factor of i
	 * @param i Number to test factors of
	 * @param nums array of proposed factors of i
	 * @return true if every element in nums[] factors i, false otherwise
	 */
	static boolean hasFactors(int i, int[] nums){
		for(int num : nums){
			if(i % num != 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Tests if i is a factor of every number in nums
	 * @param i proposed factor
	 * @param nums array of numbers to factor
	 * @return true if it is a factor of every element of nums, false otherwise
	 */
	static boolean isFactor(int i, int[] nums){
		for(int num : nums){
			if(num % i != 0){
				return false;
			}
		}
		return true;
	}

}
