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
	private Long codValidationFieldLayout;

	@Column(name="CANCELAMENTO_DEPENDENTE")
	private String cancellationDependent;

	@Column(name="CANCELAMENTO_TITULAR")
	private String cancellationHolder;

	@Column(name="COD_CAMPO_LAYOUT_PADRAO")
	private Long codFieldLayoutDefault;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInactive;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusion;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="INCLUSAO_DEPENDENTE")
	private String inclusionDependent;

	@Column(name="INCLUSAO_TITULAR")
	private String inclusionHolder;

	@Column(name="MUDANCACONTRATUAL_DEPENDENTE")
	private String contractualChangeDependent;

	@Column(name="MUDANCACONTRATUAL_TITULAR")
	private String contractualChangeHolder;

	@Column(name="REATIVACAO_DEPENDENTE")
	private String reactivationDependent;

	@Column(name="REATIVACAO_TITULAR")
	private String reactivationHolder;

	@Column(name="RETIFICACAO_CAMPO")
	private Long rectificationField;

	@Column(name="RETIFICACAO_DEPENDENTE")
	private String rectificationDependent;

	@Column(name="RETIFICACAO_TITULAR")
	private String rectificationHolder;

	public ValidFieldLayout() {
	}

	public Long getCodValidationFieldLayout() {
		return this.codValidationFieldLayout;
	}

	public void setCodValidationFieldLayout(Long codValidationFieldLayout) {
		this.codValidationFieldLayout = codValidationFieldLayout;
	}

	public String getCancellationDependent() {
		return this.cancellationDependent;
	}

	public void setCancellationDependent(String cancellationDependent) {
		this.cancellationDependent = cancellationDependent;
	}

	public String getCancellationHolder() {
		return this.cancellationHolder;
	}

	public void setCancellationHolder(String cancellationHolder) {
		this.cancellationHolder = cancellationHolder;
	}

	public Long getCodFieldLayoutDefault() {
		return this.codFieldLayoutDefault;
	}

	public void setCodFieldLayoutDefault(Long codFieldLayoutDefault) {
		this.codFieldLayoutDefault = codFieldLayoutDefault;
	}

	public Date getDtInactive() {
		return this.dtInactive;
	}

	public void setDtInactive(Date dtInactive) {
		this.dtInactive = dtInactive;
	}

	public Date getDtInclusion() {
		return this.dtInclusion;
	}

	public void setDtInclusion(Date dtInclusion) {
		this.dtInclusion = dtInclusion;
	}

	public String getFlStatus() {
		return this.flStatus;
	}

	public void setFlStatus(String flStatus) {
		this.flStatus = flStatus;
	}

	public String getInclusionDependent() {
		return this.inclusionDependent;
	}

	public void setInclusionDependent(String inclusionDependent) {
		this.inclusionDependent = inclusionDependent;
	}

	public String getInclusionHolder() {
		return this.inclusionHolder;
	}

	public void setInclusionHolder(String inclusionHolder) {
		this.inclusionHolder = inclusionHolder;
	}

	public String getMudancacontratualDependent() {
		return this.contractualChangeDependent;
	}

	public void setMudancacontratualDependent(String contractualChangeDependent) {
		this.contractualChangeDependent = contractualChangeDependent;
	}

	public String getMudancacontratualHolder() {
		return this.contractualChangeHolder;
	}

	public void setMudancacontratualHolder(String contractualChangeHolder) {
		this.contractualChangeHolder = contractualChangeHolder;
	}

	public String getReativacaoDependent() {
		return this.reactivationDependent;
	}

	public void setReativacaoDependent(String reactivationDependent) {
		this.reactivationDependent = reactivationDependent;
	}

	public String getReativacaoHolder() {
		return this.reactivationHolder;
	}

	public void setReativacaoHolder(String reactivationHolder) {
		this.reactivationHolder = reactivationHolder;
	}

	public Long getRetificacaoField() {
		return this.rectificationField;
	}

	public void setRetificacaoField(Long rectificationField) {
		this.rectificationField = rectificationField;
	}

	public String getRetificacaoDependent() {
		return this.rectificationDependent;
	}

	public void setRetificacaoDependent(String rectificationDependent) {
		this.rectificationDependent = rectificationDependent;
	}

	public String getRetificacaoHolder() {
		return this.rectificationHolder;
	}

	public void setRetificacaoHolder(String rectificationHolder) {
		this.rectificationHolder = rectificationHolder;
	}

}