package com.ruimagalhaes.minhasfinancas.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ruimagalhaes.minhasfinancas.domain.enums.StatusLancamento;
import com.ruimagalhaes.minhasfinancas.domain.enums.TipoLancamento;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Lancamento  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String descricao;
	private Integer mes;
	private Integer ano;
	private BigDecimal valor;
	
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;
	
	private Date dataCadastro;

	@ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
	private Usuario usuario;

	
}
