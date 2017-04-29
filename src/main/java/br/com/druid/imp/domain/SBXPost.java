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
@Table(name="SBX_ENVIO")
public class SBXPost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SBX_ENVIO_ID_GENERATOR", sequenceName="SQ_SBX_ENVIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SBX_ENVIO_ID_GENERATOR")
	@Column(name="COD_SBX_ENVIO")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="EPILOGO_HASH")
	private String epilogoHash;

	@Column(name="FL_STATUS")
	private String flStatus;

	//bi-directional many-to-one association to LogsXmlSendReceived
	@OneToMany(mappedBy="sbxEnvio")
	private List<LogsXmlSendReceived> logsXmlEnvRecebs;

	//bi-directional many-to-one association to Destiny
	@ManyToOne
	@JoinColumn(name="COD_DESTINO")
	private Destiny destiny;

	//bi-directional many-to-one association to IdTransaction
	@ManyToOne
	@JoinColumn(name="COD_IDENTIFICACAO_TRANSACAO")
	private IdTransaction identificationTransactionSends;

	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="COD_LOTE")
	private Batch lote;

	//bi-directional many-to-one association to Origin
	@ManyToOne
	@JoinColumn(name="COD_ORIGEM")
	private Origin origem;

	//bi-directional many-to-one association to SoftwareGenerator
	@ManyToOne
	@JoinColumn(name="COD_SOFTWARE_GERADOR")
	private SoftwareGenerator softwareGerador;

	public SBXPost() {
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

	public String getEpilogoHash() {
		return this.epilogoHash;
	}

	public void setEpilogoHash(String epilogoHash) {
		this.epilogoHash = epilogoHash;
	}

	public String getFlStatus() {
		return this.flStatus;
	}

	public void setFlStatus(String flStatus) {
		this.flStatus = flStatus;
	}

	public List<LogsXmlSendReceived> getLogsXmlEnvRecebs() {
		return this.logsXmlEnvRecebs;
	}

	public void setLogsXmlEnvRecebs(List<LogsXmlSendReceived> logsXmlEnvRecebs) {
		this.logsXmlEnvRecebs = logsXmlEnvRecebs;
	}

	public LogsXmlSendReceived addLogsXmlEnvReceb(LogsXmlSendReceived logsXmlEnvReceb) {
		getLogsXmlEnvRecebs().add(logsXmlEnvReceb);
		logsXmlEnvReceb.setSBXSend(this);

		return logsXmlEnvReceb;
	}

	public LogsXmlSendReceived removeLogsXmlEnvReceb(LogsXmlSendReceived logsXmlEnvReceb) {
		getLogsXmlEnvRecebs().remove(logsXmlEnvReceb);
		logsXmlEnvReceb.setSBXSend(null);

		return logsXmlEnvReceb;
	}

	

	public Destiny getDestiny() {
		return destiny;
	}

	public void setDestiny(Destiny destiny) {
		this.destiny = destiny;
	}



	public IdTransaction getIdentificationTransactionSends() {
		return identificationTransactionSends;
	}

	public void setIdentificationTransactionSends(IdTransaction identificationTransactionSends) {
		this.identificationTransactionSends = identificationTransactionSends;
	}

	public Batch getLote() {
		return this.lote;
	}

	public void setLote(Batch lote) {
		this.lote = lote;
	}

	public Origin getOrigem() {
		return this.origem;
	}

	public void setOrigem(Origin origem) {
		this.origem = origem;
	}

	public SoftwareGenerator getSoftwareGerador() {
		return this.softwareGerador;
	}

	public void setSoftwareGerador(SoftwareGenerator softwareGerador) {
		this.softwareGerador = softwareGerador;
	}

}