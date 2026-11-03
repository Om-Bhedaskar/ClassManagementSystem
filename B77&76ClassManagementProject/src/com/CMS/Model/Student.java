package com.CMS.Model;

public class Student {

	private int studenytId;
	private String studentName;

	private Batch batch;

	public int getStudenytId() {
		return studenytId;
	}

	public void setStudenytId(int studenytId) {
		this.studenytId = studenytId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [studenytId=" + studenytId + ", studentName=" + studentName + ", batch=" + batch + "]";
	}

}
