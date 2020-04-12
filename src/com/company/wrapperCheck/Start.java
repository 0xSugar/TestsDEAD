package com.company.wrapperCheck;

/**
 * Проверка wrapper (обворачивания)... напряжно как-то, потом доделаю.
 */
public class Start {
    public static void main(String[] args) {
        // Наследование
        System.out.println("---- ---- Наследование ---- ---- ---- ---");
        Cat cat = new CatWrapperExtends("Мурзик");
        System.out.println(cat.getName());  // как получить чистое имя? Никак.
        System.out.println("--");
        Cat cat2 = new Cat("Мурзик");
//        CatWrapperExtendsUpdated undatedWrapper = new CatWrapperExtendsUpdated();

        /*
        Используя наследование нельзя получить имя, вызвать можно будет только переопределенное имя с
        добавленным тексом. Иначе нужно создавать еще оди метод, отличный от род. класса.
        -> Нельзя получить чистые неизмененные данные (только имя)
        -> Нужно каждый раз создавать "нового кота" с теме же параметрами
        -> Нельзя связать кота с обёрткой, т.к. при наследовании обёртка является котом
        ->
         */
        System.out.println("\n\n");


        // Ссылка
        System.out.println("---- ---- Ссылка ---- ---- ---- ---- ----");
        Cat cat3 = new Cat("Murzik");
        CatWrapperLink wrappedCat = new CatWrapperLink(cat3);
        System.out.println(cat3.getName());
        System.out.println(wrappedCat.getName());
        /*
        Вроде все ок, не знаю ситуация, при которых это бы работало хуже за Н+С
         */
        System.out.println("\n\n");


        // Наследование + Ссылка
        System.out.println("---- ---- Наследование + Ссылка ---- ----");

        /*
        Небольшая разница между Н+С и просто Ссылка. Если у класса будет НЕ public конструктор и он будет
        находится в другом пакете, то через наследование можно создавать экземпляр и изменять поля, чего не добиться
        только с ссылкой.
        - >
         */
    }
}
