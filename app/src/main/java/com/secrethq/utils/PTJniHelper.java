

package com.secrethq.utils;

public class PTJniHelper {
	public static String password() {
		return "Fiysc5X7514Xdvshlfy3CBt4/iadqOBcGnn6dJT94AgZeaoglfu1DRss/ibOq7ZbGn+tIM+osQgaLfgkyPznCA==";
	}
	public static native boolean isAdNetworkActive( String name ); 
    public static native String jsSettingsString();
    
    public static native void setSettingsValue(String path, String value);
    public static native String getSettingsValue(String path);
}
