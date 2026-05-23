package p000;

import com.umeng.analytics.pro.bv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2525 implements InterfaceC3450, InterfaceC3407, Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap f8053 = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C1265 f8054 = new C1265(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8055;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC3450 f8056;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1826 f8057;

    public C2525(int i, InterfaceC3450 interfaceC3450, C1826 c1826) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC3450 == null) {
            throw new NullPointerException("type == null");
        }
        this.f8055 = i;
        this.f8056 = interfaceC3450;
        this.f8057 = c1826;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C2525 m4532(int i, InterfaceC3450 interfaceC3450, C1826 c1826) {
        C2524 c2524 = (C2524) f8054.get();
        c2524.f8050 = i;
        c2524.f8051 = interfaceC3450;
        c2524.f8052 = c1826;
        ConcurrentHashMap concurrentHashMap = f8053;
        C2525 c2525 = (C2525) concurrentHashMap.get(c2524);
        if (c2525 == null) {
            c2525 = new C2525(c2524.f8050, c2524.f8051, c2524.f8052);
            C2525 c2526 = (C2525) concurrentHashMap.putIfAbsent(c2525, c2525);
            if (c2526 != null) {
                return c2526;
            }
        }
        return c2525;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2525) {
            C2525 c2525 = (C2525) obj;
            return m4537(c2525.f8055, c2525.f8056, c2525.f8057);
        }
        if (!(obj instanceof C2524)) {
            return false;
        }
        C2524 c2524 = (C2524) obj;
        return m4537(c2524.f8050, c2524.f8051, c2524.f8052);
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return this.f8056.getType();
    }

    public final int hashCode() {
        C1826 c1826 = this.f8057;
        return ((this.f8056.hashCode() + ((c1826 != null ? c1826.hashCode() : 0) * 31)) * 31) + this.f8055;
    }

    public final String toString() {
        return m4543(false);
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return m4543(true);
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int mo4533() {
        return this.f8056.mo4533();
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo4534() {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2525 c2525) {
        int i = c2525.f8055;
        C1826 c1826 = c2525.f8057;
        int i2 = this.f8055;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c2525) {
            return 0;
        }
        int iCompareTo = this.f8056.getType().f10904.compareTo(c2525.f8056.getType().f10904);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C1826 c1827 = this.f8057;
        if (c1827 == null) {
            return c1826 == null ? 0 : -1;
        }
        if (c1826 == null) {
            return 1;
        }
        return c1827.compareTo(c1826);
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo4536() {
        return this.f8056.mo4536();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m4537(int i, InterfaceC3450 interfaceC3450, C1826 c1826) {
        if (this.f8055 != i || !this.f8056.equals(interfaceC3450)) {
            return false;
        }
        C1826 c1827 = this.f8057;
        if (c1827 != c1826) {
            return c1827 != null && c1827.equals(c1826);
        }
        return true;
    }

    @Override // p000.InterfaceC3450
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3450 mo4538() {
        return this.f8056.mo4538();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m4539(C2525 c2525) {
        return m4541(c2525) && this.f8055 == c2525.f8055;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m4540() {
        return this.f8056.getType().m4966();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m4541(C2525 c2525) {
        if (c2525 != null && this.f8056.getType().equals(c2525.f8056.getType())) {
            Object obj = c2525.f8057;
            C1826 c1826 = this.f8057;
            if (c1826 == obj) {
                return true;
            }
            if (c1826 != null && c1826.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String m4542() {
        return AbstractC1194.m2779(this.f8055, bv.aE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String m4543(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m4542());
        sb.append(":");
        C1826 c1826 = this.f8057;
        if (c1826 != null) {
            sb.append(c1826.toString());
        }
        InterfaceC3450 interfaceC3450 = this.f8056;
        C3448 type = interfaceC3450.getType();
        sb.append(type);
        if (type != interfaceC3450) {
            sb.append("=");
            if (z && (interfaceC3450 instanceof C0917)) {
                sb.append(((C0917) interfaceC3450).m2430());
            } else if (z && (interfaceC3450 instanceof AbstractC0777)) {
                sb.append(interfaceC3450.mo1214());
            } else {
                sb.append(interfaceC3450);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2525 m4544(int i) {
        return this.f8055 == i ? this : m4532(i, this.f8056, this.f8057);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2525 m4545(InterfaceC3450 interfaceC3450) {
        return m4532(this.f8055, interfaceC3450, this.f8057);
    }
}
