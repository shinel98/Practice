package Greedy;


import java.util.Scanner;

public class BaekJoon_14916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1 || n == 3) {
			System.out.println(-1);
			return;
		}
		
		int t_cent = 0;
		int t_remain = 0;
		int f_cent = n / 5;
		int f_remain = n % 5;
		
		if(f_remain == 1 || f_remain == 3) {
			f_cent--; 
			t_cent = ((n - f_cent*5) / 2);
			t_remain = ((n - f_cent*5) % 2);
			if(t_remain == 0) {
				System.out.println(f_cent+t_cent);
			}
			else {
				System.out.println(-1);
			}
		}
		else {
			t_cent = f_remain/2; 
			System.out.println(f_cent+t_cent);
		}
	}

}
