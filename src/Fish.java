public class Fish {

   private String name;
   private String color;
   private  int age;
   private double weight;
   private String aquarium;


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public String getAquarium() {
      return aquarium;
   }

   public void setAquarium(String aquarium) {
      this.aquarium = aquarium;
   }

   public Fish(){

   }
   public  Fish (String name,String color,int age,double weight,String aquarium){

      this.name =name;
      this.color = color;
      this.age = age;
      this.weight = weight;
      this.aquarium =aquarium;
   }
}
