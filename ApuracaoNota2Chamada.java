package aula16.unit.com.br;

public class ApuracaoNota2Chamada extends ApuracaoNotas{
	
	private double nota;
	
	public ApuracaoNota2Chamada(double n1, double n2, double n) {
		super(n1, n2);
		this.nota = n;
		
		// Duas notas - Com segunda chamada
		
		if(n1 == 0) {
			CalcularMedia(n2,n);
		}
		else if(n2 == 0) {
			CalcularMedia(n1,n);
		}
		
		// Três notas - sem segunda chamada
		
		else {
			CalcularMedia(n1,n);
		}
	}

	public ApuracaoNota2Chamada(double n1, double n2, double n3, double n) {
		super(n1, n2, n3);
		this.nota = n;
	
		//3 - Duas notas - Segunda chamada 
		
		if(n1 == 0)      {
			CalcularMedia(n2,n3,n);
		}
		else if(n2 == 0) {
			CalcularMedia(n1,n3,n);
		}
		else if(n3 == 0) { CalcularMedia(n1,n2,n);	}
		
		//4 - Três notas - Segunda chamada 
		
		else if(n2 == 0 && n1 == 0) {
			CalcularMedia(n2,n3,n); 
		}
		else if(n1 == 0 && n3 == 0) {
			CalcularMedia(n1,n2,n); 
		}
		else if(n2 == 0 && n3 == 0) {
			CalcularMedia(n1,n2,n); 
		}
		else{
			CalcularMedia(n1,n2,n); 
		}
	}
	//Get
	public double getNota() { 
		return nota; 
		}
	//Set
	public void setNota(double n) {
		this.nota = n;
		}
	//Metódos
	@Override
	public double CalcularMedia(double n1,double n2) {
		
		return this.media = (n1 + n2 ) /2;
	}
	@Override
	public double CalcularMedia(double n1,double n2,double n3){
		return this.media = (n1 + n2 + n3)/3;
	}
}
