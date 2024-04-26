package br.com.rtarcisio.course.endpoint.controller;

import br.com.rtarcisio.course.Model.Course;
import br.com.rtarcisio.course.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@Slf4j
@RestController
@RequestMapping("v1/admin/course")
public class CourseController {

    private final CourseService courseService;

    @GetMapping()
    public ResponseEntity<Page<Course>> list(Pageable page){
    return new ResponseEntity<>(courseService.listar(page), HttpStatus.OK);
    }
}
