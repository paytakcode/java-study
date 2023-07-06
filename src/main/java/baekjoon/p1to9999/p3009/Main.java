package baekjoon.p1to9999.p3009;

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
		int[] xArray = new int[3];
		int[] yArray = new int[3];
		int x = 0;
		int y = 0;
		for (int i = 0; i < 3; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArray[i] = Integer.parseInt(st.nextToken());
			yArray[i] = Integer.parseInt(st.nextToken());
		}
		if (xArray[0] == xArray[1]) {
			x = xArray[2];
		} else if (xArray[1] == xArray[2]){
			x = xArray[0];
		} else {
			x = xArray[1];
		}
		if (yArray[0] == yArray[1]) {
			y = yArray[2];
		} else if (yArray[1] == yArray[2]){
			y = yArray[0];
		} else {
			y = yArray[1];
		}
		br.close();
		bw.write(x + " " + y);
		bw.close();
	}
}
