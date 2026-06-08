package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric();

        cleric.HP = 30;
        cleric.MP = 5;

        System.out.println("selfAid before: HP=" + cleric.HP + ", MP=" + cleric.MP);
        cleric.selfAid();
        System.out.println("selfAid after: HP=" + cleric.HP + ", MP=" + cleric.MP);

        int recoveredMP = cleric.pray(3);
        System.out.println("pray recovered MP=" + recoveredMP);
        System.out.println("pray after: HP=" + cleric.HP + ", MP=" + cleric.MP);
    }
}
