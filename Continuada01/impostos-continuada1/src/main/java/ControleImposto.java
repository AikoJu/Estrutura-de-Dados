import java.util.ArrayList;
import java.util.List;

public class ControleImposto {
    List<IImposto> impostos = new ArrayList<>();

    public void adicionarImposto(IImposto imposto){
        impostos.add(imposto);
    }

    public void listarTodos(){
        for (IImposto i : impostos){
            System.out.println(i);
        }
    }
    public Double getTotalValorImpostos(){
        Double total = 0.0;
        for (IImposto i : impostos){
            total += i.getValorImposto();
        }
        return total;
    }
}
