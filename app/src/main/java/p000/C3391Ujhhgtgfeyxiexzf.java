package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3391Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Object f10589Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static volatile C3391Ujhhgtgfeyxiexzf f10590Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f10591Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2392Ujhhgtgfeyxiexzf f10592Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile int f10593Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Handler f10594Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0425Ujhhgtgfeyxiexzf f10595Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC3390feyxiexzfUjhhgtg f10596Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f10597Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f10598Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C3130Ujhhgtgfeyxiexzf f10599Ujhhgtgfeyxiexzf;

    public C3391Ujhhgtgfeyxiexzf(C3626Ujhhgtgfeyxiexzf c3626Ujhhgtgfeyxiexzf) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10591Ujhhgtgfeyxiexzf = reentrantReadWriteLock;
        this.f10593Ujhhgtgfeyxiexzf = 3;
        InterfaceC3390feyxiexzfUjhhgtg interfaceC3390feyxiexzfUjhhgtg = (InterfaceC3390feyxiexzfUjhhgtg) c3626Ujhhgtgfeyxiexzf.f10587Ujhhgtgfeyxiexzf;
        this.f10596Ujhhgtgfeyxiexzf = interfaceC3390feyxiexzfUjhhgtg;
        int i = c3626Ujhhgtgfeyxiexzf.f10586Ujhhgtgfeyxiexzf;
        this.f10598Ujhhgtgfeyxiexzf = i;
        this.f10599Ujhhgtgfeyxiexzf = (C3130Ujhhgtgfeyxiexzf) c3626Ujhhgtgfeyxiexzf.f10588Ujhhgtgfeyxiexzf;
        this.f10594Ujhhgtgfeyxiexzf = new Handler(Looper.getMainLooper());
        this.f10592Ujhhgtgfeyxiexzf = new C2392Ujhhgtgfeyxiexzf(0);
        this.f10597Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(24);
        C0425Ujhhgtgfeyxiexzf c0425Ujhhgtgfeyxiexzf = new C0425Ujhhgtgfeyxiexzf(this);
        this.f10595Ujhhgtgfeyxiexzf = c0425Ujhhgtgfeyxiexzf;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f10593Ujhhgtgfeyxiexzf = 0;
            } catch (Throwable th) {
                this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m4908Ujhhgtgfeyxiexzf() == 0) {
            try {
                interfaceC3390feyxiexzfUjhhgtg.mo4675Ujhhgtgfeyxiexzf(new C3386Ujhhgtgfeyxiexzf(c0425Ujhhgtgfeyxiexzf));
            } catch (Throwable th2) {
                m4910Ujhhgtgfeyxiexzf(th2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3391Ujhhgtgfeyxiexzf m4907Ujhhgtgfeyxiexzf() {
        C3391Ujhhgtgfeyxiexzf c3391Ujhhgtgfeyxiexzf;
        synchronized (f10589Ujhhgtgfeyxiexzf) {
            try {
                c3391Ujhhgtgfeyxiexzf = f10590Ujhhgtgfeyxiexzf;
                if (!(c3391Ujhhgtgfeyxiexzf != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3391Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m4908Ujhhgtgfeyxiexzf() {
        this.f10591Ujhhgtgfeyxiexzf.readLock().lock();
        try {
            return this.f10593Ujhhgtgfeyxiexzf;
        } finally {
            this.f10591Ujhhgtgfeyxiexzf.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4909Ujhhgtgfeyxiexzf() {
        if (!(this.f10598Ujhhgtgfeyxiexzf == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m4908Ujhhgtgfeyxiexzf() == 1) {
            return;
        }
        this.f10591Ujhhgtgfeyxiexzf.writeLock().lock();
        try {
            if (this.f10593Ujhhgtgfeyxiexzf == 0) {
                this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
                return;
            }
            this.f10593Ujhhgtgfeyxiexzf = 0;
            this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            C0425Ujhhgtgfeyxiexzf c0425Ujhhgtgfeyxiexzf = this.f10595Ujhhgtgfeyxiexzf;
            C3391Ujhhgtgfeyxiexzf c3391Ujhhgtgfeyxiexzf = (C3391Ujhhgtgfeyxiexzf) c0425Ujhhgtgfeyxiexzf.f2272Ujhhgtgfeyxiexzf;
            try {
                c3391Ujhhgtgfeyxiexzf.f10596Ujhhgtgfeyxiexzf.mo4675Ujhhgtgfeyxiexzf(new C3386Ujhhgtgfeyxiexzf(c0425Ujhhgtgfeyxiexzf));
            } catch (Throwable th) {
                c3391Ujhhgtgfeyxiexzf.m4910Ujhhgtgfeyxiexzf(th);
            }
        } catch (Throwable th2) {
            this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m4910Ujhhgtgfeyxiexzf(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f10591Ujhhgtgfeyxiexzf.writeLock().lock();
        try {
            this.f10593Ujhhgtgfeyxiexzf = 2;
            arrayList.addAll(this.f10592Ujhhgtgfeyxiexzf);
            this.f10592Ujhhgtgfeyxiexzf.clear();
            this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            this.f10594Ujhhgtgfeyxiexzf.post(new RunnableC2474feyxiexzfUjhhgtg(arrayList, this.f10593Ujhhgtgfeyxiexzf, th));
        } catch (Throwable th2) {
            this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final CharSequence m4911Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        C1777feyxiexzfUjhhgtg[] c1777feyxiexzfUjhhgtgArr;
        int spanStart;
        if (!(m4908Ujhhgtgfeyxiexzf() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC3594Ujhhgtgfeyxiexzf.m5166Ujhhgtgfeyxiexzf("start should be <= than end", i <= i2);
        C1945feyxiexzfUjhhgtg c1945feyxiexzfUjhhgtg = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC3594Ujhhgtgfeyxiexzf.m5166Ujhhgtgfeyxiexzf("start should be < than charSequence length", i <= charSequence.length());
        AbstractC3594Ujhhgtgfeyxiexzf.m5166Ujhhgtgfeyxiexzf("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f10595Ujhhgtgfeyxiexzf.f2273Ujhhgtgfeyxiexzf;
        c2366Ujhhgtgfeyxiexzf.getClass();
        boolean z = charSequence instanceof C1232feyxiexzfUjhhgtg;
        if (z) {
            ((C1232feyxiexzfUjhhgtg) charSequence).m2719Ujhhgtgfeyxiexzf();
        }
        if (z) {
            c1945feyxiexzfUjhhgtg = new C1945feyxiexzfUjhhgtg((Spannable) charSequence);
            if (c1945feyxiexzfUjhhgtg != null) {
                for (C1777feyxiexzfUjhhgtg c1777feyxiexzfUjhhgtg : c1777feyxiexzfUjhhgtgArr) {
                    spanStart = c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf.getSpanStart(c1777feyxiexzfUjhhgtg);
                    int spanEnd = c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf.getSpanEnd(c1777feyxiexzfUjhhgtg);
                    if (spanStart != i2) {
                        c1945feyxiexzfUjhhgtg.removeSpan(c1777feyxiexzfUjhhgtg);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            }
            ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c1945feyxiexzfUjhhgtg = new C1945feyxiexzfUjhhgtg((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C1777feyxiexzfUjhhgtg.class) <= i2) {
                c1945feyxiexzfUjhhgtg = new C1945feyxiexzfUjhhgtg();
                c1945feyxiexzfUjhhgtg.f6421Ujhhgtgfeyxiexzf = false;
                c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf = new SpannableString(charSequence);
            }
            if (c1945feyxiexzfUjhhgtg != null && (c1777feyxiexzfUjhhgtgArr = (C1777feyxiexzfUjhhgtg[]) c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf.getSpans(i, i2, C1777feyxiexzfUjhhgtg.class)) != null && c1777feyxiexzfUjhhgtgArr.length > 0) {
                while (i < r5) {
                    spanStart = c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf.getSpanStart(c1777feyxiexzfUjhhgtg);
                    int spanEnd2 = c1945feyxiexzfUjhhgtg.f6422Ujhhgtgfeyxiexzf.getSpanEnd(c1777feyxiexzfUjhhgtg);
                    if (spanStart != i2) {
                        c1945feyxiexzfUjhhgtg.removeSpan(c1777feyxiexzfUjhhgtg);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        C1945feyxiexzfUjhhgtg c1945feyxiexzfUjhhgtg2 = (C1945feyxiexzfUjhhgtg) c2366Ujhhgtgfeyxiexzf.m3610Ujhhgtgfeyxiexzf(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C2629Ujhhgtgfeyxiexzf(c1945feyxiexzfUjhhgtg, 11, (C2466feyxiexzfUjhhgtg) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf));
                        if (c1945feyxiexzfUjhhgtg2 != null) {
                            Spannable spannable = c1945feyxiexzfUjhhgtg2.f6422Ujhhgtgfeyxiexzf;
                            if (z) {
                                ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((C1232feyxiexzfUjhhgtg) charSequence2).m2720Ujhhgtgfeyxiexzf();
        throw th;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4912Ujhhgtgfeyxiexzf(AbstractC3389Ujhhgtgfeyxiexzf abstractC3389Ujhhgtgfeyxiexzf) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(abstractC3389Ujhhgtgfeyxiexzf, "initCallback cannot be null");
        this.f10591Ujhhgtgfeyxiexzf.writeLock().lock();
        try {
            if (this.f10593Ujhhgtgfeyxiexzf == 1 || this.f10593Ujhhgtgfeyxiexzf == 2) {
                this.f10594Ujhhgtgfeyxiexzf.post(new RunnableC2474feyxiexzfUjhhgtg(Arrays.asList(abstractC3389Ujhhgtgfeyxiexzf), this.f10593Ujhhgtgfeyxiexzf, (Throwable) null));
            } else {
                this.f10592Ujhhgtgfeyxiexzf.add(abstractC3389Ujhhgtgfeyxiexzf);
            }
        } finally {
            this.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
        }
    }
}
