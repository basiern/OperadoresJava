public class Operadores {
    /**
     * <h1>Métodos</h1h>
     * Esse repositório trata de estudo dos métodos na linguagem java
     * @author Eduardo Ferreira | @basiern
     * @version 1.0
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
        //vamos estudar incremento

        int numero = 5;

        //Para incrementar:
        numero = numero + 1;
        /*agora o número é 6, pois foi somado +1
        A expressão acima também pode ser utilizada em forma de incremento, conforme abaixo:
        */
        numero++;
        /*Como se utilizou uma função e um incremento, o resultado esperado deve ser 7 
        *Outra alternativa é incrementar direto na impressão, assim:
        */
        System.out.println("Quanto é 5 +1 +1 +1? " + ++ numero);
        /*O resultado deve ser 8

        Para decrementar, é só fazer o inverso:
        */
        numero = numero -1;
        numero--;
        System.out.println("Quanto é 8 -1 -1 -1? "+ -- numero);

        //agora vamos inverter uma variável boolean

        boolean luzLigada = true;
        System.out.println("A luz está ligada? " + luzLigada);

        luzLigada = !luzLigada;
        System.out.println("Agora desliguei, a luz continua ligada? " + luzLigada);

        //agora vamos estudar o ternário (condicional)

        int nota1, nota2;

        nota1 = 7;
        nota2 = 7;

        String resultado = nota1==nota2 ?"Notas iguais" : "Notas diferentes";
        //como as notas são iguais, o resultado esperado é que imprima "notas iguais"
        System.out.println("A nota 1 e nota 2 são iguais ou diferentes? " + resultado);

        //Tambem temos os operadores relacionais (maior que, menor que, igual)

        boolean igual = nota1 == nota2;
        System.out.println("A nota 1 é igual a nota 2? " + igual);

        boolean diferente = nota1 != nota2;
        System.out.println("A nota 1 é diferente a nota 2? " + diferente);

        boolean maiorque = nota1 > nota2;
        System.out.println("A nota 1 é maior que a nota 2? " + maiorque);

        //Por fim, os operadores lógicos

        /*Para esse exemplo, vamos usar o direito penal
        *A diferença entre furto e roubo é a presença de violencia OU grave ameaça
        */
        boolean graveameaca = true;
        boolean violencia = true;

        if(graveameaca||violencia){
            System.out.println("O crime é de roubo");
        } else {
            System.out.println("O crime é de furto");
        }

        }

    }
