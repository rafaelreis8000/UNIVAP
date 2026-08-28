public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(
            "Caixa", "Rafael Reis", 38245209821L,
            15000, 0
        );

        ContaCorrente c2 = new ContaCorrente(
           "Caoxa" , "Jonas Brothers", 12345678911L,
            5000, 12
        );

        ContaCorrente c3 = new ContaCorrente(
            "CAixa", "Mirosmar Camargo", 45219485099L,
             5000, 150
            );

        ContaCorrente c4 = new ContaCorrente(
            "Caixa", "Robert Rasmussen", 55245876109L,
             15000, 200
            );

        ContaCorrente c5 = new ContaCorrente(
            "Caixa", "Brinos Brenous", 15602198455L,
             60000, 1500
            );

        ContaCorrente[] banco = {c1, c2, c3, c4, c5};
        float valorTotal = 0;

        for (int i = 0; i < banco.length; i++) {
            valorTotal += banco[i].getSaldo();
        }

        System.out.println("O valor total das contas é de R$" + valorTotal);
    }
}