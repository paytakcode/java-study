package baekjoon.p1to9999.p2485;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		final int N = Integer.parseInt(br.readLine());

		int[] trees = new int[N];

		for(int i = 0; i < N; i++){
			trees[i] = Integer.parseInt(br.readLine());
		}

		int gcd = 0;

		for(int i = 0; i < N - 1; i++){
			int distance = trees[i + 1] - trees[i];
			gcd = findGCD(distance, gcd);
		}

		br.close();
		bw.write(String.valueOf((trees[N-1] - trees[0]) / gcd + 1 - N));
		bw.close();

	}
	static int findGCD(int a, int b){
		while(b != 0){
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}