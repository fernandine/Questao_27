package aplicacao;

import entidade.Entrada;


public abstract class Programa {
	
	public static void main(String[] args) {
		
	     
	Entrada ent = new Entrada();
	

	    System.out.println("A soma dos dois números é: " + ent.Calcular(10,20));
	}

	   
	}