import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задание 1.1
        System.out.println("Задание 1.1.");

        Human maksim = new Human("Маским", "Минск", -10, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 20, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, null);


        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);

        System.out.println();

        // Задание 2.2
        System.out.println("Задание 1.2");

        Flower rouse = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);


        printInfoFlower(rouse);
        printInfoFlower(chrysanthemum);
        printInfoFlower(pion);
        printInfoFlower(gypsophila);


        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия", new Car.Key(), new Car.Insurance());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 0, "Германия", null, null);
        Car bmw = new Car("BMW", null, 3, null, 0, "Германии", null, null);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южной Корея", null, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.4, "оранжевый", 2016, "Южной Корея", null, null);

        audi.setRegistrationNumber("вариатор");
        bmw.setSummerTyres(false);
        kia.setRegistrationNumber("а123аа178");
        lada.setInsurance(new Car.Insurance(LocalDate.now(), 1000, null));

        printInfoCar(lada);
        printInfoCar(audi);
        printInfoCar(bmw);
        printInfoCar(kia);
        printInfoCar(hyundai);

    }

    public static void printInfoCar(Car car) {
        System.out.println(
                car.getBrand() + car.getModel() +
                        ", год выпуска: " + car.getProductionYear() +
                        ", страна сборки: " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getTransmission() +
                        ", рег номер: " + car.getRegistrationNumber() +
                        ", кол-во мест: " + car.getNumberOfSeats() +
                        ", " + (car.isSummerTyres() ? "летняя" : " зимняя") + " резина" +
                        ", " + (car.getKey().isKeylessAccess() ? " безключевой доступ" : "ключевой доступ") +
                        ", " + (car.getKey().isRemoteRunEngine() ? " удаленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость страховки: " + car.getInsurance().getCost() +
                        ", срок действия страховки: " + car.getInsurance().getExpireDate());


    }

    public static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + "." + " Я из города " + human.getTown() + "." + " Мне " + human.getYearOfBirth() + " лет. Я работаю на должности " + human.job + "." + " Будем знакомы!");
    }

    public static void printInfoFlower(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() + ". Страна: " + flower.getCountry() + ". Стоимость: " + flower.getCost() + ". Срок стояния цветов: " + flower.lifeSpan);

    }


    //

}