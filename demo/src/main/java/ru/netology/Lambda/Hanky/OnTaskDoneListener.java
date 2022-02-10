package ru.netology.Lambda.Hanky;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);

}
