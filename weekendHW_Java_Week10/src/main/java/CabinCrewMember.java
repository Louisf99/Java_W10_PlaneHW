public class CabinCrewMember extends Person {
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType){
        super(name);
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String relayMessages(){
        return "Please put your seatbelts on";
    }

}
