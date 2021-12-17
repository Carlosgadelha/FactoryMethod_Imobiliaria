package Imobiliaria;

public class Main {

	public static void main(String[] args) {
		
		FabricaDeImoveis f = new FabricaDeImoveis();
		
		double imoveis[] = new double[5];
		
		for(int i=0; i<5; i++) {
			imoveis[i] = f.criarImovel("casa", 01, 1000).faturamento ;
			System.out.println(imoveis[i]);
		}
		
		
		//System.out.println(f.criarImovel("casa", 01, 1000).aluguel);
		
		
	}

}