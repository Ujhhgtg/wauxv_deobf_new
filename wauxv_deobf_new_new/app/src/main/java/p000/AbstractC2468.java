package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲇᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2468 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2623 f7842 = new C2623();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Object f7843 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C2135 f7844 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static long m4402(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2466.m4399(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2135 m4403() {
        C2135 c2135 = new C2135(10);
        f7844 = c2135;
        C2623 c2623 = f7842;
        c2623.getClass();
        if (AbstractFutureC0082.f1079.mo1097(c2623, null, c2135)) {
            AbstractFutureC0082.m1101(c2623);
        }
        return f7844;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4404(Context context, boolean z) {
        C2467 c2467M4400;
        int i;
        if (z || f7844 == null) {
            synchronized (f7843) {
                if (!z) {
                    try {
                        if (f7844 != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jM4402 = m4402(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c2467M4400 = C2467.m4400(file3);
                            } catch (IOException unused) {
                                m4403();
                                return;
                            }
                        } else {
                            c2467M4400 = null;
                        }
                        if (c2467M4400 != null && c2467M4400.f7840 == jM4402 && (i = c2467M4400.f7839) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (c2467M4400 != null && c2467M4400.f7839 == 2 && i3 == 1 && length < c2467M4400.f7841) {
                            i3 = 3;
                        }
                        C2467 c2467 = new C2467(1, i3, jM4402, length2);
                        if (c2467M4400 == null || !c2467M4400.equals(c2467)) {
                            try {
                                c2467.m4401(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m4403();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m4403();
                        return;
                    }
                }
                m4403();
            }
        }
    }
}
