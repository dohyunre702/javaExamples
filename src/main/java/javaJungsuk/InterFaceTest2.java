package javaJungsuk;

public class InterFaceTest2 {

    //인터페이스
    interface I {
        public abstract void play();
    }

    //인터페이스 구현체
    class A {
        void autoPlay(I i) {
            i.play();
        }
    }

    //상속받은 클래스
    class B implements I{
        public void play() {
            System.out.println("play in B class");
        }
    }

    class C implements I {
        public void play() {
            System.out.println("play in C class");
        }
    }

    class InterfaceTest2 {
        public void main(String[] args) {
            A a = new A();
            a.autoPlay(new B());
            a.autoPlay(new C());
        }
    }
}
