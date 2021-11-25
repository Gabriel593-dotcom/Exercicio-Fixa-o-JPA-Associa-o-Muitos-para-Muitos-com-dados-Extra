package exercicio_fix_manytomany_com_dados_extras.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import exercicio_fix_manytomany_com_dados_extras.entities.Participante;
import exercicio_fix_manytomany_com_dados_extras.entities.Produto;

@Embeddable
public class OfertaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "participante_id")
	private Participante participante;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
