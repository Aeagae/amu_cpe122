public class Youtuber extends Creator {
    private int views;
    public Youtuber(String name , int views) {
        super(name);
        this.views = views;
    }
    @Override
    public double calculateEarnings(){
        return views*0.01;
    }
    public String toString(){
        return super.toString() + "views: " + views + "Earnings: " + calculateEarnings();
    }
}
