package projeto.professor;

import java.util.Collection;
import java.util.Date;

public interface IFachadaHotel {
	
	public Hotel cadastrarHotel(String nome, String endereco,EnumClasseHotel classeHotel);
	public Quarto cadastrarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao, EnumTipoQuarto tipoQuarto);
	public Quarto pesquisarQuarto(Integer limHospedes, Date dataInicio, Date dataFim);
	public Collection<Quarto> listaQuartosDisponiveis (Date dataInicio, Date dataFim);
	public Double calcularValorQuarto(Double valor);

}
