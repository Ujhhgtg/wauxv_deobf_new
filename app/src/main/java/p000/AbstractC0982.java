package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Set f3595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f3596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f3598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final long f3599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2873 f3600;

    public AbstractC0982(String str, String str2, Set set, boolean z, int i, float f, long j, int i2) {
        str2 = (i2 & 2) != 0 ? "" : str2;
        set = (i2 & 4) != 0 ? new LinkedHashSet() : set;
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? 0 : i;
        f = (i2 & 32) != 0 ? 0.0f : f;
        j = (i2 & 64) != 0 ? 0L : j;
        this.f3594 = str2;
        this.f3595 = set;
        this.f3596 = z;
        this.f3597 = i;
        this.f3598 = f;
        this.f3599 = j;
        this.f3600 = new C2873(new C0106(16, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2536() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getBoolean(strM2540, this.f3596);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float m2537() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getFloat(strM2540, this.f3598);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m2538() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getInt(strM2540, this.f3597);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long m2539() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getLong(strM2540, this.f3599);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String m2540() {
        return (String) this.f3600.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Set m2541() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getStringSet(strM2540, this.f3595);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String m2542() {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 != null) {
            return c0542.m1891().getString(strM2540, this.f3594);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2543(boolean z) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putBoolean(strM2540, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2544(float f) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putFloat(strM2540, f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2545(int i) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putInt(strM2540, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2546(long j) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putLong(strM2540, j);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2547(Set set) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putStringSet(strM2540, set);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2548(String str) {
        String strM2540 = m2540();
        C0542 c0542 = AbstractC1458.f5192;
        if (c0542 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0542.m1891().putString(strM2540, str);
    }
}
