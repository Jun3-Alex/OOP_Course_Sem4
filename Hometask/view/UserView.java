package OOP_Course.Lesson4.OOPSeminar4.Hometask.view;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
