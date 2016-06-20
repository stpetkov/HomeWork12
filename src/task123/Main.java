package task123;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String text = new String("hello guys how are you i am fine thanks");
		String[] parts = text.split("\\s+");
		Arrays.sort(parts);
		StringBuilder sb = new StringBuilder();
		for (String s : parts) {
			sb.append(s);
			sb.append(" ");
		}
		String sorted = sb.toString().trim();
		System.out.print(sorted);
	}

}
