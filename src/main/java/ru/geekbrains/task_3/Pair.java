package ru.geekbrains.task_3;

/*
- Напишите обобщенный класс Pair,
который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(),
getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(),
возвращающее строковое представление пары.
 */
public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + first + ", " + second + '}';
    }
}