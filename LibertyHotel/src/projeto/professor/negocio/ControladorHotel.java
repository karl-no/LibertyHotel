package projeto.professor.negocio;

import java.util.Collection;

import exercicio.LogSingleton;

public class ControladorHotel {

	private static ControladorHotel instance;
	
	private ControladorHotel () {
		
	}
	
	public static ControladorHotel getInstance() {
		
		if(instance == null) {
			instance = new ControladorHotel();
		}
		
		return instance;
	}
	
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
		
		Quarto quarto = fabricaQuarto.criarQuarto(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
		
		repositorioQuarto.cadastrarQuarto(quarto);
		return quarto;
	}
	
	
}
