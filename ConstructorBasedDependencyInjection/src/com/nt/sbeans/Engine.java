package com.nt.sbeans;

public class Engine {
      String engineType;
      int horsePower;
	  public Engine(String engineType, int horsePower) {
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	  }
      public void showEngineDetails() {
    	  System.out.println("Engine Details:"+"Type ="+engineType+", HorsePower ="+horsePower);
      }
}
