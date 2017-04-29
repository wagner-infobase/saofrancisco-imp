package br.com.druid.imp.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the vw_movimentacao database table.
 * 
 */
@Entity
@Table(name="vw_movimentacao")
@NamedQuery(name="VwMovement.findAll", query="SELECT v FROM VwMovement v")
public class VwMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cco;

	private int cod;

	@Column(name="COD_IDENT_BENEFC_OPER")
	private String codIdentBenefcOper;

	private String cpf;

	@Column(name="DIAS_ANS")
	private BigInteger diasAns;

	private String dsc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_PARA_FILTRO_INI_FIM")
	private Date dtParaFiltroIniFim;

	@Column(name="ERROS_ANS")
	private String errosAns;

	@Id
	private Long id;

	@Column(name="MES_REF_FORMAT_NAME")
	private String mesRefFormatName;

	@Column(name="MES_REF_FORMAT_NUMBER")
	private String mesRefFormatNumber;

	private String movimentacao;

	@Column(name="NM_BENEFICIARIO")
	private String nmBeneficiario;

	@Column(name="NRO_CNS")
	private String nroCns;

	@Column(name="PRE_VALIDACAO")
	private String preValidacao;

	@Column(name="PRE_VALIDACAO_STATUS")
	private String preValidacaoStatus;

	public VwMovement() {
	}

	public String getCco() {
		return this.cco;
	}

	public void setCco(String cco) {
		this.cco = cco;
	}

	public int getCod() {
		return this.cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCodIdentBenefcOper() {
		return this.codIdentBenefcOper;
	}

	public void setCodIdentBenefcOper(String codIdentBenefcOper) {
		this.codIdentBenefcOper = codIdentBenefcOper;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigInteger getDiasAns() {
		return this.diasAns;
	}

	public void setDiasAns(BigInteger diasAns) {
		this.diasAns = diasAns;
	}

	public String getDsc() {
		return this.dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public Date getDtParaFiltroIniFim() {
		return this.dtParaFiltroIniFim;
	}

	public void setDtParaFiltroIniFim(Date dtParaFiltroIniFim) {
		this.dtParaFiltroIniFim = dtParaFiltroIniFim;
	}

	public String getErrosAns() {
		return this.errosAns;
	}

	public void setErrosAns(String errosAns) {
		this.errosAns = errosAns;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMesRefFormatName() {
		return this.mesRefFormatName;
	}

	public void setMesRefFormatName(String mesRefFormatName) {
		this.mesRefFormatName = mesRefFormatName;
	}

	public String getMesRefFormatNumber() {
		return this.mesRefFormatNumber;
	}

	public void setMesRefFormatNumber(String mesRefFormatNumber) {
		this.mesRefFormatNumber = mesRefFormatNumber;
	}

	public String getMovimentacao() {
		return this.movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}

	public String getNmBeneficiario() {
		return this.nmBeneficiario;
	}

	public void setNmBeneficiario(String nmBeneficiario) {
		this.nmBeneficiario = nmBeneficiario;
	}

	public String getNroCns() {
		return this.nroCns;
	}

	public void setNroCns(String nroCns) {
		this.nroCns = nroCns;
	}

	public String getPreValidacao() {
		return this.preValidacao;
	}

	public void setPreValidacao(String preValidacao) {
		this.preValidacao = preValidacao;
	}

	public String getPreValidacaoStatus() {
		return this.preValidacaoStatus;
	}

	public void setPreValidacaoStatus(String preValidacaoStatus) {
		this.preValidacaoStatus = preValidacaoStatus;
	}

}