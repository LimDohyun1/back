import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		StringBuilder SB = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < length-i; j++) {
				SB.append(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				SB.append("*");
			}

			SB.append("\n");
		}
		System.out.println(SB);
		
	}
}