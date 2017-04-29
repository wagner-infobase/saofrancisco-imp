package br.com.druid.imp.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MovementDTO {

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataNascimento;
	private String pisPasep;
	private Character sexo;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtInclusao;
	private List<ErrorDTO> erros;
	
	public MovementDTO() {}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public List<ErrorDTO> getErros() {
		return erros;
	}

	public void setErros(List<ErrorDTO> erros) {
		this.erros = erros;
	}
}
