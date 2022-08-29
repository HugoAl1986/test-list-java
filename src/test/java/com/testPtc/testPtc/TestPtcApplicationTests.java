package com.testPtc.testPtc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestPtcApplicationTests {
	TestPtcApplication app;

	@BeforeEach
	void setUp(){
		app = new TestPtcApplication();
	}

	@Test
	@DisplayName("test de la méthode partition")
	void testPartition() {
		// creation de la liste de résultat
		List<List<Integer>> result = new ArrayList<>(3);

		// liste initiale
		List<Integer> liste = new ArrayList<>(5);
		for(int i= 0; i< 5; i++){
			liste.add(i);
		}
		// taille des sous listes
		Integer tailleSousListe = 2;

		// insertion des nombres dans la sous liste
		List<Integer> subListe1 = new ArrayList<>(2);
		subListe1.add(0);
		subListe1.add(1);
		List<Integer> subListe2 = new ArrayList<>(2);
		subListe2.add(2);
		subListe2.add(3);
		List<Integer> subListe3 = new ArrayList<>(1);
		subListe3.add(4);

		//Ajout des listes à la liste finale
		result.add(subListe1);
		result.add(subListe2);
		result.add(subListe3);

		assertEquals(result, app.partition(liste,2));
	}
}
