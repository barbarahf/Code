package ejercicios_examen;

import java.util.Arrays;

public class ListaMultimedia {
    private final Multimedia[] MULTIMEDIA_SAV;
    private int count;

    public ListaMultimedia(int maxNumberToSave) {
        MULTIMEDIA_SAV = new Multimedia[maxNumberToSave];
        count = 0;
    }

    public int size() {
        int value = 0;
        for (int i = 0; i < this.MULTIMEDIA_SAV.length; i++) {
            if (this.MULTIMEDIA_SAV[i] != null) value++;
        }
        return value;
    }

    private boolean llena(Multimedia elemnt) {
        if (!(count == MULTIMEDIA_SAV.length)) {
            MULTIMEDIA_SAV[count] = elemnt;
            count++;
            return true;
        }
        return false;
    }

    Multimedia get(int position) {
        if (position < size()) return MULTIMEDIA_SAV[position];
        return null;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += MULTIMEDIA_SAV[i].toString() + "\n";
        }
        return s;
    }
}
