package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		Queue<Integer> que = new LinkedList<Integer>();
		int last = 0;

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();

			switch (S) {
			case "push":
				last = Integer.parseInt(st.nextToken());
				que.offer(last);
				break;

			case "pop":
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.poll()).append("\n");
				}
				break;

			case "size":
				sb.append(que.size()).append("\n");
				break;

			case "empty":
				if (que.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;

			case "front":
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peek()).append("\n");
				}
				break;

			case "back":
				if (que.isEmpty()) {
					sb.append(-1).append("\n");

				} else {
					sb.append(last).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}
}
