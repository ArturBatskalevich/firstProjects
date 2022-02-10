package ru.netology.library;

public class FromAvailableStatusMover extends BookMover{

    @Override
    protected void moveToStatus(Book book,Status requestedStatus){
        System.out.println("Moving status.....");

        switch (requestedStatus){
            case ARCHIVED:
                System.out.println("Книга " + book.toString() + " переведена в архив");
                book.setStatus(Status.ARCHIVED);
                break;
            case BORROWED:
                System.out.println("Книга " + book.toString() + " отдана в пользование");
                book.setStatus(Status.BORROWED);
                break;
            case OVERDUED:
                System.out.println("Некорректная операция");
                break;
        }

        /*if (requestedStatus == Status.BORROWED || requestedStatus == Status.ARCHIVED){
            System.out.println("Операция возможна");
            if(requestedStatus == Status.BORROWED){
                System.out.println("Книга передана в пользование");
                book.setStatus(Status.BORROWED);

            } else {
                System.out.println("Книга передана в архив");
                book.setStatus(Status.ARCHIVED);
            }

        } else if (requestedStatus == Status.OVERDUED){
            System.out.println("Операция не возможна");
        }*/
    }
}
