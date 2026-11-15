package com.donetsk.jvm;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class LicenseManager {
   public static final String LICENSE_PASSWORD = "XyzClient+#-#72cnq5";

   private LicenseManager() {
   }

   public static boolean verify(String input) {
      if (input == null) {
         return false;
      }
      return MessageDigest.isEqual(
         input.getBytes(StandardCharsets.UTF_8),
         LICENSE_PASSWORD.getBytes(StandardCharsets.UTF_8)
      );
   }
}
