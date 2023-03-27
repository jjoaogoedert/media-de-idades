package mediaIdades;

import java.util.*;

public class MediaIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float total = 0;
		float media = 0;
		int i = 0;
		System.out.print("digite as idades");
		int idade = sc.nextInt();
		media = idade;
		while(idade > 0){
			idade = sc.nextInt();
			media = media + idade;
			i++;
		}
		if(total > 0) {
			total = media/i;
			System.out.print("A media de idade é "+ total);
		}
		System.out.println("IMPOSSIVEL CALCULAR");
		sc.close();
	}
}
