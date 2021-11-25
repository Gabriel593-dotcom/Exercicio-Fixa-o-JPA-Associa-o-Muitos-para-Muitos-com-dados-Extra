----READ ME ---- 

O programa consiste na implementação de um sitema de leilão. Onde um participante pode se registrar para a aquisição de vários produtos.

PARTICIPANTE
codigo : Long
nome : String

OFERTA
codigoOferta : Long
precoSugerido : Double
dataExp : Instant

PRODUTO
nome : String
precoInicial : Double

OFERTAPK
participante : PARTICIPANTE
produto : PRODUTO

ESTADOPRODUTO
NOVO
SEMINOVO
USADO
AVARIADO
DANIFICADO

Reprensentação por diagrama: 

PARTICIOANTE * ---------------------------- * PRODUTO
			  			 |
					     |
			   			 |
		 		    	OFERTA					ESTADOPRODUTO