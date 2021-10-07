class Datatype{
    public static void main(String[] args){
      //정수형
      byte b;
      b = 127;
      //b = 128; //error발생

      int i = 5;
      System.out.println(i); //5
      System.out.println(5); //컴파일러가 5를 int로 판단

      //long lo1 = 12345678901234;
      long lo2 = 12345678901234L;

      //실수형
      double d = 45.67;
      System.out.println(d); //45.67

      //i = 45.67; //error 발생
      System.out.println(45.67F);

      //문자형
      char c;
      c = 'A';
      c = 49; //'1'과 같음
      System.out.println(c);

      c = 44032; //'가'와 같음
      System.out.println(c);

      //논리형
      boolean flag;
      flag = true; //한 글자라도 대문자가 들어가면  error 발생

      //자료형 변환
      //자동 형변환 byte -> short -> int -> long -> float -> double
      //		         char ->

      i = b;
      d = i;
      System.out.println(b); //127
      System.out.println(i); //127
      System.out.println(d); //127.0
      i = c; //'가'의 utf-16값이 i에 대입
      System.out.println(i); //44032

      //강제 형변환(값을 초과하면 값을 소실할 수 있으니 주의)
      i = 128;
      //b = i; //error발생
      b = (byte)i; //강제형변환연산자()
      System.out.println(b); //-128~127

      i = 129;
      b = (byte)i;
      System.out.println(b); //-127

      d = 45.67;
      i = (int)d;
      System.out.println(i); //45
    }
}