package com.github.wesleywrl.construcao;

import org.junit.Assert;
import org.junit.Test;

public class CPF2Test {

    int d[];

    @Test(expected = IllegalArgumentException.class)
    public void verificaPosicoesVetor() {
        d = new int[]{1, 2, 3, 4, 5, 7, 8, 9};

        CPF2.verificaDigitosVerificadores(d);
    }

    @Test
    public void resultadoEsperadoTrue() {
        d = new int[]{0, 5, 7, 2, 5, 1, 5, 9, 1, 0, 8};

        Assert.assertTrue(CPF2.verificaDigitosVerificadores(d));
    }

    @Test
    public void resultadoEsperadoFalse() {
        d = new int[]{0, 5, 7, 2, 5, 1, 5, 9, 1, 1, 8};

        Assert.assertFalse(CPF2.verificaDigitosVerificadores(d));
    }

    @Test
    public void resultadoEsperadoFalse2() {
        d = new int[]{0, 5, 7, 2, 5, 1, 5, 9, 1, 0, 9};

        Assert.assertFalse(CPF2.verificaDigitosVerificadores(d));
    }

    @Test
    public void obterCoberturaCemPorCento() {
        CPF2.setCPF2();
    }
}