package com.donetsk.jvm;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HardeningBridge {
   public static native void initKey(byte[] bs);
}
