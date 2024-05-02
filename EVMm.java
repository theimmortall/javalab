import java.util.Scanner;

// Interface representing a candidate
interface Candidate {
    String getName();
    void castVote();
    int getVoteCount();
}

// Class representing a political party
class PoliticalParty implements Candidate {
    private final String name;
    private int voteCount;

    public PoliticalParty(String name) {
        this.name = name;
        this.voteCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void castVote() {
        voteCount++;
        System.out.println("Vote cast for " + name);
    }

    @Override
    public int getVoteCount() {
        return voteCount;
    }
}

// Class representing an independent candidate
class IndependentCandidate implements Candidate {
    private final String name;
    private int voteCount;

    public IndependentCandidate(String name) {
        this.name = name;
        this.voteCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void castVote() {
        voteCount++;
        System.out.println("Vote cast for " + name);
    }

    @Override
    public int getVoteCount() {
        return voteCount;
    }
}

// Class representing the Electronic Voting Machine
class EVM {
    private final Candidate[] candidates;

    public EVM(Candidate[] candidates) {
        this.candidates = candidates;
    }

    public void vote(int candidateIndex) {
        if (candidateIndex >= 0 && candidateIndex < candidates.length) {
            candidates[candidateIndex].castVote();
        } else {
            System.out.println("Invalid candidate index");
        }
    }

    public String displayResults() {
        StringBuilder result = new StringBuilder("Election Results:\n");
        for (Candidate candidate : candidates) {
            result.append(candidate.getName()).append(": ").append(candidate.getVoteCount()).append(" votes\n");
        }
        return result.toString();
    }
}

// Main class to test the EVM
public class EVMm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name for Party 1: ");
        String party1Name = scanner.nextLine();
        System.out.print("Enter the name for Party 2: ");
        String party2Name = scanner.nextLine();
        System.out.print("Enter the name for the Independent Candidate: ");
        String independentCandidateName = scanner.nextLine();

        PoliticalParty party1 = new PoliticalParty(party1Name);
        PoliticalParty party2 = new PoliticalParty(party2Name);
        IndependentCandidate independentCandidate = new IndependentCandidate(independentCandidateName);

        Candidate[] candidates = {party1, party2, independentCandidate};

        EVM evm = new EVM(candidates);

        // Simulate voting
        System.out.print("Enter the index of the candidate to vote for (0 to " + (candidates.length - 1) + "): ");
        int voteIndex = scanner.nextInt();
        evm.vote(voteIndex);

        // Display results
        System.out.println(evm.displayResults());

        scanner.close();
    }
}
