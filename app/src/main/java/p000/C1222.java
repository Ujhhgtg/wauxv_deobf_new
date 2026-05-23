package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1222 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f4423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f4425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Class f4426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Class f4427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1749 f4428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Map f4429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2303 f4430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4431;

    public C1222(Object obj, InterfaceC1749 interfaceC1749, int i, int i2, Map map, Class cls, Class cls2, C2303 c2303) {
        AbstractC1460.m3210(obj, "Argument must not be null");
        this.f4423 = obj;
        this.f4428 = interfaceC1749;
        this.f4424 = i;
        this.f4425 = i2;
        AbstractC1460.m3210(map, "Argument must not be null");
        this.f4429 = map;
        AbstractC1460.m3210(cls, "Resource class must not be null");
        this.f4426 = cls;
        AbstractC1460.m3210(cls2, "Transcode class must not be null");
        this.f4427 = cls2;
        AbstractC1460.m3210(c2303, "Argument must not be null");
        this.f4430 = c2303;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C1222) {
            C1222 c1222 = (C1222) obj;
            if (this.f4423.equals(c1222.f4423) && this.f4428.equals(c1222.f4428) && this.f4425 == c1222.f4425 && this.f4424 == c1222.f4424 && this.f4429.equals(c1222.f4429) && this.f4426.equals(c1222.f4426) && this.f4427.equals(c1222.f4427) && this.f4430.equals(c1222.f4430)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        if (this.f4431 == 0) {
            int iHashCode = this.f4423.hashCode();
            this.f4431 = iHashCode;
            int iHashCode2 = ((((this.f4428.hashCode() + (iHashCode * 31)) * 31) + this.f4424) * 31) + this.f4425;
            this.f4431 = iHashCode2;
            int iHashCode3 = this.f4429.hashCode() + (iHashCode2 * 31);
            this.f4431 = iHashCode3;
            int iHashCode4 = this.f4426.hashCode() + (iHashCode3 * 31);
            this.f4431 = iHashCode4;
            int iHashCode5 = this.f4427.hashCode() + (iHashCode4 * 31);
            this.f4431 = iHashCode5;
            this.f4431 = this.f4430.f7419.hashCode() + (iHashCode5 * 31);
        }
        return this.f4431;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4423 + ", width=" + this.f4424 + ", height=" + this.f4425 + ", resourceClass=" + this.f4426 + ", transcodeClass=" + this.f4427 + ", signature=" + this.f4428 + ", hashCode=" + this.f4431 + ", transformations=" + this.f4429 + ", options=" + this.f4430 + '}';
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
