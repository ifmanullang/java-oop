package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal03Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal03Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int deret[] = new int[logic.n];
        for (int i = 0; i < logic.n; i++) {
            if (i == 0) {
                deret[i] = 0;
            }else{
                deret[i] = i*2;
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
