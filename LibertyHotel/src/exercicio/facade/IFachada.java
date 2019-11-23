package exercicio.facade;

import java.util.Collection;
import java.util.Date;

public interface IFachada {
	
	public Cliente cadastrarCliente(String nome, String cpf, Date dataNascimento);
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor);
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim);
	public Collection<Veiculo> listaVeiculosDisponiveis(Date inicio, Date fim);
	
}
