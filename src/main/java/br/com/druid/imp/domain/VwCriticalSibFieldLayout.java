package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the VW_CRITICA_SIB_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="VW_CRITICA_SIB_CAMPO_LAYOUT")
@NamedQuery(name="VwCriticalSibFieldLayout.findAll", query="SELECT v FROM VwCriticalSibFieldLayout v")
public class VwCriticalSibFieldLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAMPO_LAYOUT_ID")
	private Long fieldLayoutId;

	@Column(name="CRITICA_SIB_CAMPO_ID")
	private Long criticalSibFieldId;

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

	@Column(name="VALIDA_SIB")
	private String validSib;

	public VwCriticalSibFieldLayout() {
	}

	public Long getFieldLayoutId() {
		return this.fieldLayoutId;
	}

	public void setFieldLayoutId(Long fieldLayoutId) {
		this.fieldLayoutId = fieldLayoutId;
	}

	public Long getCriticalSibFieldId() {
		return this.criticalSibFieldId;
	}

	public void setCriticalSibFieldId(Long criticalSibFieldId) {
		this.criticalSibFieldId = criticalSibFieldId;
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

	public String getValidSib() {
		return this.validSib;
	}

	public void setValidSib(String validSib) {
		this.validSib = validSib;
	}

}