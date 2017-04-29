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
@Table(name="DESTINO")
public class Destiny implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DESTINO_ID_GENERATOR", sequenceName="SQ_DESTINO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESTINO_ID_GENERATOR")
	@Column(name="COD_DESTINO")
	private Long id;

	private String cnpj;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="REGISTRO_ANS")
	private String recordANS;

	@Column(name="VERSAO_PADRAO")
	private String defaultVersion;

	//bi-directional many-to-one association to RpxReturn
	@OneToMany(mappedBy="destiny")
	private List<RPXReturn> rpxReturns;

	//bi-directional many-to-one association to SbxPost
	@OneToMany(mappedBy="destiny")
	private List<SBXPost> sbxSends;

	public Destiny() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getRecordANS() {
		return recordANS;
	}

	public void setRecordANS(String recordANS) {
		this.recordANS = recordANS;
	}

	public String getDefaultVersion() {
		return defaultVersion;
	}

	public void setDefaultVersion(String defaultVersion) {
		this.defaultVersion = defaultVersion;
	}

	public List<RPXReturn> getRpxReturns() {
		return rpxReturns;
	}

	public void setRpxReturns(List<RPXReturn> rpxReturns) {
		this.rpxReturns = rpxReturns;
	}

	public RPXReturn addRpxReturns(RPXReturn rpxReturns) {
		getRpxReturns().add(rpxReturns);
		rpxReturns.setDestiny(this);

		return rpxReturns;
	}

	public RPXReturn removeRpxReturns(RPXReturn rpxReturns) {
		getRpxReturns().remove(rpxReturns);
		rpxReturns.setDestiny(null);

		return rpxReturns;
	}

	public List<SBXPost> getSbxSends() {
		return sbxSends;
	}

	public void setSbxSends(List<SBXPost> sbxSends) {
		this.sbxSends = sbxSends;
	}

	public SBXPost addSbxSends(SBXPost sbxSends) {
		getSbxSends().add(sbxSends);
		sbxSends.setDestiny(this);

		return sbxSends;
	}

	public SBXPost removeSbxSends(SBXPost sbxSends) {
		getSbxSends().remove(sbxSends);
		sbxSends.setDestiny(null);

		return sbxSends;
	}

}