class Conta{
	private double saldo;

	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double valorASerDepositado){
		this.saldo +=valorASerDepositado;
	}

	public void saca(double valoraSerSacado){
		this.saldo -= valoraSerSacado;
	}

	public void atualiza(double taxa){
		this.saldo += (this.saldo*taxa);
	}
}
