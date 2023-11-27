package optional.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Curso {
	private String name;
	
	private List<Student> studentList;
	
	public Curso(String name) {
		this.name = name;
		this.studentList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}

class Student {
	//Optional
	private Optional<Registration> registration;
	private String name;
	
	public Student(String name) {
		this.name = name;
		//Initialize Optional as an empty container
		this.registration = Optional.empty();
	}
	
	public Optional<Registration> getRegistration() {
		return registration;
	}
	
	public void setRegistration(Registration matricula) {
		this.registration = Optional.of(matricula);
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}	
}

class Registration {
	private String numero;
	
	public Registration(String numero){
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}

public class OptionalExample {
	
	public static void main(String[] args) {
		
		Curso cursoAdm = new Curso("Administração");
		
		Student jose = new Student("José");
		jose.setRegistration(new Registration("11100"));
		//Adding student in course
		cursoAdm.getStudentList().add(jose);
		
		Student maria = new Student("Maria");
		maria.setRegistration(new Registration("12010"));
		//Adding student in course
		cursoAdm.getStudentList().add(maria);
		
		//NO REGISTRATION!
		Student ana = new Student("Ana");
		//Adding student in course
		cursoAdm.getStudentList().add(ana);
		
		Student paulo = new Student("Paulo");
		paulo.setRegistration(new Registration("14010"));
		//Adiciona aluno ao curso
		cursoAdm.getStudentList().add(paulo);
		
		//Displays the student's name and course registration number
		cursoAdm.getStudentList().stream()
		
		.filter( a -> a.getRegistration().isPresent() )
		
		.forEach( a -> System.out.println(a.getname() + " - " + a.getRegistration().get().getNumero() ));
		
	}
	
}
