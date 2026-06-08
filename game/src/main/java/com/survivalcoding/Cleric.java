package com.survivalcoding;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    String name;
    int HP = MAX_HP;
    int MP = MAX_MP;

    void selfAid() {
        // 셀프 에이드는 MP를 5 소비해서 자신의 HP를 최대 HP까지 회복한다.
        MP -= 5;
        HP = MAX_HP;
    }

    int pray(int sec) {
        // 인수 sec는 기도할 시간(초)이다.
        // 회복량은 기도한 시간(sec)에 0~2 사이의 랜덤 보정을 더한 값이다.
        int recovery = sec + new java.util.Random().nextInt(3);

        int beforeMP = MP;

        // 회복 후 MP가 최대 MP를 넘지 않도록 제한한다.
        MP = Math.min(MAX_MP, MP + recovery);

        // 리턴 값은 실제로 회복된 MP 양이다.
        return MP - beforeMP;
    }
}
