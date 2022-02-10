//package ru.netology.GameShooter;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//        Player player = new Player();
//
//        System.out.format("У игрока " + player.getSlotsCount() + " слотов с оружием,"+
//                        " введите номер, чтобы выстрелить,"
//                        + " -1 чтобы выйти"
//
//        );
//        int slot;
//
//        while (true){
//
//            slot = scanner.nextInt() - 1;
//
//            if (slot == -2){
//                System.out.println("Game over!");
//                break;
//            }
//
//            player.shotWithWeapon(slot);
//
//
//
//        }
//
//
//
//
//
//
//
//
//
//    }
//}
