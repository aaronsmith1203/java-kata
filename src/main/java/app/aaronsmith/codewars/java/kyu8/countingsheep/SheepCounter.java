package app.aaronsmith.codewars.java.kyu8.countingsheep;

// https://www.codewars.com/kata/54edbc7200b811e956000556
// see `readme.md` for notes

public class SheepCounter {

    public int count(Boolean[] arrayOfSheep) {
        int counter = 0;
        for (Boolean aSheep : arrayOfSheep) {
            if (aSheep != null && aSheep)
                counter++;
        }
        return counter;
    }
}
