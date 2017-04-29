package br.com.druid.imp.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


/**
 * The persistent class for the VW_HIST_LOTE database table.
 * 
 */
@Entity
@Table(name="VW_HIST_LOTE")
@NamedQuery(name="VwHistLote.findAll", query="SELECT v FROM VwHistLote v")
public class VwHistLote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date ate;

	@Temporal(TemporalType.DATE)
	private Date de;

	private String movimentacoes;

	@Id
	private Long id;
	
	@Column(name="NRO_LOTE")
	private Long nroLote;

	@Column(name="STATUS_RETORNO_ANS")
	private String statusRetornoAns;

	public VwHistLote() {
	}

	public Date getAte() {
		return this.ate;
	}

	public void setAte(Date ate) {
		this.ate = ate;
	}

	public Date getDe() {
		return this.de;
	}

	public void setDe(Date de) {
		this.de = de;
	}

	public String getMovimentacoes() {
		return this.movimentacoes;
	}

	public void setMovimentacoes(String movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public Long getNroLote() {
		return this.nroLote;
	}

	public void setNroLote(Long nroLote) {
		this.nroLote = nroLote;
	}

	public String getStatusRetornoAns() {
		return this.statusRetornoAns;
	}

	public void setStatusRetornoAns(String statusRetornoAns) {
		this.statusRetornoAns = statusRetornoAns;
	}

}