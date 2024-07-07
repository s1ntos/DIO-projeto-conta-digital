
package conta.digital;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Flores", "São Paulo", "SP", "12345-678");
		Cliente venilton = new Cliente("Venilton", endereco);

		Banco banco = new Banco("Banco Digital");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);

		cc.depositar(1000);
		cc.transferir(200, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("Aplicando juros na Conta Poupança:");
		((ContaPoupanca) poupanca).aplicarJuros();
		poupanca.imprimirExtrato();

		System.out.println("Histórico de transações da Conta Corrente:");
		cc.imprimirHistoricoTransacoes();

		System.out.println("Histórico de transações da Conta Poupança:");
		poupanca.imprimirHistoricoTransacoes();

		System.out.println("Listagem de todas as contas no banco:");
		banco.listarContas();
	}
}