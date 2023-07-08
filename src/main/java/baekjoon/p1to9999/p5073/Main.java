package baekjoon.p1to9999.p5073;

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
		loop:
		while (true) {
			HashSet<Integer> lengthSet = new HashSet<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = 0;
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				int length = Integer.parseInt(st.nextToken());
				if (length == 0){
					break loop;
				}
				if (max < length){
					max = length;
				}
				lengthSet.add(length);
				sum += length;
			}
			if (!((sum - max) > max)) {
				bw.write("Invalid");
				bw.newLine();
			} else {
				String result = "";
				switch (lengthSet.size()) {
					case 1:
						result = "Equilateral";
						break;
					case 2:
						result = "Isosceles";
						break;
					case 3:
						result = "Scalene";
						break;
					default:
						break;
				}
				bw.write(result);
				bw.newLine();
			}
		}

		br.close();
		bw.close();
	}
}
