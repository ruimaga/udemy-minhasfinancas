package com.ruimagalhaes.minhasfinancas.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Lancamento  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	private String descricao;
	private Integer mes;
	private Integer ano;
	private BigDecimal valor;
	private String tipo;
	private String status;
	private Date dataCadastro;

	@ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
	private Usuario usuario;

	public Lancamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lancamento(Integer id, String descricao, Integer mes, Integer ano, BigDecimal valor, String tipo,
			String status, Date dataCadastro, Usuario usuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
		this.dataCadastro = dataCadastro;
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, dataCadastro, descricao, id, mes, status, tipo, usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(dataCadastro, other.dataCadastro)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(mes, other.mes) && Objects.equals(status, other.status)
				&& Objects.equals(tipo, other.tipo) && Objects.equals(usuario, other.usuario)
				&& Objects.equals(valor, other.valor);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", mes=" + mes + ", ano=" + ano + ", valor="
				+ valor + ", tipo=" + tipo + ", status=" + status + ", dataCadastro=" + dataCadastro + ", usuario="
				+ usuario + "]";
	}
	

}
