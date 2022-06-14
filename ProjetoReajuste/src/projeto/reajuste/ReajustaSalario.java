package projeto.reajuste;

public class ReajustaSalario {
    private double salarioAtual;
    private double aumento;

    //construtor
    public ReajustaSalario() {
    }

    //construtor da classe
    public ReajustaSalario(double salarioAtual, double aumento) {
        this.salarioAtual = salarioAtual;
        this.aumento = aumento;
    }

    //getters e setters


    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    //metodo para calcular salário
    public void calculaReajuste() {
        double reajuste = 0;

        if (this.getSalarioAtual() <= 280) {
            reajuste = this.getSalarioAtual() * 0.20f;

        } else if (this.getSalarioAtual() > 280 && this.getSalarioAtual() <= 700) {
            reajuste = this.salarioAtual * 0.15f;

        } else if (this.getSalarioAtual() < 700 && this.getSalarioAtual() < 1500) {
            reajuste = this.getSalarioAtual() * 0.10f;

        } else {
            reajuste = this.getSalarioAtual() * 0.05f;
        }
        double salAtual = this.getSalarioAtual() + reajuste;

        System.out.println("Salário antes do reajuste: R$ " + this.getSalarioAtual());
        System.out.println("Percentual de aumento: " + this.getAumento() + " %");
        System.out.println("Valor do aumento: R$ " + String.format("%.2f", reajuste));
        System.out.println("Salário reajustado: R$ " + String.format("%.2f", salAtual));
        System.out.println("---------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "ReajustaSalario{" +
                "salarioAtual=" + salarioAtual +
                ", aumento=" + aumento +
                '}';
    }
}



