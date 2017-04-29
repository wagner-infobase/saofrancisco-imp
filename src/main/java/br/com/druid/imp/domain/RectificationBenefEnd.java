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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the retificacao_benef_end database table.
 * 
 */
@Entity
@Table(name="retificacao_benef_end")
@NamedQuery(name="RectificationBenefEnd.findAll", query="SELECT r FROM RectificationBenefEnd r")
public class RectificationBenefEnd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RETIFICACAO_BENEF_END_ID_GENERATOR", sequenceName="SQ_RETIFICACAO_BENEF_END")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RETIFICACAO_BENEF_END_ID_GENERATOR")
	@Column(name="COD_RETIFICACAO_BENEF_END")
	private Long id;

	@Column(name="CAMPO_NEW")
	private String campoNew;

	@Column(name="CAMPO_OLD")
	private String campoOld;

	private String cco;

	@Column(name="COD_CAMPO")
	private String codCampo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;
	
	@Column(name="TP_AGRUPADOR")
	private String typeObject;

	//bi-directional many-to-one association to Movement
	@ManyToOne
	@JoinColumn(name="COD_MOVIMENTACAO")
	private Movement movimentacao;

	public RectificationBenefEnd() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampoNew() {
		return this.campoNew;
	}

	public void setCampoNew(String campoNew) {
		this.campoNew = campoNew;
	}

	public String getCampoOld() {
		return this.campoOld;
	}

	public void setCampoOld(String campoOld) {
		this.campoOld = campoOld;
	}

	public String getCco() {
		return this.cco;
	}

	public void setCco(String cco) {
		this.cco = cco;
	}

	public String getCodCampo() {
		return this.codCampo;
	}

	public void setCodCampo(String codCampo) {
		this.codCampo = codCampo;
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

	public Movement getMovimentacao() {
		return this.movimentacao;
	}

	public void setMovimentacao(Movement movimentacao) {
		this.movimentacao = movimentacao;
	}

	public String getTypeObject() {
		return typeObject;
	}

	public void setTypeObject(String typeObject) {
		this.typeObject = typeObject;
	}
}