import java.util.*;
import java.io.*;

public class Kangaroo {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		
		Kang back, front;
		if(x1 < x2){
			back = new Kang(x1, v1);
			front = new Kang(x2, v2);
		} else{
			back = new Kang(x2, v2);
			front = new Kang(x1, v1);
		}
		
		if(front.v > back.v){
			System.out.println("NO");
			return;
		}
		
		while(back.x <= front.x){
			if(back.x == front.x){
				System.out.println("YES");
				return;
			}
			front.jump();
			back.jump();
		}
		System.out.println("NO");
	}

}

class Kang{
	
	public int x, v;
	
	public Kang(int x, int v){
		this.x = x;
		this.v = v;
	}
	
	public void jump(){
		this.x += this.v;
	}
	
}
