package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the origem database table.
 * 
 */
@Entity
@Table(name="origem")
@NamedQuery(name="Origin.findAll", query="SELECT o FROM Origin o")
public class Origin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORIGEM_ID_GENERATOR", sequenceName="SQ_ORIGEM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORIGEM_ID_GENERATOR")
	@Column(name="COD_ORIGEM")
	private Long id;

	private String cnpj;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="REGISTRO_ANS")
	private String registroAns;

	//bi-directional many-to-one association to RpxReturn
	@OneToMany(mappedBy="origem")
	private List<RPXReturn> rpxRetornos;

	//bi-directional many-to-one association to SbxPost
	@OneToMany(mappedBy="origem")
	private List<SBXPost> sbxEnvios;

	public Origin() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getRegistroAns() {
		return this.registroAns;
	}

	public void setRegistroAns(String registroAns) {
		this.registroAns = registroAns;
	}

	public List<RPXReturn> getRpxRetornos() {
		return this.rpxRetornos;
	}

	public void setRpxRetornos(List<RPXReturn> rpxRetornos) {
		this.rpxRetornos = rpxRetornos;
	}

	public RPXReturn addRpxRetorno(RPXReturn rpxRetorno) {
		getRpxRetornos().add(rpxRetorno);
		rpxRetorno.setOrigem(this);

		return rpxRetorno;
	}

	public RPXReturn removeRpxRetorno(RPXReturn rpxRetorno) {
		getRpxRetornos().remove(rpxRetorno);
		rpxRetorno.setOrigem(null);

		return rpxRetorno;
	}

	public List<SBXPost> getSbxEnvios() {
		return this.sbxEnvios;
	}

	public void setSbxEnvios(List<SBXPost> sbxEnvios) {
		this.sbxEnvios = sbxEnvios;
	}

	public SBXPost addSbxEnvio(SBXPost sbxEnvio) {
		getSbxEnvios().add(sbxEnvio);
		sbxEnvio.setOrigem(this);

		return sbxEnvio;
	}

	public SBXPost removeSbxEnvio(SBXPost sbxEnvio) {
		getSbxEnvios().remove(sbxEnvio);
		sbxEnvio.setOrigem(null);

		return sbxEnvio;
	}

}