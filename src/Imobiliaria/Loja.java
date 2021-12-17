package Imobiliaria;

public class Loja  extends Imovel{

	public Loja(String modelo,double valor) {
		super(modelo,valor);
		this.modelo="(ModeloImovel)" + modelo;
		this.aluguel = valor * 0.008;
		this.faturamento = this.aluguel * 0.005;
	 
		
	}
    
	
}