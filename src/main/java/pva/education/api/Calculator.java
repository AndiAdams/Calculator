package pva.education.api;

public interface Calculator<T extends Number> {
    T calc(Number first, Number second);

}
