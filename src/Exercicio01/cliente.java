package Exercicio01;

public class cliente {

	
		// TODO Auto-generated method stub
		private int idade;
		private String nome;
		private String tipocliente;	
		
		//getters e setters --> servi�os que me auxilia no acesso e na modifica��o dos daods
		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTipoCliente() {
			return tipocliente;
		}

		public void setTipoCliente(String tipocliente) {
			this.tipocliente = tipocliente;
		}
		
		//A��es... m�todos... fun��es
		void estudar() {
			System.out.println("Aluno estudando....");
		}
	

}
