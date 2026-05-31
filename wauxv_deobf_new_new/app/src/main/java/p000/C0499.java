package p000;

import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0499 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f2163;

    public /* synthetic */ C0499(Object obj, int i) {
        this.f2162 = i;
        this.f2163 = obj;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1540(Object obj) {
        switch (this.f2162) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f2162) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C2026(new C2275(bArr), new C1955(bArr, 1, (C0348) this.f2163));
            case 1:
                return new C2026(new C2275(obj), new C0968(obj.toString(), (C0348) this.f2163, 0));
            default:
                File file = (File) obj;
                return new C2026(new C2275(file), new C0968(file, (C1224) this.f2163, 1));
        }
    }
}
