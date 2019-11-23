package projeto.professor.negocio;

public class HotelClassic extends Hotel{

	public HotelClassic(String nome, String endereco) {
		super(nome, endereco, EnumCafeManha.COMPLETO, EnumClasseHotel.CLASSIC);
		
		this.getComodidades().add(EnumComodidade.ACADEMIA);
		this.getComodidades().add(EnumComodidade.ESTACIONAMENTO);
		
	}

}
