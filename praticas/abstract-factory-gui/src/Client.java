import factory.GuiFactory;
import factory.MacOSGuiFactory;
import factory.WindowsGuiFactory;

import models.interfaces.*;

public class Client {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println("SO: "+ os);

        if(os.contains("Windows")) {
            GuiFactory wf1 = new WindowsGuiFactory();
            Button b1 = wf1.createButton();
            b1.click();
        } else {
            GuiFactory mf1 = new MacOSGuiFactory();
            Checkbox cb1 = mf1.createCheckbox();
            cb1.selected();
        }
    }
}