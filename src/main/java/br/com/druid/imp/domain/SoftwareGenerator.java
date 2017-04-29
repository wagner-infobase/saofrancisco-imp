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
 * The persistent class for the software_gerador database table.
 * 
 */
@Entity
@Table(name="software_gerador")
@NamedQuery(name="SoftwareGenerator.findAll", query="SELECT s FROM SoftwareGenerator s")
public class SoftwareGenerator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOFTWARE_GERADOR_ID_GENERATOR", sequenceName="SQ_SOFTWARE_GERADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOFTWARE_GERADOR_ID_GENERATOR")
	@Column(name="COD_SOFTWARE_GERADOR")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="NOME_APLICATIVO")
	private String nomeAplicativo;

	@Column(name="VERSAO_APLICATIVO")
	private String versaoAplicativo;

	//bi-directional many-to-one association to RpxReturn
	@OneToMany(mappedBy="softwareGerador")
	private List<RPXReturn> rpxRetornos;

	//bi-directional many-to-one association to SbxPost
	@OneToMany(mappedBy="softwareGerador")
	private List<SBXPost> sbxEnvios;

	public SoftwareGenerator() {
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

	public String getNomeAplicativo() {
		return this.nomeAplicativo;
	}

	public void setNomeAplicativo(String nomeAplicativo) {
		this.nomeAplicativo = nomeAplicativo;
	}

	public String getVersaoAplicativo() {
		return this.versaoAplicativo;
	}

	public void setVersaoAplicativo(String versaoAplicativo) {
		this.versaoAplicativo = versaoAplicativo;
	}

	public List<RPXReturn> getRpxRetornos() {
		return this.rpxRetornos;
	}

	public void setRpxRetornos(List<RPXReturn> rpxRetornos) {
		this.rpxRetornos = rpxRetornos;
	}

	public RPXReturn addRpxRetorno(RPXReturn rpxRetorno) {
		getRpxRetornos().add(rpxRetorno);
		rpxRetorno.setSoftwareGerador(this);

		return rpxRetorno;
	}

	public RPXReturn removeRpxRetorno(RPXReturn rpxRetorno) {
		getRpxRetornos().remove(rpxRetorno);
		rpxRetorno.setSoftwareGerador(null);

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
		sbxEnvio.setSoftwareGerador(this);

		return sbxEnvio;
	}

	public SBXPost removeSbxEnvio(SBXPost sbxEnvio) {
		getSbxEnvios().remove(sbxEnvio);
		sbxEnvio.setSoftwareGerador(null);

		return sbxEnvio;
	}

}