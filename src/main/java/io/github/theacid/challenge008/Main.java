package io.github.theacid.challenge008;

class ReverseArray {
    public static void main(String[] args) {
        int i = 0;
        int dane[] = new int[10];

        System.out.println("Printed values from 9 - 0: ");
        for(i = 0; i < 10; i++) {
            dane[i] = 10-1-i;
            System.out.println(dane[i]);
        }
    }
}
