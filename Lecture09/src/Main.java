public class Main {

    public static void main(String[] args) {
        Product dress = new Product("Dress", 100, "Clothes");
        Product shirt = new Product("Shirt", 150, "Clothes");
        Product loafers = new Product("Loafers", 99, "Shoes");
        Product jeans = new Product("Jeans", 30, "Clothes");
        Product socks = new Product("Socks", 45, "Underwear");

        dress.putOnSale();
        loafers.putOnSale();

        System.out.println(dress);
        System.out.println(shirt);
        System.out.println(loafers);
        System.out.println(jeans);
        System.out.println(socks);

        dress.changeCategory("Clothes1.0");
    }
//    public static void main(String[] args) {
//        int[] student1Grades = {2,2,2,3,6};
//        int[] student2Grades = {2,4,5,2,6};
//
//        Student student1 = new Student("Arnorld", student1Grades);
//        Student student2 = new Student("Carry", student2Grades);
//
//        System.out.println(student1);
//        System.out.println(student2);
//    }


//    public static void main(String[] args) {
//        Movie theWitcher = new Movie("The witcher", "Fantasy", 4.50F);
//        Movie theMatrix = new Movie("The Matrix", "Fantasy", 6.70F);
//        Movie Barbi = new Movie("Barbi", "Drama", 3.00F);
//        Movie Bambi = new Movie("Bambi", "Sci-Fi", 3.57F);
//        Movie Cinderella = new Movie("Cinderella", "Romance", 5.60F);
//
//        System.out.println(theWitcher);
//        System.out.println(theMatrix);
//        System.out.println(Barbi);
//        System.out.println(Bambi);
//        System.out.println(Cinderella);
//    }



//    public static void main(String[] args) {
//        objectCreation();
//    }
//
//    public static void objectCreation() {
//        Cake chocolateCake = new Cake();
//        System.out.println(chocolateCake);
//
//        Cake oreoCake = new Cake();
//        System.out.println(oreoCake);
//    }
//
//    public static void classAttributes() {
//        Cake vanillaCake = new Cake();
//        vanillaCake.flavour = "Vanilla";
//        vanillaCake.layers = 3;
//        vanillaCake.price = 25.6;
//        String flavour = vanillaCake.flavour;
//        System.out.println(vanillaCake.flavour);
//        System.out.println(vanillaCake.layers);
//        System.out.println(vanillaCake.price);
//
//        Cake chocolateCake = new Cake();
//        chocolateCake.flavour = "Chocolate";
//        chocolateCake.layers = 5;
//        chocolateCake.price = 31.5;
//        System.out.println(chocolateCake.flavour);
//        System.out.println(chocolateCake.layers);
//        System.out.println(chocolateCake.price);
//    }
//
//    public static void classMethods() {
//        Cake chocolateCake = new Cake();
//        chocolateCake.flavour = "Chocolate";
//        chocolateCake.layers = 5;
//        chocolateCake.price = 31.5;
//
//        chocolateCake.printDetails();
//
//        double taxRate = 5.6;
//        double totalPrice = chocolateCake.calcTotalPrice(taxRate);
//        System.out.println(taxRate + " " + totalPrice);
//    }
//
//    public static void Constructors() {
//        Cake myCake = new Cake();
//        myCake.printDetails();
//    }
}