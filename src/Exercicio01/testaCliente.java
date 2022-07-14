package Exercicio01;

public class testaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente cli = new cliente(); //criando o obj // estanciado o objeto
		
		cli.setNome("Adaberdaldo");
		cli.setIdade(55);
		cli.setTipoCliente("Ferramentas e Automotivo");
		
		System.out.println(cli.getNome());
		System.out.println(cli.getIdade());
		System.out.println(cli.getTipoCliente());
	}

}
