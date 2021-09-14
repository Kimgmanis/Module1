public class Console {
    public static void main(String[] args) {
        Animal snake = new Animal("Snake", 9, 9);
        Animal rabbit = new Animal("Rabbit", 2,2);

        rabbit.getInfo();

        rabbit.translate(1,1);

        snake.getInfo();

        snake.translate(-1,-1);

        rabbit.getInfo();

        rabbit.translate(1,1);

        snake.getInfo();

        snake.translate(-1,-1);

        rabbit.getInfo();

        rabbit.translate(1,1);

        snake.getInfo();

        snake.translate(-1,-1);

        rabbit.getInfo();

        rabbit.translate(1,1);

        snake.getInfo();

        snake.translate(-1,-1);

        System.out.println("Nooooo Please don't eat me!!");

        snake.getInfo();

        snake.translate(-1,-1);

        System.out.println("Ahhrrrrrr im eating you ha ha!");

    }
}
