package conta.digital;

public class ContaPoupanca extends Conta {

	private static final double TAXA_JUROS = 0.02;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void aplicarJuros() {
		double juros = saldo * TAXA_JUROS;
		this.depositar(juros);
		transacoes.add(String.format("Juros aplicados: +%.2f", juros));
	}
}