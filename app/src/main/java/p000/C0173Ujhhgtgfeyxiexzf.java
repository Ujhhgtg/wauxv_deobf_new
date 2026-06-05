package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0173Ujhhgtgfeyxiexzf extends AbstractC2936Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1362Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0174Ujhhgtgfeyxiexzf f1363Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0173Ujhhgtgfeyxiexzf(C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf, int i) {
        this.f1362Ujhhgtgfeyxiexzf = i;
        this.f1363Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                this.f1363Ujhhgtgfeyxiexzf.clear();
                break;
            default:
                this.f1363Ujhhgtgfeyxiexzf.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf.getClass();
                int iM1240Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.m1240Ujhhgtgfeyxiexzf(entry.getKey());
                if (iM1240Ujhhgtgfeyxiexzf < 0) {
                    return false;
                }
                return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf], entry.getValue());
            default:
                return this.f1363Ujhhgtgfeyxiexzf.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM1240Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.m1240Ujhhgtgfeyxiexzf(entry.getKey());
                        if (!(iM1240Ujhhgtgfeyxiexzf < 0 ? false : C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                break;
        }
        return this.f1363Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf.getClass();
                return new C0164Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf, 0);
            default:
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf2 = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf2.getClass();
                return new C0164Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
                int iM1240Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.m1240Ujhhgtgfeyxiexzf(entry.getKey());
                if (iM1240Ujhhgtgfeyxiexzf < 0 || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf], entry.getValue())) {
                    return false;
                }
                c0174Ujhhgtgfeyxiexzf.m1243Ujhhgtgfeyxiexzf(iM1240Ujhhgtgfeyxiexzf);
                return true;
            default:
                C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf2 = this.f1363Ujhhgtgfeyxiexzf;
                c0174Ujhhgtgfeyxiexzf2.m1237Ujhhgtgfeyxiexzf();
                int iM1240Ujhhgtgfeyxiexzf2 = c0174Ujhhgtgfeyxiexzf2.m1240Ujhhgtgfeyxiexzf(obj);
                if (iM1240Ujhhgtgfeyxiexzf2 < 0) {
                    return false;
                }
                c0174Ujhhgtgfeyxiexzf2.m1243Ujhhgtgfeyxiexzf(iM1240Ujhhgtgfeyxiexzf2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                this.f1363Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
                break;
            default:
                this.f1363Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                this.f1363Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
                break;
            default:
                this.f1363Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC2936Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int mo1234Ujhhgtgfeyxiexzf() {
        switch (this.f1362Ujhhgtgfeyxiexzf) {
            case 0:
                break;
        }
        return this.f1363Ujhhgtgfeyxiexzf.f1373Ujhhgtgfeyxiexzf;
    }
}
