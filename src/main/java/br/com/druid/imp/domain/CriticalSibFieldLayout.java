package br.com.druid.imp.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CRITICA_SIB_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="CRITICA_SIB_CAMPO_LAYOUT")
@NamedQuery(name="CriticalSibFieldLayout.findAll", query="SELECT c FROM CriticalSibFieldLayout c")
public class CriticalSibFieldLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CRITICA_SIB_CAMPO_LAYOUT_CODCRITICASIBCAMPOLAYOUT_GENERATOR", sequenceName="SQ_CRITICA_SIB_CAMPO_LAYOUT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CRITICA_SIB_CAMPO_LAYOUT_CODCRITICASIBCAMPOLAYOUT_GENERATOR")
	@Column(name="COD_CRITICA_SIB_CAMPO_LAYOUT")
	private Long codCriticalSibFieldLayout;

	@Column(name="COD_CAMPO_LAYOUT_PADRAO")
	private Long codFieldLayoutDefault;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInactive;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusion;

	@Column(name="FL_STATUS")
	private String flStatus;

	@Column(name="VALIDA_SIB")
	private String validSib;

	public CriticalSibFieldLayout() {
	}

	public Long getCodCriticaSibCampoLayout() {
		return this.codCriticalSibFieldLayout;
	}

	public void setCodCriticaSibCampoLayout(Long codCriticalSibFieldLayout) {
		this.codCriticalSibFieldLayout = codCriticalSibFieldLayout;
	}

	public Long getCodCampoLayoutPadrao() {
		return this.codFieldLayoutDefault;
	}

	public void setCodCampoLayoutPadrao(Long codFieldLayoutDefault) {
		this.codFieldLayoutDefault = codFieldLayoutDefault;
	}

	public Date getDtInativo() {
		return this.dtInactive;
	}

	public void setDtInativo(Date dtInactive) {
		this.dtInactive = dtInactive;
	}

	public Date getDtInclusao() {
		return this.dtInclusion;
	}

	public void setDtInclusao(Date dtInclusion) {
		this.dtInclusion = dtInclusion;
	}

	public String getFlStatus() {
		return this.flStatus;
	}

	public void setFlStatus(String flStatus) {
		this.flStatus = flStatus;
	}

	public String getValidaSib() {
		return this.validSib;
	}

	public void setValidaSib(String validSib) {
		this.validSib = validSib;
	}

}