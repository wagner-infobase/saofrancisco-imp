package br.com.druid.imp.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the VALIDACAO_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="VALIDACAO_CAMPO_LAYOUT")
@NamedQuery(name="ValidFieldLayout.findAll", query="SELECT v FROM ValidFieldLayout v")
public class ValidFieldLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VALIDACAO_CAMPO_LAYOUT_CODVALIDACAOCAMPOLAYOUT_GENERATOR", sequenceName="SQ_VALIDACAO_CAMPO_LAYOUT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VALIDACAO_CAMPO_LAYOUT_CODVALIDACAOCAMPOLAYOUT_GENERATOR")
	@Column(name="COD_VALIDACAO_CAMPO_LAYOUT")
	private Long codValidacaoCampoLayout;

	@Column(name="CANCELAMENTO_DEPENDENTE")
	private String cancelamentoDependente;

	@Column(name="CANCELAMENTO_TITULAR")
	private String cancelamentoTitular;

	@Column(name="COD_CAMPO_LAYOUT_PADRAO")
	private Long codCampoLayoutPadrao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="INCLUSAO_DEPENDENTE")
	private String inclusaoDependente;

	@Column(name="INCLUSAO_TITULAR")
	private String inclusaoTitular;

	@Column(name="MUDANCACONTRATUAL_DEPENDENTE")
	private String mudancacontratualDependente;

	@Column(name="MUDANCACONTRATUAL_TITULAR")
	private String mudancacontratualTitular;

	@Column(name="REATIVACAO_DEPENDENTE")
	private String reativacaoDependente;

	@Column(name="REATIVACAO_TITULAR")
	private String reativacaoTitular;

	@Column(name="RETIFICACAO_CAMPO")
	private Long retificacaoCampo;

	@Column(name="RETIFICACAO_DEPENDENTE")
	private String retificacaoDependente;

	@Column(name="RETIFICACAO_TITULAR")
	private String retificacaoTitular;

	public ValidFieldLayout() {
	}

	public Long getCodValidacaoCampoLayout() {
		return this.codValidacaoCampoLayout;
	}

	public void setCodValidacaoCampoLayout(Long codValidacaoCampoLayout) {
		this.codValidacaoCampoLayout = codValidacaoCampoLayout;
	}

	public String getCancelamentoDependente() {
		return this.cancelamentoDependente;
	}

	public void setCancelamentoDependente(String cancelamentoDependente) {
		this.cancelamentoDependente = cancelamentoDependente;
	}

	public String getCancelamentoTitular() {
		return this.cancelamentoTitular;
	}

	public void setCancelamentoTitular(String cancelamentoTitular) {
		this.cancelamentoTitular = cancelamentoTitular;
	}

	public Long getCodCampoLayoutPadrao() {
		return this.codCampoLayoutPadrao;
	}

	public void setCodCampoLayoutPadrao(Long codCampoLayoutPadrao) {
		this.codCampoLayoutPadrao = codCampoLayoutPadrao;
	}

	public Date getDtInativo() {
		return this.dtInativo;
	}

	public void setDtInativo(Date dtInativo) {
		this.dtInativo = dtInativo;
	}

	public Date getDtInclusao() {
		return this.dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public String getFlStatus() {
		return this.flStatus;
	}

	public void setFlStatus(String flStatus) {
		this.flStatus = flStatus;
	}

	public String getInclusaoDependente() {
		return this.inclusaoDependente;
	}

	public void setInclusaoDependente(String inclusaoDependente) {
		this.inclusaoDependente = inclusaoDependente;
	}

	public String getInclusaoTitular() {
		return this.inclusaoTitular;
	}

	public void setInclusaoTitular(String inclusaoTitular) {
		this.inclusaoTitular = inclusaoTitular;
	}

	public String getMudancacontratualDependente() {
		return this.mudancacontratualDependente;
	}

	public void setMudancacontratualDependente(String mudancacontratualDependente) {
		this.mudancacontratualDependente = mudancacontratualDependente;
	}

	public String getMudancacontratualTitular() {
		return this.mudancacontratualTitular;
	}

	public void setMudancacontratualTitular(String mudancacontratualTitular) {
		this.mudancacontratualTitular = mudancacontratualTitular;
	}

	public String getReativacaoDependente() {
		return this.reativacaoDependente;
	}

	public void setReativacaoDependente(String reativacaoDependente) {
		this.reativacaoDependente = reativacaoDependente;
	}

	public String getReativacaoTitular() {
		return this.reativacaoTitular;
	}

	public void setReativacaoTitular(String reativacaoTitular) {
		this.reativacaoTitular = reativacaoTitular;
	}

	public Long getRetificacaoCampo() {
		return this.retificacaoCampo;
	}

	public void setRetificacaoCampo(Long retificacaoCampo) {
		this.retificacaoCampo = retificacaoCampo;
	}

	public String getRetificacaoDependente() {
		return this.retificacaoDependente;
	}

	public void setRetificacaoDependente(String retificacaoDependente) {
		this.retificacaoDependente = retificacaoDependente;
	}

	public String getRetificacaoTitular() {
		return this.retificacaoTitular;
	}

	public void setRetificacaoTitular(String retificacaoTitular) {
		this.retificacaoTitular = retificacaoTitular;
	}

}