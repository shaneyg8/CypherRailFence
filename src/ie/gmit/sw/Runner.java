package ie.gmit.sw;


import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {

	public static void main(String[] args) throws Exception {
		String plainText;
		String gram = "4grams.txt";
		Scanner console = new Scanner(System.in);
		System.out.print("Enter Text: ");
		plainText = console.nextLine();
		
		RailFence rail = new RailFence();
		String cypherText = rail.encrypt(plainText, 4);

		
		FileParser filep = new FileParser();
		
		Map<String, Double> map = new ConcurrentHashMap<String, Double>();
		map = filep.parse(gram);
		
		TextScorer texts = new TextScorer(map);
		
		CypherBreaker cypher = new CypherBreaker(cypherText, texts);

	}

}
