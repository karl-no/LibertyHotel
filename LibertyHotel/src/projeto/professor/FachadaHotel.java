package projeto.professor;

import java.util.Collection;
import java.util.Date;

public class FachadaHotel implements IFachadaHotel {

	private RepositorioHotel repositorioHotel;
	private RepositorioQuarto repositorioQuarto;
	
	
	@Override
	public Hotel cadastrarHotel(String nome, String endereco,EnumClasseHotel classeHotel) {
		IFabricaClasse fabricaHotel = null;
		
		
		if (classeHotel == EnumClasseHotel.BUDGET) {
			fabricaHotel = new FabricaClasseBudget();
		}else if(classeHotel == EnumClasseHotel.CLASSIC) {
			fabricaHotel = new FabricaClasseClassic();
		} else if(classeHotel == EnumClasseHotel.APART) {
			fabricaHotel = new FabricaClasseApart();
		}
		
		Hotel hotel = fabricaHotel.criarHotel(nome, endereco);
		
		repositorioHotel.cadastrarHotel(hotel);
		return hotel;
	}

	@Override
	public Quarto cadastrarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor,
			String descricao, EnumTipoQuarto tipoQuarto) {

		IFabricaClasse fabricaQuarto = null;
		
		if (tipoQuarto == EnumTipoQuarto.PADRAO) {
			fabricaQuarto = new QuartoPadrao();
		} else if(tipoQuarto == EnumTipoQuarto.PADRAO) {
			fabricaQuarto = new QuartoLuxo();
		} else if(tipoQuarto == EnumTipoQuarto.LUXO) {
			fabricaQuarto = new QuartoFamilia();
		} 
		
		Hotel hotel = fabricaHotel.criarHotel(nome, endereco);
		
		repositorioHotel.cadastrarHotel(hotel);
		return hotel;
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
