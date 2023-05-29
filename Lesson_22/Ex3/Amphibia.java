package Lesson_22.Ex3;

public class Amphibia {
    ReturnMessage sleep = () -> "Zzzzz...";
    ReturnMessage eat = () -> "I am eating";
    ReturnMessage swim = () -> "I am swimming";
    ReturnMessage walk = () -> "I am walking";
}

@FunctionalInterface
interface ReturnMessage {
    String getMessage();
}
