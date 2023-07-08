package baekjoon.p10000to19999.p14215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a < c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if (a >= (b + c)) {
			a -= (a - (b + c)) + 1;
		}
		br.close();
		bw.write(String.valueOf(a + b + c));
		bw.close();

	}
}
