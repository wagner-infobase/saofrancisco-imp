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
@Table(name="PROTOCOLO_PROCESS")
public class ProtocolProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROTOCOLO_PROCESS_ID_GENERATOR", sequenceName="SQ_PROTOCOLO_PROCESS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROTOCOLO_PROCESS_ID_GENERATOR")
	@Column(name="COD_PROTOCOLO_PROCESS")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="NM_ARQUIVO")
	private String fileName;

	@Column(name="NR_PROTOCOLO")
	private String numberProtocol;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxReturn;

	public ProtocolProcess() {
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNumberProtocol() {
		return numberProtocol;
	}

	public void setNumberProtocol(String numberProtocol) {
		this.numberProtocol = numberProtocol;
	}

	public RPXReturn getRpxReturn() {
		return rpxReturn;
	}

	public void setRpxReturn(RPXReturn rpxReturn) {
		this.rpxReturn = rpxReturn;
	}
}