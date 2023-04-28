import java.util.*;
import java.util.Map.Entry;
import java.time.LocalDate;
public class Voting {
    private final int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    private boolean isAnonymous;
    private ArrayList<Person> voters = new ArrayList<>();

    //private final ArrayList<String> choiceList = new ArrayList<>();
    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public ArrayList<String> getChoices() {
        ArrayList<String> m = new ArrayList<>();
        for(String s:choices.keySet()){
            m.add(s);
        }
        return m;
    }

    public void createChoice(String choice) {
        choices.put(choice, new HashSet<>());
    }

    public void vote(Person voter, ArrayList<String> voter_choices) {
        if(!isAnonymous){
            voters.add(voter);
        }
        for (String vChoices : voter_choices) {
            String Date = LocalDate.now().toString();
            Vote vote = new Vote(voter,Date);
            choices.get(vChoices).add(vote);
        }
    }
    public void vote(Person voter) {
        if(!isAnonymous){
            voters.add(voter);
        }
        Random r = new Random();
        int m = r.nextInt(choices.size());
        String Date = LocalDate.now().toString();
        Vote vote = new Vote(voter,Date);
        choices.get(m).add(vote);

    }
}