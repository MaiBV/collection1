import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }

        Iterator<Tarefa> iterator = tarefaList.iterator();
        while (iterator.hasNext()) {
            Tarefa t = iterator.next();
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                iterator.remove();
            }
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefaList); // Retorna uma cópia da lista de tarefas
    }
    public void obterDescricaoTarefas() {
        System.out.println(listarTarefas());
    }
}