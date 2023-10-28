package OOP_Course.Lesson4.OOPSeminar4.Hometask.view;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            System.out.println(teacher.toString());
        }
    }

    public void sendOnConsoleTeachers(Teacher teacher){
        System.out.println(teacher.toString());
    }

}
