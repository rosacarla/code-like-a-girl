package desafios;

import java.util.Scanner;

/*
NÚMERO REVERSO:
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos).
A saída deverá ser o reverso de um número inteiro informado.
Por exemplo: para entrada 3257, a resposta será 7523.

Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que deve conter 4
dígitos e continuar a programação até a resposta final.
 */
public class NumeroReverso {  //classe principal

  public static void numeroReverso() {  //metodo executa entrada e verificação
    Scanner scan = new Scanner(System.in);  //instanciado objeto do tipo scanner para entrada de dado via teclado
    do {  //laço do-while para verificar intervalo correto do nro
      System.out.println("Informe um número inteiro e positivo (que deve conter 4 dígitos): ");
      int numeroInformado = scan.nextInt(); //recebe nro e salva na variavel
      String numeroInformadoString = String.valueOf(numeroInformado); //metodo estatico valueOf tranforma nro inteiro em string
      if(numeroInformado >= 1000 && numeroInformado <= 9999) {  //condicao a verificar de intervalo do nro
        StringBuilder stringBuilder = new StringBuilder(numeroInformadoString); //classStringBuilder tem metodo reverse
        System.out.println(stringBuilder.reverse()); //chamada do metodo reverse
        break;  //interrompe o laço
      } else if(numeroInformadoString.length() < 4) {  //condicao para tamanho do nro, metodo length() verifica tam.
        System.out.println("O número informado deve conter 4 dígitos!"); //msg para condicao nao atendida
      }
    } while(true);
  }
}
