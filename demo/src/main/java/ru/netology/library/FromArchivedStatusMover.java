package ru.netology.library;

public class FromArchivedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status.....");

        switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("Книга " + book.toString() + " переведена в свободный доступ");
                book.setStatus(Status.AVAILABLE);
                break;
            case BORROWED:
                System.out.println("Операция невозможна");
            case OVERDUED:
                System.out.println("Операция невозможна");
                break;
        }
    }
}
