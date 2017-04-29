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
@Table(name="movimentacao")
public class Movement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVIMENTACAO_ID_GENERATOR", sequenceName="SQ_MOVIMENTACAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVIMENTACAO_ID_GENERATOR")
	@Column(name="COD_MOVIMENTACAO")
	private Long id;

	@Column(name="COD_IDENT_BENEFC_OPER")
	private String codIdentBenefcOper;

	@Column(name="CRITICA_BASICA_APROVADA")
	private String criticalBasicAprove;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	//bi-directional many-to-one association to Beneficiary
	@OneToMany(mappedBy="movement")
	private List<Beneficiary> beneficiarys;

	//bi-directional many-to-one association to Cancel
	@OneToMany(mappedBy="movement")
	private List<Cancel> cancels;

	//bi-directional many-to-one association to AnalysisMovement
	@OneToMany(mappedBy="movement")
	private List<AnalysisMovement> analysisMovement;

	//bi-directional many-to-one association to BatchMovement
	@OneToMany(mappedBy="movement")
	private List<BatchMovement> batchMovement;

	//bi-directional many-to-one association to SendAns
	@ManyToOne
	@JoinColumn(name="COD_ENVIO_ANS")
	private SendAns sendANS;

	//bi-directional many-to-one association to OperatorOrigin
	@ManyToOne
	@JoinColumn(name="COD_OPERADORA_ORIGEM")
	private OperatorOrigin operatorOrigin;

	//bi-directional many-to-one association to SystemOrigin
	@ManyToOne
	@JoinColumn(name="COD_SISTEMA_ORIGEM")
	private SystemOrigin systemOrigin;

	//bi-directional many-to-one association to StatusAns
	@ManyToOne
	@JoinColumn(name="COD_STATUS_ANS")
	private StatusANS statusANS;

	//bi-directional many-to-one association to TypeMovement
	@ManyToOne
	@JoinColumn(name="COD_TP_MOVIMENTACAO")
	private TypeMovement typeMovement;

	//bi-directional many-to-one association to Reactivation
	@OneToMany(mappedBy="movements")
	private List<Reactivation> reactivations;

	//bi-directional many-to-one association to RectificationBenefEnd
	@OneToMany(mappedBy="movimentacao")
	private List<RectificationBenefEnd> retificacaoBenefEnds;

	//bi-directional many-to-one association to RectificationContract
	@OneToMany(mappedBy="movimentacao")
	private List<RectificationContract> rectificationContract;

	public Movement() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodIdentBenefcOper() {
		return codIdentBenefcOper;
	}

	public void setCodIdentBenefcOper(String codIdentBenefcOper) {
		this.codIdentBenefcOper = codIdentBenefcOper;
	}

	public String getCriticalBasicAprove() {
		return criticalBasicAprove;
	}

	public void setCriticalBasicAprove(String criticalBasicAprove) {
		this.criticalBasicAprove = criticalBasicAprove;
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

	public List<Beneficiary> getBeneficiarys() {
		return beneficiarys;
	}

	public void setBeneficiarys(List<Beneficiary> beneficiarys) {
		this.beneficiarys = beneficiarys;
	}

	public List<Cancel> getCancels() {
		return cancels;
	}

	public void setCancels(List<Cancel> cancels) {
		this.cancels = cancels;
	}

	public List<AnalysisMovement> getAnalysisMovement() {
		return analysisMovement;
	}

	public void setAnalysisMovement(List<AnalysisMovement> analysisMovement) {
		this.analysisMovement = analysisMovement;
	}

	public List<BatchMovement> getBatchMovement() {
		return batchMovement;
	}

	public void setBatchMovement(List<BatchMovement> batchMovement) {
		this.batchMovement = batchMovement;
	}

	public SendAns getSendANS() {
		return sendANS;
	}

	public void setSendANS(SendAns sendANS) {
		this.sendANS = sendANS;
	}

	public OperatorOrigin getOperatorOrigin() {
		return operatorOrigin;
	}

	public void setOperatorOrigin(OperatorOrigin operatorOrigin) {
		this.operatorOrigin = operatorOrigin;
	}

	public SystemOrigin getSystemOrigin() {
		return systemOrigin;
	}

	public void setSystemOrigin(SystemOrigin systemOrigin) {
		this.systemOrigin = systemOrigin;
	}

	public StatusANS getStatusANS() {
		return statusANS;
	}

	public void setStatusANS(StatusANS statusANS) {
		this.statusANS = statusANS;
	}

	public TypeMovement getTypeMovement() {
		return typeMovement;
	}

	public void setTypeMovement(TypeMovement typeMovement) {
		this.typeMovement = typeMovement;
	}

	public List<Reactivation> getReactivations() {
		return reactivations;
	}

	public void setReactivations(List<Reactivation> reactivations) {
		this.reactivations = reactivations;
	}

	public List<RectificationBenefEnd> getRetificacaoBenefEnds() {
		return retificacaoBenefEnds;
	}

	public void setRetificacaoBenefEnds(List<RectificationBenefEnd> retificacaoBenefEnds) {
		this.retificacaoBenefEnds = retificacaoBenefEnds;
	}

	public List<RectificationContract> getRectificationContract() {
		return rectificationContract;
	}

	public void setRectificationContract(List<RectificationContract> rectificationContract) {
		this.rectificationContract = rectificationContract;
	}
}