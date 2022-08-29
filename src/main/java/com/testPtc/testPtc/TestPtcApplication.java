package com.testPtc.testPtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TestPtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPtcApplication.class, args);

		Scanner scan = new Scanner(System.in);

		System.out.println("Veuillez entrer la longueur de la liste : ");
		Integer longueurListe = Integer.parseInt(scan.nextLine());

		System.out.println("Veuillez entrer chaque nombre de votre liste !");
		List<Integer> liste = new ArrayList<>(longueurListe);
		for(int i=0; i < longueurListe;i++){
			Integer nombre = Integer.parseInt(scan.nextLine());
			liste.add(nombre);
		}

		System.out.println("Veuillez entrer la taille des sous-liste : ");
		Integer sousListes = Integer.parseInt(scan.nextLine());
		List<List<Integer>> resultat = partition(liste,sousListes);

		System.out.println(resultat);
	}
	public static List<List<Integer>> partition(List<Integer> liste, int taille){
		List<List<Integer>> resultat = new ArrayList<>();
		for(int i=0; i < liste.size(); i = i + taille){
			if(i + taille < liste.size()) {
				resultat.add(liste.subList(i, taille + i));
			}else{
				resultat.add(liste.subList(i,liste.size()));
				break;
			}
		}
		return resultat;
	}
}
