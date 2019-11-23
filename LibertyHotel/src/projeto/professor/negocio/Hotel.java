package projeto.professor.negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;


public class Hotel extends Observable{
	private String nome;
	private String endereco;
	private Collection<Quarto> quartos;
	private Collection<EnumComodidade> comodidades;
	private Collection<Reserva> reservas;
	private EnumCafeManha cafeManha;
	private EnumClasseHotel classe;
	
	public Hotel(String nome, String endereco,EnumCafeManha cafeManha,EnumClasseHotel classe) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cafeManha = cafeManha;
		this.classe = classe;
		quartos = new ArrayList<Quarto>();
		reservas = new ArrayList<Reserva>();
		comodidades = new ArrayList<EnumComodidade>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Collection<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(Collection<Quarto> quartos) {
		this.quartos = quartos;
	}

	public Collection<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Collection<EnumComodidade> getComodidades() {
		return comodidades;
	}
	
	public void setComodidades(Collection<EnumComodidade> comodidades) {
		this.comodidades = comodidades;
	}
	
	public EnumCafeManha getCafeManha() {
		return cafeManha;
	}
	
	public void setCafeManha(EnumCafeManha cafeManha) {
		this.cafeManha = cafeManha;
	}
	
	public EnumClasseHotel getClasse() {
		return classe;
	}
	
	public void setClasse(EnumClasseHotel classe) {
		this.classe = classe;
	}
	
	@Override
	public String toString() {
		return "Hotel [nome=" + nome + ", endereco=" + endereco + ", quartos=" + quartos + ", comodidades="
				+ comodidades + ", reservas=" + reservas + ", cafeManha=" + cafeManha + ", classe=" + classe
				+ "]";
	}

}
