package Imobiliaria;

public class Galpao  extends Imovel{

	public Galpao(String modelo,double valor) {
		super(modelo,valor);
		this.modelo="(ModeloImovel)" + modelo;
		this.aluguel = valor * 0.008;
		this.faturamento = this.aluguel * 0.005;
	 
		
	}
    
	
}