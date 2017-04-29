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
@Table(name="REATIVACAO")
public class Reactivation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REATIVACAO_ID_GENERATOR", sequenceName="SQ_REATIVACAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REATIVACAO_ID_GENERATOR")
	@Column(name="COD_REATIVACAO")
	private Long id;

	private String cco;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_REATIVACAO")
	private Date reactivationDate;

	@Column(name="FL_STATUS")
	private String status;

	//bi-directional many-to-one association to Movement
	@ManyToOne
	@JoinColumn(name="COD_MOVIMENTACAO")
	private Movement movements;

	public Reactivation() {
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

	public Date getReactivationDate() {
		return reactivationDate;
	}

	public void setReactivationDate(Date reactivationDate) {
		this.reactivationDate = reactivationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Movement getMovements() {
		return movements;
	}

	public void setMovements(Movement movements) {
		this.movements = movements;
	}

}