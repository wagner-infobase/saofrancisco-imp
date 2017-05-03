package br.com.druid.imp.domain;

public class RequiredFieldLayoutDTO {
		
	private Long codValidationFieldLayout;		
	private Long codFieldLayoutDefault;
	private String inclusionDependent;
	private String inclusionHolder;
	private String cancellationDependent;
	private String cancellationHolder;	
	private String contractualChangeDependent;
	private String contractualChangeHolder;
	private String reactivationDependent;
	private String reactivationHolder;	
	private String rectificationDependent;
	private String rectificationHolder;
	private Long rectificationField;	
	
	private Long criticalSibFieldId;

	public RequiredFieldLayoutDTO(){}

	public Long getCodValidationFieldLayout() {
		return codValidationFieldLayout;
	}
	public void setCodValidationFieldLayout(Long codValidationFieldLayout) {
		this.codValidationFieldLayout = codValidationFieldLayout;
	}
	public Long getCodFieldLayoutDefault() {
		return codFieldLayoutDefault;
	}
	public void setCodFieldLayoutDefault(Long codFieldLayoutDefault) {
		this.codFieldLayoutDefault = codFieldLayoutDefault;
	}
	public String getInclusionDependent() {
		return inclusionDependent;
	}
	public void setInclusionDependent(String inclusionDependent) {
		this.inclusionDependent = inclusionDependent;
	}
	public String getInclusionHolder() {
		return inclusionHolder;
	}
	public void setInclusionHolder(String inclusionHolder) {
		this.inclusionHolder = inclusionHolder;
	}
	public String getCancellationDependent() {
		return cancellationDependent;
	}
	public void setCancellationDependent(String cancellationDependent) {
		this.cancellationDependent = cancellationDependent;
	}
	public String getCancellationHolder() {
		return cancellationHolder;
	}
	public void setCancellationHolder(String cancellationHolder) {
		this.cancellationHolder = cancellationHolder;
	}
	public String getContractualChangeDependent() {
		return contractualChangeDependent;
	}
	public void setContractualChangeDependent(String contractualChangeDependent) {
		this.contractualChangeDependent = contractualChangeDependent;
	}
	public String getContractualChangeHolder() {
		return contractualChangeHolder;
	}
	public void setContractualChangeHolder(String contractualChangeHolder) {
		this.contractualChangeHolder = contractualChangeHolder;
	}
	public String getReactivationDependent() {
		return reactivationDependent;
	}
	public void setReactivationDependent(String reactivationDependent) {
		this.reactivationDependent = reactivationDependent;
	}
	public String getReactivationHolder() {
		return reactivationHolder;
	}
	public void setReactivationHolder(String reactivationHolder) {
		this.reactivationHolder = reactivationHolder;
	}
	public String getRectificationDependent() {
		return rectificationDependent;
	}
	public void setRectificationDependent(String rectificationDependent) {
		this.rectificationDependent = rectificationDependent;
	}
	public String getRectificationHolder() {
		return rectificationHolder;
	}
	public void setRectificationHolder(String rectificationHolder) {
		this.rectificationHolder = rectificationHolder;
	}
	public Long getRectificationField() {
		return rectificationField;
	}
	public void setRectificationField(Long rectificationField) {
		this.rectificationField = rectificationField;
	}

	public Long getCriticalSibFieldId() {
		return criticalSibFieldId;
	}

	public void setCriticalSibFieldId(Long criticalSibFieldId) {
		this.criticalSibFieldId = criticalSibFieldId;
	}	
	

}
