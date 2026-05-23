package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.umeng.analytics.pro.bc;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0379 implements Cloneable {

    public int f1766;

    public boolean f1773;

    public boolean f1777;

    public boolean f1778;

    public boolean f1780;

    public C1063 f1767 = C1063.f3850;

    public EnumC2401 f1768 = EnumC2401.f7674;

    public boolean f1769 = true;

    public int f1770 = -1;

    public int f1771 = -1;

    public InterfaceC1749 f1772 = C1193.f4333;

    public C2303 f1774 = new C2303();

    public C0545 f1775 = new C0545(0);

    public Class f1776 = Object.class;

    public boolean f1779 = true;

    public static boolean m1525(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0379) {
            return m1530((AbstractC0379) obj);
        }
        return false;
    }

    public int hashCode() {
        char[] cArr = AbstractC3522.f11032;
        return AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5110(0, AbstractC3522.m5110(0, AbstractC3522.m5110(1, AbstractC3522.m5110(this.f1773 ? 1 : 0, AbstractC3522.m5110(this.f1771, AbstractC3522.m5110(this.f1770, AbstractC3522.m5110(this.f1769 ? 1 : 0, AbstractC3522.m5111(AbstractC3522.m5110(0, AbstractC3522.m5111(AbstractC3522.m5110(0, AbstractC3522.m5111(AbstractC3522.m5110(0, AbstractC3522.m5110(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1767), this.f1768), this.f1774), this.f1775), this.f1776), this.f1772), null);
    }

    public AbstractC0379 mo1526(AbstractC0379 abstractC0379) {
        if (this.f1778) {
            return clone().mo1526(abstractC0379);
        }
        int i = abstractC0379.f1766;
        if (m1525(abstractC0379.f1766, 1048576)) {
            this.f1780 = abstractC0379.f1780;
        }
        if (m1525(abstractC0379.f1766, 4)) {
            this.f1767 = abstractC0379.f1767;
        }
        if (m1525(abstractC0379.f1766, 8)) {
            this.f1768 = abstractC0379.f1768;
        }
        if (m1525(abstractC0379.f1766, 16)) {
            this.f1766 &= -33;
        }
        if (m1525(abstractC0379.f1766, 32)) {
            this.f1766 &= -17;
        }
        if (m1525(abstractC0379.f1766, 64)) {
            this.f1766 &= -129;
        }
        if (m1525(abstractC0379.f1766, 128)) {
            this.f1766 &= -65;
        }
        if (m1525(abstractC0379.f1766, 256)) {
            this.f1769 = abstractC0379.f1769;
        }
        if (m1525(abstractC0379.f1766, 512)) {
            this.f1771 = abstractC0379.f1771;
            this.f1770 = abstractC0379.f1770;
        }
        if (m1525(abstractC0379.f1766, 1024)) {
            this.f1772 = abstractC0379.f1772;
        }
        if (m1525(abstractC0379.f1766, 4096)) {
            this.f1776 = abstractC0379.f1776;
        }
        if (m1525(abstractC0379.f1766, 8192)) {
            this.f1766 &= -16385;
        }
        if (m1525(abstractC0379.f1766, 16384)) {
            this.f1766 &= -8193;
        }
        if (m1525(abstractC0379.f1766, 131072)) {
            this.f1773 = abstractC0379.f1773;
        }
        if (m1525(abstractC0379.f1766, 2048)) {
            this.f1775.putAll(abstractC0379.f1775);
            this.f1779 = abstractC0379.f1779;
        }
        this.f1766 |= abstractC0379.f1766;
        this.f1774.f7419.mo1917(abstractC0379.f1774.f7419);
        m1534();
        return this;
    }

    @Override // 
    public AbstractC0379 clone() {
        try {
            AbstractC0379 abstractC0379 = (AbstractC0379) super.clone();
            C2303 c2303 = new C2303();
            abstractC0379.f1774 = c2303;
            c2303.f7419.mo1917(this.f1774.f7419);
            C0545 c0545 = new C0545(0);
            abstractC0379.f1775 = c0545;
            c0545.putAll(this.f1775);
            abstractC0379.f1777 = false;
            abstractC0379.f1778 = false;
            return abstractC0379;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final AbstractC0379 m1528(Class cls) {
        if (this.f1778) {
            return clone().m1528(cls);
        }
        this.f1776 = cls;
        this.f1766 |= 4096;
        m1534();
        return this;
    }

    public final AbstractC0379 m1529(C1063 c1063) {
        if (this.f1778) {
            return clone().m1529(c1063);
        }
        this.f1767 = c1063;
        this.f1766 |= 4;
        m1534();
        return this;
    }

    public final boolean m1530(AbstractC0379 abstractC0379) {
        
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = AbstractC3522.f11032;
        return this.f1769 == abstractC0379.f1769 && this.f1770 == abstractC0379.f1770 && this.f1771 == abstractC0379.f1771 && this.f1773 == abstractC0379.f1773 && this.f1767.equals(abstractC0379.f1767) && this.f1768 == abstractC0379.f1768 && this.f1774.equals(abstractC0379.f1774) && this.f1775.equals(abstractC0379.f1775) && this.f1776.equals(abstractC0379.f1776) && this.f1772.equals(abstractC0379.f1772);
    }

    public final AbstractC0379 m1531(C1096 c1096, AbstractC0426 abstractC0426) {
        if (this.f1778) {
            return clone().m1531(c1096, abstractC0426);
        }
        m1535(C1096.f4112, c1096);
        return m1538(abstractC0426, false);
    }

    public final AbstractC0379 m1532(int i, int i2) {
        if (this.f1778) {
            return clone().m1532(i, i2);
        }
        this.f1771 = i;
        this.f1770 = i2;
        this.f1766 |= 512;
        m1534();
        return this;
    }

    public final AbstractC0379 m1533() {
        if (this.f1778) {
            return clone().m1533();
        }
        this.f1768 = EnumC2401.f7675;
        this.f1766 |= 8;
        m1534();
        return this;
    }

    public final void m1534() {
        if (this.f1777) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final AbstractC0379 m1535(C2301 c2301, C1096 c1096) {
        if (this.f1778) {
            return clone().m1535(c2301, c1096);
        }
        AbstractC1460.m3209(c2301);
        this.f1774.f7419.put(c2301, c1096);
        m1534();
        return this;
    }

    public final AbstractC0379 m1536(C2244 c2244) {
        if (this.f1778) {
            return clone().m1536(c2244);
        }
        this.f1772 = c2244;
        this.f1766 |= 1024;
        m1534();
        return this;
    }

    public final AbstractC0379 m1537() {
        if (this.f1778) {
            return clone().m1537();
        }
        this.f1769 = false;
        this.f1766 |= 256;
        m1534();
        return this;
    }

    public final AbstractC0379 m1538(InterfaceC3427 interfaceC3427, boolean z) {
        if (this.f1778) {
            return clone().m1538(interfaceC3427, z);
        }
        C1100 c1100 = new C1100(interfaceC3427, z);
        m1539(Bitmap.class, interfaceC3427, z);
        m1539(Drawable.class, c1100, z);
        m1539(BitmapDrawable.class, c1100, z);
        m1539(C1446.class, new C1448(interfaceC3427), z);
        m1534();
        return this;
    }

    public final AbstractC0379 m1539(Class cls, InterfaceC3427 interfaceC3427, boolean z) {
        if (this.f1778) {
            return clone().m1539(cls, interfaceC3427, z);
        }
        AbstractC1460.m3209(interfaceC3427);
        this.f1775.put(cls, interfaceC3427);
        int i = this.f1766;
        this.f1766 = 67584 | i;
        this.f1779 = false;
        if (z) {
            this.f1766 = i | 198656;
            this.f1773 = true;
        }
        m1534();
        return this;
    }

    public final AbstractC0379 m1540() {
        if (this.f1778) {
            return clone().m1540();
        }
        this.f1780 = true;
        this.f1766 |= 1048576;
        m1534();
        return this;
    }
}
