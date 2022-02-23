package exercicios.desafio;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Desafio {
    public static void main(String[] args) {

        Random geradorRandom = new Random();
        List<Integer> listaNumeros = new ArrayList<>();

        int qtdLancamentos = 100;

        for(int i = 0; i < qtdLancamentos; i++){
            listaNumeros.add(geradorRandom.nextInt(10));
        }

        Map<Integer, Integer> numeros = new HashMap<>();
        for (Integer valores : listaNumeros){

            if (numeros.containsKey(valores)){
                numeros.put(valores, (numeros.get(valores) + 1));
            } else {
                numeros.put(valores, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : numeros.entrySet()){
            System.out.printf("\nO número (%d) foi lançado (%d) vezes", entry.getKey(), entry.getValue());
        }
    }
}
