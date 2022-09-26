public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1-2. Сделала сразу с использованием if и else
        //Ex1
        System.out.println("Домашнее задание - 1-2");
        System.out.println("Задание номер один\n");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        else {
            System.out.println("Тебе нужно еще немного потерпеть, чтобы достичь совершеннолетия");
        }

        //Ex2
        System.out.println("\nЗадание номер два");
        int agePeople = 24;
        if (agePeople >= 7 && agePeople < 18) {
            System.out.println("Ребенок ходит в школу\n");
        } else if (agePeople >= 18 & agePeople < 24) {
            System.out.println("Человек может отправиться в университет");
               } else {
                    System.out.println("Человек окончил университет и ему пора искать первую работу");
                 }

        //Ex3
        System.out.println("\nЗадание номер три\n");
        int wagonCapacity = 102;
        int sitPlaces = 60;
        int standPlaces = wagonCapacity - sitPlaces;
        int passengerCount = 160;
        if (passengerCount <= sitPlaces) {
           sitPlaces = sitPlaces - passengerCount;
           if (sitPlaces != 0) {
               System.out.println("Сидячих мест: " + sitPlaces + ". Стоячих мест: " + standPlaces);
            }
        } else {
            passengerCount = passengerCount - sitPlaces;
            sitPlaces = 0;
            if (passengerCount <= standPlaces) {
                standPlaces = standPlaces - passengerCount;
                System.out.println("Сидячих мест: " + sitPlaces + ". Стоячих мест: " + standPlaces);
            } else {
                passengerCount = passengerCount - standPlaces;
                System.out.println("Вагон уже польностью забит. " + passengerCount + " пассажиров не попали в вагон.");
              }
          }
        //Домашнее задание 3
        //Ex1
        System.out.println("\nДомашнее задание - 3");
        System.out.println("Задание номер один\n");
        int age2 = 2;
        if (age2 >= 24){
            System.out.println("Человеку пора ходить на работу!");
        } else if (age2 > 18) {
            System.out.println("Человеку надо в университет ходить!");
        } else if (age2 >= 7) {
            System.out.println("Человеку нужно ходить в школу!");
        } else if (age2 >= 2) {
            System.out.println("Человеку нужно ходить в детский сад!");
        }
        //Ex2
        System.out.println("\nЗадание номер два\n");
        int age3 = 5;
        if (age3 >= 14){
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        } else if (age3 >= 5) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении " +
                    "взрослого");
        } else {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        //Ex3
        System.out.println("\nЗадание номер \n");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two) {
            if (one > free) {
                    System.out.println("Большее число one = " + one);
            } else {
                System.out.println("Большее число free = " + free);
              }
        } else if (two > free) {
            System.out.println("Большее число two = " + two);
          } else {
                System.out.println("Большее число free = " + free);
            }
    }
}