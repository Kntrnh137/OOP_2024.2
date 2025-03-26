package AimsProjectPackage;

public class Cart {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc " + ANSI_CYAN + disc.getTitle()+ ANSI_RESET + " has been added");
		} else {
			System.out.println("The cart is almost full.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("The disc " + ANSI_YELLOW + disc.getTitle() + ANSI_RESET + " has been removed.");
				break;
			}
		}
	}

	public float totalCost() {
		float totalCost = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	
	public void displayCart() {
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(i+1 + "\t" + itemsOrdered[i].getTitle() + "\t" + itemsOrdered[i].getCost());
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] DVDList) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			for(int i =0; i < DVDList.length; i++) {
				itemsOrdered[qtyOrdered] = DVDList[i];
				qtyOrdered++;
				System.out.println("The disc " + ANSI_CYAN + DVDList[i].getTitle()+ ANSI_RESET + " has been added");
			}
			System.out.println("The list of DVDs has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The disc " + ANSI_CYAN + dvd1.getTitle()+ ANSI_RESET + " has been added");
			System.out.println("The disc " + ANSI_CYAN + dvd2.getTitle()+ ANSI_RESET + " has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
}
