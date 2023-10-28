package OOP_Course.Lesson4.OOPSeminar4.Hometask.controller;

import OOP_Course.Lesson4.OOPSeminar4.Hometask.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
