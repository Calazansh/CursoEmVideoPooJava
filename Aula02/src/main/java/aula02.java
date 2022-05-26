public class aula02 {
    public static void main(String[] args) {
        caneta c1 = new caneta();

        c1.modelo = " bic";
        c1.cor = "azul";
        c1.ponta =0.5f;
        c1.tampada = false;

        c1.destampar();
        c1.status();
        c1.rabiscar();
    }


}
