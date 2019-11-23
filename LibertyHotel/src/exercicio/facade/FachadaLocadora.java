package exercicio.facade;

import java.util.Collection;
import java.util.Date;

public class FachadaLocadora implements IFachada{

	private RepositorioCliente repositorioCliente;
	private RepositorioVeiculo repositorioVeiculo;
	
	@Override
	public Cliente cadastrarCliente(String nome, String cpf, Date dataNascimento) {
		
		Cliente cliente = new Cliente();
		repositorioCliente.cadastrarCliente(cliente);
		return cliente;
	}

	@Override
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Veiculo> listaVeiculosDisponiveis(Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return null;
	}

}
