package orderArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class OrderArray {
	int min = 1;
	int max = 50;

	int[] arr = { 32, 47, 41, 7, 47, 9, 36, 32, 20, 15, 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43 };

	public static void main(String[] args) {
		OrderArray orderArray = new OrderArray();
		Random gerador = new Random();
		List<Integer> numeros = new ArrayList<>();
		List<Integer> numerosOriginal = new LinkedList<Integer>();
		
		for (int i = orderArray.min; i < orderArray.max; i++) {
			int num = gerador.nextInt(51);
			if (num >= orderArray.min && num <= orderArray.max) {
				numeros.add(num);
			}
		}

		for (int i = 0; i < orderArray.arr.length; i++) {
			// System.out.println("Lista original -1: " + orderArray.arr[i]);
			numerosOriginal.add(orderArray.arr[i]);
		}
		System.out.println("Lista original:" + numerosOriginal);

		// System.out.println("Lista sem ordem:" + numeros);
		Collections.sort(numeros);
		// System.out.println("Lista com ordem:" + numeros);
		Set<Integer> notNumeros = new LinkedHashSet<>();
		numeros.forEach(i -> {
			if (!(numerosOriginal.contains(i))) {
				notNumeros.add(i);
			}
		});

		System.out.println("Númemos não contidos:" + notNumeros);
	}
}
