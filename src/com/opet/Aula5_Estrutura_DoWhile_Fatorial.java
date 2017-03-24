package com.opet;

import com.opet.util.Reader;
public class Aula5_Estrutura_DoWhile_Fatorial
{

    public static void main(String[] args) throws Exception
    {
        int numeroAnterior = 0;
        int soma = 0;

        System.out.print("Insira um número:");
        int numeroUsuario = Reader.readInt();
        int i=numeroUsuario;
        do {
                numeroAnterior = numeroUsuario-(numeroUsuario-i)-1;
                soma=soma+(numeroUsuario*numeroAnterior);
                System.out.println(numeroUsuario+" * "+
                  numeroAnterior+": "+(numeroUsuario*numeroAnterior));
                soma=soma+(numeroUsuario*numeroAnterior);
            System.out.println("Fatorial de "+numeroUsuario+" é "+soma);
            i--;
        } while(i>0);

    }

}
