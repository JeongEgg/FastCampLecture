package part2.ch3.model;

@FunctionalInterface
public interface Converter<F,T> {
    // 2
    T convert(F from);
}
