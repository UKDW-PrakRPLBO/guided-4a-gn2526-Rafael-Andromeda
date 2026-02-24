package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening {

    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah > 0) {
            int biaya = 0;

            if (jumlah > 100000) {
                biaya = 1000;
            }

            int total = jumlah + biaya;

            if (saldo >= total) {
                saldo -= total;
            }
        }
    }

    public void sedekah(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
        }
    }
}