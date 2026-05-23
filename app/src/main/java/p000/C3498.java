package p000;

import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤞᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3498 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C3498 f10998 = new C3498(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f10999;

    public /* synthetic */ C3498(int i) {
        this.f10999 = i;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1394(Object obj) {
        switch (this.f10999) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f10999) {
            case 0:
                return new C1995(new C2244(obj), new C0529(1, obj));
            case 1:
                File file = (File) obj;
                return new C1995(new C2244(file), new C0529(0, file));
            default:
                return null;
        }
    }
}
