package com.badlogic.gdx.backends.iosrobovm.objectal;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;

/**
 * @author Niklas Therning
 */
@Library(Library.INTERNAL)
@NativeClass
public class OALAudioTrack extends NSObject{

    static{
        ObjCRuntime.bind(OALAudioTrack.class);
    }

    @Method(selector = "track")
    public native static OALAudioTrack create();

    @Method
    public native boolean preloadFile(String filePath);

    @Method
    public native void stop();

    @Method
    public native void clear();

    @Method
    public native boolean play();

    @Property
    public native boolean isPaused();

    @Property
    public native void setPaused(boolean paused);

    @Property
    public native boolean isPlaying();

    @Property
    public native float getVolume();

    @Property
    public native void setVolume(float volume);

    @Property
    public native float getPan();

    @Property
    public native void setPan(float pan);

    @Property
    public native double getCurrentTime();

    @Property
    public native void setCurrentTime(double currentTime);

    @Property
    public native int getNumberOfLoops();

    @Property
    public native void setNumberOfLoops(int numberOfLoops);

    @Property
    public native AVAudioPlayerDelegate getDelegate();

    @Property(strongRef = true)
    public native void setDelegate(AVAudioPlayerDelegate delegate);
}
