package com.luv2code.hibernate.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;


import javax.persistence.Entity;

@Entity
@Table(name="InstructorDetail")
public class InstructorDetail {
	
	
	//annotate the class as an entity and map to db table
	
	//define the fields
	
	//annotate the fields with column names
	
	//create constructor
	
	//generate getter and setter methods
	
	//generate tostring() method
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@column(name="id")
	private int id;
	
	@column(name="youtubechannel")
	private String youtubeChannel;
	
	@column(name="hobby")
	private int hobby;

	
	//add new field for instructor
	@OneToOne(mappedBy="instructorDetail",cascade=Cascadetype.ALL)
	private Instructor instructor;
	
	
	
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InstructorDetail() {
		
		
	}

	public InstructorDetail(String youtubeChannel, int hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public int getHobby() {
		return hobby;
	}

	public void setHobby(int hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
	
	
	}
