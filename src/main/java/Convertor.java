/**
 * Created by tr1o on 28.11.17.
 */
public final class Convertor {

    /**
     * Массив int к float массиву
     * @param arr
     * @return
     * @throws ConvertorException
     */
    static float[] IntToFloat(int[] arr) throws ConvertorException {
        float[] result = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Float.MAX_VALUE) result[i] = (float) arr[i];
            else throw new ConvertorException("Error, overflow when converting value int[] to float[]");
        }
        return result;
    }
}
