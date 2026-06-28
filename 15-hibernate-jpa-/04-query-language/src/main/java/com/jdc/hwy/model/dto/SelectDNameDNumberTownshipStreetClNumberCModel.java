package com.jdc.hwy.model.dto;

public record SelectDNameDNumberTownshipStreetClNumberCModel(
		String driver,
		String dNumber,
		String township,
		String street,
		String clNumber,
		String cModel
		){
	
	@Override
	public final String toString() {
		return """
				Name           :%s
				Driver Licence :%s
				Township       :%s
				Street         :%s
				Car Licence    :%s
				Car Model      :%s
				""".formatted(driver,dNumber,township,street,clNumber,cModel);
	}

}
