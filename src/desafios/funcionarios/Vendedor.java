package desafios.funcionarios;

public class Vendedor extends Funcionarios {  //classe filha de Funcionario
  private double comissao;
  private long numeroVendas;

  public Vendedor(String nome, long cpf, double comissao, long numeroVendas) {
    super(nome, cpf);  //atributos herdados de Funcionario
    this.comissao = comissao;
    this.numeroVendas = numeroVendas;
  }

  @Override
  public double calcularSalario() {
    return super.SALARIO_MINIMO + (this.comissao * this.numeroVendas); //super indica a heranca da constante
  }

  //metodos getters e setters
  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public long getNumeroVendas() {
    return numeroVendas;
  }

  public void setNumeroVendas(long numeroVendas) {
    this.numeroVendas = numeroVendas;
  }
}
