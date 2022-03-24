import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClientText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String key = input.nextLine();
		String file = input.nextLine();
		int contor = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				if (key.equals(line))
					contor++;
				line = br.readLine();
			}
			System.out.println("S-a gasit linia de " + contor + " ori.");
			br.close();
		} catch (IOException e) {
			System.out.println("Eroare la deschidere");
		}

	}
}