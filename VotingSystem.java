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
    public void printResults(int index){
        votingList.get(index).printResults();
    }
    public void printVoters(int index){
        votingList.get(index).printVoters();
    }
    public void printVoting(int index){
        System.out.println(votingList.get(index).getQuestion());
        for(String c:votingList.get(index).getChoices()){
            System.out.println(c);
        }
    }
    public void vote(int index,Person voter,ArrayList<String> choice){
        votingList.get(index).vote(voter,choice);
    }
    public void vote(int index,Person voter){
        votingList.get(index).vote(voter);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotingSystem that = (VotingSystem) o;
        return Objects.equals(votingList, that.votingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votingList);
    }

}