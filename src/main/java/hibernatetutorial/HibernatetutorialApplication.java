package hibernatetutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernatetutorial.entities.Course;
import hibernatetutorial.repository.CourseRepository;

@SpringBootApplication
public class HibernatetutorialApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernatetutorialApplication.class, args);
		System.out.println("Application has started running");
	}

	@Override
	public void run(String... args) throws Exception {
		//inserting two courses
//		Course course=new Course(0,"Javascript Programming","3 hours");
//		this.courseRepository.saveorUpdateCourse(course);
		
		//getting courses
//		Course course=this.courseRepository.getCourseById(0);
//		System.out.println(course);
		
		
		//updating a course
//		Course course=new Course(1,"Python Programming","7 hours");
//		this.courseRepository.saveorUpdateCourse(course);
//		
//		Course course=this.courseRepository.getCourseById(1);
//		course.setName("Ruby Programming");
//		this.courseRepository.saveorUpdateCourse(course);
				
		//deleting a course
//		this.courseRepository.deleteCourse(1);
//		System.out.println("Course has been deleted successfully");
	}

}
