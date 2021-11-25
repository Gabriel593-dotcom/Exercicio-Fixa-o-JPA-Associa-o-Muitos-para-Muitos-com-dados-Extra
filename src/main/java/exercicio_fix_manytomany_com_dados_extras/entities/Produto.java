package exercicio_fix_manytomany_com_dados_extras.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import exercicio_fix_manytomany_com_dados_extras.entities.enums.EstadoProduto;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private Double precoInicial;
	private Integer estadoProduto;

	public Produto() {
	}

	public Produto(Long codigo, String nome, Double precoInicial, EstadoProduto estadoProduto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.precoInicial = precoInicial;
		setEstadoProduto(estadoProduto);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoInicial() {
		return precoInicial;
	}

	public void setPrecoInicial(Double precoInicial) {
		this.precoInicial = precoInicial;
	}

	public EstadoProduto getEstadoProduto() {
		return EstadoProduto.getEstadoProduto(estadoProduto);
	}

	public void setEstadoProduto(EstadoProduto estadoProduto) {
		this.estadoProduto = estadoProduto.getCode();
	}
}
