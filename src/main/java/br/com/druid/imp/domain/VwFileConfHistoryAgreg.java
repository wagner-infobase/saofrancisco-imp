package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the vw_arqconf_historico_agreg database table.
 * 
 */
@Entity
@Table(name="vw_arqconf_historico_agreg")
@NamedQuery(name="VwFileConfHistoryAgreg.findAll", query="SELECT v FROM VwFileConfHistoryAgreg v")
public class VwFileConfHistoryAgreg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DT_COMPARACAO")
	private String dtComparacao;

	@Column(name="DT_PROCESSAMENTO")
	private String dtProcessamento;
	
	@Column(name="DT_PROCESSAMENTO_FILTRO")
	private String dtProcessamentoFiltro;

	@Id
	private Long id;

	@Column(name="MES_ANO")
	private String mesAno;

	private String operador;

	@Column(name="QTD_CONVENIADOS")
	private int qtdConveniados;

	private String status;

	public VwFileConfHistoryAgreg() {
	}

	public String getDtComparacao() {
		return this.dtComparacao;
	}

	public void setDtComparacao(String dtComparacao) {
		this.dtComparacao = dtComparacao;
	}

	public String getDtProcessamento() {
		return this.dtProcessamento;
	}

	public void setDtProcessamento(String dtProcessamento) {
		this.dtProcessamento = dtProcessamento;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMesAno() {
		return this.mesAno;
	}

	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}

	public String getOperador() {
		return this.operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getQtdConveniados() {
		return this.qtdConveniados;
	}

	public void setQtdConveniados(int qtdConveniados) {
		this.qtdConveniados = qtdConveniados;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDtProcessamentoFiltro() {
		return dtProcessamentoFiltro;
	}

	public void setDtProcessamentoFiltro(String dtProcessamentoFiltro) {
		this.dtProcessamentoFiltro = dtProcessamentoFiltro;
	}
	

}