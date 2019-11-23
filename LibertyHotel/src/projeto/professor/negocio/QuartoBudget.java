package projeto.professor.negocio;

public class QuartoBudget extends Quarto{

	public QuartoBudget(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		super(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);

		this.getItensQuarto().add(EnumItemQuarto.CAMA);
		
		
	}

}
