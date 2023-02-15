package q10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			String insert = br.readLine();

			if (insert.contains("push")) {
				String spt[] = insert.split(" ");
				stack.push(Integer.parseInt(spt[1]));

			} else if (insert.contains("pop")) {
				if (stack.empty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.pop() + "\n");
				}

			} else if (insert.contains("size")) {
				bw.write(stack.size() + "\n");

			} else if (insert.contains("empty")) {
				if (stack.empty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}

			} else if (insert.contains("top")) {
				if (stack.empty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}