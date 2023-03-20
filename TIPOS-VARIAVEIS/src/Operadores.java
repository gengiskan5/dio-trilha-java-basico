public class Operadores {
    public static void main(String[] args) {

        boolean condicao1=true;

        boolean condicao2=true;

        if (condicao1 && condicao2){
            System.out.println(" as duas condiçoes sao verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println(" Uma das condiçoes è verdadeira");
        }

        System.out.println("fim");









        System.out.println("----------------------------------");
        String nomeUm = "Alexandro";

        // Compara objetos
        String nomeDois =  new String("Alexandro");

        System.out.println(nomeUm.equals(nomeDois));


        System.out.println("-----------------------");
       int numero1 = 1;
       int numero2 = 2;

       if (numero1 == numero2){
           System.out.println("a nossa condição é verdadeira");
       }

       boolean simNao = numero1 == numero2;

        System.out.println("Numeroum é igual a numerodois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numeroum é diferente a numerodois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numeroum é maior  que numerodois? " + simNao);
    }
}
