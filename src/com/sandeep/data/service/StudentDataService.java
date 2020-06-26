package com.sandeep.data.service;

import java.util.ArrayList;
import java.util.List;

import com.sandeep.data.object.Student;

public class StudentDataService {

	public static List<Student> getStudentList() {

		List<Student> listOfStudent = new ArrayList<Student>();

		Student aStudent = new Student();

		for (int i = 1; i <= 200; i++) {

			aStudent = new Student();

			aStudent.setName("Sandeep" + i);

			aStudent.setMark("20" + i);

			listOfStudent.add(aStudent);
		}

		return listOfStudent;

	}
}
