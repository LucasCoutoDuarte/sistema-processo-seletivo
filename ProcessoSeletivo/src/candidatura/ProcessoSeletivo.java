package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
        else
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    static void imprimirCandidatos() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O Candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidato() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato: " + candidato + " solicitou o salário de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato: " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardar retorno dos demais candidatos");
        }
    }
}
