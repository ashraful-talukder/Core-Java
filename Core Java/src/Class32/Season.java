package Class32;

public enum Season {
    //WINTER(10), SUMMER(20); //we can declare like this also
    /**
     * If enum contains abstract method then those should be override like below
     * and we can access those abstract method like below commented line in main method
     */
    WINTER(10) {
        @Override
        public String dispSeason() {
            return "Winter";
        }
    }, SUMMER(20) {
        @Override
        public String dispSeason() {
            return "Summer";
        }
    };
    public int value;
    
    Season(int value){
        this.value = value;
    }
    
    public abstract String dispSeason(); //enum can have abstract method
}

class Enum1{
    
    public static void main(String[] args) {
        for (Season s : Season.values()){
            System.out.println(s + " " + s.value);
            //System.out.println(s + " " + s.value + " " + s.dispSeason());
        }
    }
}
