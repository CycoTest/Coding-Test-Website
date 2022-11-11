package q595;

public class Main {
	public static void main(String[] args) {
		String ws = "Hong Gil Dong";
		
		// 1.
		for (int i=3; i <=6; i++) {
			System.out.print(ws.charAt(i));
		}
		System.out.println();
			
		// 2.
		System.out.print(ws.charAt(3));
		System.out.print(ws.charAt(4));
		System.out.print(ws.charAt(5));
		System.out.println(ws.charAt(6));
		
		// 3.
		System.out.print(ws.substring(3, 7));
	}
}
