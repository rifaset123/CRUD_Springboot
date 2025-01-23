package com.xtramile.service;

import com.xtramile.entity.Student;
import com.xtramile.exception.StudentNotFoundException;
import com.xtramile.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    // inject
    private final StudentRepository studentRepository;

    // post
    public Student postStudent(Student student){
        return studentRepository.save(student);
    }

    // get
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(
                () -> new StudentNotFoundException(
                        "No Student with ID = " + id
                )
        );
    }

    // update
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudentDetails(Student currentStudent, Student newStudentDetails) {
        currentStudent.setNim(newStudentDetails.getNim());
        currentStudent.setNamaDepan(newStudentDetails.getNamaDepan());
        currentStudent.setNamaBelakang(newStudentDetails.getNamaBelakang());
        currentStudent.setTanggalLahir(newStudentDetails.getTanggalLahir());
        return currentStudent;
    }

    // delete
    public void deleteStudent(Long id){
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("No Student with ID = " + id);
        }
        studentRepository.deleteById(id);
    }
}
