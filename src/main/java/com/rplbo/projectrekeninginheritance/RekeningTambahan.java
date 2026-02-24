package com.rplbo.projectrekeninginheritance;

public class RekeningTambahan extends RekeningKeluarga {

    private static final int BATAS = 500000;

    public RekeningTambahan(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningTambahan(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah > 0 && jumlah <= BATAS) {
            super.penarikan(jumlah);
        }
    }
}