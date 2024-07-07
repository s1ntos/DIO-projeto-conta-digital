package conta.digital;

public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, IConta contaDestino);
	void imprimirExtrato();
	int getNumero(); // Adicionado para obter o número da conta no método transferir
}