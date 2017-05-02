package br.com.druid.imp.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VW_CAMPO_LAYOUT_PADRAO database table.
 * 
 */
@Entity
@Table(name="VW_CAMPO_LAYOUT_PADRAO")
@NamedQuery(name="VwFieldLayoutDefault.findAll", query="SELECT v FROM VwFieldLayoutDefault v")
public class VwFieldLayoutDefault implements Serializable {
	private static final long serialVersionUID = 1L;

	private String active;

	@Column(name="CRITICA_SIB")
	private String validSib;

	@Column(name="DESCRICAO_CAMPO")
	private String descriptionField;

	@Id
	private Long id;

	@Column(name="NOME_LAYOUT")
	private String nameLayout;

	@Column(name="NUMERO_CAMPO")
	private Long numberField;

	@Column(name="TAMANHO_CAMPO")
	private Long lengthField;

	@Column(name="TIPO_CAMPO")
	private String typeField;

	@Column(name="TIPO_INFORMACAO")
	private String typeInformation;

	@Column(name="VALIDA_DOMINIO")
	private String validDomain;
	
	@Column(name="HABILITAR", length=1)
	private String enable;

	public VwFieldLayoutDefault() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getValidSib() {
		return this.validSib;
	}

	public void setValidSib(String validSib) {
		this.validSib = validSib;
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

	public String getNameLayout() {
		return this.nameLayout;
	}

	public void setNameLayout(String nameLayout) {
		this.nameLayout = nameLayout;
	}

	public Long getNumberField() {
		return this.numberField;
	}

	public void setNumberField(Long numberField) {
		this.numberField = numberField;
	}

	public Long getLengthField() {
		return this.lengthField;
	}

	public void setLengthField(Long lengthField) {
		this.lengthField = lengthField;
	}

	public String getTypeField() {
		return this.typeField;
	}

	public void setTypeField(String typeField) {
		this.typeField = typeField;
	}

	public String getTypeInformation() {
		return this.typeInformation;
	}

	public void setTypeInformation(String typeInformation) {
		this.typeInformation = typeInformation;
	}

	public String getValidDomain() {
		return this.validDomain;
	}

	public void setValidDomain(String validDomain) {
		this.validDomain = validDomain;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}
	
	

}