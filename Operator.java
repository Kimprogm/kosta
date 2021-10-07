class Operator{
    public static void main(String[] args){
        //산술연산자 +, -, *, /, %
        int a, b, c;
        a = 2;
        b = 3;
        c = a + b; //5
        c = a/b; //0
        double c1 = a/b; //0.0
        double c2 = (double)a/b; //0.5

        short s1, s2, s3; //int보다 작은 자료형은 산술연산이 불가능. 산술연산시 int로 자동형변환 됨
        s1 = 2;
        s2 = 3;
        //s3 = s1 + s2; //error 발생
        s3 = (short)(s1 + s2);

        //증감연산자 ++, --

        //대입연산자 =, +=, -=, *=, /=, %=

        //비교연산자 >, <, >=, <=, ==, !=

        //논리연산자 &, &&, |, ||, !
        
        //삼항연산자 ? : ;
        a = 2;
        b = 3;
        c = a < b ?10 :20;
        System.out.println(c); //10
        c = a == b ?10 :20;
        System.out.println(c); //20
        
        //성별값이 1이거나 3인 경우엔 남자,그 외의 경우엔 여자를 출력
        int gend = 3;
        System.out.println(gend == 1 || gend == 3 ?"남자" :"여자");
        
        //홀수값인 경우에 남자
        gend = 1;
        System.out.println(gend % 2 == 1 ?"남자" :"여자");
    }
}