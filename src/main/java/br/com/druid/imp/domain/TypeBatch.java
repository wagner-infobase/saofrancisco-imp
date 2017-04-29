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
 * The persistent class for the tp_lote database table.
 * 
 */
@Entity
@Table(name="tp_lote")
@NamedQuery(name="TypeBatch.findAll", query="SELECT t FROM TypeBatch t")
public class TypeBatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TP_LOTE_ID_GENERATOR", sequenceName="SQ_TP_LOTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TP_LOTE_ID_GENERATOR")
	@Column(name="COD_TP_LOTE")
	private Long id;

	@Column(name="DSC_TP_LOTE")
	private String dscTpLote;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INATIVO")
	private Date dtInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_INCLUSAO")
	private Date dtInclusao;

	@Column(name="FL_STATUS")
	private String flStatus;

	

	public TypeBatch() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDscTpLote() {
		return this.dscTpLote;
	}

	public void setDscTpLote(String dscTpLote) {
		this.dscTpLote = dscTpLote;
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



	

}