import java.io.*;
import java.util.*;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		while(N-- > 0){
			round(scan.nextInt());
		}
	}
	
	private static void round(int grade){
		if(next5(grade) - grade < 3 && grade >= 38){
			System.out.println(next5(grade));
		} else{
			System.out.println(grade);
		}
	}
	
	private static int next5(int grade){
		return ((grade/5)+1)*5;
	}

}
