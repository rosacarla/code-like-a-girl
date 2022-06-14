package desafios;

import java.util.ArrayList;
import java.util.List;

/*
CLASSE MACACO:
Faça um programa e teste interativamente uma classe que modele um macaco com os
atributos “nome” e “bucho” (estômago), os métodos “comer”, “verBucho”, “digerir”.

Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de
verificar o conteúdo do estômago a cada refeição (método “comer”).
Por fim, o método “digerir” deve esvaziar o bucho do Macaco;
c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código
para que não haja nenhum Macaco canibal.
 */

public class Macaco {
  //atributos sao nome e list (barriga do macaco)
  private String nome;
  private List<String> bucho = new ArrayList<>(); //lista simula estomago pra colocar comida

  //metodos
  public void comer(String comida) {  //metodo nao retorna nda, mas imprime o que tem na barriga
    if (bucho.size() == 3) {   //condicao com metodo size() retorna qtde de elementos da lista
      System.out.println("Bucho Cheio!");
    } else {
      bucho.add(comida);  //metodo add() pra adicionar comida
    }
    System.out.println(bucho); //mostra conteudo da list bucho
  }

  public void digerir() {
    if (bucho.isEmpty()) {  //condicao com metodo isEmpty() pra ver se barriga esta vazia
      System.out.println("Bucho Vazio!"); //msg de barriga vazia
    } else {
      bucho.remove(bucho.get(0)); //metodo remove() elemento da list bucho na posicao do get()
    }
    System.out.println(bucho);  //mostra conteudo da list bucho
  }

}
