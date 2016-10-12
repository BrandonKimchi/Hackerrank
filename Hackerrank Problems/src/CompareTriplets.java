import java.util.Scanner;
public class CompareTriplets {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] aScores = new int[3];
		int[] bScores = new int[3];
		
		int aComparison = 0;
		int bComparison = 0;
		
		for(int i = 0; i < 3; i++){
			aScores[i] = scan.nextInt();
		}
		for(int i = 0; i < 3; i++){
			bScores[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 3; i++){
			if(aScores[i] > bScores[i]){
				aComparison++;
			}
			else if(bScores[i] > aScores[i]){
				bComparison++;
			}
		}
		
		System.out.println(aComparison + " " + bComparison);
	}

}
