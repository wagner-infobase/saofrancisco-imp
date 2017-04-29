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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ERRO_ANS")
@NamedQuery(name="ErrorAns.findAll", query="SELECT e FROM ErrorAns e")
public class ErrorAns implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ERRO_ANS_ID_GENERATOR", sequenceName="SQ_ERRO_ANS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ERRO_ANS_ID_GENERATOR")
	@Column(name="COD_ERRO_ANS")
	private Long id;

	
	@Column(name="ACAO_CORRECAO")
	private String actionCorrection;

	@Column(name="COD_ERRO")
	private int codError;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="MSG_ERRO")
	private String msgError;

	@Column(name="MSG_ERRO_DETALHE")
	private String msgErrorDetail;

	@Column(name="OPERADOR")
	private String operator;

	//bi-directional many-to-one association to AnalysisMovement
	@OneToMany(mappedBy="errorANS")
	private List<AnalysisMovement> analysisMovements;

	//bi-directional many-to-one association to CriticalAns
	@ManyToOne
	@JoinColumn(name="COD_CRITICA_ANS")
	private CriticalAns criticalANS;

	public ErrorAns() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActionCorrection() {
		return actionCorrection;
	}

	public void setActionCorrection(String actionCorrection) {
		this.actionCorrection = actionCorrection;
	}

	public int getCodError() {
		return codError;
	}

	public void setCodError(int codError) {
		this.codError = codError;
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

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

	public String getMsgErrorDetail() {
		return msgErrorDetail;
	}

	public void setMsgErrorDetail(String msgErrorDetail) {
		this.msgErrorDetail = msgErrorDetail;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public CriticalAns getCriticalANS() {
		return criticalANS;
	}

	public void setCriticalANS(CriticalAns criticalANS) {
		this.criticalANS = criticalANS;
	}

	public List<AnalysisMovement> getAnalysisMovements() {
		return analysisMovements;
	}

	public void setAnalysisMovements(List<AnalysisMovement> analysisMovements) {
		this.analysisMovements = analysisMovements;
	}

	public AnalysisMovement addCriticasMovimentacao(AnalysisMovement analysisMovements) {
		getAnalysisMovements().add(analysisMovements);
		analysisMovements.setErrorANS(this);

		return analysisMovements;
	}

	public AnalysisMovement removeCriticasMovimentacao(AnalysisMovement analysisMovements) {
		getAnalysisMovements().remove(analysisMovements);
		analysisMovements.setErrorANS(null);

		return analysisMovements;
	}

}