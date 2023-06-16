public class Main {
    public static void main(String[] args) {
        BPlus a = new BPlus();
        //Exemplo 1: Construa uma Árvore B+ para
        //(1, 4, 7, 10, 17, 21, 31, 25, 19, 20, 28, 42)
        //com n = 4.
        a.insere(42);
        a.insere(1);
        a.insere(17);
        a.insere(4);
        a.insere(10);
        a.insere(7);
        a.insere(21);
        a.insere(19);
        a.insere(31);
        a.insere(25);
        a.insere(20);
        a.insere(28);

        a.exibe();
    }
}