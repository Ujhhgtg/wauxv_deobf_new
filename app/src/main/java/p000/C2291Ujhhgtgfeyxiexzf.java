package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴ要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2291Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f7514Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f7515Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f7516Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f7517Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f7518Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f7519Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final String f7520Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Throwable f7521Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f7522Ujhhgtgfeyxiexzf;

    public C2291Ujhhgtgfeyxiexzf(String str, String str2, String str3, Throwable th, int i) {
        String strM3617Ujhhgtgfeyxiexzf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Integer num;
        Object c0919feyxiexzfUjhhgtg;
        str = (i & 4) != 0 ? AbstractC1937feyxiexzfUjhhgtg.f6409Ujhhgtgfeyxiexzf : str;
        this.f7514Ujhhgtgfeyxiexzf = 0L;
        this.f7515Ujhhgtgfeyxiexzf = "";
        this.f7516Ujhhgtgfeyxiexzf = str;
        this.f7517Ujhhgtgfeyxiexzf = str2;
        this.f7518Ujhhgtgfeyxiexzf = "";
        int iIntValue = 0;
        this.f7519Ujhhgtgfeyxiexzf = 0;
        this.f7520Ujhhgtgfeyxiexzf = str3;
        this.f7521Ujhhgtgfeyxiexzf = th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f7514Ujhhgtgfeyxiexzf = jCurrentTimeMillis;
        this.f7515Ujhhgtgfeyxiexzf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT).format(new Date(jCurrentTimeMillis));
        if (C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf() && C2283feyxiexzfUjhhgtg.f7480Ujhhgtgfeyxiexzf) {
            strM3617Ujhhgtgfeyxiexzf = "android-zygote";
        } else {
            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
            strM3617Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf();
        }
        this.f7518Ujhhgtgfeyxiexzf = strM3617Ujhhgtgfeyxiexzf;
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
        String strM3617Ujhhgtgfeyxiexzf2 = C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf();
        int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.f7729Ujhhgtgfeyxiexzf;
        InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.f7726Ujhhgtgfeyxiexzf[0];
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(c2366Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
        ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
        c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "currentActivityThread";
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4862Ujhhgtgfeyxiexzf();
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
        Context context = null;
        Object objM1649Ujhhgtgfeyxiexzf = c0393Ujhhgtgfeyxiexzf != null ? c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(new Object[0]) : null;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getSystemContext";
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m4862Ujhhgtgfeyxiexzf();
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf2 = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf());
        if (c0393Ujhhgtgfeyxiexzf2 != null) {
            c0393Ujhhgtgfeyxiexzf2.m1940Ujhhgtgfeyxiexzf(objM1649Ujhhgtgfeyxiexzf);
            try {
                c0919feyxiexzfUjhhgtg = c0393Ujhhgtgfeyxiexzf2.m1650Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[0], 0));
            } catch (Throwable th2) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th2);
            }
            context = (Context) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
        }
        if (context != null && (packageManager = context.getPackageManager()) != null && (applicationInfo = packageManager.getApplicationInfo(strM3617Ujhhgtgfeyxiexzf2, 1)) != null) {
            int i3 = applicationInfo.uid;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(UserHandle.class));
            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
            c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "getUserId";
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE)}, 1));
            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf3 = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf());
            if (c0393Ujhhgtgfeyxiexzf3 != null && (num = (Integer) c0393Ujhhgtgfeyxiexzf3.m1650Ujhhgtgfeyxiexzf(Integer.valueOf(i3))) != null) {
                iIntValue = num.intValue();
            }
        }
        this.f7519Ujhhgtgfeyxiexzf = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2291Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2291Ujhhgtgfeyxiexzf c2291Ujhhgtgfeyxiexzf = (C2291Ujhhgtgfeyxiexzf) obj;
        return this.f7514Ujhhgtgfeyxiexzf == c2291Ujhhgtgfeyxiexzf.f7514Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7515Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7515Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7516Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7516Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7517Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7517Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7518Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7518Ujhhgtgfeyxiexzf) && this.f7519Ujhhgtgfeyxiexzf == c2291Ujhhgtgfeyxiexzf.f7519Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7520Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7520Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7521Ujhhgtgfeyxiexzf, c2291Ujhhgtgfeyxiexzf.f7521Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iM2415Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((Integer.hashCode(this.f7519Ujhhgtgfeyxiexzf) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(Long.hashCode(this.f7514Ujhhgtgfeyxiexzf) * 31, 31, this.f7515Ujhhgtgfeyxiexzf), 31, this.f7516Ujhhgtgfeyxiexzf), 31, this.f7517Ujhhgtgfeyxiexzf), 31, this.f7518Ujhhgtgfeyxiexzf)) * 31, 31, this.f7520Ujhhgtgfeyxiexzf);
        Throwable th = this.f7521Ujhhgtgfeyxiexzf;
        return iM2415Ujhhgtgfeyxiexzf + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i;
        String str = "";
        for (Integer num : AbstractC1937feyxiexzfUjhhgtg.f6410Ujhhgtgfeyxiexzf) {
            int iIntValue = num.intValue();
            if (iIntValue == 1000) {
                str = ((Object) str) + "[" + this.f7516Ujhhgtgfeyxiexzf + "]";
            }
            if (iIntValue == 1001) {
                str = ((Object) str) + "[" + this.f7517Ujhhgtgfeyxiexzf + "]";
            }
            if (iIntValue == 1002 && !this.f7522Ujhhgtgfeyxiexzf) {
                String str2 = this.f7518Ujhhgtgfeyxiexzf;
                if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str2)) {
                    str = ((Object) str) + "[" + str2 + "]";
                }
            }
            if (iIntValue == 1003 && !this.f7522Ujhhgtgfeyxiexzf && (i = this.f7519Ujhhgtgfeyxiexzf) != 0) {
                str = ((Object) str) + "[" + i + "]";
            }
        }
        String str3 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) ? str : null;
        String str4 = this.f7520Ujhhgtgfeyxiexzf;
        if (str3 != null) {
            String str5 = ((Object) str) + " " + str4;
            if (str5 != null) {
                return str5;
            }
        }
        return str4;
    }
}
