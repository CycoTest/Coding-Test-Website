package q1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	final static int red = 0;
	final static int green = 1;
	final static int blue = 2;

	static BufferedReader br;
	static int line;
	static int[][] rgbCost;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		line = Integer.parseInt(br.readLine());
		rgbCost = new int[line][3];

		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			rgbCost[i][red] = Integer.parseInt(st.nextToken());
			rgbCost[i][green] = Integer.parseInt(st.nextToken());
			rgbCost[i][blue] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		for (int i=0; i<line; i++) {
			rgbCost[i][red] += Math.min(rgbCost[i-1][green], rgbCost[i-1][blue]);
			rgbCost[i][green] += Math.min(rgbCost[i-1][red], rgbCost[i-1][blue]);
			rgbCost[i][blue] += Math.min(rgbCost[i-1][red], rgbCost[i-1][green]);
		}

		System.out.println(Math.min(Math.min(rgbCost[line - 1][red], rgbCost[line - 1][green]), rgbCost[line - 1][blue]));
	}
}
/*
 * Q: RGB거리에는 집이 N개 있다. 
 * 		거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
 * 
 * 		집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 
 * 		각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 
 * 		아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
 * 
 * 		1. 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
 * 		2. N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
 * 		3. i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
 * 
 * input form)
 * 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 
 * 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 
 * 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
 * 
 * output form)
 * 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
 * 
 * input ex1)
 * 3
 * 26 40 83
 * 49 60 57
 * 13 89 99
 * 
 * output ex1)
 * 96
 * 
 * input ex2)
 * 3
 * 1 100 100
 * 100 1 100
 * 100 100 1
 * 
 * output ex2)
 * 3
 * 
 * input ex3)
 * 3
 * 1 100 100
 * 100 100 100
 * 1 100 100
 * 
 * output ex3)
 * 102
 * 
 * input ex4)
 * 6
 * 30 19 5
 * 64 77 64
 * 15 19 97
 * 4 71 57
 * 90 86 84
 * 93 32 91
 * 
 * output ex4)
 * 208
 * 
 * input ex5)
 * 8
 * 71 39 44
 * 32 83 55
 * 51 37 63
 * 89 29 100
 * 83 58 11
 * 65 13 15
 * 47 25 29
 * 60 66 19
 * 
 * output ex5)
 * 253
 */

