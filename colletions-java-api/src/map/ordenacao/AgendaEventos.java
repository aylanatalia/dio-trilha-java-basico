package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;
     
    
    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atracao: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("Proximo evento: " + proximoEvento.getNome() + " acontecerá: " + proximaData);
        }else{
            System.out.println("Não há próximos eventos na lista.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2025, 3, 10), "Concertos", "Samba");
        agenda.adicionarEvento(LocalDate.of(2023, 3, 12), "Shows", "Rock");
        agenda.adicionarEvento(LocalDate.of(2023, 3, 14), "Concertos", "Funk");
        agenda.adicionarEvento(LocalDate.of(2023, 3, 16), "Shows", "Pop");
        agenda.adicionarEvento(LocalDate.of(2023, 3, 18), "Concertos", "Rap");
        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }
}
