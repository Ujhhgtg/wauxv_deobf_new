package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Set f3611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f3612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f3614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final long f3615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2933 f3616;

    public AbstractC0986(String str, String str2, Set set, boolean z, int i, float f, long j, int i2) {
        str2 = (i2 & 2) != 0 ? "" : str2;
        set = (i2 & 4) != 0 ? new LinkedHashSet() : set;
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? 0 : i;
        f = (i2 & 32) != 0 ? 0.0f : f;
        j = (i2 & 64) != 0 ? 0L : j;
        this.f3610 = str2;
        this.f3611 = set;
        this.f3612 = z;
        this.f3613 = i;
        this.f3614 = f;
        this.f3615 = j;
        this.f3616 = new C2933(new C0114(str, 18));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2660() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getBoolean(strM2664, this.f3612);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float m2661() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getFloat(strM2664, this.f3614);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m2662() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getInt(strM2664, this.f3613);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long m2663() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getLong(strM2664, this.f3615);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String m2664() {
        return (String) this.f3616.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Set m2665() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getStringSet(strM2664, this.f3611);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String m2666() {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 != null) {
            return c0519.m1985().getString(strM2664, this.f3610);
        }
        throw new IllegalArgumentException("DefaultConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2667(boolean z) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putBoolean(strM2664, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2668(float f) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putFloat(strM2664, f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2669(int i) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putInt(strM2664, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2670(long j) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putLong(strM2664, j);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2671(Set set) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putStringSet(strM2664, set);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2672(String str) {
        String strM2664 = m2664();
        C0519 c0519 = AbstractC2902.f9278;
        if (c0519 == null) {
            throw new IllegalArgumentException("DefaultConfig must be init".toString());
        }
        c0519.m1985().putString(strM2664, str);
    }
}
