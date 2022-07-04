package com.github.budison.codingbat.logic1;

abstract class CigarParty {
    static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
}
