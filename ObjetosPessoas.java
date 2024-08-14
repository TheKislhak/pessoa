package ex;

public class ObjetosPessoas {

	public static void main(String[] args) {
		//Criando objetos da classe Pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		//Obj 1
		pessoa1.setNome("Ceroba Ketsukane");
		pessoa1.setIdade(32);
		pessoa1.setEndereco("Dunas, Subsolo");
		pessoa1.setProfissao("Ciêntista");
		pessoa1.setCpf(3748937649l);
		pessoa1.setRg(2497362721l);
		
		//obj 2
		pessoa2.setNome("Starlo Star");
		pessoa2.setIdade(29);
		pessoa2.setEndereco("Dunas, Subsolo");
		pessoa2.setProfissao("Xerife");
		pessoa2.setCpf(62398414289l);
		pessoa2.setRg(2342582343l);
		
		//Chamando o método get() para apresentar os objetos
		System.out.println("————— Objeto 1 —————");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
		
		System.out.println("————— Objeto 2 —————");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
		

	}

}
