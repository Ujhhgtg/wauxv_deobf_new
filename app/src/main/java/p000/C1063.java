package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1063 {

    public static final C1063 f3848 = new C1063(0);

    public static final C1063 f3849 = new C1063(1);

    public static final C1063 f3850 = new C1063(2);

    public final /* synthetic */ int f3851;

    public /* synthetic */ C1063(int i) {
        this.f3851 = i;
    }

    public final boolean m2616(int i) {
        switch (this.f3851) {
            case 0:
                return false;
            case 1:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }
}
