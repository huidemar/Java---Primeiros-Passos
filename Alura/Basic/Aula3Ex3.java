class Funcionario{
	String nome;	
	String cpf;
	String rg;
	double salario;

	void RecebeAumento(double valor){
		this.salario += valor;
	}

	double CalculaGanhoAnual(){
		return this.salario *= 12;

	}

	void Mostra(){
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.rg);
		System.out.println(this.salario);
	}
}

class Programa{
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Mévio";
		funcionario.salario = 1200;
		funcionario.Mostra();

		Funcionario fun = new Funcionario();
		fun.nome = "Tício";
		fun.salario = 1200;
		fun.cpf = "123";
		fun.rg  = "321";
		fun.Mostra();
	}
}
