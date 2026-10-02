package com.example.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="MTOM_Student")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {

	
	@Id
	@SequenceGenerator(name="g2",sequenceName = "s_sid",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g2",strategy = GenerationType.SEQUENCE)
	private Integer sid;
	@NonNull
	@Column(length=30)
	private String sname;
	@NonNull
	@Column(length=30)
	private String saddrs;
	@NonNull
	@Column(length=30)
	private String college;
	@ManyToMany(targetEntity =Faculty.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="MTOM_F_S",joinColumns = @JoinColumn(name="student_id",referencedColumnName = "sid" ),
	inverseJoinColumns = @JoinColumn(name="faculty_id",referencedColumnName = "fid"))
	private Set<Faculty> faculty=new HashSet();
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddrs=" + saddrs + ", college=" + college + "]";
	}
	
}
