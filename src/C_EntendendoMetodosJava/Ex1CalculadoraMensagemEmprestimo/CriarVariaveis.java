package C_EntendendoMetodosJava.Ex1CalculadoraMensagemEmprestimo;

public class CriarVariaveis {

    public static void main(String[] args) {

        int i;
        //int i;
        int I;
        //int 1a; Inválida, começa com número
        int _1a; //Não é uma boa prática, mas não dá erro de compilação
        int $aq; //Não é uma boa prática, mas não dá erro de compilação

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //sempre será 10.
        //j = 15; //Não pode mudar, apresenta erro.
        int asrn24678md;
        //int asrn246 78md; //Não pode ter espaço, dá erro
        int asrn246$78_md = 10; //Válido, mas _ e $ não é uma boa prática.
        //int asrn246%78md =10; //% não é válido.

        asrn24678md = 100;
        asrn246$78_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; Não segue as boas práticas
        final int NUMERO_TENTATIVAS = 5; //boa prática para final
        //final int numeroTentativas = 5;
        int QUANTIDAE_OPCOES = 25; //Não é final e está com nome de final, não segue boa prática.
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn246$78_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDAE_OPCOES);


    }
}