import java.util.*;
import java.io.*;

public class JavaStack {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			String input = scan.next();
			System.out.println(evaluateString(input));
		}
		scan.close();
	}
	
	/**
	 * Takes in a string to process following the rules:
	 * it is balanced if all the groups of braces of different types close each other
	 * @param str
	 * @return
	 */
	public static boolean evaluateString(String str){
		Stack<Character> bracketLevel = new Stack<Character>(); //store the last opening bracket so it can be matched to the closing, then go up a level when closed.
		
		String openingBrackets = "({[";
		String closingBrackets = ")}]";
		
		for(int i = 0; i < str.length(); i++){
			if(openingBrackets.contains(str.charAt(i)+"")){ //if the character opens a pair of braces
				bracketLevel.push(str.charAt(i)); //add this opener to the stack
			}
			else if(bracketLevel.isEmpty()){ //no openings made, but something is trying to close, so it is broken
				return false;
			}
			else if(closingBrackets.indexOf(str.charAt(i)) == openingBrackets.indexOf(bracketLevel.peek())){//the closing brace = the opening brace type
				//with a match, this group will close, so pop up a level in the stack and move along
				bracketLevel.pop();
			}
			else{//else there is a closing bracket that does not match whatever last opened, so it is imbalanced
				return false;
			}
		}
		
		if(!bracketLevel.isEmpty()){ //if the opening stack is not empty, then something was not closed properly
			return false;
		}
		
		return true;
	}
	
}
