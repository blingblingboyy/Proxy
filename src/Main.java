public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("teste_10mb.jpg");

        //Imagem vai carregada do disco
        image.display();
        System.out.println();

        //Imagem não vai ser carregada
        image.display();
    }
}