class Eletronico extends Produto{

    @Override
    double calcularPrecoFinal() {
        if (getPrecoBase() > 3000) {
            return getPrecoBase() + (getPrecoBase()* 0.05);
        }

        return getPrecoBase() + (getPrecoBase()* 0.1);
    }
}