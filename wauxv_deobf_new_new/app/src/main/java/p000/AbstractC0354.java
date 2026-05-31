package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.umeng.analytics.pro.bc;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲇᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f1744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f1751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1068 f1738 = C1068.f3861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public EnumC2454 f1739 = EnumC2454.f7818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f1740 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f1741 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f1742 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InterfaceC1772 f1743 = C1195.f4330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C2336 f1745 = new C2336();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0522 f1746 = new C0522(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Class f1747 = Object.class;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f1750 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m1631(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0354) {
            return m1636((AbstractC0354) obj);
        }
        return false;
    }

    public int hashCode() {
        char[] cArr = AbstractC3580.f11185;
        return AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5122(0, AbstractC3580.m5122(0, AbstractC3580.m5122(1, AbstractC3580.m5122(this.f1744 ? 1 : 0, AbstractC3580.m5122(this.f1742, AbstractC3580.m5122(this.f1741, AbstractC3580.m5122(this.f1740 ? 1 : 0, AbstractC3580.m5123(AbstractC3580.m5122(0, AbstractC3580.m5123(AbstractC3580.m5122(0, AbstractC3580.m5123(AbstractC3580.m5122(0, AbstractC3580.m5122(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1738), this.f1739), this.f1745), this.f1746), this.f1747), this.f1743), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC0354 mo1632(AbstractC0354 abstractC0354) {
        if (this.f1749) {
            return clone().mo1632(abstractC0354);
        }
        int i = abstractC0354.f1737;
        if (m1631(abstractC0354.f1737, 1048576)) {
            this.f1751 = abstractC0354.f1751;
        }
        if (m1631(abstractC0354.f1737, 4)) {
            this.f1738 = abstractC0354.f1738;
        }
        if (m1631(abstractC0354.f1737, 8)) {
            this.f1739 = abstractC0354.f1739;
        }
        if (m1631(abstractC0354.f1737, 16)) {
            this.f1737 &= -33;
        }
        if (m1631(abstractC0354.f1737, 32)) {
            this.f1737 &= -17;
        }
        if (m1631(abstractC0354.f1737, 64)) {
            this.f1737 &= -129;
        }
        if (m1631(abstractC0354.f1737, 128)) {
            this.f1737 &= -65;
        }
        if (m1631(abstractC0354.f1737, bc.e)) {
            this.f1740 = abstractC0354.f1740;
        }
        if (m1631(abstractC0354.f1737, 512)) {
            this.f1742 = abstractC0354.f1742;
            this.f1741 = abstractC0354.f1741;
        }
        if (m1631(abstractC0354.f1737, 1024)) {
            this.f1743 = abstractC0354.f1743;
        }
        if (m1631(abstractC0354.f1737, 4096)) {
            this.f1747 = abstractC0354.f1747;
        }
        if (m1631(abstractC0354.f1737, 8192)) {
            this.f1737 &= -16385;
        }
        if (m1631(abstractC0354.f1737, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f1737 &= -8193;
        }
        if (m1631(abstractC0354.f1737, 131072)) {
            this.f1744 = abstractC0354.f1744;
        }
        if (m1631(abstractC0354.f1737, 2048)) {
            this.f1746.putAll(abstractC0354.f1746);
            this.f1750 = abstractC0354.f1750;
        }
        this.f1737 |= abstractC0354.f1737;
        this.f1745.f7541.mo2012(abstractC0354.f1745.f7541);
        m1640();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC0354 clone() {
        try {
            AbstractC0354 abstractC0354 = (AbstractC0354) super.clone();
            C2336 c2336 = new C2336();
            abstractC0354.f1745 = c2336;
            c2336.f7541.mo2012(this.f1745.f7541);
            C0522 c0522 = new C0522(0);
            abstractC0354.f1746 = c0522;
            c0522.putAll(this.f1746);
            abstractC0354.f1748 = false;
            abstractC0354.f1749 = false;
            return abstractC0354;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC0354 m1634(Class cls) {
        if (this.f1749) {
            return clone().m1634(cls);
        }
        this.f1747 = cls;
        this.f1737 |= 4096;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC0354 m1635(C1068 c1068) {
        if (this.f1749) {
            return clone().m1635(c1068);
        }
        this.f1738 = c1068;
        this.f1737 |= 4;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m1636(AbstractC0354 abstractC0354) {
        abstractC0354.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = AbstractC3580.f11185;
        return this.f1740 == abstractC0354.f1740 && this.f1741 == abstractC0354.f1741 && this.f1742 == abstractC0354.f1742 && this.f1744 == abstractC0354.f1744 && this.f1738.equals(abstractC0354.f1738) && this.f1739 == abstractC0354.f1739 && this.f1745.equals(abstractC0354.f1745) && this.f1746.equals(abstractC0354.f1746) && this.f1747.equals(abstractC0354.f1747) && this.f1743.equals(abstractC0354.f1743);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AbstractC0354 m1637(C1102 c1102, AbstractC0401 abstractC0401) {
        if (this.f1749) {
            return clone().m1637(c1102, abstractC0401);
        }
        m1641(C1102.f4123, c1102);
        return m1644(abstractC0401, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0354 m1638(int i, int i2) {
        if (this.f1749) {
            return clone().m1638(i, i2);
        }
        this.f1742 = i;
        this.f1741 = i2;
        this.f1737 |= 512;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC0354 m1639() {
        if (this.f1749) {
            return clone().m1639();
        }
        this.f1739 = EnumC2454.f7819;
        this.f1737 |= 8;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1640() {
        if (this.f1748) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC0354 m1641(C2334 c2334, C1102 c1102) {
        if (this.f1749) {
            return clone().m1641(c2334, c1102);
        }
        AbstractC2727.m4692(c2334);
        this.f1745.f7541.put(c2334, c1102);
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final AbstractC0354 m1642(C2275 c2275) {
        if (this.f1749) {
            return clone().m1642(c2275);
        }
        this.f1743 = c2275;
        this.f1737 |= 1024;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final AbstractC0354 m1643() {
        if (this.f1749) {
            return clone().m1643();
        }
        this.f1740 = false;
        this.f1737 |= bc.e;
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final AbstractC0354 m1644(InterfaceC3484 interfaceC3484, boolean z) {
        if (this.f1749) {
            return clone().m1644(interfaceC3484, z);
        }
        C1106 c1106 = new C1106(interfaceC3484, z);
        m1645(Bitmap.class, interfaceC3484, z);
        m1645(Drawable.class, c1106, z);
        m1645(BitmapDrawable.class, c1106, z);
        m1645(C1454.class, new C1456(interfaceC3484), z);
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final AbstractC0354 m1645(Class cls, InterfaceC3484 interfaceC3484, boolean z) {
        if (this.f1749) {
            return clone().m1645(cls, interfaceC3484, z);
        }
        AbstractC2727.m4692(interfaceC3484);
        this.f1746.put(cls, interfaceC3484);
        int i = this.f1737;
        this.f1737 = 67584 | i;
        this.f1750 = false;
        if (z) {
            this.f1737 = i | 198656;
            this.f1744 = true;
        }
        m1640();
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final AbstractC0354 m1646() {
        if (this.f1749) {
            return clone().m1646();
        }
        this.f1751 = true;
        this.f1737 |= 1048576;
        m1640();
        return this;
    }
}
