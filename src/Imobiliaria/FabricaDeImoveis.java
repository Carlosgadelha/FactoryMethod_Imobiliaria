package Imobiliaria;

public class FabricaDeImoveis{
	
	public Imovel criarImovel(String modelo, int cod, double valor) {
		
        switch (modelo){
        case "casa":
            return new Casa(modelo,valor);
        case "apartamento":
            return new Apartamento(modelo,valor);
        default:	        	
            break;
        }
        return null;
    }
	
}