import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] matriz = new double[3][4];
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
		
		System.out.println("Entre com as notas do " +(i+1)+"° aluno");
				matriz[i][j] = in.nextDouble();
	}
		}

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
	}
	}
