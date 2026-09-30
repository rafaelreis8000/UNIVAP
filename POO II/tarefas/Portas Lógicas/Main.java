public class Main {

    public static void main(String[] args) {

        System.out.println("===== TESTES DA PORTA =====");

        Porta p1 = new Porta();
        System.out.println(p1);

        Porta p2 = new Porta(true);
        System.out.println(p2);

        Porta p3 = new Porta(0);
        System.out.println(p3);

        Porta p4 = new Porta(1);
        System.out.println(p4);

        Porta p5 = new Porta("on");
        System.out.println(p5);

        Porta p6 = new Porta("off");
        System.out.println(p6);

        p1.on();
        System.out.println(p1);

        p1.off();
        System.out.println(p1);

        p1.not();
        System.out.println(p1);

        p1.setEstado(true);
        System.out.println(p1);

        p1.setEstado(0);
        System.out.println(p1);


        System.out.println();
        System.out.println("===== TESTES DA AND =====");

        PortaAnd and = new PortaAnd(1, 0);
        System.out.println(and);

        and.getA().off();
        System.out.println(and.and());

        and.getA().on();
        and.getB().on();
        System.out.println(and.and());

        and.setPortaAnd(1, 0);
        System.out.println(and);

        PortaAnd andString = new PortaAnd("on", "on");
        System.out.println(andString);

        PortaAnd andBoolean = new PortaAnd(true, false);
        System.out.println(andBoolean);


        System.out.println();
        System.out.println("===== TESTES DA OR =====");

        PortaOr or = new PortaOr(0, 0);
        System.out.println(or);

        or.setPortaOr(0, 1);
        System.out.println(or);

        or.setPortaOr(1, 0);
        System.out.println(or);

        or.setPortaOr(1, 1);
        System.out.println(or);

        PortaOr orString = new PortaOr("off", "on");
        System.out.println(orString);


        System.out.println();
        System.out.println("===== TESTES DO CIRCUITO INTEGRADO =====");

        CiPortasAnd ci = new CiPortasAnd(4);

        ci.getPorta(1).setPortaAnd(1, 1);
        ci.getPorta(2).setPortaAnd(1, 0);
        ci.getPorta(3).setPortaAnd(0, 1);

        System.out.println(ci);


        System.out.println();
        System.out.println("===== TESTES DA XOR =====");

        PortaXor xor = new PortaXor();

        xor.setPortaXor(0, 0);
        System.out.println(xor);

        xor.setPortaXor(0, 1);
        System.out.println(xor);

        xor.setPortaXor(1, 0);
        System.out.println(xor);

        xor.setPortaXor(1, 1);
        System.out.println(xor);


        System.out.println();
        System.out.println("===== TESTES DA NAND =====");

        PortaNand nand = new PortaNand(0, 0);
        System.out.println(nand);

        nand.setPortaAnd(0, 1);
        System.out.println(nand);

        nand.setPortaAnd(1, 0);
        System.out.println(nand);

        nand.setPortaAnd(1, 1);
        System.out.println(nand);


        System.out.println();
        System.out.println("===== TESTES DA NOR =====");

        PortaNor nor = new PortaNor(0, 0);
        System.out.println(nor);

        nor.setPortaOr(0, 1);
        System.out.println(nor);

        nor.setPortaOr(1, 0);
        System.out.println(nor);

        nor.setPortaOr(1, 1);
        System.out.println(nor);


        System.out.println();
        System.out.println("===== TESTES DA XNOR =====");

        PortaXnor xnor = new PortaXnor(0, 0);
        System.out.println(xnor);

        xnor.setPortaXor(0, 1);
        System.out.println(xnor);

        xnor.setPortaXor(1, 0);
        System.out.println(xnor);

        xnor.setPortaXor(1, 1);
        System.out.println(xnor);


        System.out.println();
        System.out.println("===== TESTE DE POLIMORFISMO =====");

        PortaAnd portaPolimorfica = new PortaNand(1, 1);

        System.out.println(
            "Objeto PortaAnd apontando para PortaNand:"
        );

        System.out.println(portaPolimorfica.and());


        PortaOr outraPortaPolimorfica = new PortaNor(0, 0);

        System.out.println(
            "Objeto PortaOr apontando para PortaNor:"
        );

        System.out.println(outraPortaPolimorfica.or());
    }
}