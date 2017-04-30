package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAMPO_LAYOUT_PADRAO")
public class FieldLayoutDefault implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="CAMPO_LAYOUT_PADRAO_ID_GENERATOR", sequenceName="SQ_CAMPO_LAYOUT_PADRAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAMPO_LAYOUT_PADRAO_ID_GENERATOR")
	@Column(name="COD_CAMPO_LAYOUT_PADRAO")
	private Long id;
	
	@Column(name="NUMERO_CAMPO")
	private Long numberField;
	
	@Column(name="DESCRICAO_CAMPO")
	private String descriptionField;
	
	@Column(name="TIPO_CAMPO")
	private String typeField;
	
	@Column(name="TAMANHO_CAMPO")
	private Long lengthField;

	@Column(name="TIPO_INFORMACAO")
	private String typeInformation;
	
	@Column(name="HABILITAR", length=1)
	private String enable;
	
	@ManyToOne
	@JoinColumn(name="COD_LAYOUT_PADRAO")
	private LayoutDefault layoutDefault;
	
	@Column(name="FL_STATUS")
	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumberField() {
		return numberField;
	}

	public void setNumberField(Long numberField) {
		this.numberField = numberField;
	}

	public String getDescriptionField() {
		return descriptionField;
	}

	public void setDescriptionField(String descriptionField) {
		this.descriptionField = descriptionField;
	}

	public String getTypeField() {
		return typeField;
	}

	public void setTypeField(String typeField) {
		this.typeField = typeField;
	}

	public Long getLengthField() {
		return lengthField;
	}

	public void setLengthField(Long lengthField) {
		this.lengthField = lengthField;
	}

	public String getTypeInformation() {
		return typeInformation;
	}

	public void setTypeInformation(String typeInformation) {
		this.typeInformation = typeInformation;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public LayoutDefault getLayoutDefault() {
		return layoutDefault;
	}

	public void setLayoutDefault(LayoutDefault layoutDefault) {
		this.layoutDefault = layoutDefault;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public Date getIncludeDate() {
		return includeDate;
	}

	public void setIncludeDate(Date includeDate) {
		this.includeDate = includeDate;
	}

}
