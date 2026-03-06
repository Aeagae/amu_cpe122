public class Writer extends Creator {
    private int articlesPublished;
    public Writer(String name ,int articlesPublished) {
        super(name);
        this.articlesPublished = articlesPublished;
    }
    @Override
    public double calculateEarnings(){
        return articlesPublished * 20;
    }
    public String toString() {
        return super.toString() + "Articles published: " + articlesPublished + "Earnings"+ calculateEarnings();
    }
}
