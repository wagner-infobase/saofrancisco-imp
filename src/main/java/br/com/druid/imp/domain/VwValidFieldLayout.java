package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VW_VALIDACAO_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="VW_VALIDACAO_CAMPO_LAYOUT")
@NamedQuery(name="VwValidFieldLayout.findAll", query="SELECT v FROM VwValidFieldLayout v")
public class VwValidFieldLayout implements Serializable {
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

	@Column(name="VALIDA_DEPEN_CANCELAMENTO")
	private String validDepenCancellation;

	@Column(name="VALIDA_DEPEN_INCLUSAO")
	private String validDepenInclusion;

	@Column(name="VALIDA_DEPEN_MUDANCACONTRATUAL")
	private String validDepenContractualChange;

	@Column(name="VALIDA_DEPEN_REATIVACAO")
	private String validDepenReactivation;

	@Column(name="VALIDA_DEPEN_RETIFICACAO")
	private String validDepenRectification;

	@Column(name="VALIDA_TIT_CANCELAMENTO")
	private String validHolderCancellation;

	@Column(name="VALIDA_TIT_INCLUSAO")
	private String validHolderInclusion;

	@Column(name="VALIDA_TIT_MUDANCACONTRATUAL")
	private String validHolderContractualChange;

	@Column(name="VALIDA_TIT_REATIVACAO")
	private String validHolderReactivation;

	@Column(name="VALIDA_TIT_RETIFICACAO")
	private String validHolderRectification;

	@Column(name="VALIDACAO_CAMPO_ID")
	private Long validationFieldId;

	public VwValidFieldLayout() {
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

	public String getvalidDepenCancellation() {
		return this.validDepenCancellation;
	}

	public void setvalidDepenCancellation(String validDepenCancellation) {
		this.validDepenCancellation = validDepenCancellation;
	}

	public String getvalidDepenInclusion() {
		return this.validDepenInclusion;
	}

	public void setvalidDepenInclusion(String validDepenInclusion) {
		this.validDepenInclusion = validDepenInclusion;
	}

	public String getvalidDepenContractualChange() {
		return this.validDepenContractualChange;
	}

	public void setvalidDepenContractualChange(String validDepenContractualChange) {
		this.validDepenContractualChange = validDepenContractualChange;
	}

	public String getvalidDepenReactivation() {
		return this.validDepenReactivation;
	}

	public void setvalidDepenReactivation(String validDepenReactivation) {
		this.validDepenReactivation = validDepenReactivation;
	}

	public String getvalidDepenRectification() {
		return this.validDepenRectification;
	}

	public void setvalidDepenRectification(String validDepenRectification) {
		this.validDepenRectification = validDepenRectification;
	}

	public String getvalidHolderCancellation() {
		return this.validHolderCancellation;
	}

	public void setvalidHolderCancellation(String validHolderCancellation) {
		this.validHolderCancellation = validHolderCancellation;
	}

	public String getvalidHolderInclusion() {
		return this.validHolderInclusion;
	}

	public void setvalidHolderInclusion(String validHolderInclusion) {
		this.validHolderInclusion = validHolderInclusion;
	}

	public String getvalidHolderContractualChange() {
		return this.validHolderContractualChange;
	}

	public void setvalidHolderContractualChange(String validHolderContractualChange) {
		this.validHolderContractualChange = validHolderContractualChange;
	}

	public String getvalidHolderReactivation() {
		return this.validHolderReactivation;
	}

	public void setvalidHolderReactivation(String validHolderReactivation) {
		this.validHolderReactivation = validHolderReactivation;
	}

	public String getvalidHolderRectification() {
		return this.validHolderRectification;
	}

	public void setvalidHolderRectification(String validHolderRectification) {
		this.validHolderRectification = validHolderRectification;
	}

	public Long getValidationFieldId() {
		return this.validationFieldId;
	}

	public void setValidationFieldId(Long validationFieldId) {
		this.validationFieldId = validationFieldId;
	}

}