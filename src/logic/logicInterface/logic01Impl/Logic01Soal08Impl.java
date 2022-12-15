package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal08Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal08Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        String[] deret = new String[logic.n];
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < logic.n; i++) {
            // genap dulu
            if (i % 2 == 0) {
                deret[i] = String.valueOf(huruf);
            } else {
                deret[i] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
            this.logic.array[0][i] = String.valueOf(deret[i]);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();

    }
}
