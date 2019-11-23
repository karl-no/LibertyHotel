package projeto.professor.negocio;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Hospede implements Observer {
	private String nome;
	private String endereco;
	private String telefone;
	private Date dataNascimento;
	
	public Hospede(String nome, String endereco, String telefone, Date dataNascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\n\tHospede [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", dataNascimento="
				+ dataNascimento + "]";
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Reserva) {
			System.out.println("Hotel reservado: " + ((Hotel) o).getNome() + "\n" + ((Reserva)arg));	
		}
		
	}
}
