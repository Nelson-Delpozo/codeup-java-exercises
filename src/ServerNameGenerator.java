//Server Name Generator
//
//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//        Example Output
//
//
//        Here is your server name:
//        dedicated-photon


public class ServerNameGenerator {

    public String[] adjectives;
    public String[] nouns;

    public ServerNameGenerator() {
        this.adjectives = new String[]{"happy", "sad", "angry", "delicious", "yucky", "peaceful", "loving", "narcoleptic", "heuristic", "convoluted"};
        this.nouns = new String[]{"car", "train", "bus", "airplane", "boat", "bicycle", "scooter", "skateboard", "helicopter", "cannon"};
    }

    public String getAdjective() {

        return adjectives[(int) Math.floor(Math.random() * 10)];
    }

    public String getNoun() {

        return nouns[(int) Math.floor(Math.random() * 10)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverName = new ServerNameGenerator();
        System.out.printf("Your server name is: %s-%s",(serverName.getAdjective()), (serverName.getNoun()) );

    }
}
