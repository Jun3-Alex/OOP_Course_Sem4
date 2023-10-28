package OOP_Course.Lesson4.OOPSeminar4.Hometask.controller;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.Student;
import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.Teacher;
import OOP_Course.Lesson4.OOPSeminar4.Hometask.service.TeacherService;
import OOP_Course.Lesson4.OOPSeminar4.Hometask.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public List<Teacher> getAll(){
        return dataService.getAll();
    }

    public void updateTeacher(long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        for (Teacher teacher : dataService.getAll()) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setPatronymic(patronymic);
                teacher.setDateOfBirth(dateOfBirth);
                return;
            }
        }
        System.out.println("Преподаватель не найден");
    }

}