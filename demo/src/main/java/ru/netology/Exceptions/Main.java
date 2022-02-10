package ru.netology.Exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите логин");
            String login = scanner.nextLine();
            System.out.println("Введите пароль");
            String password = scanner.nextLine();


            //Проверить логин и пароль


            final User user = getUserByLoginAndPassword(login, password);
            System.out.println("Доступ предоставлен для пользователя = " + user.getLogin());
            validateUser(user);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


        //Вызвать методы валидации пользователя


    }

    public static User[] getUsers() {

        User user1 = new User("alex", "alex@gmail.com", "alex1", 17);
        User user2 = new User("jony", "jony@gamil.com", "jony1", 18);
        User user3 = new User("artur", "artur@gamil.com", "artur1", 19);

        return new User[]{user1, user2, user3};

    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {

        for (User user : getUsers()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() > 18) {
            System.out.println("Успешная валидация!");
            return;
        }
        throw new AccessDeniedException("The user is too young");


    }
}
