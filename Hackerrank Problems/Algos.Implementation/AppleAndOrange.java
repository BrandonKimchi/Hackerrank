import java.io.*;
import java.util.*;

public class AppleAndOrange {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int houseLeft = scan.nextInt();
		int houseRight = scan.nextInt();
		int appleTree = scan.nextInt();
		int orangeTree = scan.nextInt();
		int apples = scan.nextInt();
		int oranges = scan.nextInt();
		int applesLanded = 0;
		while(apples-- > 0){
			int d = scan.nextInt();
			if(houseLeft <= appleTree+d && houseRight >= appleTree+d){
				applesLanded++;
			}
		}
		int orangesLanded = 0;
		while(oranges-- > 0){
			int d = scan.nextInt();
			if(houseLeft <= orangeTree+d && houseRight >= orangeTree+d){
				orangesLanded++;
			}
		}
		System.out.println(applesLanded);
		System.out.println(orangesLanded);
	}

}
