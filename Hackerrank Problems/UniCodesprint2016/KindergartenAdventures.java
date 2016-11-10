import java.util.*;

public class KindergartenAdventures {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] times = new int[N];
		for(int i = 0; i < N; i++){
			times[i] = scan.nextInt();
		}
		
		int[] completions = new int[N]; //store number completed for starting at index
		
		for(int i = 0; i < N; i++){
			completions[i] = findCompletions(times, i);
		}
		
		int maxIndex = 0;
		for(int i = 0; i < N; i++){
			if(completions[i] > completions[maxIndex]){
				maxIndex = i;
			}
		}
		//print out index +1 because people count from 1
		System.out.println(maxIndex + 1);
	}
	
	static int findCompletions(int[] times, int index){
		int count = 0;
		for(int i = 0; i < times.length; i++){
			if(times[(i+index)%times.length] - i <= 0){
				count++;
			}
		}
		return count;
	}

}
