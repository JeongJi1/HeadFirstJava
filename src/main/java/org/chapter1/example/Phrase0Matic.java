package org.chapter1.example;

public class Phrase0Matic {
    public static void main(String args[]){
        //연습문제
        //자동 구문 생성기
        //단어 목록 생성
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

        //단어 목록의 갯수 확인
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //난수 발생
        java.util.Random randomGenerateor = new java.util.Random();
        int rand1 = randomGenerateor.nextInt(oneLength);
        int rand2 = randomGenerateor.nextInt(twoLength);
        int rand3 = randomGenerateor.nextInt(threeLength);

        //구문 생성
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //구문 출력
        System.out.println("What we need is a " + phrase);
    }
}
