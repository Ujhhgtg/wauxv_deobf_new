package p000;

import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲇᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0522 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f2207;

    public /* synthetic */ C0522(int i, Object obj) {
        this.f2206 = i;
        this.f2207 = obj;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1394(Object obj) {
        switch (this.f2206) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f2206) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C1995(new C2244(bArr), new C1924(bArr, 1, (C0373) this.f2207));
            case 1:
                return new C1995(new C2244(obj), new C0964(obj.toString(), (C0373) this.f2207, 0));
            default:
                File file = (File) obj;
                return new C1995(new C2244(file), new C0964(file, (C1227) this.f2207, 1));
        }
    }
}
