import java.util.Scanner;

public class MilEVinteUm{
	static int[] vetorNotas = {100, 50, 20, 10, 5, 2};
	static double[] vetorMoedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

	static int notaCem = 0;
	static int notaCinquenta = 0;
	static int notaVinte = 0;
	static int notaDez = 0;
	static int notaCinco = 0;
	static int notaDois = 0;

	static int moedaUmReal = 0;
	static int moedaCinquenta = 0;
	static int moedaVinteECinco = 0;
	static int moedaDez = 0;
	static int moedaCinco = 0;
	static int moedaUmCentavo = 0;

	public static void main(String[] args){ 
		Scanner teclado = new Scanner(System.in);
		//Teste obj = new Teste();
		double valor = teclado.nextDouble();
		//obj.imprimir(valor);
		//obj.show();
		MilEVinteUm.imprimir(valor);
		MilEVinteUm.show(valor);
	}

	public static void imprimir(double valor){
		for(int i = 0; i < vetorNotas.length; i++){
			while(true){
				if(vetorNotas[i] <= valor){
					switch (vetorNotas[i]){
						case 100: notaCem++; valor -= 100; break;
						case 50: notaCinquenta++; valor -= 50; break;
						case 20: notaVinte++; valor -= 20; break;
						case 10: notaDez++; valor -= 10; break;
						case 5: notaCinco++; valor -= 5; break;
						case 2: notaDois++; valor -= 2; break;
					}
				}else{
					break;
				}
			}
		}

		for(int j = 0; j < vetorMoedas.length; j++){
			while(true){
				if(vetorMoedas[j] <= valor){
					if(vetorMoedas[j]  == 1){
						moedaUmReal++;
						valor -= 1;
					}else if(vetorMoedas[j] == 0.50){
						moedaCinquenta++;
						valor -= 0.50;
					}else if(vetorMoedas[j] == 0.25){
						moedaVinteECinco++;
						valor -= 0.25;
					}else if(vetorMoedas[j] == 0.10){
						moedaDez++;
						valor -= 0.10;
					}else if(vetorMoedas[j] == 0.05){
						moedaCinco++;
						valor -= 0.05;
					}else{
						moedaUmCentavo++; 
						valor -= 0.01;
					}
				}else{
					break;
				}
			}
		}
	}

	public static void show(double valor){
		System.out.println("NOTAS:");
		System.out.println(notaCem+" nota(s) de R$ 100.00");
		System.out.println(notaCinquenta+" nota(s) de R$ 50.00");
		System.out.println(notaVinte+" nota(s) de R$ 20.00");
		System.out.println(notaDez+" nota(s) de R$ 10.00");
		System.out.println(notaCinco+" nota(s) de R$ 5.00");
		System.out.println(notaDois+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moedaUmReal+" moedas(s) de R$ 1.00");
		System.out.println(moedaCinquenta+" moedas(s) de R$ 0.50");
		System.out.println(moedaVinteECinco+" moedas(s) de R$ 0.25");
		System.out.println(moedaDez+" moedas(s) de R$ 0.10");
		System.out.println(moedaCinco+" moedas(s) de R$ 0.05");	
		System.out.println(moedaUmCentavo+" moedas(s) de R$ 0.01");
	}
}