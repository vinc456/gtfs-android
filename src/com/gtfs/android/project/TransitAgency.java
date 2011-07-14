package com.gtfs.android.project;

public class TransitAgency {

	public String agency_id;
	public String agency_name;
	public String agency_url;
	public String agency_timezone;
	public String agency_lang;
	public String agency_phone;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.agency_id = temp[0];
        this.agency_name = temp[1];
        this.agency_url = temp[2];
        this.agency_timezone = temp[3];
        this.agency_lang = temp[4];
        this.agency_phone = temp[5];
		
	}
}
