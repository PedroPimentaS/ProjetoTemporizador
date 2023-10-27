package exemplos;

import java.util.Scanner;

public class ProjetoTemporizador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite o numero que voce quer que comece a contagem: ");
			int n=sc.nextInt();
			
			System.out.println("DIgite o segundo que deseja: ");
			int s=sc.nextInt();
			
			
			for (int i = n; i > 0; i--) {
				for (int j = s; j > 0; j--) {
					System.out.println(i + ":" + j);
					Thread.sleep(1000);
				}
				s=59;			
				}
			System.out.println("BOMMMMM");
			
		} catch (Exception e) {
			System.out.println("Ele não esperou ' segundo");
		}
		sc.close();
	}

}
