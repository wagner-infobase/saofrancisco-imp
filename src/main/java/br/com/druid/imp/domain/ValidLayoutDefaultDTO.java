package br.com.druid.imp.domain;

import java.util.List;

public class ValidLayoutDefaultDTO {
	
	private Long codLayoutDefault;	
	private List<ValidFieldLayoutDTO> validfieldlayout;
	
	public ValidLayoutDefaultDTO(){}
	
	public Long getCodLayoutDefault() {
		return codLayoutDefault;
	}
	public void setCodLayoutDefault(Long codLayoutDefault) {
		this.codLayoutDefault = codLayoutDefault;
	}
	public List<ValidFieldLayoutDTO> getValidfieldlayout() {
		return validfieldlayout;
	}
	public void setValidfieldlayout(List<ValidFieldLayoutDTO> validfieldlayout) {
		this.validfieldlayout = validfieldlayout;
	}

	
}
