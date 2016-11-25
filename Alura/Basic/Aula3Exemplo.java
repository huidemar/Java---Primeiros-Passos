class Conta{

	int numero;
	Pessoa titular;
	double saldo;
	int agencia;

	void deposita(double valorASerDepositado){

		this.saldo += valorASerDepositado;
	}

	void saca(double valorASerSacado){
		if (this.saldo>=valorASerSacado){
			this.saldo -= valorASerSacado;
		}		
	}

	void transfere(double valor, Conta desinto){
		this.saldo -= valor;
		desinto.saldo += valor;
	}
}

class Pessoa{
	String nome;
	String cpf;

}

class Programa{
	public static void main(String[] args) {
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800;
		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio";
		mauricio.agencia = 12;

		mauricio.deposita(100);


		Conta guilherme = new Conta();
		guilherme.numero =1234;
		guilherme.saldo = 900;
		guilherme.titular = new Pessoa();
		guilherme.titular.nome = "Guilherme";
		guilherme.agencia = 13;

		guilherme.deposita(100);

		System.out.println(mauricio.titular.nome);
		System.out.println(mauricio.saldo);

		System.out.println(guilherme.titular.nome);
		System.out.println(guilherme.saldo);		
	}
}
