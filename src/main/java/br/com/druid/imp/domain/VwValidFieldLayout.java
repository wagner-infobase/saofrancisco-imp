package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VW_VALIDACAO_CAMPO_LAYOUT database table.
 * 
 */
@Entity
@Table(name="VW_VALIDACAO_CAMPO_LAYOUT")
@NamedQuery(name="VwValidFieldLayout.findAll", query="SELECT v FROM VwValidFieldLayout v")
public class VwValidFieldLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	private String active;

	@Column(name="CAMPO_LAYOUT_ID")
	private Long campoLayoutId;

	@Column(name="DESCRICAO_CAMPO")
	private String descricaoCampo;

	@Id
	private Long id;

	@Column(name="LAYOUT_ID")
	private Long layoutId;

	@Column(name="NOME_LAYOUT")
	private String nomeLayout;

	@Column(name="NUMERO_CAMPO")
	private Integer numeroCampo;

	@Column(name="VALIDA_DEPEN_CANCELAMENTO")
	private String validaDepenCancelamento;

	@Column(name="VALIDA_DEPEN_INCLUSAO")
	private String validaDepenInclusao;

	@Column(name="VALIDA_DEPEN_MUDANCACONTRATUAL")
	private String validaDepenMudancacontratual;

	@Column(name="VALIDA_DEPEN_REATIVACAO")
	private String validaDepenReativacao;

	@Column(name="VALIDA_DEPEN_RETIFICACAO")
	private String validaDepenRetificacao;

	@Column(name="VALIDA_TIT_CANCELAMENTO")
	private String validaTitCancelamento;

	@Column(name="VALIDA_TIT_INCLUSAO")
	private String validaTitInclusao;

	@Column(name="VALIDA_TIT_MUDANCACONTRATUAL")
	private String validaTitMudancacontratual;

	@Column(name="VALIDA_TIT_REATIVACAO")
	private String validaTitReativacao;

	@Column(name="VALIDA_TIT_RETIFICACAO")
	private String validaTitRetificacao;

	@Column(name="VALIDACAO_CAMPO_ID")
	private Long validacaoCampoId;

	public VwValidFieldLayout() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getCampoLayoutId() {
		return this.campoLayoutId;
	}

	public void setCampoLayoutId(Long campoLayoutId) {
		this.campoLayoutId = campoLayoutId;
	}

	public String getDescricaoCampo() {
		return this.descricaoCampo;
	}

	public void setDescricaoCampo(String descricaoCampo) {
		this.descricaoCampo = descricaoCampo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}

	public String getNomeLayout() {
		return this.nomeLayout;
	}

	public void setNomeLayout(String nomeLayout) {
		this.nomeLayout = nomeLayout;
	}

	public Integer getNumeroCampo() {
		return this.numeroCampo;
	}

	public void setNumeroCampo(Integer numeroCampo) {
		this.numeroCampo = numeroCampo;
	}

	public String getValidaDepenCancelamento() {
		return this.validaDepenCancelamento;
	}

	public void setValidaDepenCancelamento(String validaDepenCancelamento) {
		this.validaDepenCancelamento = validaDepenCancelamento;
	}

	public String getValidaDepenInclusao() {
		return this.validaDepenInclusao;
	}

	public void setValidaDepenInclusao(String validaDepenInclusao) {
		this.validaDepenInclusao = validaDepenInclusao;
	}

	public String getValidaDepenMudancacontratual() {
		return this.validaDepenMudancacontratual;
	}

	public void setValidaDepenMudancacontratual(String validaDepenMudancacontratual) {
		this.validaDepenMudancacontratual = validaDepenMudancacontratual;
	}

	public String getValidaDepenReativacao() {
		return this.validaDepenReativacao;
	}

	public void setValidaDepenReativacao(String validaDepenReativacao) {
		this.validaDepenReativacao = validaDepenReativacao;
	}

	public String getValidaDepenRetificacao() {
		return this.validaDepenRetificacao;
	}

	public void setValidaDepenRetificacao(String validaDepenRetificacao) {
		this.validaDepenRetificacao = validaDepenRetificacao;
	}

	public String getValidaTitCancelamento() {
		return this.validaTitCancelamento;
	}

	public void setValidaTitCancelamento(String validaTitCancelamento) {
		this.validaTitCancelamento = validaTitCancelamento;
	}

	public String getValidaTitInclusao() {
		return this.validaTitInclusao;
	}

	public void setValidaTitInclusao(String validaTitInclusao) {
		this.validaTitInclusao = validaTitInclusao;
	}

	public String getValidaTitMudancacontratual() {
		return this.validaTitMudancacontratual;
	}

	public void setValidaTitMudancacontratual(String validaTitMudancacontratual) {
		this.validaTitMudancacontratual = validaTitMudancacontratual;
	}

	public String getValidaTitReativacao() {
		return this.validaTitReativacao;
	}

	public void setValidaTitReativacao(String validaTitReativacao) {
		this.validaTitReativacao = validaTitReativacao;
	}

	public String getValidaTitRetificacao() {
		return this.validaTitRetificacao;
	}

	public void setValidaTitRetificacao(String validaTitRetificacao) {
		this.validaTitRetificacao = validaTitRetificacao;
	}

	public Long getValidacaoCampoId() {
		return this.validacaoCampoId;
	}

	public void setValidacaoCampoId(Long validacaoCampoId) {
		this.validacaoCampoId = validacaoCampoId;
	}

}