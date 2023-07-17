package baekjoon.p10000to19999.p10815;

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
		final int N = Integer.parseInt(br.readLine());
		HashSet<Integer> numSet = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			numSet.add(Integer.parseInt(st.nextToken()));
		}
		final int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			if (numSet.contains(Integer.parseInt(st.nextToken()))) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			if (i != M - 1) {
				bw.write(" ");
			}
		}
		br.close();
		bw.close();
	}
}
