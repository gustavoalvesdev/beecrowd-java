import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alg1099 {
	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtd = entrada.nextInt();
		
		int q = 0;
		
		int somaImpares = 0;
		ArrayList<Integer> results = new ArrayList<>();
		
		while (q < qtd) {
			
			somaImpares = 0;
			
			int val1 = entrada.nextInt();
			int val2 = entrada.nextInt();
			
			if (val1 > val2 || val1 == val2) {
				int aux = val1;
				val1 = val2;
				val2 = aux;
			}
			
			if (val2 != val1 + 1) {
				
				for (int i = val1 + 1; i < val2; i++) {
					if (i % 2 != 0) {
						somaImpares += i;
					}
				}
				
			}
			results.add(somaImpares);
			q++;
		}
		
		for(int soma: results) {
			System.out.println(soma);
		}
		
		entrada.close();
	}
}