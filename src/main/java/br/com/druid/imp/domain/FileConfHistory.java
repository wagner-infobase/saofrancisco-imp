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
@Table(name="ARQCONF_HISTORICO")
public class FileConfHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ARQCONF_HISTORICO_ID_GENERATOR", sequenceName="SQ_ARQCONF_HISTORICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ARQCONF_HISTORICO_ID_GENERATOR")
	@Column(name="COD_ARQCONF_HISTORICO")
	private Long id;

	@Column(name="BAIRRO")
	private String neighborhood;

	private String cco;

	private String cei;

	private String cep;

	private String cnpj;

	@Column(name="COD_IDENT_BENEFC_OPER")
	private String codIdentBenefcOper;

	@Column(name="COD_MOTIVO_CANCELAMENTO")
	private String codReasonCancel;

	@Column(name="COD_MUNICIPIO_LOGRADOURO")
	private String codCountyPublicPlace;

	@Column(name="COD_MUNICIPIO_PROFISSIONAL")
	private String codCountyProfessional;

	@Column(name="COD_TITULAR")
	private String codHolder;

	@Column(name="COMPLEMENTO_LOGRADOURO")
	private String complementPublicPlace;

	private String cpf;

	private String cpt;

	private String dnv;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CANCELAMENTO")
	private Date cancelDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CONTRATACAO")
	private Date hiringDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date inactiveDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date includeDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Date bornDate;

	@Column(name="END_RES_PROF")
	private String endResProf;

	@Column(name="FL_STATUS")
	private String status;

	@Column(name="INDICADOR_BRASIL_EXTERIOR")
	private String indicatorBrasilExterior;

	private String ipc;

	@Column(name="LOGRADOURO")
	private String publicPlace;

	@Column(name="NM_BENEFICIARIO")
	private String benefeciaryName;

	@Column(name="NM_MAE")
	private String motherName;

	@Column(name="NRO_CNS")
	private String numberCNS;

	@Column(name="NRO_LOGRADOURO")
	private String numberPublicPlace;

	@Column(name="NRO_PLAN_ORIG_RPS")
	private String numberPlanOrigRps;

	@Column(name="PIS_PASEP")
	private String pisPasep;

	@Column(name="RELACAO_DEPENDENCIA")
	private String dependencyRelationship;

	private String rps;

	@Column(name="SEXO")
	private String gender;

	private String spca;


	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="COD_LOTE")
	private Batch batch;

	public FileConfHistory() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCCO() {
		return cco;
	}

	public void setCCO(String cco) {
		this.cco = cco;
	}

	public String getCEI() {
		return cei;
	}

	public void setCEI(String cei) {
		this.cei = cei;
	}

	public String getCEP() {
		return cep;
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodIdentBenefcOper() {
		return codIdentBenefcOper;
	}

	public void setCodIdentBenefcOper(String codIdentBenefcOper) {
		this.codIdentBenefcOper = codIdentBenefcOper;
	}

	public String getCodReasonCancel() {
		return codReasonCancel;
	}

	public void setCodReasonCancel(String codReasonCancel) {
		this.codReasonCancel = codReasonCancel;
	}

	public String getCodCountyPublicPlace() {
		return codCountyPublicPlace;
	}

	public void setCodCountyPublicPlace(String codCountyPublicPlace) {
		this.codCountyPublicPlace = codCountyPublicPlace;
	}

	public String getCodCountyProfessional() {
		return codCountyProfessional;
	}

	public void setCodCountyProfessional(String codCountyProfessional) {
		this.codCountyProfessional = codCountyProfessional;
	}

	public String getCodHolder() {
		return codHolder;
	}

	public void setCodHolder(String codHolder) {
		this.codHolder = codHolder;
	}

	public String getComplementPublicPlace() {
		return complementPublicPlace;
	}

	public void setComplementPublicPlace(String complementPublicPlace) {
		this.complementPublicPlace = complementPublicPlace;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPT() {
		return cpt;
	}

	public void setCPT(String cpt) {
		this.cpt = cpt;
	}

	public String getDNV() {
		return dnv;
	}

	public void setDNV(String dnv) {
		this.dnv = dnv;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
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

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getEndResProf() {
		return endResProf;
	}

	public void setEndResProf(String endResProf) {
		this.endResProf = endResProf;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIndicatorBrasilExterior() {
		return indicatorBrasilExterior;
	}

	public void setIndicatorBrasilExterior(String indicatorBrasilExterior) {
		this.indicatorBrasilExterior = indicatorBrasilExterior;
	}

	public String getIPC() {
		return ipc;
	}

	public void setIPC(String ipc) {
		this.ipc = ipc;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getBenefeciaryName() {
		return benefeciaryName;
	}

	public void setBenefeciaryName(String benefeciaryName) {
		this.benefeciaryName = benefeciaryName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getNumberCNS() {
		return numberCNS;
	}

	public void setNumberCNS(String numberCNS) {
		this.numberCNS = numberCNS;
	}

	public String getNumberPublicPlace() {
		return numberPublicPlace;
	}

	public void setNumberPublicPlace(String numberPublicPlace) {
		this.numberPublicPlace = numberPublicPlace;
	}

	public String getNumberPlanOrigRps() {
		return numberPlanOrigRps;
	}

	public void setNumberPlanOrigRps(String numberPlanOrigRps) {
		this.numberPlanOrigRps = numberPlanOrigRps;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public String getDependencyRelationship() {
		return dependencyRelationship;
	}

	public void setDependencyRelationship(String dependencyRelationship) {
		this.dependencyRelationship = dependencyRelationship;
	}

	public String getRPS() {
		return rps;
	}

	public void setRPS(String rps) {
		this.rps = rps;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSPCA() {
		return spca;
	}

	public void setSPCA(String spca) {
		this.spca = spca;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
}