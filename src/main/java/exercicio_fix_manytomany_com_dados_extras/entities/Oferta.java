package exercicio_fix_manytomany_com_dados_extras.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import exercicio_fix_manytomany_com_dados_extras.entities.pk.OfertaPK;

@Entity
@Table(name = "tb_oferta")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OfertaPK codigo = new OfertaPK();
	private Double precoSugerido;
	private Instant dataExp;

	public Oferta() {
	}

	public Oferta(Double precoSugerido, Instant dataExp, Participante participante, Produto produto) {
		super();
		this.codigo.setParticipante(participante);
		this.codigo.setProduto(produto);
		this.precoSugerido = precoSugerido;
		this.dataExp = dataExp;
	}

	@JsonIgnore
	public Participante getParticipante() {
		return this.codigo.getParticipante();
	}

	public void setParcipante(Participante participante) {
		this.codigo.setParticipante(participante);
	}

	public Produto getProduto() {
		return this.codigo.getProduto();
	}

	public void setProduto(Produto produto) {
		this.codigo.setProduto(produto);
	}

	public Double getPrecoSugerido() {
		return precoSugerido;
	}

	public void setPrecoSugerido(Double precoSugerido) {
		this.precoSugerido = precoSugerido;
	}

	public Instant getDataExp() {
		return dataExp;
	}

	public void setDataExp(Instant dataExp) {
		this.dataExp = dataExp;
	}

}
