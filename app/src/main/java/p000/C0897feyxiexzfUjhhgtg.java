package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ能不能ᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0897feyxiexzfUjhhgtg implements Handler.Callback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f3454Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(11);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public volatile ComponentCallbacks2C0894feyxiexzfUjhhgtg f3455Ujhhgtgfeyxiexzf;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ComponentCallbacks2C0894feyxiexzfUjhhgtg m2376Ujhhgtgfeyxiexzf(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application) && (context instanceof ContextWrapper)) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                return m2376Ujhhgtgfeyxiexzf(contextWrapper.getBaseContext());
            }
        }
        if (this.f3455Ujhhgtgfeyxiexzf == null) {
            synchronized (this) {
                try {
                    if (this.f3455Ujhhgtgfeyxiexzf == null) {
                        this.f3455Ujhhgtgfeyxiexzf = new ComponentCallbacks2C0894feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context.getApplicationContext()), new C3382feyxiexzfUjhhgtg(), new C2466feyxiexzfUjhhgtg(28), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3455Ujhhgtgfeyxiexzf;
    }
}
