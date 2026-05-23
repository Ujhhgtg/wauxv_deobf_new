package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2415 {

    public static final C2567 f7698 = new C2567();

    public static final Object f7699 = new Object();

    public static C2102 f7700 = null;

    public static long m4381(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2413.m4378(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C2102 m4382() {
        C2102 c2102 = new C2102(10);
        f7700 = c2102;
        C2567 c2567 = f7698;
        
        if (AbstractFutureC0074.f1014.mo952(c2567, null, c2102)) {
            AbstractFutureC0074.m956(c2567);
        }
        return f7700;
    }

    public static void m4383(Context context, boolean z) {
        C2414 c2414M4379;
        int i;
        if (z || f7700 == null) {
            synchronized (f7699) {
                if (!z) {
                    try {
                        if (f7700 != null) {
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
                        long jM4381 = m4381(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c2414M4379 = C2414.m4379(file3);
                            } catch (IOException unused) {
                                m4382();
                                return;
                            }
                        } else {
                            c2414M4379 = null;
                        }
                        if (c2414M4379 != null && c2414M4379.f7696 == jM4381 && (i = c2414M4379.f7695) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (c2414M4379 != null && c2414M4379.f7695 == 2 && i3 == 1 && length < c2414M4379.f7697) {
                            i3 = 3;
                        }
                        C2414 c2414 = new C2414(1, i3, jM4381, length2);
                        if (c2414M4379 == null || !c2414M4379.equals(c2414)) {
                            try {
                                c2414.m4380(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m4382();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m4382();
                        return;
                    }
                }
                m4382();
            }
        }
    }
}
