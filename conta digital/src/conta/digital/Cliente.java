package conta.digital;

public class Cliente {

	private String nome;
	private Endereco endereco;

	public Cliente(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void atualizarInformacoes(String novoNome, Endereco novoEndereco) {
		this.nome = novoNome;
		this.endereco = novoEndereco;
	}
}