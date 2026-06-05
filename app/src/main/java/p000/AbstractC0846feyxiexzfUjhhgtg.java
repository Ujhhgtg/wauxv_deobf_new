package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0905feyxiexzfUjhhgtg f3333Ujhhgtgfeyxiexzf = new C0905feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object f3334Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C0420Ujhhgtgfeyxiexzf f3335Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static long m2253Ujhhgtgfeyxiexzf(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2958feyxiexzfUjhhgtg.m4409Ujhhgtgfeyxiexzf(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C0420Ujhhgtgfeyxiexzf m2254Ujhhgtgfeyxiexzf() {
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(10);
        f3335Ujhhgtgfeyxiexzf = c0420Ujhhgtgfeyxiexzf;
        C0905feyxiexzfUjhhgtg c0905feyxiexzfUjhhgtg = f3333Ujhhgtgfeyxiexzf;
        c0905feyxiexzfUjhhgtg.getClass();
        if (AbstractFutureC2945feyxiexzfUjhhgtg.f9238Ujhhgtgfeyxiexzf.mo4300Ujhhgtgfeyxiexzf(c0905feyxiexzfUjhhgtg, null, c0420Ujhhgtgfeyxiexzf)) {
            AbstractFutureC2945feyxiexzfUjhhgtg.m4304Ujhhgtgfeyxiexzf(c0905feyxiexzfUjhhgtg);
        }
        return f3335Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m2255Ujhhgtgfeyxiexzf(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        C0847feyxiexzfUjhhgtg c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf;
        C0847feyxiexzfUjhhgtg c0847feyxiexzfUjhhgtg;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f3335Ujhhgtgfeyxiexzf == null) {
            synchronized (f3334Ujhhgtgfeyxiexzf) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jM2253Ujhhgtgfeyxiexzf = m2253Ujhhgtgfeyxiexzf(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf = C0847feyxiexzfUjhhgtg.m2256Ujhhgtgfeyxiexzf(file3);
                        } else {
                            c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf = null;
                        }
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf != null) {
                            i = 3;
                        }
                        c0847feyxiexzfUjhhgtg = new C0847feyxiexzfUjhhgtg(1, i, jM2253Ujhhgtgfeyxiexzf, length);
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf != null) {
                            c0847feyxiexzfUjhhgtg.m2257Ujhhgtgfeyxiexzf(file3);
                        } else {
                            c0847feyxiexzfUjhhgtg.m2257Ujhhgtgfeyxiexzf(file3);
                        }
                        m2254Ujhhgtgfeyxiexzf();
                        return;
                    }
                    m2254Ujhhgtgfeyxiexzf();
                    return;
                }
                if (f3335Ujhhgtgfeyxiexzf != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    try {
                        long jM2253Ujhhgtgfeyxiexzf2 = m2253Ujhhgtgfeyxiexzf(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf = C0847feyxiexzfUjhhgtg.m2256Ujhhgtgfeyxiexzf(file3);
                            } catch (IOException unused2) {
                                m2254Ujhhgtgfeyxiexzf();
                                return;
                            }
                        } else {
                            c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf = null;
                        }
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf == null && c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf.f3338Ujhhgtgfeyxiexzf == jM2253Ujhhgtgfeyxiexzf2 && (i3 = c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf.f3337Ujhhgtgfeyxiexzf) != 2) {
                            i = i3;
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z && z4 && i != 1) {
                            i = 2;
                        }
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf != null && c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf.f3337Ujhhgtgfeyxiexzf == 2 && i == 1 && length3 < c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf.f3339Ujhhgtgfeyxiexzf) {
                            i = 3;
                        }
                        c0847feyxiexzfUjhhgtg = new C0847feyxiexzfUjhhgtg(1, i, jM2253Ujhhgtgfeyxiexzf2, length);
                        if (c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf != null || !c0847feyxiexzfUjhhgtgM2256Ujhhgtgfeyxiexzf.equals(c0847feyxiexzfUjhhgtg)) {
                            try {
                                c0847feyxiexzfUjhhgtg.m2257Ujhhgtgfeyxiexzf(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m2254Ujhhgtgfeyxiexzf();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m2254Ujhhgtgfeyxiexzf();
                        return;
                    }
                }
                m2254Ujhhgtgfeyxiexzf();
                return;
                throw th;
            }
        }
    }
}
