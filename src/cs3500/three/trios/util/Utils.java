package cs3500.three.trios.util;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A class containing general useful methods.
 */
public class Utils {

  /**
   * Returns a copy of the given 2d array. Each array in the 2d array will also be copied.
   *
   * @throws IllegalArgumentException if array2D is null
   */
  public static <T> T[][] copyArray2D(T[][] array2D) {
    Requirements.requireNonNullArray2D(array2D);
    T[][] copy = array2D.clone();
    for (int rowIndex = 0; rowIndex < array2D.length; rowIndex++) {
      copy[rowIndex] = array2D[rowIndex].clone();
    }
    return copy;
  }

  /**
   * Returns a string of the toStrings of each element in the list joined by the delimiter.
   *
   * @throws IllegalArgumentException if list or delimiter is null
   */
  public static String joinToString(List<?> list, String delimiter) {
    Requirements.requireNonNull(delimiter);
    Requirements.requireNonNullCollection(list);
    return list.stream()
        .map(Object::toString)
        .collect(Collectors.joining(delimiter));
  }
}
