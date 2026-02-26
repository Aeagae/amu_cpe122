public class Message {
    private String Text;
    private double Cost;
    private static int NumberofMessages = 0;
    public Message() {
        Text = "NOMESSAGE";
        Cost = 1.0;
        NumberofMessages++;
    }
    public Message(String Text, double Cost) {
        this.Text = Text;
        this.Cost = Cost;
        NumberofMessages++;
    }
    Message(Message m){
        Text = m.Text;
        Cost = m.Cost;
        NumberofMessages++;
    }
    public String toString(){
        return "Text " + Text + " Cost " + Cost;
    }
    public boolean equals(Message m){
        return Text == m.Text;
    }
    public Message append(Message m){
        Text = Text + m.Text;
        Cost = Cost + m.Cost;
        Message append = new Message(Text, Cost);
        return append;
    }
    public static int getNumberofMessages(){
        return NumberofMessages;
    }

}
