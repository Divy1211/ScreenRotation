package GUI;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.keyboard.NativeKeyEvent;

import java.io.File;
import java.io.IOException;

public class ScreenRotation implements NativeKeyListener {
    static boolean alt = false;
    static String path = "", com = "";
    public static void main(String[] args) {
        File f = new File("6172917170520.txt");
        path = f.getAbsolutePath().replace("\\6172917170520.txt","");
        com = path.charAt(0)+": & cd \""+path.substring(2,path.length())+"\" & display64.exe /rotate ";
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new ScreenRotation());
    }
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if(e.getKeyCode() == 56)
            alt = true;
        if(alt && e.getKeyCode() == NativeKeyEvent.VC_LEFT) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec(new String[]{"cmd.exe","/c",com+"90"});
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        } else if(alt && e.getKeyCode() == NativeKeyEvent.VC_RIGHT) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec(new String[]{"cmd.exe","/c",com+"270"});
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        } else if(alt && e.getKeyCode() == NativeKeyEvent.VC_UP) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec(new String[]{"cmd.exe","/c",com+"0"});
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        } else if(alt && e.getKeyCode() == NativeKeyEvent.VC_DOWN) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec(new String[]{"cmd.exe","/c",com+"180"});
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        if(e.getKeyCode() == 56)
            alt = false;
    }
}