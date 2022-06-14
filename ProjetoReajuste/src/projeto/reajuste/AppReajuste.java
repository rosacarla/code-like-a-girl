package projeto.reajuste;

public class AppReajuste {
    public static void main(String[] args) {
        ReajustaSalario s1 = new ReajustaSalario(280, 20);
        ReajustaSalario s2 = new ReajustaSalario(699.99, 15);
        ReajustaSalario s3 = new ReajustaSalario(1445.67,10);
        ReajustaSalario s4 = new ReajustaSalario(1501, 5);

        s1.calculaReajuste();
        s2.calculaReajuste();
        s3.calculaReajuste();
        s4.calculaReajuste();

    }
}
