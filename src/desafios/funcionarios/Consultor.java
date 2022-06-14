package desafios.funcionarios;

public class Consultor extends Funcionarios { //classe filha de Funcionario
  private double valorHora;
  private long horasTrabalhadas;

  //metodo construtor
  public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
    super(nome, cpf);  //atributos herdados de Funcionario
    this.valorHora = valorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  @Override
  public double calcularSalario() {
    return valorHora * horasTrabalhadas;
  }

  //metodos getters e setters
  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public long getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(long horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }
}
