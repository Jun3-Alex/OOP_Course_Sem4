package OOP_Course.Lesson4.OOPSeminar4.Hometask.view;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.Student;
import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
