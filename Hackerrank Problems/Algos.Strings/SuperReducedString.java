import java.util.*;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String prev;
		String next = s;
		do {
			prev = next;
			next = simplify(next);
		} while(!next.equals(prev));
		if(prev.equals("")){
			System.out.println("Empty String");
		} else{
			System.out.println(prev);
		}
		scan.close();
	}
	
	static String simplify(String s){
		String out = "";
		for(int i = 0; i < s.length(); i++){
			if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
				i++;
				continue;
			}
			out += s.charAt(i);
		}
		return out;
	}

}
