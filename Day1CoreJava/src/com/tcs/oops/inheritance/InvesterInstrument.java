package com.tcs.oops.inheritance;

public class InvesterInstrument {
	
	private int iiid;
	private String title;
	private String type;
	private double fund;
	public int getIiid() {
		return iiid;
	}
	public void setIiid(int iiid) {
		this.iiid = iiid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}
	@Override
	public String toString() {
		return "InvesterInstrument [iiid=" + iiid + ", title=" + title + ", type=" + type + ", fund=" + fund + "]";
	}
	public InvesterInstrument(int iiid, String title, String type, double fund) {
		super();
		this.iiid = iiid;
		this.title = title;
		this.type = type;
		this.fund = fund;
	}
	public InvesterInstrument() {
		super();
	}
	

}
