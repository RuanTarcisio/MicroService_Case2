package br.com.rtarcisio.course.Repository;

import br.com.rtarcisio.course.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
