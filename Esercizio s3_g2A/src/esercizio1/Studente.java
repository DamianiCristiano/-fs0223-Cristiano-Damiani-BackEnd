package esercizio1;

public class Studente {

	String id;
	String lastname;
	String gender;
	String birthDate;
	Integer avg;
	Integer min_vote;
	Integer max_vote;

	public Studente(String id, String lastname, String gender, String birthDate, Integer avg, Integer min_vote,
			Integer max_vote) {
		this.id = id;
		this.lastname = lastname;
		this.gender = gender;
		this.birthDate = birthDate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", lastname=" + lastname + ", gender=" + gender + ", birthDate=" + birthDate
				+ ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote + "]";
	}

	public Integer getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(Integer min_vote) {
		this.min_vote = min_vote;
	}

	public Integer getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(Integer max_vote) {
		this.max_vote = max_vote;
	}

}
