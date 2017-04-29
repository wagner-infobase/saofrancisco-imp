package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="LOTE")
public class Batch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOTE_ID_GENERATOR", sequenceName="SQ_LOTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOTE_ID_GENERATOR")
	@Column(name="COD_LOTE")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ATE")
	private Date until;

	@Column(name="COMPARADO")
	private String compared;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dateInative;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dateInclude;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIAL")
	private Date dateInit;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="LOCAL_GRAVACAO_LOTE")
	private String batchRecordLocation;

	@Column(name="NM_LOTE")
	private String batchName;

	@Column(name="NRO_LOTE")
	private Long batchNumber;

	@Column(name="PROTOCOLO")
	private String protocol;

	//bi-directional many-to-one association to FileConfHistory
	@OneToMany(mappedBy="batch")
	private List<FileConfHistory> fileConfHistory;

	//bi-directional many-to-one association to FileConfMonthCurrent
	@OneToMany(mappedBy="batch")
	private List<FileConfMonthCurrent> fileConfMonthCurrent;

	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="COD_LOTE_PAI")
	private Batch batchFather;

	//bi-directional many-to-one association to Batch
	@OneToMany(mappedBy="batchFather")
	private List<Batch> batches;

	//bi-directional many-to-one association to TypeBatch
	@ManyToOne
	@JoinColumn(name="COD_TP_LOTE")
	private TypeBatch batchType;

	//bi-directional many-to-one association to BatchMovement
	@OneToMany(mappedBy="batch")
	private List<BatchMovement> batchMovement;

	//bi-directional many-to-one association to RpxReturn
	@OneToMany(mappedBy="batch")
	private List<RPXReturn> rpxReturns;

	//bi-directional many-to-one association to SbxPost
	@OneToMany(mappedBy="lote")
	private List<SBXPost> sbxSends;

	public Batch() {}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getUntil() {
		return until;
	}

	public void setUntil(Date until) {
		this.until = until;
	}

	public String getCompared() {
		return compared;
	}

	public void setCompared(String compared) {
		this.compared = compared;
	}

	public Date getDateInative() {
		return dateInative;
	}

	public void setDateInative(Date dateInative) {
		this.dateInative = dateInative;
	}

	public Date getDateInclude() {
		return dateInclude;
	}

	public void setDateInclude(Date dateInclude) {
		this.dateInclude = dateInclude;
	}

	public Date getDateInit() {
		return dateInit;
	}

	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	public String getBatchRecordLocation() {
		return batchRecordLocation;
	}

	public void setBatchRecordLocation(String batchRecordLocation) {
		this.batchRecordLocation = batchRecordLocation;
	}

	public Long getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(Long batchNumber) {
		this.batchNumber = batchNumber;
	}

	public List<FileConfHistory> getFileConfHistory() {
		return this.fileConfHistory;
	}

	public void setFileConfHistory(List<FileConfHistory> fileConfHistory) {
		this.fileConfHistory = fileConfHistory;
	}

	public FileConfHistory addFileConfHistory(FileConfHistory fileConfHistory) {
		getFileConfHistory().add(fileConfHistory);
		fileConfHistory.setBatch(this);

		return fileConfHistory;
	}

	public FileConfHistory removeFileConfHistory(FileConfHistory fileConfHistory) {
		getFileConfHistory().remove(fileConfHistory);
		fileConfHistory.setBatch(null);

		return fileConfHistory;
	}

	public List<FileConfMonthCurrent> getFileConfMonthCurrent() {
		return this.fileConfMonthCurrent;
	}

	public void setFileConfMonthCurrent(List<FileConfMonthCurrent> fileConfMonthCurrent) {
		this.fileConfMonthCurrent = fileConfMonthCurrent;
	}

	public FileConfMonthCurrent addFileConfMonthCurrent(FileConfMonthCurrent fileConfMonthCurrent) {
		getFileConfMonthCurrent().add(fileConfMonthCurrent);
		fileConfMonthCurrent.setBatch(this);

		return fileConfMonthCurrent;
	}

	public FileConfMonthCurrent removeArqconfMesCorrente(FileConfMonthCurrent fileConfMonthCurrent) {
		getFileConfMonthCurrent().remove(fileConfMonthCurrent);
		fileConfMonthCurrent.setBatch(null);

		return fileConfMonthCurrent;
	}

	public Batch getBatchFather() {
		return batchFather;
	}

	public void setBatchFather(Batch batchFather) {
		this.batchFather = batchFather;
	}
	
	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	public TypeBatch getBatchType() {
		return batchType;
	}

	public void setBatchType(TypeBatch batchType) {
		this.batchType = batchType;
	}
	
	public List<BatchMovement> getBatchMovement() {
		return batchMovement;
	}

	public void setBatchMovement(List<BatchMovement> batchMovement) {
		this.batchMovement = batchMovement;
	}

	public BatchMovement addBatchMovement(BatchMovement batchMovement) {
		getBatchMovement().add(batchMovement);
		batchMovement.setBatch(this);

		return batchMovement;
	}

	public BatchMovement removeBatchMovement(BatchMovement batchMovement) {
		getBatchMovement().remove(batchMovement);
		batchMovement.setBatch(null);

		return batchMovement;
	}

	public List<RPXReturn> getRpxReturns() {
		return rpxReturns;
	}

	public void setRpxReturns(List<RPXReturn> rpxReturns) {
		this.rpxReturns = rpxReturns;
	}

	public RPXReturn addRpxReturns(RPXReturn rpxReturns) {
		getRpxReturns().add(rpxReturns);
		rpxReturns.setBatch(this);

		return rpxReturns;
	}

	public RPXReturn removeRpxReturns(RPXReturn rpxReturns) {
		getRpxReturns().remove(rpxReturns);
		rpxReturns.setBatch(null);

		return rpxReturns;
	}

	public List<SBXPost> getSbxSends() {
		return sbxSends;
	}

	public void setSbxSends(List<SBXPost> sbxSends) {
		this.sbxSends = sbxSends;
	}

	public SBXPost addSbxEnvio(SBXPost sbxSends) {
		getSbxSends().add(sbxSends);
		sbxSends.setLote(this);

		return sbxSends;
	}

	public SBXPost removeSbxEnvio(SBXPost sbxSends) {
		getSbxSends().remove(sbxSends);
		sbxSends.setLote(null);

		return sbxSends;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}	
}