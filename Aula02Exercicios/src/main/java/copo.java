
public class copo {
    String marca;
    String Fabricante;
    String cor;
    float tamanho;
    float largura;
    boolean cheio;

    public  void status(){
        System.out.println("A marca do copo é "+ this.marca);
        System.out.println("O fabricante do copo é "+ this.Fabricante);
        System.out.println("A cor do copo é " + this.cor);
        System.out.println("O tamanho do copo é " + this.tamanho + " mm");
        System.out.println("A largura do copo é " + this.largura + " mm");
        System.out.println("O copo está cheio? "+ this.cheio);
    }
    public void encher () {
        if (this.cheio = false){
            System.out.println("Enchendo o copo... ");
        }
        else {
            System.out.println("Ops' nao posso encher mais, senao vou derramar no computador!!!");
        }




    }
}
