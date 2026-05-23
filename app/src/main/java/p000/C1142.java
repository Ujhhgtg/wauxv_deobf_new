package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1142 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Object f4235 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static volatile C1142 f4236;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f4237;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0269 f4238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile int f4239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Handler f4240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2107 f4241;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC1141 f4242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0373 f4243;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f4244;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0986 f4245;

    public C1142(C1374 c1374) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4237 = reentrantReadWriteLock;
        this.f4239 = 3;
        InterfaceC1141 interfaceC1141 = (InterfaceC1141) c1374.f4233;
        this.f4242 = interfaceC1141;
        int i = c1374.f4232;
        this.f4244 = i;
        this.f4245 = (C0986) c1374.f4234;
        this.f4240 = new Handler(Looper.getMainLooper());
        this.f4238 = new C0269(0);
        this.f4243 = new C0373(23);
        C2107 c2107 = new C2107(this);
        this.f4241 = c2107;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f4239 = 0;
            } catch (Throwable th) {
                this.f4237.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m2754() == 0) {
            try {
                interfaceC1141.mo2614(new C1137(c2107));
            } catch (Throwable th2) {
                m2756(th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1142 m2753() {
        C1142 c1142;
        synchronized (f4235) {
            try {
                c1142 = f4236;
                if (!(c1142 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1142;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2754() {
        this.f4237.readLock().lock();
        try {
            return this.f4239;
        } finally {
            this.f4237.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2755() {
        if (!(this.f4244 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m2754() == 1) {
            return;
        }
        this.f4237.writeLock().lock();
        try {
            if (this.f4239 == 0) {
                this.f4237.writeLock().unlock();
                return;
            }
            this.f4239 = 0;
            this.f4237.writeLock().unlock();
            C2107 c2107 = this.f4241;
            C1142 c1142 = (C1142) c2107.f6946;
            try {
                c1142.f4242.mo2614(new C1137(c2107));
            } catch (Throwable th) {
                c1142.m2756(th);
            }
        } catch (Throwable th2) {
            this.f4237.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2756(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4237.writeLock().lock();
        try {
            this.f4239 = 2;
            arrayList.addAll(this.f4238);
            this.f4238.clear();
            this.f4237.writeLock().unlock();
            this.f4240.post(new RunnableC0386(arrayList, this.f4239, th));
        } catch (Throwable th2) {
            this.f4237.writeLock().unlock();
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
    public final CharSequence m2757(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        C3466[] c3466Arr;
        int spanStart;
        if (!(m2754() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC2665.m4658("start should be <= than end", i <= i2);
        C3504 c3504 = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC2665.m4658("start should be < than charSequence length", i <= charSequence.length());
        AbstractC2665.m4658("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0243 c0243 = (C0243) this.f4241.f6947;
        c0243.getClass();
        boolean z = charSequence instanceof C2793;
        if (z) {
            ((C2793) charSequence).m4771();
        }
        if (z) {
            c3504 = new C3504((Spannable) charSequence);
            if (c3504 != null) {
                for (C3466 c3466 : c3466Arr) {
                    spanStart = c3504.f11005.getSpanStart(c3466);
                    int spanEnd = c3504.f11005.getSpanEnd(c3466);
                    if (spanStart != i2) {
                        c3504.removeSpan(c3466);
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
            ((C2793) charSequence2).m4772();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c3504 = new C3504((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    ((C2793) charSequence2).m4772();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C3466.class) <= i2) {
                c3504 = new C3504();
                c3504.f11004 = false;
                c3504.f11005 = new SpannableString(charSequence);
            }
            if (c3504 != null && (c3466Arr = (C3466[]) c3504.f11005.getSpans(i, i2, C3466.class)) != null && c3466Arr.length > 0) {
                while (i < r5) {
                    spanStart = c3504.f11005.getSpanStart(c3466);
                    int spanEnd2 = c3504.f11005.getSpanEnd(c3466);
                    if (spanStart != i2) {
                        c3504.removeSpan(c3466);
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
                        C3504 c3505 = (C3504) c0243.m1328(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C0542(c3504, 10, (C0373) c0243.f1404));
                        if (c3505 != null) {
                            Spannable spannable = c3505.f11005;
                            if (z) {
                                ((C2793) charSequence2).m4772();
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
                        ((C2793) charSequence2).m4772();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((C2793) charSequence2).m4772();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((C2793) charSequence2).m4772();
        throw th;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2758(AbstractC1140 abstractC1140) {
        AbstractC2665.m4661(abstractC1140, "initCallback cannot be null");
        this.f4237.writeLock().lock();
        try {
            if (this.f4239 == 1 || this.f4239 == 2) {
                this.f4240.post(new RunnableC0386(Arrays.asList(abstractC1140), this.f4239, (Throwable) null));
            } else {
                this.f4238.add(abstractC1140);
            }
        } finally {
            this.f4237.writeLock().unlock();
        }
    }
}
