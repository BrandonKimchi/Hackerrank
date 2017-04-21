import java.util.*;

public class EqualizeTheArray {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int x = scan.nextInt();
			if(counts.get(x) == null){
				counts.put(x, 0);
			}
			counts.put(x, counts.get(x)+1);
		}
		
		int maxVal = 0;
		for(Integer key : counts.keySet()){
			maxVal = Math.max(maxVal, counts.get(key));
		}
		
		System.out.println(n-maxVal);
		scan.close();
	}

}
