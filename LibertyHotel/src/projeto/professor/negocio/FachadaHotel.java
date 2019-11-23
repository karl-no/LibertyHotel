package projeto.professor.negocio;

import java.util.Collection;
import java.util.Date;

public class FachadaHotel implements IFachadaHotel {

	
	
	@Override
	public Hotel cadastrarHotel(String nome, String endereco,EnumClasseHotel classeHotel) {
		
		Hotel hotel = ControladorHotel.getInstance().cadastrarHotel(nome, endereco, classeHotel);
		return hotel;
		
	}

	@Override
	public Quarto cadastrarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor,
			String descricao, EnumTipoQuarto tipoQuarto) {

		Quarto quarto = ControladorHotel.getInstance().cadastrarQuarto(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
		return quarto;
		
	}

	@Override
	public Quarto pesquisarQuarto(Integer limHospedes, Date dataInicio, Date dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Quarto> listaQuartosDisponiveis(Date dataInicio, Date dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularValorQuarto(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
