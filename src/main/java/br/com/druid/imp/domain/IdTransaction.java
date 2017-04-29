package br.com.druid.imp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="IDENTIFICACAO_TRANSACAO")
public class IdTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="IDENTIFICACAO_TRANSACAO_ID_GENERATOR", sequenceName="SQ_IDENTIFICACAO_TRANSACAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTIFICACAO_TRANSACAO_ID_GENERATOR")
	@Column(name="COD_IDENTIFICACAO_TRANSACAO")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_TRANSACAO")
	private Date transactionDate;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="SEQUENCIAL")
	private BigDecimal sequence;

	@Column(name="TIPO")
	private String type;

	//bi-directional many-to-one association to RpxReturn
	@OneToMany(mappedBy="identificationTransactionReturns")
	private List<RPXReturn> rpxReturns;

	//bi-directional many-to-one association to SbxPost
	@OneToMany(mappedBy="identificationTransactionSends")
	private List<SBXPost> sbxSends;

	public IdTransaction() {
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

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getSequence() {
		return sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<RPXReturn> getRpxReturns() {
		return rpxReturns;
	}

	public void setRpxReturns(List<RPXReturn> rpxReturns) {
		this.rpxReturns = rpxReturns;
	}

	public RPXReturn addRPXReturns(RPXReturn rpxReturns) {
		getRpxReturns().add(rpxReturns);
		rpxReturns.setIdentificationTransactionReturns(this);

		return rpxReturns;
	}

	public RPXReturn removeRPXReturns(RPXReturn rpxReturns) {
		getRpxReturns().remove(rpxReturns);
		rpxReturns.setIdentificationTransactionReturns(null);

		return rpxReturns;
	}

	public List<SBXPost> getSBXSends() {
		return sbxSends;
	}

	public void setSBXSends(List<SBXPost> sbxSends) {
		this.sbxSends = sbxSends;
	}

	public SBXPost addSBXSend(SBXPost sbxSends) {
		getSBXSends().add(sbxSends);
		sbxSends.setIdentificationTransactionSends(this);

		return sbxSends;
	}

	public SBXPost removeSBXSend(SBXPost sbxSends) {
		getSBXSends().remove(sbxSends);
		sbxSends.setIdentificationTransactionSends(null);

		return sbxSends;
	}

}