public class BoundedCounter extends Counter {
    private int max;


    // Lab 8 Challenge

    /* No-argument constructor: name="untitled", value=0, max=10 */
    public BoundedCounter() {
        super();
        max = 10;
    }

    /* Full constructor */
    public BoundedCounter(String name, int initialValue, int max) {
        super(name, initialValue);

//        if(max < 0){
//            this.max = 0;
//        }
        this.max = (max < 0) ? 0 : max;

        if(getValue() > this.max){
            reset();
            for(int i = 0; i < max; i++){
                super.increment();
            }
        }
    }

    public int getMax() {
        return max;
    }

    public boolean isAtMax() {
        return getValue() == getMax();
    }

    /* Overridden: increment only if not at max */
    @Override
    public void increment() {
//        super.increment();
//        if(isAtMax()){
//            increment();
//        }
        if (getValue() < this.max) {
            super.increment();
        }
    }

    /* Overridden: provide richer textual output */
    @Override
    public String toString() {
        return  "BoundedCounter(name=\"" + getName() + "\", value=" + getValue() + ", max=" + this.max + ")";
    }
}

