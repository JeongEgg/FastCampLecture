package part2.ch3.model;

@FunctionalInterface
public interface PersonFactory {
    // 2
    public Person create(String name, int age);
}
