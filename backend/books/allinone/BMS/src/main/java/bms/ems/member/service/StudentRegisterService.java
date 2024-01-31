package bms.ems.member.service;

import bms.ems.member.Student;
import bms.ems.member.dao.StudentDao;

public class StudentRegisterService {
    private StudentDao studentDao;

    public StudentRegisterService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void register(Student student) {
        if(verify(student.getsNum())) {
            studentDao.insert(student);
        } else {
            System.out.println("The student has already registered.");
        }
    }

    public boolean verify(String sNum) {
        Student student = studentDao.select(sNum);
        return student == null ? true : false;
    }
}
