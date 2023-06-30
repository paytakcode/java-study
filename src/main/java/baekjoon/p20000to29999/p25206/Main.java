package baekjoon.p20000to29999.p25206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		float avg;
		float scoreSum = 0f;
		float multipliedSum = 0f;
		while ((str = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(str);
			st.nextToken();
			float score = Float.parseFloat(st.nextToken());
			switch (st.nextToken()) {
				case "A+":
					avg = 4.5f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "A0":
					avg = 4.0f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "B+":
					avg = 3.5f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "B0":
					avg = 3.0f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "C+":
					avg = 2.5f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "C0":
					avg = 2.0f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "D+":
					avg = 1.5f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "D0":
					avg = 1.0f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "F":
					avg = 0f;
					scoreSum += score;
					multipliedSum += score * avg;
					break;
				case "P":
					break;
				default:
					System.out.println("Something wrong");
			}
		}
		float result = multipliedSum / scoreSum;
		System.out.println(result);
	}
}
