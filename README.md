# Screen Rotation Hotkeys/Shortcut in Windows 10

1. A Java program that re-enables the ctrl+alt+arrow key screen rotation hotkeys on Windows 10.

2. In versions of Windows prior to Windows 10, there was a useful feature where if you pressed ctrl+alt+left/right/up/down arrow keys, the screen would rotate in that direction. Sadly support for this was dropped in Windows 10 but I found this feature useful enough to write a Java program that would re enable this feature!

# Prerequisites
1. Have Java 8 or higher installed.

# How the program works

1. Determine if you have a 64 bit or a 32 bit processor. (skip the rest of step 1 if you know this already)
  a) To determine this, right click on you "My Computer" or "This PC" icon and click properties.
  b) The type of processor should be written under System, System Type:
![Properties Window](https://github.com/Divy1211/ScreenRotation/blob/master/Properties.png)

2. Download the ScreenRotaion32.jar or ScreenRotation64.jar file from here, corresponding to the type of processor you have as found in step 1.

3 Download a utility called [display](https://download.cnet.com/Display/3000-2094_4-78037087.html). (This program is not my creation!)
  a) Take the display32.exe or display64.exe file corresponding to the type of processor you have as found in step 1.
  b) Put it in the same folder as the ScreenRotation32/64.jar file.
  
4. Press Win+R, a small window called "Run" should open. Type shell:startup and hit enter.
![Run Window](https://github.com/Divy1211/ScreenRotation/blob/master/images/Run.png)

5. Create a **shortcut** for the ScreenRotation<32/64>.jar file and put it in the folder that just you just opened. There might be other files in that folder, but that is not a problem.
![Startup Folder](https://github.com/Divy1211/ScreenRotation/blob/master/images/Startup.png)

6. Double click this shortcut once its in there. No visible change will occour but you will now be able to use alt+arrow keys (no need to hold control, just alt+arrow will do) to rotate the screen just like previous windows versions allowed you to do! It will automatically start even when you restart your computer.

# Note!
1. Please ensure that the processor type matches the display file and the ScreenRotation file!
2. Both of these must be kept in the same folder for it to work!
3. If you ever change the location of these two files, you will have to go through steps 4 to 6 again.
