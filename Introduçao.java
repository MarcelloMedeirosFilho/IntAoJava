public class Introduçao {

    public static void main(String[] args) {
        //Variáveis/String
        String name = "Marcello";
        System.out.println("olá, " + name);
        
        //ou 
        String nome;
        nome = "Menezes";
        System.out.println("olá, " + nome);

        //int,byte,short,long /Numeros inteiros
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a/b;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        //booleam /V ou F
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //Tabela verdade
        //operador && (and)
        //true && true = true
        //true && false = false
        //false && true = false 
        //false && false = false

        //operador || (or)
        //true || true = true
        //true || false = true
        //false || true = true 
        //false || false = false
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "não é fim de semana";
        System.out.println(mensagem);
    }
}