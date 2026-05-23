package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C0020;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2564 implements Handler.Callback {

    public static final C2102 f8143 = new C2102(11);

    public volatile ComponentCallbacks2C2563 f8144;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public final ComponentCallbacks2C2563 m4580(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC3522.f11032;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return m4580(contextWrapper.getBaseContext());
            }
        }
        if (this.f8144 == null) {
            synchronized (this) {
                try {
                    if (this.f8144 == null) {
                        this.f8144 = new ComponentCallbacks2C2563(ComponentCallbacks2C0020.m614(context.getApplicationContext()), new C1133(), new C0373(27), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f8144;
    }
}
