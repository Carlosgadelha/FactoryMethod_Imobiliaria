package Imobiliaria;

public class Casa  extends Imovel{

	public Casa(String modelo,double valor) {
		super(modelo,valor);
		this.modelo="(ModeloImovel)" + modelo;
		this.aluguel = valor * 0.01;
		this.faturamento = this.aluguel * 0.005;
	 
		
	}
    
	
}