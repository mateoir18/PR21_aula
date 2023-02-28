package PR21_aula;

import java.util.Arrays;

public class Aula {

	
	private int[]notas;
	private int NotaPR1;
	private int NotaBBDD;
	private String codigo;
	
	public Aula() {
		this.NotaBBDD = NotaBBDD;
		this.NotaPR1 = NotaPR1;
		this.codigo = codigo;
	}
	
	public void generaraula() {
		notas = new int[30];
		for(int i =1; i<notas.length;i++) {
			notas[i] = (int)(Math.random()*10);
			
		}
	}

	@Override
	public String toString() {
		return "Aula [notas="   + Arrays.toString(notas) + "]";
	}
	
	
	
	
	
}
