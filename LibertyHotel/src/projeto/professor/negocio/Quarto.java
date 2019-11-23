package projeto.professor.negocio;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Quarto {
	private Hotel hotel;
	private Integer numero;
	private Integer limHospedes;
	private Boolean ehFumante;
	private Double valor;
	private String descricao;
	private Collection<EnumItemQuarto> itensQuarto;
	private EnumTipoQuarto tipoQuarto;

	public Quarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao, EnumTipoQuarto tipoQuarto) {
		this.numero = numero;
		this.limHospedes = limHospedes;
		this.ehFumante = ehFumante;
		this.valor = valor;
		this.descricao = descricao;
		this.itensQuarto = new ArrayList<EnumItemQuarto>();
		this.tipoQuarto = tipoQuarto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getLimHospedes() {
		return limHospedes;
	}

	public void setLimHospedes(Integer limHospedes) {
		this.limHospedes = limHospedes;
	}

	public Boolean getEhFumante() {
		return ehFumante;
	}

	public void setEhFumante(Boolean ehFumante) {
		this.ehFumante = ehFumante;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<EnumItemQuarto> getItensQuarto() {
		return itensQuarto;
	}

	public void setItensQuarto(Collection<EnumItemQuarto> itensQuarto) {
		this.itensQuarto = itensQuarto;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public EnumTipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}
	
	public void setTipoQuarto(EnumTipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	@Override
	public String toString() {
		return "\nQuarto [numero=" + numero + ", limHospedes=" + limHospedes + ", ehFumante="
				+ ehFumante + ", valor=" + valor + ", descricao=" + descricao + ", itensQuarto=" + itensQuarto + "]";
	}
	
	
}
