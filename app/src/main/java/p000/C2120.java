package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2120 implements Comparator {

    public static final C2120 f6980 = new C2120(0);

    public static final C2120 f6981 = new C2120(1);

    public final /* synthetic */ int f6982;

    public /* synthetic */ C2120(int i) {
        this.f6982 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6982) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f6982) {
            case 0:
                return f6981;
            default:
                return f6980;
        }
    }
}
