package p000;

import java.util.Random;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 extends ThreadLocal {

    public final /* synthetic */ int f4597;

    public /* synthetic */ C1265(int i) {
        this.f4597 = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4597) {
            case 0:
                return new Random();
            default:
                return new C2524();
        }
    }
}
