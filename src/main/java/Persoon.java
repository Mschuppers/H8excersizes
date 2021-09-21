public class Persoon {

    private int age;
    private String universalRights = "All humans are equal";
    //private Name name;
    private Gender gender;
    private static final int maxAge = 131;

    private String name;
//    private enum Name {
//        UNKOWN,
//        JAN_JANSSEN
//    }

    private enum Gender {
        MALE,
        FEMALE,
        UNKOWN
    }

    //CONSTRUCTORS

    public Persoon() {

    }


    public Persoon(String name, int age, Gender gender) {
        this(24);
        this.name = name;
        this.gender = gender;
    }

    public Persoon(int age) {
    age = this.age;


    }

    public Persoon(String name, Gender gender) {
        this(24);
        this.name= "Unkown";
        this.gender = Gender.UNKOWN;
    }


    //SETTERS
    public void setAge(int age) {
        this.age = age;
    }

    //GETTERS


    //MAIN
    public static void main(String[] args) {
        //Generate objects
        Persoon p = new Persoon("Jan Janssen", 42, Gender.MALE);
        Persoon q = new Persoon("Jan Janssen", 42, Gender.MALE);

        //toString the object details
        System.out.println(p);
        System.out.println(q);

        //Compare objects
        if (p.equals(q)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());

    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.gender;
    }


    @Override
    public boolean equals(Object o) {
        // typecast o to Persoon
        Persoon c = (Persoon) o;

        // Check if o is an instance of Persoon
        if (!(o instanceof Persoon)) {
            return false;
        }
        return ((Persoon) o).age == age && ((Persoon) o).name == name;

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = age * name.hashCode() * gender.hashCode();
        return result;
    }
}

