package app.medias;

import java.util.Scanner;

public class AppMedias {
    public static void main(String[] args) {

                double nota1, nota2, nota3;
                int peso1, peso2, peso3;
                int opcaoMedia;
                double media;

                Scanner nota = new Scanner(System.in); //recebe input de notas e pesos

                System.out.println(" ESCOLHA UMA OPÇÃO PARA CALCULAR A MÉDIA: ");
                Scanner opcao = new Scanner(System.in);
                System.out.println("1. Média aritmética");
                System.out.println("2. Média ponderada");
                System.out.println("3. Sair");

                opcaoMedia = opcao.nextInt();  //scanner do numero da opção escolhida

                if(opcaoMedia > 3 || opcaoMedia < 1) //condicao para mensagem de opção invalida
                    System.out.println("A sua opção é inválida! Digite novamente.");

                else
                    switch (opcaoMedia){  // switch com cases das opcoes de calculo da media

                        case 1:{
                            System.out.println("\n-------------------------------------");
                            System.out.println("Informe a nota 1: ");
                            nota1= nota.nextDouble();
                            System.out.println("Informe a nota 2: ");
                            nota2= nota.nextDouble();
                            media = (nota1 + nota2) / 2;
                            System.out.println("\nA média aritmética é: " + media);
                            break;
                        }
                        case 2:{
                            System.out.println("\n-------------------------------------");
                            System.out.println("Informe a nota 1: ");
                            nota1= nota.nextDouble();
                            System.out.println("Informe o peso da nota 1: ");
                            peso1 = nota.nextInt();
                            System.out.println("Informe a nota 2: ");
                            nota2= nota.nextDouble();
                            System.out.println("Informe o peso da nota 2: ");
                            peso2 = nota.nextInt();
                            System.out.println("Informe a nota 3: ");
                            nota3= nota.nextDouble();
                            System.out.println("Informe o peso da nota 3: ");
                            peso3 = nota.nextInt();
                            media = (nota1*peso1) + (nota2*peso2) + (nota3*peso3) / (peso1+peso2+peso3);
                            System.out.println("\nA média podenderada é: " + media);
                            break;
                        }
                        case 3:{
                            System.out.println("\nSaindo do programa...");
                            break;
                        }

                    }
                }
        }














