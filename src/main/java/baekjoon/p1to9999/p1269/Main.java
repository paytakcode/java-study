package baekjoon.p1to9999.p1269;

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
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
		    b.add(Integer.parseInt(st.nextToken()));
		}
		int intersection = 0;
		for (int num : a) {
			if (b.contains(num)) {
				intersection++;
			}
		}
		br.close();
		bw.write(String.valueOf(N + M - 2 * intersection));
		bw.close();
	}
}
