package br.com.druid.imp.domain;

import java.util.List;

public class ValidationLayoutDefaultDTO {
	
	private Long codLayoutDefault;	
	private String validSib;
	private String validDomain;	
	private List<RequiredFieldLayoutDTO> validfieldlayout;
	
	public ValidationLayoutDefaultDTO(){}
	
	public Long getCodLayoutDefault() {
		return codLayoutDefault;
	}
	public void setCodLayoutDefault(Long codLayoutDefault) {
		this.codLayoutDefault = codLayoutDefault;
	}
	public List<RequiredFieldLayoutDTO> getValidfieldlayout() {
		return validfieldlayout;
	}
	public void setValidfieldlayout(List<RequiredFieldLayoutDTO> validfieldlayout) {
		this.validfieldlayout = validfieldlayout;
	}

	public String getValidSib() {
		return validSib;
	}

	public void setValidSib(String validSib) {
		this.validSib = validSib;
	}

	public String getValidDomain() {
		return validDomain;
	}

	public void setValidDomain(String validDomain) {
		this.validDomain = validDomain;
	}
	
	
}
