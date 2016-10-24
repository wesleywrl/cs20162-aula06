/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.wesleywrl.construcao;

/**
 *  Algoritmo de CPF.
 *
 * <p>
 * Algoritmo  obtido da Lista de exercícios da aula 6, da disciplina 
 * Construção de software do prof. Fábio.
 * 
 *
 */
public class CPF {

    /**
     * Construtor da classe CPF.
     */
    protected CPF() {
    }

    /**
     * Método que acessa o construtor.
     */
    public static void setCPF() {
        CPF meuCpf = new CPF();
    }

    /**
     * Número que indica o digito 1.
     */
    public static final int DIGITO_1 = 1;

    /**
     * Número que indica o digito 2.
     */
    public static final int DIGITO_2 = 2;

    /**
     * Número que indica o digito 3.
     */
    public static final int DIGITO_3 = 3;

    /**
     * Número que indica o digito 4.
     */
    public static final int DIGITO_4 = 4;

    /**
     * Número que indica o digito 5.
     */
    public static final int DIGITO_5 = 5;

    /**
     * Número que indica o digito 6.
     */
    public static final int DIGITO_6 = 6;

    /**
     * Número que indica o digito 7.
     */
    public static final int DIGITO_7 = 7;

    /**
     * Número que indica o digito 8.
     */
    public static final int DIGITO_8 = 8;

    /**
     * Número que indica o digito 9.
     */
    public static final int DIGITO_9 = 9;

    /**
     * Número que indica o digito 10.
     */
    public static final int DIGITO_10VERIFICADOR = 10;

    /**
     * Número que indica o digito 11.
     */
    public static final int DIGITO_11VERIFICADOR = 11;

    /**
     * Número que indica o tamanho do CPF.
     */
    public static final int TAMANHO_CPF = 11;

    /**
     * Verifica se os dois últimos digitos estão válidos.
     *
     * @param d Um cpf de entrada para verificação.
     *
     * @return true para válido ou false para inválido.
     *
     * @throws IllegalArgumentException Se o tamanho d[], for diferentes de 11.
     */
    public static boolean verificaDigitosVerificadores(final int[] d) {

        if (d.length != TAMANHO_CPF) {
            throw new IllegalArgumentException("A entrada deve possuir 11 "
                    + "dígitos");
        }

        int sj = (d[DIGITO_1 - 1] + (DIGITO_2 * d[DIGITO_2 - 1]) + (DIGITO_3
                * d[DIGITO_3 - 1]) + (DIGITO_4 * d[DIGITO_4 - 1]) + (DIGITO_5
                * d[DIGITO_5 - 1]) + (DIGITO_6 * d[DIGITO_6 - 1]) + (DIGITO_7
                * d[DIGITO_7 - 1]) + (DIGITO_8 * d[DIGITO_8 - 1]) + (DIGITO_9
                * d[DIGITO_9 - 1]));

        int sk = (d[DIGITO_2 - 1] + (DIGITO_2 * d[DIGITO_3 - 1]) + (DIGITO_3
                * d[DIGITO_4 - 1]) + (DIGITO_4 * d[DIGITO_5 - 1]) + (DIGITO_5
                * d[DIGITO_6 - 1]) + (DIGITO_6 * d[DIGITO_7 - 1]) + (DIGITO_7
                * d[DIGITO_8 - 1]) + (DIGITO_8 * d[DIGITO_9 - 1]) + (DIGITO_9
                * d[DIGITO_10VERIFICADOR - 1]));

        int j = ((sj % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);

        int k = ((sk % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);

        return (j == d[DIGITO_10VERIFICADOR - 1]
                && k == d[DIGITO_11VERIFICADOR - 1]);
    }
}