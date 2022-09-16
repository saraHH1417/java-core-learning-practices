package CollectionsRotaExercise27;

public enum EnumTest {
    TEST1("test 1") {
        public int getScore() {
            return 20;
        }
    },
    TEST2("test2") {
       public int getScore() {
           return 19;
       }
    },
    TEST3("test3") {
        public int getScore() {
            return 18;
        }
    };
    private EnumTest(String value) {
        System.out.println("this is constructor " + value);
    }

    public String getTest() {
        return "This is concrete method from enum";
    }

    public abstract int getScore();

}
