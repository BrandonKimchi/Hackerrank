import java.io.*;
import java.util.*;

public class BreakingTheRecords {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int games = scan.nextInt();
		int[] scores = new int[games];
		for(int i = 0; i < games; i++){
			scores[i] = scan.nextInt();
		}
		
		int max = scores[0], min = scores[0];
		int maxBreak = 0, minBreak = 0;
		
		for(int score : scores){
			if(score > max){
				max = score;
				maxBreak++;
			}
			if(score < min){
				min = score;
				minBreak++;
			}
		}
		
		System.out.println(maxBreak + " " + minBreak);
		scan.close();
	}

}
