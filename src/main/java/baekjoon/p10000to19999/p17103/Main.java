package baekjoon.p10000to19999.p17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		final int T = Integer.parseInt(br.readLine());
		boolean[] isNotPrime = new boolean[1000001];
		isNotPrime[0] = isNotPrime[1] = true;

		for (int i = 2; i <= Math.sqrt(1000000); i++) {
			if(isNotPrime[i] == true){
				continue;
			}
			for (int j = i * i; j < isNotPrime.length; j += i) {
				isNotPrime[j] = true;
			}
		}

		for (int i = 0; i < T; i++) {
			int countPartition = 0;
			int N = Integer.parseInt(br.readLine());

			for (int j = 1; j <= N / 2; j++) {
				if (!isNotPrime[j] && !isNotPrime[N - j]) {
					countPartition++;
				}
			}
			sb.append(countPartition).append("\n");
		}
		System.out.print(sb);
	}
}
