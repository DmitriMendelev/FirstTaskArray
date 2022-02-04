package by.Mendelev.FirstTask.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomArray customArray = (CustomArray) obj;
        return Arrays.equals(array,customArray.array);
    }

    @Override
    public String toString() {
        return "CustomArray.(" + "array=" + Arrays.toString(array) + ")";
    }
}
