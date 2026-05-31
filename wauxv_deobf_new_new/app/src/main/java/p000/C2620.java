package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C0027;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲈᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2620 implements Handler.Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2135 f8296 = new C2135(11);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public volatile ComponentCallbacks2C2619 f8297;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ComponentCallbacks2C2619 m4602(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC3580.f11185;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return m4602(contextWrapper.getBaseContext());
            }
        }
        if (this.f8297 == null) {
            synchronized (this) {
                try {
                    if (this.f8297 == null) {
                        this.f8297 = new ComponentCallbacks2C2619(ComponentCallbacks2C0027.m757(context.getApplicationContext()), new C1139(), new C0348(28), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f8297;
    }
}
