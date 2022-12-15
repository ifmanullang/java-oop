package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal04Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal04Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int deret[] = new int[logic.n];
        // 1  1  2  3  5  8 13  21
        for (int i = 0; i < logic.n; i++) {
            if (i == 0 || i == 1) {
                // deret ke i => 0, 1
                deret[i] = 1;
            } else {
                deret[i] = deret[i - 1] + deret[i - 2];
            }
            this.logic.array[0][i] = String.valueOf(deret[i]);
        }
    }

    @Override
    public void cetakArray() {
this.isiArray();
this.logic.printSingle();
    }
}
