package com.survivalcoding;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    String name;
    int HP = MAX_HP;
    int MP = MAX_MP;

    void selfAid() {
        MP -= 5;
        HP = MAX_HP;
    }

    int pray(int sec) {
        int recovery = sec + new java.util.Random().nextInt(3);
        int beforeMP = MP;
        MP = Math.min(MAX_MP, MP + recovery);
        return MP - beforeMP;
    }
}
