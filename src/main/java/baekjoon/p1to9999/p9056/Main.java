package baekjoon.p1to9999.p9056;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] xArray = new int[n];
		int[] yArray = new int[n];
		for (int i = 0; i < n; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
			xArray[i] = Integer.parseInt(st.nextToken());
			yArray[i] = Integer.parseInt(st.nextToken());
		}
		int result = (IntStream.of(xArray).max().getAsInt() - IntStream.of(xArray).min().getAsInt())
			* (IntStream.of(yArray).max().getAsInt() - IntStream.of(yArray).min().getAsInt());
		br.close();
		bw.write(String.valueOf(result));
		bw.close();
	}
}
