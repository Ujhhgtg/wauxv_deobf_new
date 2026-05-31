package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲀᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1223 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f4420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f4422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Class f4423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Class f4424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1772 f4425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Map f4426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2336 f4427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4428;

    public C1223(Object obj, InterfaceC1772 interfaceC1772, int i, int i2, Map map, Class cls, Class cls2, C2336 c2336) {
        AbstractC2727.m4693(obj, "Argument must not be null");
        this.f4420 = obj;
        this.f4425 = interfaceC1772;
        this.f4421 = i;
        this.f4422 = i2;
        AbstractC2727.m4693(map, "Argument must not be null");
        this.f4426 = map;
        AbstractC2727.m4693(cls, "Resource class must not be null");
        this.f4423 = cls;
        AbstractC2727.m4693(cls2, "Transcode class must not be null");
        this.f4424 = cls2;
        AbstractC2727.m4693(c2336, "Argument must not be null");
        this.f4427 = c2336;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C1223) {
            C1223 c1223 = (C1223) obj;
            if (this.f4420.equals(c1223.f4420) && this.f4425.equals(c1223.f4425) && this.f4422 == c1223.f4422 && this.f4421 == c1223.f4421 && this.f4426.equals(c1223.f4426) && this.f4423.equals(c1223.f4423) && this.f4424.equals(c1223.f4424) && this.f4427.equals(c1223.f4427)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        if (this.f4428 == 0) {
            int iHashCode = this.f4420.hashCode();
            this.f4428 = iHashCode;
            int iHashCode2 = ((((this.f4425.hashCode() + (iHashCode * 31)) * 31) + this.f4421) * 31) + this.f4422;
            this.f4428 = iHashCode2;
            int iHashCode3 = this.f4426.hashCode() + (iHashCode2 * 31);
            this.f4428 = iHashCode3;
            int iHashCode4 = this.f4423.hashCode() + (iHashCode3 * 31);
            this.f4428 = iHashCode4;
            int iHashCode5 = this.f4424.hashCode() + (iHashCode4 * 31);
            this.f4428 = iHashCode5;
            this.f4428 = this.f4427.f7541.hashCode() + (iHashCode5 * 31);
        }
        return this.f4428;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4420 + ", width=" + this.f4421 + ", height=" + this.f4422 + ", resourceClass=" + this.f4423 + ", transcodeClass=" + this.f4424 + ", signature=" + this.f4425 + ", hashCode=" + this.f4428 + ", transformations=" + this.f4426 + ", options=" + this.f4427 + '}';
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
