
import java.util.*;

/**
 * 
 */
public interface Discountable extends ElectronicProduct {

    /**
     * applyDiscount(percent: double): void
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent);

}