package com.example.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class PoliticalParty {
	@Id
	@SequenceGenerator(name="g1",sequenceName = "p_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	private String partyName;
	@NonNull
	private String partySymbal;
	@OneToMany(targetEntity = Politician.class,cascade = CascadeType.ALL)
	@JoinColumn(name="p_id",referencedColumnName = "pid")
	private Set<Politician> politician;

	public PoliticalParty() {
		super();
	}

	@Override
	public String toString() {
		return "PoliticalParty [pid=" + pid + ", partyName=" + partyName + ", partySymbal=" + partySymbal + "]";
	}
	

}
