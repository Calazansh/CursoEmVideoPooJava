public class computador {

    String marca;
    String cor;
    String processador;
    String placaVideo;
    String memoriaRam;


    void showConfiguration (){
        System.out.println("A marca é " + this.marca);
        System.out.println("As cores são " + this.cor);
        System.out.println("O processador é um "+ this.processador);
        System.out.println("Placa de video " + this.placaVideo);
        System.out.println("Ele tem " + this.memoriaRam + " de memoria Ram ");
    }
}
