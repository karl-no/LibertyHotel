package projeto.professor;

public class QuartoApart extends Quarto {

	public QuartoApart(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		super(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);

		this.getItensQuarto().add(EnumItemQuarto.CAMA);
		this.getItensQuarto().add(EnumItemQuarto.TV);
		this.getItensQuarto().add(EnumItemQuarto.COZINHA_COMPLETA);
		
	}

	
	
}
