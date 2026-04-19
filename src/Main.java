public class Main {

    public static void main(String[] args) {

        int[] vetorInicial = {10, 5, 8, 3, 12, 7};

        OperacoesVetor op = new OperacoesVetor(vetorInicial);

        Thread t1 = new Thread(() -> op.somaMedia(), "Thread Soma/Média");
        Thread t2 = new Thread(() -> op.ordenar(), "Thread Ordenação");
        Thread t3 = new Thread(() -> op.maiorMenor(), "Thread Maior/Menor");
        Thread t4 = new Thread(() -> op.modificar(), "Thread Modificações");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}