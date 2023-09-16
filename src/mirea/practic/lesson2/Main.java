package mirea.practic.lesson2;

public class  Main {
    public static void main(String[] args){
        Author chel = new Author("Jhon", "jh@gmail.com", 'm');
        System.out.println(chel.toString());
        Ball ball = new Ball(3.2, 11.5);
        System.out.println(ball.toString());
        ball.move(1.1, -15.9);
        System.out.println(ball.toString());
    }
}
