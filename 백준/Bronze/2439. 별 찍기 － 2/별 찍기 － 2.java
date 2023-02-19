import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String a = "";
		String b = "";
		
		for (int i = 0; i < length; i++) {
			for (int k = (length-i-1); k > 0; k--) {
				a+=" ";
			}
			for (int j = i; j >= 0; j--) {
				b += "*";
			}
			System.out.println(a+b);
			a ="";
			b ="";
		}
		
	}
}