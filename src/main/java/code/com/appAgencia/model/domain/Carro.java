package code.com.appAgencia.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity

public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String placa;
	private String montadora;
	private String modelo;
	private int anoFab;
	private int anoMod;
	private float kmtragem;
	private boolean completo;
	private boolean gnv;
	private boolean flex;
	@OneToOne
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Carro() {
		this.kmtragem = 0;
		this.completo = true;
		this.gnv = false;
		this.flex = true;
		
	}
	
	public Carro(String placa, int anoMod, String montadora, String modelo) {
		this();
		this.anoFab = anoMod;
		this.placa = placa;
		this.anoMod = anoMod;
		this.montadora = montadora;
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Montadora: "+montadora+", modelo: "+modelo+", ano: "+anoMod+" e Placa: "+placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String marca) {
		this.montadora = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public int getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(int anoMod) {
		this.anoMod = anoMod;
	}
	public float getKmtragem() {
		return kmtragem;
	}
	public void setKmtragem(float kmtragem) {
		this.kmtragem = kmtragem;
	}
	public boolean isCompleto() {
		return completo;
	}
	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	public boolean isGnv() {
		return gnv;
	}
	public void setGnv(boolean gnv) {
		this.gnv = gnv;
	}
	public boolean isFlex() {
		return flex;
	}
	public void setFlex(boolean flex) {
		this.flex = flex;
	}

}
