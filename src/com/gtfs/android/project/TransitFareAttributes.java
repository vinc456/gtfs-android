package com.gtfs.android.project;

public class TransitFareAttributes {

	public String fare_id;
	public String price;
	public String currency_type;
	public String payment_method;
	public String transfers;
	public String transfer_duration;

	public void FromString(String str){
		String[] temp;
		temp = str.split(",");
        
		this.fare_id = temp[0];
        this.price = temp[1];
        this.currency_type = temp[2];
        this.payment_method = temp[3];
        this.transfers = temp[4];
        this.transfer_duration = temp[5];
		
	}
}
