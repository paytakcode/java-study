package baekjoon.p1to9999.p2501;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		int result = 0;
		for (int i = 1; i <= n; i++){
			if (n % i == 0) {
				count++;
			}
			if (count == k) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
