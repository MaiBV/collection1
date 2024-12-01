public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("\nO número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer compras");
        listaTarefa.adicionarTarefa("Limpar a casa");
        System.out.println("\nO número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\nTarefas:");
        for (Tarefa tarefa : listaTarefa.listarTarefas()) {
            System.out.println(tarefa);
        }


        listaTarefa.removerTarefa("Fazer compras");

        System.out.println("\nTarefas após remoção:");
        for (Tarefa tarefa : listaTarefa.listarTarefas()) {
            System.out.println(tarefa);
        }

        System.out.println("\nNúmero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterNumeroTotalTarefas();
        listaTarefa.obterDescricaoTarefas();
        System.out.println(listaTarefa.toString());

    }
}