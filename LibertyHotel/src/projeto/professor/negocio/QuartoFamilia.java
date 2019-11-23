package projeto.professor.negocio;

public class QuartoFamilia extends Quarto{
	
	public QuartoFamilia(Integer numero, Boolean ehFumante) {
		super(numero, 4, ehFumante, 150.00, "Quarto Família",EnumTipoQuarto.FAMILIA);
	}
	
}
