package electionSystem;

public class Politician {

    String currentParty;
    String name;
    String DOB; //go back and divide into day, month, year, and make returnDOBString method.
    String politicalParty;
    String homeCounty;
    String photoURL; //need to figure out how to add to javafx... imageView?

    public Politician(String currentParty, String name, String DOB, String politicalParty, String homeCounty, String photoURL) {
        this.currentParty = currentParty;
        this.name = name;
        this.DOB = DOB;
        this.politicalParty = politicalParty;
        this.homeCounty = homeCounty;
        this.photoURL = photoURL;
    }
}
