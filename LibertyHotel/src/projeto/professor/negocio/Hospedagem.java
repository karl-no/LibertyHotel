package projeto.professor.negocio;

import java.util.Collection;

public class Hospedagem {
	private Quarto quarto;
	private Collection<Hospede> hospedes;
	
	public Hospedagem(Quarto quarto, Collection<Hospede> hospedes) {
		super();
		this.quarto = quarto;
		this.hospedes = hospedes;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Collection<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(Collection<Hospede> hospedes) {
		this.hospedes = hospedes;
	}

	@Override
	public String toString() {
		return "\n\tHospedagem [quarto=" + quarto + ", hospedes=" + hospedes + "]";
	}
}
