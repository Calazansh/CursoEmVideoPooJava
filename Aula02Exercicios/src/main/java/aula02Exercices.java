public class aula02Exercices {
    public static void main(String[] args) {
        computador c1 = new computador();

        c1.marca = "MSI";
        c1.cor = "Preto e vermelho";
        c1.processador = "i7 quinta geracao";
        c1.placaVideo = " GTX 960";
        c1.memoriaRam = " 16GB";

        copo b1 = new  copo();

        b1.marca = "Sem marca";
        b1.cor = "Azul";
        b1.Fabricante = "Eu mesmo";
        b1.largura = 6.5f;
        b1.tamanho = 10.5f;

            c1.showConfiguration();
            System.out.println("-------------------------------------");

            b1.status();
            b1.encher();

    }
}
