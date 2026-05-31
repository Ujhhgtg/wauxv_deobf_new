package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1148 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Object f4247 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static volatile C1148 f4248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f4249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0279 f4250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile int f4251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Handler f4252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2140 f4253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC1147 f4254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0348 f4255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f4256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0990 f4257;

    public C1148(C1382 c1382) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4249 = reentrantReadWriteLock;
        this.f4251 = 3;
        InterfaceC1147 interfaceC1147 = (InterfaceC1147) c1382.f4245;
        this.f4254 = interfaceC1147;
        int i = c1382.f4244;
        this.f4256 = i;
        this.f4257 = (C0990) c1382.f4246;
        this.f4252 = new Handler(Looper.getMainLooper());
        this.f4250 = new C0279(0);
        this.f4255 = new C0348(24);
        C2140 c2140 = new C2140(this);
        this.f4253 = c2140;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f4251 = 0;
            } catch (Throwable th) {
                this.f4249.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m2898() == 0) {
            try {
                interfaceC1147.mo2738(new C1143(c2140));
            } catch (Throwable th2) {
                m2900(th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1148 m2897() {
        C1148 c1148;
        synchronized (f4247) {
            try {
                c1148 = f4248;
                if (!(c1148 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1148;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2898() {
        this.f4249.readLock().lock();
        try {
            return this.f4251;
        } finally {
            this.f4249.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2899() {
        if (!(this.f4256 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m2898() == 1) {
            return;
        }
        this.f4249.writeLock().lock();
        try {
            if (this.f4251 == 0) {
                this.f4249.writeLock().unlock();
                return;
            }
            this.f4251 = 0;
            this.f4249.writeLock().unlock();
            C2140 c2140 = this.f4253;
            C1148 c1148 = (C1148) c2140.f7070;
            try {
                c1148.f4254.mo2738(new C1143(c2140));
            } catch (Throwable th) {
                c1148.m2900(th);
            }
        } catch (Throwable th2) {
            this.f4249.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2900(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4249.writeLock().lock();
        try {
            this.f4251 = 2;
            arrayList.addAll(this.f4250);
            this.f4250.clear();
            this.f4249.writeLock().unlock();
            this.f4252.post(new RunnableC0361(arrayList, this.f4251, th));
        } catch (Throwable th2) {
            this.f4249.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final CharSequence m2901(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        C3522[] c3522Arr;
        int spanStart;
        if (!(m2898() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C1787.m3662("start should be <= than end", i <= i2);
        C3561 c3561 = null;
        if (charSequence == null) {
            return null;
        }
        C1787.m3662("start should be < than charSequence length", i <= charSequence.length());
        C1787.m3662("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0253 c0253 = (C0253) this.f4253.f7071;
        c0253.getClass();
        boolean z = charSequence instanceof C2853;
        if (z) {
            ((C2853) charSequence).m4804();
        }
        if (z) {
            c3561 = new C3561((Spannable) charSequence);
            if (c3561 != null) {
                for (C3522 c3522 : c3522Arr) {
                    spanStart = c3561.f11157.getSpanStart(c3522);
                    int spanEnd = c3561.f11157.getSpanEnd(c3522);
                    if (spanStart != i2) {
                        c3561.removeSpan(c3522);
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
            ((C2853) charSequence2).m4805();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c3561 = new C3561((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    ((C2853) charSequence2).m4805();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C3522.class) <= i2) {
                c3561 = new C3561();
                c3561.f11156 = false;
                c3561.f11157 = new SpannableString(charSequence);
            }
            if (c3561 != null && (c3522Arr = (C3522[]) c3561.f11157.getSpans(i, i2, C3522.class)) != null && c3522Arr.length > 0) {
                while (i < r5) {
                    spanStart = c3561.f11157.getSpanStart(c3522);
                    int spanEnd2 = c3561.f11157.getSpanEnd(c3522);
                    if (spanStart != i2) {
                        c3561.removeSpan(c3522);
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
                        C3561 c3562 = (C3561) c0253.m1474(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C0519(c3561, 11, (C0348) c0253.f1478));
                        if (c3562 != null) {
                            Spannable spannable = c3562.f11157;
                            if (z) {
                                ((C2853) charSequence2).m4805();
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
                        ((C2853) charSequence2).m4805();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((C2853) charSequence2).m4805();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((C2853) charSequence2).m4805();
        throw th;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2902(AbstractC1146 abstractC1146) {
        C1787.m3664(abstractC1146, "initCallback cannot be null");
        this.f4249.writeLock().lock();
        try {
            if (this.f4251 == 1 || this.f4251 == 2) {
                this.f4252.post(new RunnableC0361(Arrays.asList(abstractC1146), this.f4251, (Throwable) null));
            } else {
                this.f4250.add(abstractC1146);
            }
        } finally {
            this.f4249.writeLock().unlock();
        }
    }
}
