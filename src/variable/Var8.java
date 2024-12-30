package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수 기본적으로 int 사용
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483647 (약 20억)

        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수 float << double 기본적으로 double 사용
        float f = 10.0f;
        double d = 10.0;

        //char 거의 안씀 String "a"처럼 쓴다
        // int byte long double String만 사용

        //변수 이름 숫자로 시작x

        //변수 이름의 시작은 소문자 그 뒤에 단어는 대문자 시작 ex) my account ->> myAccount
        //클래스의 이름 시작은 대문자, 상수는 모두 대문자, 패키지는 모두 소문자
    }
}
