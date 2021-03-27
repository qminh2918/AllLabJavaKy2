/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author MINH
 */
public class MVCPattern {
    public static void main(String[] args) 
	{ 
		Student model = retriveStudentFromDatabase(); 

		StudentView view = new StudentView(); 

		StudentController controller = new StudentController(model, view); 

		controller.updateView(); 

		controller.setStudentName("Vikram Sharma"); 

		controller.updateView(); 
	} 

	private static Student retriveStudentFromDatabase() 
	{ 
		Student student = new Student(); 
		student.setName("Lokesh Sharma"); 
		student.setRollNo("15UCS157"); 
		return student; 
	} 
}
