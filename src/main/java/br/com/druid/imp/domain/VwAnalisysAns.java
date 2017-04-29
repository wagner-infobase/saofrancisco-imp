package br.com.druid.imp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the vw_critica_ans database table.
 * 
 */
@Entity
@Table(name="vw_critica_ans")
@NamedQuery(name="VwAnalisysAns.findAll", query="SELECT v FROM VwAnalisysAns v")
public class VwAnalisysAns implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="ACTION_CORRECTION")
	private String actionCorrection;

	private String active;

	@Lob
	@Column(name="DETAIL_MESSAGE")
	private String detailMessage;

	@Column(name="ERROR_CODE")
	private Integer errorCode;

	@Column(name="ERROR_MESSAGE")
	private String errorMessage;

	@Column(name="FIELD_ID")
	private String fieldId;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@Id
	private Long id;

	private String operator;

	public VwAnalisysAns() {
	}

	public String getActionCorrection() {
		return actionCorrection;
	}

	public void setActionCorrection(String actionCorrection) {
		this.actionCorrection = actionCorrection;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDetailMessage() {
		return detailMessage;
	}

	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	
	
	
	

}