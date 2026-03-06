abstract class Creator {
    String name;
    public Creator(String name) {
         this.name = name;
    }
    public abstract double calculateEarnings();
     public String toString() {
         return "Name : "+ name;
     }

}
