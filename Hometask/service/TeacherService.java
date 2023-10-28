package OOP_Course.Lesson4.OOPSeminar4.Hometask.service;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.Teacher;
import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);

    }
    public void updateTeacher(long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        for (Teacher teacher : teachers) {
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
