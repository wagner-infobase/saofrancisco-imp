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
 * The persistent class for the registros_rejeitados database table.
 * 
 */
@Entity
@Table(name="registros_rejeitados")
@NamedQuery(name="RejectedRecord.findAll", query="SELECT r FROM RejectedRecord r")
public class RejectedRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTROS_REJEITADOS_ID_GENERATOR", sequenceName="SQ_REGISTROS_REJEITADOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTROS_REJEITADOS_ID_GENERATOR")
	@Column(name="COD_REGISTROS_REJEITADOS")
	private Long id;

	@Column(name="COD_BENEFICIARIO")
	private String codBeneficiario;

	@Column(name="COD_CAMPO")
	private String codCampo;

	@Column(name="COD_ERRO")
	private String codErro;

	@Column(name="DSC_CAMPO")
	private String dscCampo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Lob
	@Column(name="MSG_ERRO")
	private byte[] msgErro;

	@Column(name="VALOR_CAMPO")
	private String valorCampo;

	//bi-directional many-to-one association to RpxReturn
	@ManyToOne
	@JoinColumn(name="COD_RPX_RETORNO")
	private RPXReturn rpxRetorno;

	//bi-directional many-to-one association to TypeMovement
	@ManyToOne
	@JoinColumn(name="COD_TP_MOVIMENTACAO")
	private TypeMovement tpMovimentacao;

	public RejectedRecord() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodBeneficiario() {
		return this.codBeneficiario;
	}

	public void setCodBeneficiario(String codBeneficiario) {
		this.codBeneficiario = codBeneficiario;
	}

	public String getCodCampo() {
		return this.codCampo;
	}

	public void setCodCampo(String codCampo) {
		this.codCampo = codCampo;
	}

	public String getCodErro() {
		return this.codErro;
	}

	public void setCodErro(String codErro) {
		this.codErro = codErro;
	}

	public String getDscCampo() {
		return this.dscCampo;
	}

	public void setDscCampo(String dscCampo) {
		this.dscCampo = dscCampo;
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

	public byte[] getMsgErro() {
		return this.msgErro;
	}

	public void setMsgErro(byte[] msgErro) {
		this.msgErro = msgErro;
	}

	public String getValorCampo() {
		return this.valorCampo;
	}

	public void setValorCampo(String valorCampo) {
		this.valorCampo = valorCampo;
	}

	public RPXReturn getRpxRetorno() {
		return this.rpxRetorno;
	}

	public void setRpxRetorno(RPXReturn rpxRetorno) {
		this.rpxRetorno = rpxRetorno;
	}

	public TypeMovement getTpMovimentacao() {
		return this.tpMovimentacao;
	}

	public void setTpMovimentacao(TypeMovement tpMovimentacao) {
		this.tpMovimentacao = tpMovimentacao;
	}

}