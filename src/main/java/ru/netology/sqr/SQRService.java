package ru.netology.sqr;

public class SQRService {

    public int squareNumber(int limitBelow, int limitTop) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limitBelow && i * i <= limitTop) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}

