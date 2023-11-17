package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Regalo> regali = new ArrayList<>();
		String name = null;
		System.out.print("[0 -> exit] Dimmi il regalo che vuoi aggiungere alla tua lista: ");
		do {
			name = in.nextLine();
			if(name.equals("0")) break;
			System.out.print("A chi è destinato: ");
			String destinatario = in.nextLine();
			
			Regalo regalo = new Regalo(name, destinatario);
			regali.add(regalo);
			System.out.println("La lista ha all'interno N." + regali.size() + " di regali");
			System.out.print("[0 -> exit] Aggiungi un altro regalo: ");
			
		} while(!name.equals("0"));
			
		
        System.out.print("Scegli l'ordine della lista (nome/destinatario): ");
        String order = in.nextLine().toLowerCase();

        if (order.equals("nome")) {
            Collections.sort(regali, Comparator.comparing(Regalo::getName));
//            Collections.sort(regali, Comparator.comparing(regalo -> regalo.getName()));
        } else if (order.equals("destinatario")) {
            Collections.sort(regali, Comparator.comparing(Regalo::getDestinatario));
//            Collections.sort(regali, Comparator.comparing(regalo -> regalo.getDestinatario()));
        } else {
            System.out.println("Ordine non scelto.");
        }
		
		  for (Regalo regalo : regali) {
	            System.out.println(regalo);
	        }
	}

}
