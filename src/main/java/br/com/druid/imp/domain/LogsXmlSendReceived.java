package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the logs_xml_env_receb database table.
 * 
 */
@Entity
@Table(name="logs_xml_env_receb")
@NamedQuery(name="LogsXmlSendReceived.findAll", query="SELECT l FROM LogsXmlSendReceived l")
public class LogsXmlSendReceived implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOGS_XML_ENV_RECEB_ID_GENERATOR", sequenceName="SEQ_LOGS_XML_ENV_RECEB")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOGS_XML_ENV_RECEB_ID_GENERATOR")
	@Column(name="COD_LOGS_XML_ENV_RECEB")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Lob
	private byte[] xml;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxRetorno;

	//bi-directional many-to-one association to SbxPost
	@ManyToOne
	@JoinColumn(name="COD_SBX_ENVIO")
	private SBXPost sbxEnvio;

	public LogsXmlSendReceived() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtInativo() {
		return this.dtInativo;
	}

	public void setDtInativo(Date dtInativo) {
		this.dtInativo = dtInativo;
	}

	public Date getDtInclusao() {
		return this.dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public String getFlStatus() {
		return this.flStatus;
	}

	public void setFlStatus(String flStatus) {
		this.flStatus = flStatus;
	}

	public byte[] getXml() {
		return this.xml;
	}

	public void setXml(byte[] xml) {
		this.xml = xml;
	}

	public RPXReturn getRPXReturn() {
		return this.rpxRetorno;
	}

	public void setRPXReturn(RPXReturn rpxRetorno) {
		this.rpxRetorno = rpxRetorno;
	}

	public SBXPost getSBXSend() {
		return this.sbxEnvio;
	}

	public void setSBXSend(SBXPost sbxEnvio) {
		this.sbxEnvio = sbxEnvio;
	}

}