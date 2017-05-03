package br.com.druid.imp.domain;

import java.util.List;

public class ValidationLayoutDefaultDTO {
	
	private Long codLayoutDefault;	
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

}
