package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class IdolDancer extends Dancer {
    //댄서의 기능 쓸 수 있음 -> 댄서 개념 확장
    public IdolDancer(String crewName, Grade grade, String myName) {
        //상위 클래스에 기본 생성자가 없을 때
        super(crewName, grade, myName);//super호출은 첫줄에 있어야함
    }

    @Override
    //오버라이딩 : 겉은 똑같아야됨
    //안에 내용 추가 가능
    public void dance() {
        //super.dance();
        System.out.println("윙크를 갈깁니다");
    }
}
