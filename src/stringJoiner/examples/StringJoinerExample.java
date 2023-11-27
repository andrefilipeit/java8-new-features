package stringJoiner.examples;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		String names = " André, Filipe, Oliveira, Jamilly, Roberta";
		
		StringTokenizer st = new StringTokenizer(names, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringJoiner sj = new StringJoiner(", ");
		sj.add("André");
		sj.add("Filipe");
		sj.add("Oliveira");
		sj.add("Jamilly");
		sj.add("Roberta");
		
		System.out.println(sj);
	}

}
