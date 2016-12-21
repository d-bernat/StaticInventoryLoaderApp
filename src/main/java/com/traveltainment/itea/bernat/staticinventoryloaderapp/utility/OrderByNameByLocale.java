/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.utility;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.NamedInventory;
import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

public class OrderByNameByLocale<T extends NamedInventory> {
    private boolean isValid(Locale locale) {
        try {
            return locale.getISO3Language() != null && locale.getISO3Country() != null;
        }
        catch (MissingResourceException e) {
            return false;
        }
    }

    public List<T> sort(List<T> list, String code) {
        Locale locale;
        String[] language = code.split("-");
        if (language == null || language.length != 2) {
            language = new String[]{"default", "default"};
        }
        if (!this.isValid(locale = new Locale(language[0], language[1]))) {
            locale = Locale.getDefault();
        }
        Collator instance = Collator.getInstance(locale);
        Collections.sort(list, (obj1, obj2) -> instance.compare(obj1.getName(), obj2.getName()));
        return list;
    }
}

