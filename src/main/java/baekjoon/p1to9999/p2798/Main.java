package baekjoon.p1to9999.p2798;

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int result = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int[] sums = new int[(n * (n - 1) * (n - 2)) / 6];
		int index = 0;
		loop:
		for (int i = 0; i < n - 2; i++) {
			int sum = nums[i];
			if (sum >= m) {
				continue;
			}
			for (int j = i + 1; j < n - 1; j++) {
				sum += nums[j];
				if (sum >= m) {
					sum -= nums[j];
					continue;
				}
				for (int k = j + 1; k < n; k++) {
					sum += nums[k];
					if (sum == m) {
						result = sum;
						break loop;
					}
					sums[index++] = sum;
					sum -= nums[k];
				}
				sum -= nums[j];
			}
		}
		if (result == 0) {
			int[] sortedSums = IntStream.of(sums).sorted().toArray();
			for (int i = sortedSums.length - 1; i >= 0; i--) {
				result = sortedSums[i];
				if (result <= m) {
					break;
				}
			}
		}
		br.close();
		bw.write(String.valueOf(result));
		bw.close();

	}
}
