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
@Table(name="STATUS_ANS")
public class StatusANS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STATUS_ANS_ID_GENERATOR", sequenceName="SQ_STATUS_ANS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STATUS_ANS_ID_GENERATOR")
	@Column(name="COD_STATUS_ANS")
	private Long id;

	@Column(name="DSC_STATUS")
	private String dscStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="statusANS")
	private List<Movement> movements;

	public StatusANS() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDscStatus() {
		return dscStatus;
	}

	public void setDscStatus(String dscStatus) {
		this.dscStatus = dscStatus;
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

	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}
}