public class Election {
    private String electionType;
    private String id;
    private String startDate;
    private String endDate;

    public Election(String electionType, String id, String startDate, String endDate) {
        this.electionType = electionType;
        this.id =id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public String getElectionType() {
        return electionType;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Election{" + "electionType='" + electionType + '\'' + ", startDate='" + startDate + '\'' + ", endDate='" + endDate + '\'' + '}';
    }
}






//  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - NO  GUI SYNTAX needed for this class
