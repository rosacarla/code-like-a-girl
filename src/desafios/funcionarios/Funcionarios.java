package desafios.funcionarios;
/*
Considerando o diagrama feito para uma empresa de vendas, nesse contexto, utilize o conceito de Herança para remodelá-lo e implemente um programa que explore
o domínio em questão:

Regras:
a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor),
uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
c) Consultores ganham somente pelas horas que trabalharam.
 */

public abstract class Funcionarios {  //classe abstrata por ser classe mae
  private String nome;
  private long cpf; //poderia ser string
  protected final Double SALARIO_MINIMO = 1000.0;  //constante armazena valor de sal minimo

  //metodo construtor dos atributos
  public Funcionarios(String nome, long cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
  public abstract double calcularSalario();  //metodo abstrato recebera logica nas classes filhas

  //metodos getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getCpf() {
    return cpf;
  }

  public void setCpf(long cpf) {
    this.cpf = cpf;
  }

  public Double getSALARIO_MINIMO() {
    return SALARIO_MINIMO;
  }
}
