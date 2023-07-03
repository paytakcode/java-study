package baekjoon.p1to9999.p5086;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()){
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 || b == 0){
				break;
			}
			if (a > b && a % b == 0){
				sb.append("multiple").append("\n");
			} else if (b > a && b % a == 0){
				sb.append("factor").append("\n");
			} else if (a % b > 0 || b % a > 0){
				sb.append("neither").append("\n");
			}
		}
		System.out.println(sb);
	}
}
