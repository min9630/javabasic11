package org.example.encap;

import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DancerTest {
    
    @Test
    void danceTest(){
        //Dancer dancer = new Dancer("서울짱크루", Grade.HIGH, "춤신춤왕");
        //추상화로 인해 객체생성 제한
        //dancer.dance();
        //dancer.setHeight(178);

        //System.out.println("dancer = " + dancer);
        //dancer뒤 .toString이 붙어있음


    }

    @Test
    void idolTest(){
        IdolDancer jungguk = new IdolDancer("BTS", Grade.HIGH, "정국");
        jungguk.dance();

        StreetDancer park = new StreetDancer("을지로크루", Grade.MIDDLE, "박춤꾼");
        park.dance();

        System.out.println("jungguk = " + jungguk);
        //정국이한테 toString이 없으면 Dancer거 받아씀
    }


    @Test
    void teamTest(){
        PerformanceTeam team = new PerformanceTeam();

        Dancer kim = new IdolDancer("동방신기", Grade.HIGH, "영웅재중");

        Dancer mokama = new StreetDancer("말발굽", Grade.HIGH, "김목마");
        //다형성
        //부모의 타입 사용가능


        team.addDancer(kim);
        team.addDancer(mokama);


    }

}