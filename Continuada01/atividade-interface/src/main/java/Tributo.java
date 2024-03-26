import java.util.ArrayList;

public class Tributo {
    private ArrayList<Tributavel> listTrib;

    public Tributo() {
        this.listTrib = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t){
        listTrib.add(t);
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;

        for (Tributavel t: listTrib){
            total += t.getValorTributo();
        }

        return total;
    }

    public void exibeTodos(){
        for (Tributavel t: listTrib){
            System.out.println(t);
        }
    }
}
