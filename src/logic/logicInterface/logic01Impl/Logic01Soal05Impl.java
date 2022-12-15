package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int deret[] = new int[logic.n];
        // 1  1  1  3  5  9  17  31  57
        for (int i = 0; i < logic.n; i++) {
            if (i == 0 || i == 1 || i == 2) {
                // deret ke i => 0, 1
                deret[i] = 1;
            } else {
                deret[i] = deret[i - 1] + deret[i - 2] + deret[i - 3];
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
