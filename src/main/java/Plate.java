public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int food) {
        if (food < this.food) {
            this.food -= food;
            return true;
        }
        System.out.println("In plate not enough food");
        return false;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("amount of food:" + food);
    }

}
