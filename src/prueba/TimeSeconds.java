package prueba;

public class TimeSeconds {

    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(1));
        System.out.println(solution(7500));
        System.out.println(solution(83643));

    }

    public static String solution(int T) {
        int hours = T/3600;
        int minutes = T%3600/60;
        int seconds = T%3600%60;
        return Integer.toString(hours) + "h" + Integer.toString(minutes) + "m" + Integer.toString(seconds) + "s";
    }
}
