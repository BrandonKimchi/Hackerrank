import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] clouds = new int[n];
		for(int i = 0; i < n; i++){
			clouds[i] = scan.nextInt();
		}
		
		int jumps = 0;
		int pos = 0;
		while(pos < clouds.length-1){
			if(pos < clouds.length-2 && clouds[pos+2] == 1){
				pos++;
			} else{
				pos+=2;
			}
			jumps++;
		}
		System.out.println(jumps);
		scan.close();
	}

}
