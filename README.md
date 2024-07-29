# Election Management System

A simple Java application for managing election data, including voters, candidates, and elections.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VS Code)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/election-management-system.git
    ```

2. Open the project in your preferred Java IDE or text editor.

### Usage

1. Navigate into the project directory.

2. To view Robert's code, execute the command below:

    ```bash
    git checkout robert
    ```

3. You can create your branch and work in there just as Robert has done. Use the following command to create your branch:

    ```bash
    git checkout -b roseline
    ```

4. Always check you're in your own branch before starting work:

    ```bash
    git branch
    ```

### Example

Here is an example of how to use the `Database` class to store and retrieve data:

```java
public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        // Example voter data
        Voter voter = new Voter("John Doe", "john.doe@example.com", "hashed_password");
        db.storeVoterData("voter123", voter);

        // Example candidate data
        Candidate candidate = new Candidate("Jane Smith", "Independent", "Better Future for All", "hashed_password");
        db.storeCandidateData("candidate456", candidate);

        // Example election data
        Election election = new Election("Presidential", "2024-11-01", "2024-11-08");
        db.storeElectionData("election789", election);

        // Retrieve data
        System.out.println(db.getVoterData("voter123"));
        System.out.println(db.getCandidateData("candidate456"));
        System.out.println(db.getElectionData("election789"));
    }
}
