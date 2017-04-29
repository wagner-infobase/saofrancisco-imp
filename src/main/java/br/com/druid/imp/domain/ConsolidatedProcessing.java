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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CONSOLIDADO_PROCESSAMENTO")
@NamedQuery(name="ConsolidatedProcessing.findAll", query="SELECT c FROM ConsolidatedProcessing c")
public class ConsolidatedProcessing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONSOLIDADO_PROCESSAMENTO_ID_GENERATOR", sequenceName="SQ_CONSOLID_PROCESS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONSOLIDADO_PROCESSAMENTO_ID_GENERATOR")
	@Column(name="COD_CONSOLIDADO_PROCESSAMENTO")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="PERCENTUAL_ACERTO")
	private double accuracyPercent;

	@Column(name="QTD_PROCESS")
	private int qtdProcess;

	@Column(name="QTD_REGISTROS")
	private int qtdRecord;

	@Column(name="QTD_REJEITADOS")
	private int qtdRejected;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxReturn;

	//bi-directional many-to-one association to TypeMovement
	@ManyToOne
	@JoinColumn(name="COD_TP_MOVIMENTACAO")
	private TypeMovement typeMovement;

	public ConsolidatedProcessing() {}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAccuracyPercent() {
		return accuracyPercent;
	}

	public void setAccuracyPercent(double accuracyPercent) {
		this.accuracyPercent = accuracyPercent;
	}

	public int getQtdProcess() {
		return qtdProcess;
	}

	public void setQtdProcess(int qtdProcess) {
		this.qtdProcess = qtdProcess;
	}

	public int getQtdRecord() {
		return qtdRecord;
	}

	public void setQtdRecord(int qtdRecord) {
		this.qtdRecord = qtdRecord;
	}

	public int getQtdRejected() {
		return qtdRejected;
	}

	public void setQtdRejected(int qtdRejected) {
		this.qtdRejected = qtdRejected;
	}

	public RPXReturn getRPXReturn() {
		return rpxReturn;
	}

	public void setRPXReturn(RPXReturn rpxReturn) {
		this.rpxReturn = rpxReturn;
	}

	public TypeMovement getTypeMovement() {
		return typeMovement;
	}

	public void setTypeMovement(TypeMovement typeMovement) {
		this.typeMovement = typeMovement;
	}
}