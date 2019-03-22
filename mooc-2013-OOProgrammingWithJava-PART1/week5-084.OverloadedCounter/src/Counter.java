
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.check = false;
        this.value = startingValue;
    }

    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }

    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount > 0) {
            this.value = this.value - decreaseAmount;
            int temp = this.value;
            if (this.check == true) {
                if (temp < 0) {
                    this.value =0;
                }
            }
        }

    }

}
