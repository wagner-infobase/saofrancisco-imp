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
@Table(name="CONSOLID_ERRO_PROCESS")
public class ConsolidatedErrorProcessing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONSOLID_ERRO_PROCESS_ID_GENERATOR", sequenceName="SQ_CONSOLID_ERRO_PROCESS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONSOLID_ERRO_PROCESS_ID_GENERATOR")
	@Column(name="COD_CONSOLID_ERRO_PROCESS")
	private Long id;

	@Column(name="COD_ERRO")
	private String codError;

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

	@Column(name="QTD_ERRO")
	private int qtdError;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxReturn;

	public ConsolidatedErrorProcessing() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
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

	public int getQtdError() {
		return qtdError;
	}

	public void setQtdError(int qtdError) {
		this.qtdError = qtdError;
	}

	public RPXReturn getRPXReturn() {
		return rpxReturn;
	}

	public void setRPXReturn(RPXReturn rpxReturn) {
		this.rpxReturn = rpxReturn;
	}
}