package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0517 {

    public final /* synthetic */ int f2192;

    public final int m1826(Object obj) {
        switch (this.f2192) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int m1827() {
        switch (this.f2192) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String m1828() {
        switch (this.f2192) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
