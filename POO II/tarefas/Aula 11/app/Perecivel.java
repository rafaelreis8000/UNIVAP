import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Perecivel extends Produto{

    private LocalDate validade;

    // Get e set para validade

    public LocalDate getValidade() {
        return this.validade;
    } public void setValidade(LocalDate validade) {

        if (validade.isBefore(validade)) {
            throw new IllegalArgumentException("A data não pode ser anterior à de hoje!");
        }

        this.validade = validade;
    }

    // retorno de preço final com checagem de validade
    @Override
    double calcularPrecoFinal() {

        LocalDate hoje = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(hoje, validade);
        
        if (dias >= 5) {
            return getPrecoBase();
        }

        return (getPrecoBase() - (getPrecoBase() * 0.15));
    }
}
