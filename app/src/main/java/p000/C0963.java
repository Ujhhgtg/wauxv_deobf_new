package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0963 {

    public static final C0532 f3487 = new C0532(1);

    public final HashMap f3488;

    public C0963(int i) {
        switch (i) {
            case 1:
                this.f3488 = new HashMap();
                break;
            case 2:
                this.f3488 = new HashMap();
                new HashMap();
                break;
            case 3:
                this.f3488 = new HashMap(3);
                break;
            case 4:
                this.f3488 = new HashMap();
                break;
            case 5:
                this.f3488 = new HashMap();
                break;
            case 6:
                this.f3488 = new HashMap(3);
                break;
            default:
                this.f3488 = new HashMap();
                break;
        }
    }

    public void m2451(Class cls, InterfaceC1902 interfaceC1902) {
        this.f3488.put(cls, interfaceC1902);
    }

    public void m2452(Class cls, C0435 c0435) {
        this.f3488.put(cls, c0435);
    }
}
