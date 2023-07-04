package baekjoon.p1to9999.p9506;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 0;
		while ((n = Integer.parseInt(br.readLine())) != -1) {
			StringBuilder sb = new StringBuilder(n + " = 1");
			int sum = 1;
			for (int i = 2; i < n; i++) {
			    if (n % i == 0) {
					sb.append(" + ").append(i);
					sum += i;
				}
			}
			if (n == sum){
				bw.write(sb.toString());
			} else {
				bw.write(n + " is NOT perfect.");
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
