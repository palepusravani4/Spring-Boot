package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Politician {
	@Id
	@SequenceGenerator(name="g1",sequenceName = "pid_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	@Column(length = 30)
	private String pname;
	@NonNull
	@Column(length = 30)
	private String paddrs;
	@NonNull
	private Integer age;
	@ManyToOne(targetEntity =PoliticalParty.class,cascade =  CascadeType.ALL)
	@JoinColumn(name="p_id",referencedColumnName = "pid")
	private PoliticalParty party;

	public Politician() {
		super();
	}

	@Override
	public String toString() {
		return "Politician [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", age=" + age + "]";
	}
	
	

}
