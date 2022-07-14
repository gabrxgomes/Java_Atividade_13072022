package Exercicio02;

public class TestaAvião {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avião avi = new Avião(); //criando o obj // estanciado o objeto
		
		// O MEU TESTA AVIÃO É A MINHA CLASSE PRINCIPAL A MAIN ONDE EU VOU CHAMARA MINHA CLASSE(OBJETO) E INSTANSIA-LA 
		
		avi.setPeso(6000); // USANDO O METODO GET E SET DENTRO DA MAIN PARA NO CASO SETAR O PESO DO MEU AVIAO (AVI
		avi.setModelo("Militar");
		avi.setCor("Estampa ");
		
		System.out.println("O peso da aeronave:  "+ avi.getPeso()); // concatenando o meu get dos atributos do meu objeto avião com um texto no meu sysout
		System.out.println("O modelo da aeronave: " + avi.getModelo()); // concatenando o meu get dos atributos do meu objeto avião com um texto no meu sysout 
		System.out.println("A cor da aeronave: " + avi.getCor()); // concatenando o meu get dos atributos do meu objeto avião com um texto no meu sysout
		
	}

}
