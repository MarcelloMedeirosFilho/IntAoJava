public class estruturasCondicionais {

    public static void main(String[] args) {

        int nota = 70;

        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else if (nota < 70 && nota >= 40) {
            System.out.println("Aluno na final!");
        } else if (nota < 40 && nota >= 0) {
            System.out.println("Aluno reprovado direto!");
        } else {
            System.out.println("nota invalida!");
        }
    }
}
