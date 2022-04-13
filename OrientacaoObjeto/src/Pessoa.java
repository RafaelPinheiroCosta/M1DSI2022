
public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	boolean dar(int numFigurinhas, Pessoa pessoa) {
		//boolean msg;
		
		if(this.numFigurinhas < numFigurinhas ) {			
			System.out.println("O numero de figurinhas que vc tem é menor que a que vc quer dar!!!!");
			//msg = false;
			return false;
			
		}else {
			this.numFigurinhas -= numFigurinhas;		
			pessoa.receber(numFigurinhas);
			//msg = true;
			return true;
		}
		
		//return msg;
	}

}
