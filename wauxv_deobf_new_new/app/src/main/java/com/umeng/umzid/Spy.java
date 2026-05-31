package com.umeng.umzid;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Spy {
    public static boolean initSuccess = false;

    static {
        try {
            System.loadLibrary("umeng-spy");
            initSuccess = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String getID() {
        if (initSuccess) {
            return getNativeID(Build.VERSION.SDK_INT >= 29);
        }
        return null;
    }

    public static native String getNativeID(boolean z);

    public static native String getNativeLibraryVersion();

    public static native String getNativeTag(boolean z, boolean z2, boolean z3);

    public static synchronized String getTag(Context context) {
        boolean zJ;
        if (context != null) {
            try {
                zJ = d.j(context);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            zJ = false;
        }
        return getNativeTag(zJ, context != null ? d.i(context) : false, Build.VERSION.SDK_INT >= 29);
    }

    public static String getVersion() {
        if (initSuccess) {
            return getNativeLibraryVersion();
        }
        return null;
    }
}
