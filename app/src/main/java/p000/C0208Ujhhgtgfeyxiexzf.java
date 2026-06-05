package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ要点脸ᛴ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0208Ujhhgtgfeyxiexzf extends AbstractC2933Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0207Ujhhgtgfeyxiexzf f1468Ujhhgtgfeyxiexzf;

    public C0208Ujhhgtgfeyxiexzf(C0207Ujhhgtgfeyxiexzf c0207Ujhhgtgfeyxiexzf) {
        this.f1468Ujhhgtgfeyxiexzf = c0207Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f1468Ujhhgtgfeyxiexzf.f1465Ujhhgtgfeyxiexzf.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int mo1287Ujhhgtgfeyxiexzf() {
        return this.f1468Ujhhgtgfeyxiexzf.f1465Ujhhgtgfeyxiexzf.groupCount() + 1;
    }
}
