package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VW_OBRIGACAO_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="VW_OBRIGATORIO_CAMPO_LAYOUT")
@NamedQuery(name="VwRequiredFieldLayout.findAll", query="SELECT v FROM VwRequiredFieldLayout v")
public class VwRequiredFieldLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	private String active;

	@Column(name="CAMPO_LAYOUT_ID")
	private Long fieldLayoutId;

	@Column(name="DESCRICAO_CAMPO")
	private String descriptionField;

	@Id
	private Long id;

	@Column(name="LAYOUT_ID")
	private Long layoutId;

	@Column(name="NOME_LAYOUT")
	private String nameLayout;

	@Column(name="NUMERO_CAMPO")
	private Integer numberField;

	@Column(name="OBRIGA_DEPEN_CANCELAMENTO")
	private String forcesDepenCancellation;

	@Column(name="OBRIGA_DEPEN_INCLUSAO")
	private String forcesDepenInclusion;

	@Column(name="OBRIGA_DEPEN_MUDANCACONTRATUAL")
	private String forcesDepenContractualChange;

	@Column(name="OBRIGA_DEPEN_REATIVACAO")
	private String forcesDepenReactivation;

	@Column(name="OBRIGA_DEPEN_RETIFICACAO")
	private String forcesDepenRectification;

	@Column(name="OBRIGA_TIT_CANCELAMENTO")
	private String forcesHolderCancellation;

	@Column(name="OBRIGA_TIT_INCLUSAO")
	private String forcesHolderInclusion;

	@Column(name="OBRIGA_TIT_MUDANCACONTRATUAL")
	private String forcesHolderContractualChange;

	@Column(name="OBRIGA_TIT_REATIVACAO")
	private String forcesHolderReactivation;

	@Column(name="OBRIGA_TIT_RETIFICACAO")
	private String forcesHolderRectification;

	@Column(name="OBRIGATORIO_CAMPO_ID")
	private Long requiredFieldId;
	
	@Column(name="RETIFICACAO_CAMPO")
	private Long RectificationField;	

	public VwRequiredFieldLayout() {
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getFieldLayoutId() {
		return fieldLayoutId;
	}

	public void setFieldLayoutId(Long fieldLayoutId) {
		this.fieldLayoutId = fieldLayoutId;
	}

	public String getDescriptionField() {
		return descriptionField;
	}

	public void setDescriptionField(String descriptionField) {
		this.descriptionField = descriptionField;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}

	public String getNameLayout() {
		return nameLayout;
	}

	public void setNameLayout(String nameLayout) {
		this.nameLayout = nameLayout;
	}

	public Integer getNumberField() {
		return numberField;
	}

	public void setNumberField(Integer numberField) {
		this.numberField = numberField;
	}

	public String getForcesDepenCancellation() {
		return forcesDepenCancellation;
	}

	public void setForcesDepenCancellation(String forcesDepenCancellation) {
		this.forcesDepenCancellation = forcesDepenCancellation;
	}

	public String getForcesDepenInclusion() {
		return forcesDepenInclusion;
	}

	public void setForcesDepenInclusion(String forcesDepenInclusion) {
		this.forcesDepenInclusion = forcesDepenInclusion;
	}

	public String getForcesDepenContractualChange() {
		return forcesDepenContractualChange;
	}

	public void setForcesDepenContractualChange(String forcesDepenContractualChange) {
		this.forcesDepenContractualChange = forcesDepenContractualChange;
	}

	public String getForcesDepenReactivation() {
		return forcesDepenReactivation;
	}

	public void setForcesDepenReactivation(String forcesDepenReactivation) {
		this.forcesDepenReactivation = forcesDepenReactivation;
	}

	public String getForcesDepenRectification() {
		return forcesDepenRectification;
	}

	public void setForcesDepenRectification(String forcesDepenRectification) {
		this.forcesDepenRectification = forcesDepenRectification;
	}

	public String getForcesHolderCancellation() {
		return forcesHolderCancellation;
	}

	public void setForcesHolderCancellation(String forcesHolderCancellation) {
		this.forcesHolderCancellation = forcesHolderCancellation;
	}

	public String getForcesHolderInclusion() {
		return forcesHolderInclusion;
	}

	public void setForcesHolderInclusion(String forcesHolderInclusion) {
		this.forcesHolderInclusion = forcesHolderInclusion;
	}

	public String getForcesHolderContractualChange() {
		return forcesHolderContractualChange;
	}

	public void setForcesHolderContractualChange(String forcesHolderContractualChange) {
		this.forcesHolderContractualChange = forcesHolderContractualChange;
	}

	public String getForcesHolderReactivation() {
		return forcesHolderReactivation;
	}

	public void setForcesHolderReactivation(String forcesHolderReactivation) {
		this.forcesHolderReactivation = forcesHolderReactivation;
	}

	public String getForcesHolderRectification() {
		return forcesHolderRectification;
	}

	public void setForcesHolderRectification(String forcesHolderRectification) {
		this.forcesHolderRectification = forcesHolderRectification;
	}

	public Long getRequiredFieldId() {
		return requiredFieldId;
	}

	public void setRequiredFieldId(Long requiredFieldId) {
		this.requiredFieldId = requiredFieldId;
	}

	public Long getRectificationField() {
		return RectificationField;
	}

	public void setRectificationField(Long rectificationField) {
		RectificationField = rectificationField;
	}
	

}