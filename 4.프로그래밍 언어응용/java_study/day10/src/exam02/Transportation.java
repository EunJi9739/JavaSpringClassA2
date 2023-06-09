package exam02;

public enum Transportation {
    BUS(1250){
        @Override
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    },
    //private final Transportation SUBWAY = new Transportation(1350);
    SUBWAY(1350){
        @Override
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    },
    TRAIN(5000){
        @Override
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    };

    private int basicFare;
    Transportation(int basicFare){
        this.basicFare = basicFare;
    }

    public int getBasicFare(){
        return basicFare;
    }

    public abstract int getTotalFare(int no);
}
