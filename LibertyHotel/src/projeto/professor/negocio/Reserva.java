package projeto.professor.negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Reserva {
	private Date dataInicio;
	private Date dataFim;
	private Hospede responsavel;
	private Collection<Hospedagem> hospedagens;
	
	public Reserva(Date dataInicio, Date dataFim, Hospede responsavel) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.responsavel = responsavel;
		this.hospedagens = new ArrayList<Hospedagem>();
		
		
		
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Hospede getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Hospede responsavel) {
		this.responsavel = responsavel;
	}

	public Collection<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public void setHospedagens(Collection<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}

	@Override
	public String toString() {
		return "\nReserva [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", responsavel=" + responsavel
				+ ", hospedagens=" + hospedagens + "]";
	}
	
}
