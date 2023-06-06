package exam02.validator;

public interface Validator<T> extends RequiredValidator, LengthCheckValidator {
    void check(T t);
}