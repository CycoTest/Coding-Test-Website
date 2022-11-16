package q105_15Right_arrangement;

public class Main {
	public static void main(String[] args) {
		String pop[][] = { // pop = population
				{ "Seoul", "10,312,545", "+91,375" }, 
				{ "Pusan", "3,567,910", "+5,868" },
				{ "Incheon", "2,758,296", "+64,888" }, 
				{ "Daegu", "2,511,676", "+17,230" },
				{ "Gwangju", "1,454,636", "+29,774" } 
				};

		for (int i = 0; i < pop.length; i++) {
			for (int j = 0; j < pop[i].length; j++) {
				System.out.printf("%15s", pop[i][j]);
			}
			System.out.println();
		}
	}
}
