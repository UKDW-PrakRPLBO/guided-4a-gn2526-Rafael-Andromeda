package com.rplbo.projectrekeninginheritance;

public class RekeningUtama extends RekeningKeluarga {

    private static final int BATAS = 3000000;

    public RekeningUtama(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningUtama(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah > 0 && jumlah <= BATAS) {
            super.penarikan(jumlah);
        }
    }
}