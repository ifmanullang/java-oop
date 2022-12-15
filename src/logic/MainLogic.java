package logic;

import logic.logic01.*;
import logic.logic02.*;

public class MainLogic {
    public static void main(String[] args) {
        System.out.println("Sample Logic 01 Soal 01");
        Logic01Soal01 logic01Soal01 = new Logic01Soal01(12);
        logic01Soal01.cetakArray();

        System.out.println("\n\nSample Logic 02 Soal 09");
        Logic02Soal09 logic02Soal09 = new Logic02Soal09(9);
        logic02Soal09.cetakArray();
    }
}


