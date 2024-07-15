package models.classes;

import models.interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public boolean selected() {
        return false;
    }
}
