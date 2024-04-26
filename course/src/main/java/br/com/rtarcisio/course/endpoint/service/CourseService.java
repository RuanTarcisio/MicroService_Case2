package br.com.rtarcisio.course.endpoint.service;

import br.com.rtarcisio.course.Model.Course;
import br.com.rtarcisio.course.Repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@Slf4j
public class CourseService {
    private final CourseRepository courseRepository;

    public Page<Course> listar(Pageable pageable){
        log.info("Listando todos cursos");
        return courseRepository.findAll(pageable);
    }

}
