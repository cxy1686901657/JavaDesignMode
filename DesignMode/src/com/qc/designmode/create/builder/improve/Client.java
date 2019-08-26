package com.qc.designmode.create.builder.improve;

public class Client {
	public static void main(String[] args) {
		
		CommonHouse commonHouse = new CommonHouse();
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		House house = houseDirector.constructHouse();
		
		HighBuilding highBuilding = new HighBuilding();

		houseDirector.setHouseBuilder(highBuilding);

        House house1 = houseDirector.constructHouse();


    }
}
