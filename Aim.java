package AimsProjectPackage;

public class Aim {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc[] DVDList = new DigitalVideoDisc[3];
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
		
		DVDList[0] = dvd3;
		DVDList[1] = dvd2;
		DVDList[2] = dvd1;
		
		
//		anOrder.addDigitalVideoDisc(dvd1);
//		anOrder.addDigitalVideoDisc(dvd2);
//		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(DVDList);
		
		anOrder.removeDigitalVideoDisc(dvd3);
		
		System.out.println("------------------------------------");
		
		
		anOrder.displayCart();
		System.out.println("\tTotal cost:\t" + anOrder.totalCost());
	}

}
