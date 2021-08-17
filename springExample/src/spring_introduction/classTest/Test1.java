package spring_introduction.classTest;

/**
 * Inversion of Control
 * Основные функции,которые выполняет Spring Container;
 *  IoC - инверсия управления. Создание и управление объектами
 *  DI - Dependency Injection. Внедрение зависимостей
 * IoC - аутсорсинг создания и управления объектами. Т.е. передача
 * программистом прав на создание и управление объектами Spring-y.
 */

import spring_introduction.classPet.Cat;
import spring_introduction.interfacePet.Pet;

/**
 * Способы конфигурации Spring Container
 *  XML file (устаревший способ)
 *  Annotations + XML file (современный способ)
 *  Java code (современный способ)
 */
public class Test1 {
    public static void main(String[] args) {
        Pet pet =new Cat();
        pet.say();
    }
}
