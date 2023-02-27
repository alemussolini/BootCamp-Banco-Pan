package edu.alessandro.AnatomiaDasClasses;

public class MinhaClasse {
    
    public static void main (String [] args ){

        String primeiroNome = "Alessandro";
        String segundoNome = "Mussolini";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

       /*  System.out.println("Hello World"); */

       /* String meuNome = "Alessandro";
          int anoFabricacao = 2022;
          boolean verdadeira = true;
          anoFabricacao = 2018;
        */
    }
       

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        
        /* METODOS
         * ESTRUTURA
         * TipoRetorno NomeObjetivoNoInfinito Parametro(s)
         * EXEMPLO
         * int somar (int numeroUm, int numero2)
         * String formatarCep (long cep)
         */

             return primeiroNome.concat(" ").concat(segundoNome);
         }


    
}
