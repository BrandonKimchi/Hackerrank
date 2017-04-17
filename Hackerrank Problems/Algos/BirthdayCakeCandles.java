import java.util.*;
import java.io.*;

public class BirthdayCakeCandles {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> candleCount = new HashMap<Integer, Integer>();
		int N = scan.nextInt();
		int maxHeight = 0;
		while(N-- > 0){
			//read next candle
			int height = scan.nextInt();
			maxHeight = Math.max(maxHeight, height);
			if(candleCount.get(height) == null){
				candleCount.put(height, 0);
			}
			candleCount.put(height, candleCount.get(height)+1);
		}
		//only need count of highest height
		System.out.println(candleCount.get(maxHeight));
	}

}
