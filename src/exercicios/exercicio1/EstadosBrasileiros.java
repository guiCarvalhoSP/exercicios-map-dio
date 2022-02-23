package exercicios.exercicio1;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class EstadosBrasileiros {

    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estadosNordeste = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNordeste);


        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        if(!estadosNordeste.containsKey("PB")){
            estadosNordeste.put("PB", 4039277);
        }
        System.out.println(estadosNordeste);

        System.out.println("\nExiba a população do estado PE: ");
        System.out.println(estadosNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem em que foram informados: ");
        Map<String, Integer> estadosNordesteLinkedMap = new LinkedHashMap<>(estadosNordeste);
        System.out.println(estadosNordesteLinkedMap);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estadosNordesteTreeMap = new TreeMap<>(estadosNordeste);
        System.out.println(estadosNordesteTreeMap);

        Integer populacaoMaior = Collections.max(estadosNordeste.values());
        Integer populacaoMenor = Collections.min(estadosNordeste.values());
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry : estadosNordeste.entrySet()){
            if (entry.getValue().equals(populacaoMaior)) estadoMaiorPopulacao = entry.getKey();
            else if (entry.getValue().equals(populacaoMenor)) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", estadoMenorPopulacao, populacaoMenor);
        System.out.printf("Exiba o estado com o maior população (%s) e seu respectivo valor (%d)\n", estadoMaiorPopulacao, populacaoMaior);

        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterator = estadosNordeste.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: \n" + (soma/estadosNordeste.size()) );

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        iterator = estadosNordeste.values().iterator();
        while(iterator.hasNext()){
            if (iterator.next() < 4000000)
                iterator.remove();
        }
        System.out.println(estadosNordeste);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        estadosNordeste.clear();
        estadosNordesteLinkedMap.clear();
        estadosNordesteTreeMap.clear();
        System.out.println(estadosNordeste);

        System.out.println("\nConfira se a lista está vazia: " + (estadosNordeste.isEmpty() ? "Vazio" : "Não Vazio"));

    }
}
