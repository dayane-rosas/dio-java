public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Dayane";
        String segundoNome = "Rosas";
        String terceiroNome = " de Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome, String terceiroNome) {
        return "Resultado do método é: " + primeiroNome.concat(" ").concat(segundoNome).concat(terceiroNome);

    }

}
