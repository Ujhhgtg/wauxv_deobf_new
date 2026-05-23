package p000;

import android.app.Notification;
import android.graphics.Insets;
import android.os.Trace;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1645 {
    public static boolean m3370() {
        return Trace.isEnabled();
    }

    public static Insets m3371(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void m3372(Notification.Builder builder) {
        builder.setAllowSystemGeneratedContextualActions(true);
    }

    public static void m3373(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
