package quiz18;

public class Member  {
    private int id;
    private String tier;

    public Member(int id, String tier) {
        this.id = id;
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Character{id=" + id + ", tier='" + tier + "'}";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	} 
}