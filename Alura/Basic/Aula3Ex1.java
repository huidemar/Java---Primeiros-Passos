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
}

class Programa{
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Mévio";
		funcionario.salario = 1200;
		System.out.println("Nome: "+funcionario.nome);
		System.out.println("Salário: "+funcionario.salario);
		System.out.println("Ganho Anual: "+funcionario.CalculaGanhoAnual());

	}
}
