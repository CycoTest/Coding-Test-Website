package q10828;

import java.util.Scanner;
import java.util.Stack;

class InsertStack {
	
	public void push() {
		
	}
	
	public void pop() {
		
	}
	
	public void size() {
		
	}
	
	public void empty() {
		
	}
	
	public void top() {
		
	}
}

public class Main04_incomplete {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> insert = new Stack<Integer>();
		
		int N = in.nextInt();
		String process[] = new String[N];
		for (int i=0; i<process.length; i++) {
			process[i] = in.nextLine();
			
			if (process[i].contains("push")) {
				insert.push(Integer.valueOf(process[i]));
			} else if (process[i].equals("top")) {
				if (insert.isEmpty()) {
					System.out.println(-1);
				} else {
					insert.peek();
					insert.pop();
				}
			} else if (process[i].equals("size")) {
				insert.size();
			} else {
				
			}
		}
		in.close();
	}
}
