package lk.ac.vau.fas.ict.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.first.Model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/app")
public class AppController {

    //Create some Student objects
    Student Bob = new Student("2021ICT01","Bob Marely",23,"IT", 3.21);
    Student Amal = new Student("2020ICT02", "Amal Perera",24,"AMC",3.41);
	Student Kamal = new Student("2022ICT03", "Kamal Gunasinghe",22,"AMC",2.91);
    List<Student> students = new ArrayList<Student>();

    //A method to return a student
    @GetMapping("/student")
    public Student getStudent() {
        return Bob;
    }

    //return multiple student
    @GetMapping("/all-students")
    public List<Student> getAll() {
        students.add(Bob);
        students.add(Amal);
        students.add(Kamal);
        return students;
    }

    //Find a Student from the list by regNo
    @GetMapping("/student/{regno}")
    public Student getStudent(@PathVariable("regno") String regNo) {
        for (Student student: students) {
            if(student.getRegNo().equals(regNo)) {
                return student;
            }
        }
        return null;
    }

    @GetMapping("/msg")
    public String myMessage() {
        return "Hello SpringBoot";
    }

    @GetMapping("/name")
    public String myName() {
        return "My name is SpringBoot";
    }

    @GetMapping("/age/{ag}")
    public String myAge(@PathVariable("ag") int age) {
        return "My age is "+age;
    }
    
    @GetMapping("/course/{uni}/{crs}")
	public String MyUni(@PathVariable("uni") String university, @PathVariable("crs") String course) {
		return "My university is "+ university + " and my course is "+ course;
	}
    
    
}
