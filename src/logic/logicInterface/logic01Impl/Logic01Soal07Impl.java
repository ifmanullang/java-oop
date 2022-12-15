package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal07Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        String[] deret = new String[logic.n];
        char huruf = 'A';
        // isi array
        for (int i = 0; i < logic.n; i++) {
            deret[i] = String.valueOf(huruf);
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
