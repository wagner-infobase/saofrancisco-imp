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
@Table(name="TP_MOVIMENTACAO")
public class TypeMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TP_MOVIMENTACAO_ID_GENERATOR", sequenceName="SQ_TP_MOVIMENTACAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TP_MOVIMENTACAO_ID_GENERATOR")
	@Column(name="COD_TP_MOVIMENTACAO")
	private Long id;

	@Column(name="DSC_MOVIMENTACAO")
	private String dscMovement;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	//bi-directional many-to-one association to ConsolidatedProcessing
	@OneToMany(mappedBy="typeMovement")
	private List<ConsolidatedProcessing> consolidatedProcessing;

	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="typeMovement")
	private List<Movement> movements;

	//bi-directional many-to-one association to RejectedRecord
	@OneToMany(mappedBy="tpMovimentacao")
	private List<RejectedRecord> rejectedRecords;

	public TypeMovement() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDscMovement() {
		return dscMovement;
	}

	public void setDscMovement(String dscMovement) {
		this.dscMovement = dscMovement;
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

	public List<ConsolidatedProcessing> getConsolidatedProcessing() {
		return consolidatedProcessing;
	}

	public void setConsolidatedProcessing(List<ConsolidatedProcessing> consolidatedProcessing) {
		this.consolidatedProcessing = consolidatedProcessing;
	}

	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public List<RejectedRecord> getRejectedRecords() {
		return rejectedRecords;
	}

	public void setRejectedRecords(List<RejectedRecord> rejectedRecords) {
		this.rejectedRecords = rejectedRecords;
	}
}