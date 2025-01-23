package com.xtramile.controller;

import com.xtramile.entity.Student;
import com.xtramile.exception.CustomErrorResponse;
import com.xtramile.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    // inject service
    private final StudentService studentService;

    // post
    @PostMapping("/student")
    public Student postStudent(@RequestBody Student student){
        return studentService.postStudent(student);
    }

    // get
    @GetMapping("/students")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    // update
    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student currentStudent = studentService.getStudentById(id);

        if (currentStudent == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        Student updatedStudent = studentService.updateStudentDetails(currentStudent, student);
        return ResponseEntity.status(HttpStatus.OK).body(updatedStudent);
    }

    // delete
    @DeleteMapping("student/{id}")
    public ResponseEntity<CustomErrorResponse> deleteStudent(@PathVariable Long id){
        Student currentStudent = studentService.getStudentById(id);
        if (currentStudent == null)
            return ResponseEntity.notFound().build();
        studentService.deleteStudent(id);
        CustomErrorResponse response = new CustomErrorResponse(HttpStatus.OK.value(), "Student " + currentStudent.getNamaDepan() + " deleted successfully");
        return ResponseEntity.ok(response);
    }
}
