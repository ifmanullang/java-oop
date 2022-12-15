package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int deret[] = new int[logic.n];
        for (int i = 0; i < logic.n; i++) {
            deret[i] = (int) Math.pow(3, i);
            this.logic.array[0][i] = String.valueOf(deret[i]);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
