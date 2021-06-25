package aula01.manha.individual;

public class Exercicio2 {

    public static void main(String[] args) {
        // Empresa X - 01/01/2021 - Valor da empresa: 1,13m (148% aa)
        // Empresa Y - 01/01/2021 - Valor da empresa: 18,4m (32% aa)

        double valorEmpresaX = 1.13;
        double valorEmpresaY = 18.4;
        int ano = 2021;

        while (valorEmpresaX <= valorEmpresaY) {
            valorEmpresaX = valorEmpresaX*2.48;
            valorEmpresaY = valorEmpresaY*1.184;
            ano+=1;
            System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaX);
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaY);
        }
        System.out.println("A Empresa X ultrapassou o valor da empresa Y no ano " + ano);
    }
}
