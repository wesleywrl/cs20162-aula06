/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.wesleywrl.construcao;

/**
 * Algoritmo de CPF 3(forma).
 * <p>
 * Algoritmo obtido da Lista de exercícios da aula 6, da disciplina 
 * Construção de software do prof. Fábio .
 * 
 */
public class CPF3 {

    /**
     * Construtor da classe CPF2.
     */
    protected CPF3() {
    }

    /**
     * Método que acessa o construtor.
     */
    public static void setCPF3() {
        CPF3 meuCpf3 = new CPF3();
    }

    /**
     * Número que indica o primeiro digito.
     */
    public static final int DIGITO_1 = 1;

    /**
     * Número que indica o segundo digito.
     */
    public static final int DIGITO_2 = 2;

    /**
     * Número que indica o terceiro digito.
     */
    public static final int DIGITO_3 = 3;

    /**
     * Número que indica o quarto digito.
     */
    public static final int DIGITO_4 = 4;

    /**
     * Número que indica o quinto digito.
     */
    public static final int DIGITO_5 = 5;

    /**
     * Número que indica o sexto digito.
     */
    public static final int DIGITO_6 = 6;

    /**
     * Número que indica o setimo digito.
     */
    public static final int DIGITO_7 = 7;

    /**
     * Número que indica o oitavo digito.
     */
    public static final int DIGITO_8 = 8;

    /**
     * Número que indica o nono digito.
     */
    public static final int DIGITO_9 = 9;

    /**
     * Número que indica o décimo digito.
     */
    public static final int DIGITO_10VERIFICADOR = 10;

    /**
     * Número que indica o décimo primeiro digito.
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

        int c = DIGITO_8, p = d[DIGITO_9 - 1], s = d[DIGITO_9 - 1];

        p = p + d[DIGITO_8 - 1];
        s += p;

        p = p + d[DIGITO_7 - 1];
        s += p;

        p = p + d[DIGITO_6 - 1];
        s += p;

        p = p + d[DIGITO_5 - 1];
        s += p;

        p = p + d[DIGITO_4 - 1];
        s += p;

        p = p + d[DIGITO_3 - 1];
        s += p;

        p = p + d[DIGITO_2 - 1];
        s += p;

        p = p + d[DIGITO_1 - 1];
        s += p;

        int j = ((s % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);
        int k = (((s - p + (DIGITO_9 * j))
                % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);

        return (j == d[DIGITO_10VERIFICADOR - 1]
                && k == d[DIGITO_11VERIFICADOR - 1]);
    }
}