package za.ac.cput.service.courseService;

import za.ac.cput.entity.Course;
import za.ac.cput.service.IService;

public interface ICourseService extends IService<Course, String> {
    void deleteById(String id);
}
