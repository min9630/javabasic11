package org.example.encap;

import org.example.inter.Danceable;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;
import static org.example.encap.Grade.LOW;

public abstract class Dancer implements Danceable{
    //abstract class : 추상 클래스
    //추상화 : 구체적으로 객체한테 할 일을 명시
    public Dancer(String crewName, Grade grade, String myName) {
        this.crewName = crewName;
        this.grade = grade;
        this.myName = myName;
    }

    private String crewName; //팀의 이름
    Grade grade = LOW; //실력
    String myName; //내 이름

    private double height;//키

  //  public Dancer() {

    //}
    //스트레칭
    private void stretch(){
        out.println(myName+"이 몸을 풉니다");
    }
    //유연성 연습
    private void moreFlexible(){
        out.println(myName+"이 다리를 찢습니다");
    }


        //moreFlexible();
        //춤출때  스트레칭과 다리를 찢게함
        //캡슐화 : 데이터를 지키기 위해, 객체보호를 위해
        //out.println(myName+"이 춤을 춥니다");

    public void setHeight(double height) {
        if(height <=130 || height >= 250){
            this.height = 160;
            return;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        //toString 재정의
        return "Dancer{" +
                "crewName='" + crewName + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }
}
