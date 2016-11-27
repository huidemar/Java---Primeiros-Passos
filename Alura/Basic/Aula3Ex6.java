class Data{
	int dia = 0;
	int mes = 0;
	int ano = 0;
}
class Funcionario{
	String nome;	
	String cpf;
	String rg;
	double salario;
	Data datanasc;

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
		Funcionario f1 = new Funcionario();
		f1.nome= "Danilo";
		f1.salario=100;

		f1.datanasc = new Data();
		f1.datanasc.dia = 01;
		f1.datanasc.mes = 12;
		f1.datanasc.ano = 1990;
	}
}
