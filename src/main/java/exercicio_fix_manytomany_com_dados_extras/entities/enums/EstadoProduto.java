package exercicio_fix_manytomany_com_dados_extras.entities.enums;

public enum EstadoProduto {
	
	NOVO(1),
	SEMINOVO(2),
	USADO(3),
	AVARIADO(4),
	DANIFICADO(5);
	
	private Integer code;
	
	private EstadoProduto(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public static EstadoProduto getEstadoProduto(Integer code) {
		for(EstadoProduto estadoProduto : EstadoProduto.values()) {
			if(estadoProduto.getCode() == code) {
				return estadoProduto;
			}
		}
		
		throw new IllegalArgumentException();
	}
}
