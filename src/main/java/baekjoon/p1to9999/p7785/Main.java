package baekjoon.p1to9999.p7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());

		Set<String> workingEmpSet = new HashSet<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String emp = st.nextToken();
			boolean isWorking = st.nextToken().equals("enter");
			if (isWorking) {
				workingEmpSet.add(emp);
			} else {
				workingEmpSet.remove(emp);
			}
		}

		TreeSet<String> sortedWorkingEmpSet = new TreeSet<>(Comparator.reverseOrder());
		sortedWorkingEmpSet.addAll(workingEmpSet);

		StringBuilder sb = new StringBuilder();
		for (String emp : sortedWorkingEmpSet) {
			sb.append(emp).append("\n");
		}

		System.out.print(sb);

		br.close();
	}
}
