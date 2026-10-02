package com.example.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("hotel")

public class Hotel {
	@Value("1001")
	private Integer hotelid;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.address}")
	private String hoteladdress;
	@Value("${hotel.phoneno}")
	private String mobileno;
	
	@Value("${customer.name}")
	private String custname;
	@Value("#{m.dosaprice+m.idlyprice}")
	private float bill;
	@Value("${os.name}")
	private String osname;
	@Value("${user.name}")
	private String windowsname;
	@Value("${path}")
	private String pathdata;
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", hotelName=" + hotelName + ", hoteladdress=" + hoteladdress
				+ ", mobileno=" + mobileno + ", custname=" + custname + ", bill=" + bill + ", osname=" + osname
				+ ", windowsname=" + windowsname + ", pathdata=" + pathdata + "]";
	}
	
	

}
