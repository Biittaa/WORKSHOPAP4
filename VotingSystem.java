import java.util.ArrayList;
import java.util.Objects;

public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, isAnonymous);
        for (String choice : choices)
            voting.createChoice(choice);
        votingList.add(voting);
    }
    public Voting getVoting(int index){
        return votingList.get(index);
    }
    public  ArrayList<Voting> getVotingList() {
        return votingList;
    }

}