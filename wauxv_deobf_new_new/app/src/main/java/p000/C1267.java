package p000;

import java.util.Random;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲁᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1267 extends ThreadLocal {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4596;

    public /* synthetic */ C1267(int i) {
        this.f4596 = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4596) {
            case 0:
                return new Random();
            default:
                return new C2580();
        }
    }
}
