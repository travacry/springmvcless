package pet;

/**
 * Created by tr1o on 29.11.17.
 */
public abstract class LostPet {

    /**
     * Опасен питомец или нет
     * @return
     */
    public boolean isDanger() {
        return true;
    }

    /**
     * Адрес где поймали
     * @return
     */
    abstract String getWhereCatch();
}
