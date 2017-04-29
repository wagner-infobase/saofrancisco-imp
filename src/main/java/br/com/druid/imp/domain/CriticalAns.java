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
@Table(name="CRITICA_ANS")
public class CriticalAns implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CRITICA_ANS_ID_GENERATOR", sequenceName="SQ_CRITICA_ANS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CRITICA_ANS_ID_GENERATOR")
	@Column(name="COD_CRITICA_ANS")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="ID_CAMPO")
	private String fieldID;

	@Column(name="NM_CAMPO")
	private String fieldName;

	//bi-directional many-to-one association to ErrorAns
	@OneToMany(mappedBy="criticalANS")
	private List<ErrorAns> errorANS;

	public CriticalAns() {
	}

	public Long getId() {
		return this.id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFieldID() {
		return fieldID;
	}

	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<ErrorAns> getErrorANS() {
		return errorANS;
	}

	public void setErrorANS(List<ErrorAns> errorANS) {
		this.errorANS = errorANS;
	}

	public ErrorAns addErrorANS(ErrorAns errorANS) {
		getErrorANS().add(errorANS);
		errorANS.setCriticalANS(this);

		return errorANS;
	}

	public ErrorAns removeErrorANS(ErrorAns errorANS) {
		getErrorANS().remove(errorANS);
		errorANS.setCriticalANS(null);

		return errorANS;
	}
}