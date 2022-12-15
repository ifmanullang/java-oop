package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal04 extends BasicLogic {
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.n; i++) {
            if(i < 2)
                this.array[0][i]= "1";
            else
                this.array[0][i]= (Integer.parseInt(this.array[0][i-1])+Integer.parseInt(this.array[0][i-2]))+"";
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
