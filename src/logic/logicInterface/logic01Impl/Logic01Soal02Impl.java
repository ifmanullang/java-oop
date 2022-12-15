package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal02Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal02Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int deret [] = new int[logic.n];
        for (int i = 0; i < logic.n; i++) {
            if (i == 0) {
                deret[i] = 1;
            } else if (i == 1) {
                deret[i] = 3;
            } else if (i % 2 == 0) {
                deret[i] = deret[i - 2] + 1;
            } else {
                deret[i] = deret[i - 2] + 3;
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
