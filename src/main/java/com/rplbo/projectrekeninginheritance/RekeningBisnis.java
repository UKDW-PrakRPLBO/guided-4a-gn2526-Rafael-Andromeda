package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningBisnis(Nasabah nasabah, int saldo) {
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
        return jumlah * 0.01; // 1%
    }
}