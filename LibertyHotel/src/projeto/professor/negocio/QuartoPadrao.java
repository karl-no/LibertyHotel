package projeto.professor.negocio;

public class QuartoPadrao extends Quarto{

	public QuartoPadrao(Integer numero, Boolean ehFumante) {
		super(numero, 2, ehFumante, 100.00, "Quarto Padrão",EnumTipoQuarto.PADRAO);
	}
}
