import java.util.Arrays;
import java.util.Random;

public class OperacoesVetor {

    private int[] vetor;

    public OperacoesVetor(int[] vetorInicial) {
        this.vetor = vetorInicial;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public void somaMedia() {
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        double media = (double) soma / vetor.length;

        System.out.println(Thread.currentThread().getName() + " -> Soma: " + soma + " | Média: " + media);
    }

    public void ordenar() {
        Arrays.sort(vetor);

        System.out.println(Thread.currentThread().getName() + " -> Vetor ordenado: " + Arrays.toString(vetor));
    }

    public void maiorMenor() {
        int maior = vetor[0];
        int menor = vetor[0];

        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println(Thread.currentThread().getName() + " -> Maior: " + maior + " | Menor: " + menor);
    }

    public void modificar() {
        Random rand = new Random();

        // Adicionar número aleatório
        int novo = rand.nextInt(100);
        int[] novoVetor = Arrays.copyOf(vetor, vetor.length + 1);
        novoVetor[vetor.length] = novo;
        vetor = novoVetor;

        System.out.println(Thread.currentThread().getName() + " -> Número adicionado: " + novo);

        // Remover elemento aleatório
        if (vetor.length > 0) {
            int indiceRemover = rand.nextInt(vetor.length);

            int[] vetorTemp = new int[vetor.length - 1];
            int j = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (i != indiceRemover) {
                    vetorTemp[j] = vetor[i];
                    j++;
                }
            }

            vetor = vetorTemp;

            System.out.println(Thread.currentThread().getName() + " -> Removeu índice: " + indiceRemover);
        }

        // Contar pares
        int pares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                pares++;
            }
        }

        System.out.println(Thread.currentThread().getName() + " -> Quantidade de pares: " + pares);

        System.out.println(Thread.currentThread().getName() + " -> Vetor final: " + Arrays.toString(vetor));
    }
}