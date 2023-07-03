package baekjoon.p1to9999.p2903;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dotsOfLine = 2;
		for (int i = 1; i <= n; i++){
			dotsOfLine += dotsOfLine - 1;
		}
		System.out.println(dotsOfLine * dotsOfLine);
	}
}
