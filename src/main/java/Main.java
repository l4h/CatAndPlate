public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Timon", 15),
                new Cat("Murka", 35),
                new Cat("Tomas", 15),
                new Cat("zazulya", 80),
                new Cat("NotCatBuhHungryNeighbor", 1000)
        };

        Plate plate = new Plate(200);

        for (Cat oneCat : cats) {
            oneCat.eat(plate);
            System.out.println("Кот " + oneCat.getName() + " сыт:" + oneCat.isSatiety());
            plate.info();
        }
        //накормим соседа
        plate.increaseFood(1000);
        cats[4].eat(plate);
        System.out.println("Кот " + cats[4].getName() + " сыт:" + cats[4].isSatiety());
    }


}
