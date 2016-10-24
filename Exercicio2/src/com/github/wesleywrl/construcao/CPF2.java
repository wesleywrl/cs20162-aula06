/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.wesleywrl.construcao;

/**
 * Algoritmo de CPF 2.
 *
 * <p>
 * Algoritmo obtido da Lista de exercícios da aula 6, da disciplina 
 * Construção de software do prof. Fábio.

 *
 */
public class CPF2 {

    /**
     * Construtor da classe CPF2.
     */
    protected CPF2() {
    }

    /**
     * Método que acessa o construtor.
     */
    public static void setCPF2() {
        CPF2 meuCpf2 = new CPF2();
    }

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
     * @throws IllegalArgumentException Se o tamanho d[], ou seja quantidade de
     * carácteres for diferentes de 11.
     */
    public static boolean verificaDigitosVerificadores(final int[] d) {

        if (d.length != TAMANHO_CPF) {
            throw new IllegalArgumentException("A entrada deve possuir 11 "
                    + "dígitos");
        }

        int c = DIGITO_8, p = d[DIGITO_9 - 1], s = d[DIGITO_9 - 1];

        while (c >= 1) {
            p = p + d[c - 1];
            s += p;
            c--;
        }

        int j = ((s % DIGITO_11VERIFICADOR) % DIGITO_10VERIFICADOR);
        int k = (((s - p + (DIGITO_9 * j)) % DIGITO_11VERIFICADOR)
                % DIGITO_10VERIFICADOR);

        return (j == d[DIGITO_10VERIFICADOR - 1]
                && k == d[DIGITO_11VERIFICADOR - 1]);
    }

}