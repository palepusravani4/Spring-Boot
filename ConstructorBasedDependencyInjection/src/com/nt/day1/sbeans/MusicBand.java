package com.nt.day1.sbeans;

import java.util.List;

public class MusicBand {
	String bandname;
	List<Instrument> in;
	public MusicBand(String bandname, List<Instrument> in) {
		super();
		this.bandname = bandname;
		this.in = in;
	}
	public void showbandDetails() {
		System.out.println("Music Band: "+bandname);
		 System.out.println("Instruments Used: ");
		for(Instrument i:in) {
			i.showInstrument();
		}
	}

}
