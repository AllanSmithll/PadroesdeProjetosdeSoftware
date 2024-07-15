package models.classes;

import models.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public boolean selected() {
        return false;
    }
}
