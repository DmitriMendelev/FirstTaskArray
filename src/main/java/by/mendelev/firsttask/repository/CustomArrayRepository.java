package by.mendelev.firsttask.repository;

import by.mendelev.firsttask.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomArrayRepository {
    private static final Logger logger = LogManager.getLogger();
    private List<CustomArray> customArrayList = new ArrayList<>();
    private static final CustomArrayRepository instance = new CustomArrayRepository();

    private CustomArrayRepository() {
    }

    public static CustomArrayRepository getInstance() {
        return instance;
    }

    public void addCustomArray(CustomArray customArray) {
        customArrayList.add(customArray);
    }

    public void removeCustomArray(CustomArray customArray) {
        this.customArrayList.remove(customArray);
    }

    public CustomArray get(int index) {
        return customArrayList.get(index);
    }


    /**
     * @param specification
     * @return list of CustomArrays, filtered with specification
     */
    public List<CustomArray> query(Specification specification) {

        return customArrayList.stream().filter(o -> specification.specify(o))
                .collect(Collectors.toList());
    }

    /**
     * @param comparator
     * @return list new CustomArrays list sorted with comparator
     */
    public List<CustomArray> sort(Comparator<CustomArray> comparator) {

        return customArrayList.stream().sorted(comparator)
                .collect(Collectors.toList());
    }

}
