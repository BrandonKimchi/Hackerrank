import java.util.Scanner;
import java.io.*;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		long n = scan.nextLong();
		
		long a = occurences(s, 'a');
		long total = a * (n / s.length());
		
		total += occurences(s.substring(0, (int)(n%s.length())), 'a');
		
		System.out.println(total);
		
		scan.close();
	}
	
	static long occurences(String s, char a){
		long out = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == a)
				out++;
		}
		return out;
	}

}
