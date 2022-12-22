package hibernatetutorial.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hibernatetutorial.entities.Course;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;
	
	//adding a course
	public void saveorUpdateCourse(Course course) {
		if(course.getId()==0) {
			em.persist(course);
			System.out.println("The course has been saved successfully");
		}else {
			em.merge(course);
			System.out.println("The course has been updated successfully");
		}
		return;
	}
	
	//getting a particular by courseId
	public Course getCourseById(int courseId) {
		Course course=em.find(Course.class,courseId);
		return course;
	}
	
	//deleting a course
	public boolean deleteCourse(int courseId) {
		Course course=getCourseById(courseId);
		em.remove(course);
		return true;
	}
	
}
