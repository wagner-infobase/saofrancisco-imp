package br.com.druid.imp.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BatchMovementDTO {

	private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private String initDate;
	private String untilDate;
	private String batchNumber;
	private String batchName;
	private List<Long> listMov;

	public BatchMovementDTO() {}

	

	public BatchMovementDTO(DateFormat sdf, String initDate, String untilDate, String batchNumber, String batchName,
			List<Long> listMov) {
		super();
		this.sdf = sdf;
		this.initDate = initDate;
		this.untilDate = untilDate;
		this.batchNumber = batchNumber;
		this.batchName = batchName;
		this.listMov = listMov;
	}

	public Date getInitDate() throws ParseException {
		return sdf.parse(initDate);
	}

	public void setInitDate(String initDate) {
		this.initDate = initDate;
	}

	public Date getUntilDate() throws ParseException {

		return sdf.parse(untilDate);
	}

	public void setUntilDate(String dtAte) {
		this.untilDate = dtAte;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String nroLote) {
		this.batchNumber = nroLote;
	}
	
	public String getBatchName() {
		return batchName;
	}
	
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public List<Long> getListMov() {
		return listMov;
	}

	public void setListMov(List<Long> listMov) {
		this.listMov = listMov;
	}

}