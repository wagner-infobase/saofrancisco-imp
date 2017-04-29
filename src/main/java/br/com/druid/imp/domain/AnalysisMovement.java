package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="CRITICAS_MOVIMENTACAO")
public class AnalysisMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CRITICAS_MOVIMENTACAO_ID_GENERATOR", sequenceName="SQ_CRITICAS_MOVIMENTACAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CRITICAS_MOVIMENTACAO_ID_GENERATOR")
	@Column(name="COD_CRITICAS_MOVIMENTACAO")
	private Long id;

	@Column(name="CORRIGIDO")
	private String corrected;

	//bi-directional many-to-one association to ErrorAns
	@ManyToOne
	@JoinColumn(name="COD_ERRO_ANS")
	private ErrorAns errorANS;

	//bi-directional many-to-one association to Movement
	@ManyToOne
	@JoinColumn(name="COD_MOVIMENTACAO")
	private Movement movement;

	public AnalysisMovement() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorrected() {
		return corrected;
	}

	public void setCorrected(String corrected) {
		this.corrected = corrected;
	}

	public ErrorAns getErrorANS() {
		return errorANS;
	}

	public void setErrorANS(ErrorAns errorANS) {
		this.errorANS = errorANS;
	}

	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}
}