package baekjoon.p10000to19999.p10816;

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
		final int N = Integer.parseInt(br.readLine());
		int[] arr = new int[20000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num + 10000000] = ++arr[num + 10000000];
		}
		final int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(arr[num + 10000000]));
			if (i != M - 1) {
				bw.write( " ");
			}
		}
		br.close();
		bw.close();
	}
}
