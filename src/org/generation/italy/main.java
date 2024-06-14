package org.generation.italy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scrivere un programma per gestire i “Buoni propositi per il futuro”: il
		 * programma all’avvio visualizza 5 “buoni propositi” (es: “fare più attività
		 * fisica”, “esercitarsi sulla OOP”, ecc.). Si chiede all’utente di indicare
		 * quale dei propositi visualizzati è stato conseguito, e viene riproposto
		 * l’elenco solo con quelli non ancora conseguiti. Si continua a chiedere
		 * all’utente fino a quando tutti i propositi saranno conseguiti.
		 */

		Scanner sc = new Scanner(System.in);
		String risposta;
		int completati = 0;
		String[] buoniPropositi = new String[5];
		buoniPropositi[0] = "1. Fare più esercizio fisico";
		buoniPropositi[1] = "2. Imparare a suonare la chitarra";
		buoniPropositi[2] = "3. Imparare a programmare su Java";
		buoniPropositi[3] = "4. Risparmiare";
		buoniPropositi[4] = "5. Leggere più libri";

		boolean[] conseguiti = new boolean[buoniPropositi.length];

		while (completati < buoniPropositi.length) {
			System.out.println("I tuoi buoni propositi:");
			for (int i = 0; i < buoniPropositi.length; i++) {
				if (!conseguiti[i]) {
					System.out.println((i + 1) + ". " + buoniPropositi[i]);
				}
			}

			System.out.print("Indica il numero dei buoni propositi che hai completato: ");
			int scelta = sc.nextInt();
			sc.nextLine();

			if (scelta >= 1 && scelta <= buoniPropositi.length && !conseguiti[scelta - 1]) {
				conseguiti[scelta - 1] = true;
				completati++;
				System.out.println("Hai completato: " + buoniPropositi[scelta - 1]);
			} else {
				System.out.println("Errore nella scelta o proposito già conseguito, riprova :) ");
			}
		}

		System.out.println("\nComplimenti! Hai conseguito tutti i tuoi buoni propositi.");
		sc.close();

	}

}
