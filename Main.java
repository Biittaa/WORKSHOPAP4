import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingsystem = new VotingSystem();
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("youtube");
        choices1.add("spotify");
        choices1.add("instagram");
        choices1.add("whatsapp");
        choices1.add("google maps");
        votingsystem.createVoting("what's your favorite app?", false, 1, choices1);
        Person p1 = new Person("Sam", "Brown");
        Person p2 = new Person("Mike", "Jones");
        Person p3 = new Person("Thomas", "Walker");
        Person p4 = new Person("Olivia", "Johnson");
        ArrayList<String> pchoice = new ArrayList<>();
        pchoice.add("whatsapp");
        votingsystem.vote(0,p1,pchoice);
        pchoice.add("youtube");
        votingsystem.vote(0,p2,pchoice);
        pchoice.add("spotify");
        votingsystem.vote(0,p3,pchoice);
        pchoice.remove("whatsapp");
        pchoice.add("instagram");
        votingsystem.vote(0,p4,pchoice);
        votingsystem.printVoters(0);
        votingsystem.printResults(0);
        System.out.println("\n*********************************************************************************");
        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("math");
        choices2.add("physic");
        choices2.add("chemistry");
        choices2.add("programming");
        votingsystem.createVoting("what's your favorite subject?", false, 0, choices2);
        ArrayList<String> p2choice = new ArrayList<>();
        p2choice.add("math");
        p2choice.add("chemistry");
        votingsystem.vote(1,p1,p2choice);
        p2choice.remove("chemistry");
        votingsystem.vote(1,p2,p2choice);
        p2choice.add("chemistry");
        p2choice.add("physic");
        votingsystem.vote(1,p3,p2choice);
        p2choice.add("programming");
        votingsystem.vote(1,p4,p2choice);
        votingsystem.printVoters(1);
        votingsystem.printResults(1);
    }
}
