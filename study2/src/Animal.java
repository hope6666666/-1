public class Animal {

    int weight;

    public void move() {

        System.out.println("animal moving");


    }

    public void sleep() {

        System.out.println("animal slepping");

    }


    public static class Fish extends Animal {

        public void move() {

            System.out.println("swimming");

        }

    }

    public static class Bird extends Animal {

        public void move() {

            System.out.println("flying");

        }


    }


    public static void main(String agrs[]) {
        Animal animala = new Bird();

        animala.move();

        animala.sleep();

        Animal fishb = new Fish();

        fishb.sleep();

        fishb.move();


    }
}
