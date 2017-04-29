package br.com.druid.imp.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDTO {

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtInclusaoErro; 
	private BigDecimal codErro;
	private String erro;
	private String detalheErro; 
	private String acaoCorrecao; 
	private String idCampo;
	private String nomeCampo; 
	
	public ErrorDTO() {}

	public Date getDtInclusaoErro() {
		return dtInclusaoErro;
	}

	public void setDtInclusaoErro(Date dtInclusaoErro) {
		this.dtInclusaoErro = dtInclusaoErro;
	}

	public BigDecimal getCodErro() {
		return codErro;
	}

	public void setCodErro(BigDecimal codErro) {
		this.codErro = codErro;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getDetalheErro() {
		return detalheErro;
	}

	public void setDetalheErro(String detalheErro) {
		this.detalheErro = detalheErro;
	}

	public String getAcaoCorrecao() {
		return acaoCorrecao;
	}

	public void setAcaoCorrecao(String acaoCorrecao) {
		this.acaoCorrecao = acaoCorrecao;
	}

	public String getIdCampo() {
		return idCampo;
	}

	public void setIdCampo(String idCampo) {
		this.idCampo = idCampo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}
}
