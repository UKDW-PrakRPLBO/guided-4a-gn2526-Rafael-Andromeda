package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening {

    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penyetoran(int jumlah) {
        if (jumlah > 0) {
            int bunga = (int) bunga(jumlah);
            saldo += jumlah + bunga;
        }
    }

    private double bunga(int jumlah) {
        return jumlah * 0.005; // 0.5%
    }

    @Override
    public void penarikan(int jumlah) {
        int total = jumlah + 5000;
        if (jumlah > 0 && saldo >= total) {
            saldo -= total;
        }
    }
}