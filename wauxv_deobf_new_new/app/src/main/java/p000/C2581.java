package p000;

import com.umeng.analytics.pro.bv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2581 implements InterfaceC3507, InterfaceC3466, Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap f8203 = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1267 f8204 = new C1267(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f8205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC3507 f8206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1853 f8207;

    public C2581(int i, InterfaceC3507 interfaceC3507, C1853 c1853) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC3507 == null) {
            throw new NullPointerException("type == null");
        }
        this.f8205 = i;
        this.f8206 = interfaceC3507;
        this.f8207 = c1853;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C2581 m4554(int i, InterfaceC3507 interfaceC3507, C1853 c1853) {
        C2580 c2580 = (C2580) f8204.get();
        c2580.f8200 = i;
        c2580.f8201 = interfaceC3507;
        c2580.f8202 = c1853;
        ConcurrentHashMap concurrentHashMap = f8203;
        C2581 c2581 = (C2581) concurrentHashMap.get(c2580);
        if (c2581 == null) {
            c2581 = new C2581(c2580.f8200, c2580.f8201, c2580.f8202);
            C2581 c2582 = (C2581) concurrentHashMap.putIfAbsent(c2581, c2581);
            if (c2582 != null) {
                return c2582;
            }
        }
        return c2581;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2581) {
            C2581 c2581 = (C2581) obj;
            return m4559(c2581.f8205, c2581.f8206, c2581.f8207);
        }
        if (!(obj instanceof C2580)) {
            return false;
        }
        C2580 c2580 = (C2580) obj;
        return m4559(c2580.f8200, c2580.f8201, c2580.f8202);
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return this.f8206.getType();
    }

    public final int hashCode() {
        C1853 c1853 = this.f8207;
        return ((this.f8206.hashCode() + ((c1853 != null ? c1853.hashCode() : 0) * 31)) * 31) + this.f8205;
    }

    public final String toString() {
        return m4565(false);
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return m4565(true);
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int mo4555() {
        return this.f8206.mo4555();
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo4556() {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2581 c2581) {
        int i = c2581.f8205;
        C1853 c1853 = c2581.f8207;
        int i2 = this.f8205;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c2581) {
            return 0;
        }
        int iCompareTo = this.f8206.getType().f11064.compareTo(c2581.f8206.getType().f11064);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C1853 c1854 = this.f8207;
        if (c1854 == null) {
            return c1853 == null ? 0 : -1;
        }
        if (c1853 == null) {
            return 1;
        }
        return c1854.compareTo(c1853);
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo4558() {
        return this.f8206.mo4558();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m4559(int i, InterfaceC3507 interfaceC3507, C1853 c1853) {
        if (this.f8205 != i || !this.f8206.equals(interfaceC3507)) {
            return false;
        }
        C1853 c1854 = this.f8207;
        if (c1854 != c1853) {
            return c1854 != null && c1854.equals(c1853);
        }
        return true;
    }

    @Override // p000.InterfaceC3507
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3507 mo4560() {
        return this.f8206.mo4560();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m4561(C2581 c2581) {
        return m4563(c2581) && this.f8205 == c2581.f8205;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m4562() {
        return this.f8206.getType().m5028();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m4563(C2581 c2581) {
        if (c2581 != null && this.f8206.getType().equals(c2581.f8206.getType())) {
            Object obj = c2581.f8207;
            C1853 c1853 = this.f8207;
            if (c1853 == obj) {
                return true;
            }
            if (c1853 != null && c1853.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String m4564() {
        return AbstractC1095.m2794(this.f8205, bv.aE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String m4565(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m4564());
        sb.append(":");
        C1853 c1853 = this.f8207;
        if (c1853 != null) {
            sb.append(c1853.toString());
        }
        InterfaceC3507 interfaceC3507 = this.f8206;
        C3505 type = interfaceC3507.getType();
        sb.append(type);
        if (type != interfaceC3507) {
            sb.append("=");
            if (z && (interfaceC3507 instanceof C0916)) {
                sb.append(((C0916) interfaceC3507).m2547());
            } else if (z && (interfaceC3507 instanceof AbstractC0775)) {
                sb.append(interfaceC3507.mo1360());
            } else {
                sb.append(interfaceC3507);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2581 m4566(int i) {
        return this.f8205 == i ? this : m4554(i, this.f8206, this.f8207);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2581 m4567(InterfaceC3507 interfaceC3507) {
        return m4554(this.f8205, interfaceC3507, this.f8207);
    }
}
