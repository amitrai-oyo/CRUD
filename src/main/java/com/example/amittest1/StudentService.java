package com.example.amittest1;

import com.example.amittest1.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student, Long id) {
        Student studentDb = studentRepository.findById(id).get();
        studentDb.setBranch(student.getBranch());
        studentDb.setFirstname(student.getFirstname());
        studentRepository.save(studentDb);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
