package hello.core.singleton;

//객체를 딱 1개만 생성하기 위해 사용
public class SingletonService {

    //private으로 new 막음
    private static final  SingletonService instance = new SingletonService();
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
