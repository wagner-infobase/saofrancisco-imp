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
@Table(name="REGISTROS_INCLUIDOS")
public class RecordIncluded implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTROS_INCLUIDOS_ID_GENERATOR", sequenceName="SQ_REGISTROS_INCLUIDOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTROS_INCLUIDOS_ID_GENERATOR")
	@Column(name="COD_REGISTROS_INCLUIDOS")
	private Long id;

	private String cco;

	@Column(name="COD_BENEFICIARIO")
	private String codBeneficiary;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="NM_BENEFICIARIO")
	private String beneficiaryDate;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxReturn;

	public RecordIncluded() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCCO() {
		return cco;
	}

	public void setCCO(String cco) {
		this.cco = cco;
	}

	public String getCodBeneficiary() {
		return codBeneficiary;
	}

	public void setCodBeneficiary(String codBeneficiary) {
		this.codBeneficiary = codBeneficiary;
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

	public String getBeneficiaryDate() {
		return beneficiaryDate;
	}

	public void setBeneficiaryDate(String beneficiaryDate) {
		this.beneficiaryDate = beneficiaryDate;
	}

	public RPXReturn getRPXReturn() {
		return rpxReturn;
	}

	public void setRPXReturn(RPXReturn rpxReturn) {
		this.rpxReturn = rpxReturn;
	}
}