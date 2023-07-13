package baekjoon.p1to9999.p2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int result = 0;
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = num;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum == n) {
				result = i;
				break;
			}
		}
		br.close();
		bw.write(String.valueOf(result));
		bw.close();
	}
}
