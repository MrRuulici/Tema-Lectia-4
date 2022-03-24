import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inmultire {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int P = input.nextInt();
		double[][] matrix1 = new double[N][M];
		double[][] matrix2 = new double[M][P];
		double[][] multiplication = new double[N][P];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < P; j++) {
				multiplication[i][j] = 0;
			}
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++) {
				matrix1[i][j] = input.nextInt();
			}
		for (int i = 0; i < M; i++)
			for (int j = 0; j < P; j++) {
				matrix2[i][j] = input.nextInt();
			}
		for (int i = 0; i < N; i++)
			for (int j = 0; j < P; j++) {
				for (int k = 0; k < M; k++)
					multiplication[i][j] = multiplication[i][j] + matrix1[i][k] * matrix2[k][j];
			}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < P; j++) {
					bw.write(multiplication[i][j] + " ");
				}
				bw.write("\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Eroare la deschidere");
		}
	}

}
