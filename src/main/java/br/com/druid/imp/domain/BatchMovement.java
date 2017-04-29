package br.com.druid.imp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "LOTE_MOVIMENTACAO")
public class BatchMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "LOTE_MOVIMENTACAO_ID_GENERATOR", sequenceName = "SQ_LOTE_MOVIMENTACAO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOTE_MOVIMENTACAO_ID_GENERATOR")
	@Column(name = "COD_LOTE_MOVIMENTACAO")
	private Long id;

	// bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name = "COD_LOTE")
	private Batch batch;

	// bi-directional many-to-one association to Movement
	@ManyToOne
	@JoinColumn(name = "COD_MOVIMENTACAO")
	private Movement movement;

	public BatchMovement() {
	}

	public BatchMovement(Batch batch, Movement movement) {
		super();
		this.batch = batch;
		this.movement = movement;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	public List<BatchMovement> addBatchToMovements(Batch batch, Iterable<Movement> movements) {

		List<BatchMovement> list = new ArrayList<BatchMovement>();

		for (Movement movement : movements) {
			list.add(new BatchMovement(batch, movement));
		}

		return list;
	}
}