package com.perseo.perseo_mvp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.perseo.models.Course;

public interface ICourseRepository extends JpaRepository<Course, Long> {

}


