package org.fibers.polyester.util;

import javax.swing.*;

public class SwingUtil {
    public static void runSwingAction(Runnable action) {
        SwingUtilities.invokeLater(action);
    }
}
