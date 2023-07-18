package baekjoon.p10000to19999.p14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken());
		final int M = Integer.parseInt(st.nextToken());
		HashSet<String> strings = new HashSet<>();
		int count = 0;

		for (int i = 0; i < N; i++) {
			strings.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			if (strings.contains(br.readLine())) {
				count++;
			}
		}

		br.close();
		bw.write(String.valueOf(count));
		bw.close();
	}
}
