package baekjoon.p10000to19999.p10101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> angleSet = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int angle = Integer.parseInt(br.readLine());
			angleSet.add(angle);
			sum += angle;
		}
		if (sum != 180) {
			bw.write("Error");
		} else {
			String result = "";
			switch (angleSet.size()) {
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
		}
		br.close();
		bw.close();
	}
}
