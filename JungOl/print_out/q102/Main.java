package q102;

public class Main {
	public static void main(String[] args) {
		String words = "My hometown Flowering mountain";
		String w[] = words.split(" ", 4);
		
		System.out.println(w[0] + " " + w[1]);
		System.out.println(w[2] + " " + w[3]);
	}
}
