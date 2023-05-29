class Fan {
    String color;
    String brand;
    int wingNum;

    void rotate() {
        System.out.println("Fan is rotating.");
    }

    void stop() {
        System.out.println("Fan is stopping.");
    }

    void blowAir() {
        System.out.println("Fan is blowing air.");
    }
}

public class FanExercise {
    public static void main(String[] args) {
        Fan ceilingFan = new Fan();
        Fan miniFan = new Fan();
        Fan standingFan = new Fan();

        ceilingFan.rotate();
        miniFan.stop();
        standingFan.blowAir();;
    }
}
