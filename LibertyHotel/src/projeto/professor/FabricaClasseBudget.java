package projeto.professor;

public class FabricaClasseBudget implements IFabricaClasse {

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		return new HotelBudget(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		return new QuartoBudget(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}

	
	
	
}
