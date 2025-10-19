package calculator.domain.number;

import java.util.Objects;
import java.util.function.IntBinaryOperator;

import static calculator.common.constants.NumberConstants.ZERO;
import static calculator.common.message.ErrorMessage.*;

public class Number {

    private int value;

    private Number(int value) {
        validateNumber(value);
        this.value = value;
    }

    public static Number from(int value) {
        return new Number(value);
    }

    public static Number from(String number) {
        try{
            return number.isEmpty() ? new Number(ZERO) : new Number(Integer.parseInt(number));
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(VALUE_IS_NOT_POSITIVE_INTEGER.getMessage());
        }
    }

    public void operate(Number other, IntBinaryOperator operator) {
        try{
            this.value = operator.applyAsInt(this.value, other.value);
        }catch(ArithmeticException e){
            throw new IllegalArgumentException(ARITHMETIC_RESULT_EXCEED_RANGE.getMessage());
        }
    }

    public void validateNumber(int value) {
        if (value < ZERO) {
            throw new IllegalArgumentException(VALUE_IS_NEGATIVE_INTEGER.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Number number = (Number) other;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
