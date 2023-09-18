import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trabalhador t = new Trabalhador("aart", 10, 20, 10, false);
        
        Trabalhador t2 = new Trabalhador("arlindo", 11, 30, 10, true);
        System.out.println("Coloque o numero maximo de funcionario:");
        int tam = sc.nextInt();
        Empresas e = new Empresas(null, null, tam, null, 0, null);
        e.contratar(t);
        e.contratar(t2);
        e.ferias();
        System.out.println( e.calcularPagamento());
        System.out.println(t.isFerias());
        

    }
    

}
