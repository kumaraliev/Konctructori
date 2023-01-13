public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish("Карас", "Курон ", 4, 2.3, "Аквариум");
        System.out.println(fish.getName()+","+fish.getColor()+","+fish.getAge()+","+fish.getWeight()+","+fish.getAquarium());

    }
}