import desafios.Macaco;
import desafios.NumeroReverso;
import desafios.desafio.JogoCraps;
import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

public class Main {
  public static void main(String[] args) {
    /*
    System.out.println("(1) Resolução do exercício 'Número Reverso'");
    NumeroReverso.numeroReverso();
    System.out.println("--------------------------------------------------------------------\n");

    System.out.println("(2) Resolução do exercício 'Classe Macaco'");
    Macaco macaco1 = new Macaco();  //instanciado o 1o. macaco
    Macaco macaco2 = new Macaco();  //instanciado o 2o. macaco

    //alimentado o macaco1
    System.out.println("Macaco1 comendo...");
    macaco1.comer("banana");
    macaco1.comer("banana");
    macaco1.comer("banana");
    macaco1.comer("banana");

    //alimentado o macaco2
    System.out.println("Macaco2 comendo...");
    macaco2.comer("pêra");
    macaco2.comer("uva");
    macaco2.comer("maçã");

    System.out.println("------");

    System.out.println("Macaco1 digeriu...");
    macaco1.digerir();
    macaco1.digerir();
    macaco1.digerir();
    macaco1.digerir();
    System.out.println("Macaco2 digeriu...");
    macaco2.digerir();
    macaco2.digerir();
    macaco2.digerir();
    macaco2.digerir();
    System.out.println("--------------------------------------------------------------------\n");
    */
/*
    System.out.println("(3) Resolução do exercício 'Classe Funcionários'");
    Vendedor vendedor = new Vendedor("Carla Vendedora", 123456789L, 10d, 5);
    System.out.println(vendedor.getNome());
    System.out.println("Salário: R$ " + vendedor.calcularSalario());

    Consultor consultor = new Consultor("Alex Consultor", 789456123L, 100.5d, 10);
    System.out.println(consultor.getNome());
    System.out.println("Salário: R$ " + consultor.calcularSalario());
    System.out.println("--------------------------------------------------------------------\n");
*/
    JogoCraps.jogar();

  }
}