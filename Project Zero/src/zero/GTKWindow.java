/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero;

import org.gnome.gtk.Gtk;
import org.gnome.gtk.Window;
import org.gnome.gtk.WindowPosition;

/**
 *
 * @author juanmanuel
 * Java-Gnome GTK Example
 * inspired official site java-gnome.sourceforge.net
 * 
 */

public class GTKWindow extends Window {
    
    public GTKWindow() {
        setTitle("GTK from Java example");
        connect((DeleteEvent)(source, event) -> {
            Gtk.mainQuit();
            return false;
        });
        setDefaultSize(300, 200);
        setPosition(WindowPosition.CENTER);
        show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gtk.init(args);
        new GTKWindow();
        Gtk.main(); 
    }
    
}


