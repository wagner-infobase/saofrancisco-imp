package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LAYOUT_PADRAO")
public class LayoutDefault implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="LAYOUT_PADRAO_ID_GENERATOR", sequenceName="SQ_LAYOUT_PADRAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LAYOUT_PADRAO_ID_GENERATOR")
	@Column(name="COD_LAYOUT_PADRAO")
	private Long id;

	@Column(name="NOME")
	private String name;
	
	@OneToMany(mappedBy="layoutDefault")
	private List<FieldLayoutDefault> fieldsLayoutDefault;	
	
	@Column(name="FL_STATUS")
	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="VALIDACAO")
	private String validation;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}
	
	

}
