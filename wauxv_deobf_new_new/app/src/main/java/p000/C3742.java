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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲀᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3742 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f11712;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f11713;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f11714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f11715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f11716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f11717;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f11718;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Throwable f11719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f11720;

    public C3742(String str, String str2, String str3, Throwable th, int i) {
        String strM1484;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Integer num;
        Object c2641;
        str = (i & 4) != 0 ? AbstractC0738.f2835 : str;
        this.f11712 = 0L;
        this.f11713 = "";
        this.f11714 = str;
        this.f11715 = str2;
        this.f11716 = "";
        int iIntValue = 0;
        this.f11717 = 0;
        this.f11718 = str3;
        this.f11719 = th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f11712 = jCurrentTimeMillis;
        this.f11713 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT).format(new Date(jCurrentTimeMillis));
        if (C3755.m5365() && C3755.f11760) {
            strM1484 = "android-zygote";
        } else {
            C0261.f1489.getClass();
            strM1484 = C0261.m1484();
        }
        this.f11716 = strM1484;
        C0261.f1489.getClass();
        String strM1485 = C0261.m1484();
        int i2 = AbstractC1768.f5906;
        C0253 c0253 = C0261.f1493;
        InterfaceC1766 interfaceC1766 = C0261.f1490[0];
        C1681 c1681M4712 = AbstractC2727.m4712(c0253.m1469());
        C2933 c2933 = C0160.f1227;
        ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
        c1681M4712.m3561(true);
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "currentActivityThread";
        c2004M3560.m3006();
        C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
        Context context = null;
        Object objM4025 = c2013 != null ? c2013.m4025(new Object[0]) : null;
        C2004 c2004M3561 = c1681M4712.m3560();
        c2004M3561.f6475 = "getSystemContext";
        c2004M3561.m3006();
        C2013 c2014 = (C2013) AbstractC0739.m2291(c2004M3561.m3993());
        if (c2014 != null) {
            c2014.m3542(objM4025);
            try {
                c2641 = c2014.m4026(Arrays.copyOf(new Object[0], 0));
            } catch (Throwable th2) {
                c2641 = new C2641(th2);
            }
            context = (Context) (c2641 instanceof C2641 ? null : c2641);
        }
        if (context != null && (packageManager = context.getPackageManager()) != null && (applicationInfo = packageManager.getApplicationInfo(strM1485, 1)) != null) {
            int i3 = applicationInfo.uid;
            C1681 c1681M4711 = AbstractC2727.m4711(AbstractC2574.m4549(UserHandle.class));
            ((C1958) c1681M4711.f5660).f6471 = AbstractC2234.m4168();
            c1681M4711.m3561(true);
            C2004 c2004M3562 = c1681M4711.m3560();
            c2004M3562.f6475 = "getUserId";
            c2004M3562.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Integer.TYPE)}, 1));
            C2013 c2015 = (C2013) AbstractC0739.m2291(c2004M3562.m3993());
            if (c2015 != null && (num = (Integer) c2015.m4026(Integer.valueOf(i3))) != null) {
                iIntValue = num.intValue();
            }
        }
        this.f11717 = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3742)) {
            return false;
        }
        C3742 c3742 = (C3742) obj;
        return this.f11712 == c3742.f11712 && AbstractC1469.m3322(this.f11713, c3742.f11713) && AbstractC1469.m3322(this.f11714, c3742.f11714) && AbstractC1469.m3322(this.f11715, c3742.f11715) && AbstractC1469.m3322(this.f11716, c3742.f11716) && this.f11717 == c3742.f11717 && AbstractC1469.m3322(this.f11718, c3742.f11718) && AbstractC1469.m3322(this.f11719, c3742.f11719);
    }

    public final int hashCode() {
        int iM4621 = AbstractC2647.m4621((Integer.hashCode(this.f11717) + AbstractC2647.m4621(AbstractC2647.m4621(AbstractC2647.m4621(AbstractC2647.m4621(Long.hashCode(this.f11712) * 31, 31, this.f11713), 31, this.f11714), 31, this.f11715), 31, this.f11716)) * 31, 31, this.f11718);
        Throwable th = this.f11719;
        return iM4621 + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i;
        String str = "";
        for (Integer num : AbstractC0738.f2836) {
            int iIntValue = num.intValue();
            if (iIntValue == 1000) {
                str = ((Object) str) + "[" + this.f11714 + "]";
            }
            if (iIntValue == 1001) {
                str = ((Object) str) + "[" + this.f11715 + "]";
            }
            if (iIntValue == 1002 && !this.f11720) {
                String str2 = this.f11716;
                if (!AbstractC2901.m4869(str2)) {
                    str = ((Object) str) + "[" + str2 + "]";
                }
            }
            if (iIntValue == 1003 && !this.f11720 && (i = this.f11717) != 0) {
                str = ((Object) str) + "[" + i + "]";
            }
        }
        String str3 = !AbstractC2901.m4869(str) ? str : null;
        String str4 = this.f11718;
        if (str3 != null) {
            String str5 = ((Object) str) + " " + str4;
            if (str5 != null) {
                return str5;
            }
        }
        return str4;
    }
}
