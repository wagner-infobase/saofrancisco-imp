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
@Table(name="VW_OBRIGACAO_CAMPO_LAYOUT")
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

	public VwRequiredFieldLayout() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getFieldLayoutId() {
		return this.fieldLayoutId;
	}

	public void setFieldLayoutId(Long fieldLayoutId) {
		this.fieldLayoutId = fieldLayoutId;
	}

	public String getDescriptionField() {
		return this.descriptionField;
	}

	public void setDescriptionField(String descriptionField) {
		this.descriptionField = descriptionField;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}

	public String getNameLayout() {
		return this.nameLayout;
	}

	public void setNameLayout(String nameLayout) {
		this.nameLayout = nameLayout;
	}

	public Integer getNumberField() {
		return this.numberField;
	}

	public void setNumberField(Integer numberField) {
		this.numberField = numberField;
	}

	public String getforcesDepenCancellation() {
		return this.forcesDepenCancellation;
	}

	public void setforcesDepenCancellation(String forcesDepenCancellation) {
		this.forcesDepenCancellation = forcesDepenCancellation;
	}

	public String getforcesDepenInclusion() {
		return this.forcesDepenInclusion;
	}

	public void setforcesDepenInclusion(String forcesDepenInclusion) {
		this.forcesDepenInclusion = forcesDepenInclusion;
	}

	public String getforcesDepenContractualChange() {
		return this.forcesDepenContractualChange;
	}

	public void setforcesDepenContractualChange(String forcesDepenContractualChange) {
		this.forcesDepenContractualChange = forcesDepenContractualChange;
	}

	public String getforcesDepenReactivation() {
		return this.forcesDepenReactivation;
	}

	public void setforcesDepenReactivation(String forcesDepenReactivation) {
		this.forcesDepenReactivation = forcesDepenReactivation;
	}

	public String getforcesDepenRectification() {
		return this.forcesDepenRectification;
	}

	public void setforcesDepenRectification(String forcesDepenRectification) {
		this.forcesDepenRectification = forcesDepenRectification;
	}

	public String getforcesHolderCancellation() {
		return this.forcesHolderCancellation;
	}

	public void setforcesHolderCancellation(String forcesHolderCancellation) {
		this.forcesHolderCancellation = forcesHolderCancellation;
	}

	public String getforcesHolderInclusion() {
		return this.forcesHolderInclusion;
	}

	public void setforcesHolderInclusion(String forcesHolderInclusion) {
		this.forcesHolderInclusion = forcesHolderInclusion;
	}

	public String getforcesHolderContractualChange() {
		return this.forcesHolderContractualChange;
	}

	public void setforcesHolderContractualChange(String forcesHolderContractualChange) {
		this.forcesHolderContractualChange = forcesHolderContractualChange;
	}

	public String getforcesHolderReactivation() {
		return this.forcesHolderReactivation;
	}

	public void setforcesHolderReactivation(String forcesHolderReactivation) {
		this.forcesHolderReactivation = forcesHolderReactivation;
	}

	public String getforcesHolderRectification() {
		return this.forcesHolderRectification;
	}

	public void setforcesHolderRectification(String forcesHolderRectification) {
		this.forcesHolderRectification = forcesHolderRectification;
	}

	public Long getRequiredFieldId() {
		return this.requiredFieldId;
	}

	public void setRequiredFieldId(Long requiredFieldId) {
		this.requiredFieldId = requiredFieldId;
	}

}