package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1903 extends AbstractC0063 {

    public final /* synthetic */ C1904 f6277;

    public C1903(C1904 c1904) {
        this.f6277 = c1904;
    }

    @Override // p000.AbstractC0063, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f6277.f6278.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC0063, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0063, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0063
    public final int mo943() {
        return this.f6277.f6278.groupCount() + 1;
    }
}
