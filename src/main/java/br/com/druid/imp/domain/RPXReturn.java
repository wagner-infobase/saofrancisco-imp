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


/**
 * The persistent class for the rpx_retorno database table.
 * 
 */
@Entity
@Table(name="rpx_retorno")
public class RPXReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RPX_RETORNO_ID_GENERATOR", sequenceName="SQ_RPX_RETORNO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RPX_RETORNO_ID_GENERATOR")
	@Column(name="COD_RPX_RETORNO")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="NM_ARQUIVO")
	private String nmArquivo;

	@Column(name="NRO_PROTOCOLO")
	private String nroProtocolo;

	@Column(name="VERSAO_PADRAO")
	private String versaoPadrao;

	//bi-directional many-to-one association to ConsolidatedErrorProcessing
	@OneToMany(mappedBy="rpxReturn")
	private List<ConsolidatedErrorProcessing> consolidErroProcesses;

	//bi-directional many-to-one association to ConsolidatedProcessing
	@OneToMany(mappedBy="rpxReturn")
	private List<ConsolidatedProcessing> consolidadoProcessamentos;

	//bi-directional many-to-one association to FailedBusiness
	@OneToMany(mappedBy="rpxReturn")
	private List<FailedBusiness> falhaNegocios;

	//bi-directional many-to-one association to LogsXmlSendReceived
	@OneToMany(mappedBy="rpxRetorno")
	private List<LogsXmlSendReceived> logsXmlEnvRecebs;

	//bi-directional many-to-one association to ProtocolProcess
	@OneToMany(mappedBy="rpxReturn")
	private List<ProtocolProcess> protocoloProcesses;

	//bi-directional many-to-one association to RecordIncluded
	@OneToMany(mappedBy="rpxReturn")
	private List<RecordIncluded> registrosIncluidos;

	//bi-directional many-to-one association to RejectedRecord
	@OneToMany(mappedBy="rpxRetorno")
	private List<RejectedRecord> registrosRejeitados;

	//bi-directional many-to-one association to Destiny
	@ManyToOne
	@JoinColumn(name="COD_DESTINO")
	private Destiny destiny;

	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="COD_LOTE")
	private Batch batch;

	//bi-directional many-to-one association to Origin
	@ManyToOne
	@JoinColumn(name="COD_ORIGEM")
	private Origin origem;

	//bi-directional many-to-one association to IdTransaction
	@ManyToOne
	@JoinColumn(name="COD_IDENTIFICACAO_TRANSACAO")
	private IdTransaction identificationTransactionReturns;

	//bi-directional many-to-one association to SoftwareGenerator
	@ManyToOne
	@JoinColumn(name="COD_SOFTWARE_GERADOR")
	private SoftwareGenerator softwareGerador;

	public RPXReturn() {
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

	public String getNmArquivo() {
		return this.nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public String getNroProtocolo() {
		return this.nroProtocolo;
	}

	public void setNroProtocolo(String nroProtocolo) {
		this.nroProtocolo = nroProtocolo;
	}

	public String getVersaoPadrao() {
		return this.versaoPadrao;
	}

	public void setVersaoPadrao(String versaoPadrao) {
		this.versaoPadrao = versaoPadrao;
	}

	public List<ConsolidatedErrorProcessing> getConsolidErroProcesses() {
		return this.consolidErroProcesses;
	}

	public void setConsolidErroProcesses(List<ConsolidatedErrorProcessing> consolidErroProcesses) {
		this.consolidErroProcesses = consolidErroProcesses;
	}

	public ConsolidatedErrorProcessing addConsolidErroProcess(ConsolidatedErrorProcessing consolidErroProcess) {
		getConsolidErroProcesses().add(consolidErroProcess);
		consolidErroProcess.setRPXReturn(this);

		return consolidErroProcess;
	}

	public ConsolidatedErrorProcessing removeConsolidErroProcess(ConsolidatedErrorProcessing consolidErroProcess) {
		getConsolidErroProcesses().remove(consolidErroProcess);
		consolidErroProcess.setRPXReturn(null);

		return consolidErroProcess;
	}

	public List<ConsolidatedProcessing> getConsolidadoProcessamentos() {
		return this.consolidadoProcessamentos;
	}

	public void setConsolidadoProcessamentos(List<ConsolidatedProcessing> consolidadoProcessamentos) {
		this.consolidadoProcessamentos = consolidadoProcessamentos;
	}

	public ConsolidatedProcessing addConsolidadoProcessamento(ConsolidatedProcessing consolidadoProcessamento) {
		getConsolidadoProcessamentos().add(consolidadoProcessamento);
		consolidadoProcessamento.setRPXReturn(this);

		return consolidadoProcessamento;
	}

	public ConsolidatedProcessing removeConsolidadoProcessamento(ConsolidatedProcessing consolidadoProcessamento) {
		getConsolidadoProcessamentos().remove(consolidadoProcessamento);
		consolidadoProcessamento.setRPXReturn(null);

		return consolidadoProcessamento;
	}

	public List<FailedBusiness> getFalhaNegocios() {
		return this.falhaNegocios;
	}

	public void setFalhaNegocios(List<FailedBusiness> falhaNegocios) {
		this.falhaNegocios = falhaNegocios;
	}

	public FailedBusiness addFalhaNegocio(FailedBusiness falhaNegocio) {
		getFalhaNegocios().add(falhaNegocio);
		falhaNegocio.setRPXReturn(this);

		return falhaNegocio;
	}

	public FailedBusiness removeFalhaNegocio(FailedBusiness falhaNegocio) {
		getFalhaNegocios().remove(falhaNegocio);
		falhaNegocio.setRPXReturn(null);

		return falhaNegocio;
	}

	public List<LogsXmlSendReceived> getLogsXmlEnvRecebs() {
		return this.logsXmlEnvRecebs;
	}

	public void setLogsXmlEnvRecebs(List<LogsXmlSendReceived> logsXmlEnvRecebs) {
		this.logsXmlEnvRecebs = logsXmlEnvRecebs;
	}

	public LogsXmlSendReceived addLogsXmlEnvReceb(LogsXmlSendReceived logsXmlEnvReceb) {
		getLogsXmlEnvRecebs().add(logsXmlEnvReceb);
		logsXmlEnvReceb.setRPXReturn(this);

		return logsXmlEnvReceb;
	}

	public LogsXmlSendReceived removeLogsXmlEnvReceb(LogsXmlSendReceived logsXmlEnvReceb) {
		getLogsXmlEnvRecebs().remove(logsXmlEnvReceb);
		logsXmlEnvReceb.setRPXReturn(null);

		return logsXmlEnvReceb;
	}

	public List<ProtocolProcess> getProtocoloProcesses() {
		return this.protocoloProcesses;
	}

	public void setProtocoloProcesses(List<ProtocolProcess> protocoloProcesses) {
		this.protocoloProcesses = protocoloProcesses;
	}

	public ProtocolProcess addProtocoloProcess(ProtocolProcess protocoloProcess) {
		getProtocoloProcesses().add(protocoloProcess);
		protocoloProcess.setRpxReturn(this);

		return protocoloProcess;
	}

	public ProtocolProcess removeProtocoloProcess(ProtocolProcess protocoloProcess) {
		getProtocoloProcesses().remove(protocoloProcess);
		protocoloProcess.setRpxReturn(null);

		return protocoloProcess;
	}

	public List<RecordIncluded> getRegistrosIncluidos() {
		return this.registrosIncluidos;
	}

	public void setRegistrosIncluidos(List<RecordIncluded> registrosIncluidos) {
		this.registrosIncluidos = registrosIncluidos;
	}

	public RecordIncluded addRegistrosIncluido(RecordIncluded registrosIncluido) {
		getRegistrosIncluidos().add(registrosIncluido);
		registrosIncluido.setRPXReturn(this);

		return registrosIncluido;
	}

	public RecordIncluded removeRegistrosIncluido(RecordIncluded registrosIncluido) {
		getRegistrosIncluidos().remove(registrosIncluido);
		registrosIncluido.setRPXReturn(null);

		return registrosIncluido;
	}

	public List<RejectedRecord> getRegistrosRejeitados() {
		return this.registrosRejeitados;
	}

	public void setRegistrosRejeitados(List<RejectedRecord> registrosRejeitados) {
		this.registrosRejeitados = registrosRejeitados;
	}

	public RejectedRecord addRegistrosRejeitado(RejectedRecord registrosRejeitado) {
		getRegistrosRejeitados().add(registrosRejeitado);
		registrosRejeitado.setRpxRetorno(this);

		return registrosRejeitado;
	}

	public RejectedRecord removeRegistrosRejeitado(RejectedRecord registrosRejeitado) {
		getRegistrosRejeitados().remove(registrosRejeitado);
		registrosRejeitado.setRpxRetorno(null);

		return registrosRejeitado;
	}

	


	public Destiny getDestiny() {
		return destiny;
	}

	public void setDestiny(Destiny destiny) {
		this.destiny = destiny;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Origin getOrigem() {
		return this.origem;
	}

	public void setOrigem(Origin origem) {
		this.origem = origem;
	}

	

	public IdTransaction getIdentificationTransactionReturns() {
		return identificationTransactionReturns;
	}

	public void setIdentificationTransactionReturns(IdTransaction identificationTransactionReturns) {
		this.identificationTransactionReturns = identificationTransactionReturns;
	}

	public SoftwareGenerator getSoftwareGerador() {
		return softwareGerador;
	}

	public void setSoftwareGerador(SoftwareGenerator softwareGerador) {
		this.softwareGerador = softwareGerador;
	}

}