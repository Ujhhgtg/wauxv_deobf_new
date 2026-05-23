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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3679 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long f11552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f11553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f11554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f11555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f11556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f11557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f11558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Throwable f11559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f11560;

    public C3679(String str, String str2, String str3, Throwable th, int i) {
        String strM1338;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Integer num;
        Object c2585;
        str = (i & 4) != 0 ? AbstractC1270.f4644 : str;
        this.f11552 = 0L;
        this.f11553 = "";
        this.f11554 = str;
        this.f11555 = str2;
        this.f11556 = "";
        int iIntValue = 0;
        this.f11557 = 0;
        this.f11558 = str3;
        this.f11559 = th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f11552 = jCurrentTimeMillis;
        this.f11553 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT).format(new Date(jCurrentTimeMillis));
        if (C3692.m5357() && C3692.f11603) {
            strM1338 = "android-zygote";
        } else {
            
            strM1338 = C0251.m1338();
        }
        this.f11556 = strM1338;
        
        String strM1339 = C0251.m1338();
        int i2 = 0;
        C0243 c0243 = C0251.f1419;
        InterfaceC1742 interfaceC1742 = C0251.f1416[0];
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(c0243.m1323());
        C2873 c2873 = C0152.f1159;
        ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
        c1744M2483.m3493(true);
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.f6370 = "currentActivityThread";
        c1973M3492.m2887();
        C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
        Context context = null;
        Object objM3831 = c1982 != null ? c1982.m3831(new Object[0]) : null;
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.f6370 = "getSystemContext";
        c1973M3493.m2887();
        C1982 c1983 = (C1982) AbstractC0744.m2192(c1973M3493.m3799());
        if (c1983 != null) {
            c1983.m3378(objM3831);
            try {
                c2585 = c1983.invoke(Arrays.copyOf(new Object[0], 0));
            } catch (Throwable th2) {
                c2585 = new C2585(th2);
            }
            context = (Context) (c2585 instanceof C2585 ? null : c2585);
        }
        if (context != null && (packageManager = context.getPackageManager()) != null && (applicationInfo = packageManager.getApplicationInfo(strM1339, 1)) != null) {
            int i3 = applicationInfo.uid;
            C1744 c1744M2482 = AbstractC0968.m2482(AbstractC2519.classToKClass(UserHandle.class));
            ((C1927) c1744M2482.f5843).f6366 = AbstractC2205.m4054();
            c1744M2482.m3493(true);
            MethodResolver c1973M3494 = c1744M2482.m3492();
            c1973M3494.f6370 = "getUserId";
            c1973M3494.m2888(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(Integer.TYPE)}, 1));
            C1982 c1984 = (C1982) AbstractC0744.m2192(c1973M3494.m3799());
            if (c1984 != null && (num = (Integer) c1984.invoke(Integer.valueOf(i3))) != null) {
                iIntValue = num.intValue();
            }
        }
        this.f11557 = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3679)) {
            return false;
        }
        C3679 c3679 = (C3679) obj;
        return this.f11552 == c3679.f11552 && AbstractC2207.m4087(this.f11553, c3679.f11553) && AbstractC2207.m4087(this.f11554, c3679.f11554) && AbstractC2207.m4087(this.f11555, c3679.f11555) && AbstractC2207.m4087(this.f11556, c3679.f11556) && this.f11557 == c3679.f11557 && AbstractC2207.m4087(this.f11558, c3679.f11558) && AbstractC2207.m4087(this.f11559, c3679.f11559);
    }

    public final int hashCode() {
        int iM2775 = AbstractC1194.m2775((Integer.hashCode(this.f11557) + AbstractC1194.m2775(AbstractC1194.m2775(AbstractC1194.m2775(AbstractC1194.m2775(Long.hashCode(this.f11552) * 31, 31, this.f11553), 31, this.f11554), 31, this.f11555), 31, this.f11556)) * 31, 31, this.f11558);
        Throwable th = this.f11559;
        return iM2775 + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i;
        String str = "";
        for (Integer num : AbstractC1270.f4645) {
            int iIntValue = num.intValue();
            if (iIntValue == 1000) {
                str = ((Object) str) + "[" + this.f11554 + "]";
            }
            if (iIntValue == 1001) {
                str = ((Object) str) + "[" + this.f11555 + "]";
            }
            if (iIntValue == 1002 && !this.f11560) {
                String str2 = this.f11556;
                if (!AbstractC2841.m4836(str2)) {
                    str = ((Object) str) + "[" + str2 + "]";
                }
            }
            if (iIntValue == 1003 && !this.f11560 && (i = this.f11557) != 0) {
                str = ((Object) str) + "[" + i + "]";
            }
        }
        String str3 = !AbstractC2841.m4836(str) ? str : null;
        String str4 = this.f11558;
        if (str3 != null) {
            String str5 = ((Object) str) + " " + str4;
            if (true) {
                return str5;
            }
        }
        return str4;
    }
}
