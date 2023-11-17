package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> regali = new ArrayList<>();
		String value = null;
		System.out.print("[0 -> exit] Dimmi il regalo che vuoi aggiungere alla tua lista: ");
		do {
			value = in.nextLine();
			
			if(value.equals("0")) break;
			
			regali.add(value);
			System.out.println("La lista ha all'interno N." + regali.size() + " di regali");
			System.out.print("[0 -> exit] Aggiungi un altro regalo: ");
			
		} while(!value.equals("0"));
			
		
		for(int x = 0; x < regali.size(); x++) {
			String regalo = regali.get(x);
			System.out.println("Regalo N." + (x + 1) + ": " + regalo);
		}
	}

}
