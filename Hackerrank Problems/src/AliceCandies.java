import java.io.*;
import java.util.*;

public class AliceCandies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] ratings = new int[N];
        for(int i = 0; i < N; i++){
            ratings[i] = scan.nextInt();
        }
        
        int[] candies = new int[ratings.length];//candies will be a modifier, so be sure to add 1 to each when getting sum
        for(int i = 0; i < ratings.length-1; i++){
            if(ratings[i+1] > ratings[i]){
                if(candies[i+1] <= candies[i]){
                    candies[i+1] = 1 + (candies[i] - candies[i+1]);
                }
            } else if(ratings[i] > ratings[i+1]){
                if(candies[i] <= candies[i+1]){
                    candies[i] = 1 + (candies[i+1]-candies[i]);
                }
            }
        }
        
        int totalCandy = 0;
        for(int count : candies){
            totalCandy += 1+count;
        }
        System.out.println(totalCandy);
        scan.close();
    }
}