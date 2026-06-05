package p000;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛲᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1107feyxiexzfUjhhgtg extends AbstractC2936Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C1107feyxiexzfUjhhgtg f4201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0174Ujhhgtgfeyxiexzf f4202Ujhhgtgfeyxiexzf;

    static {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = C0174Ujhhgtgfeyxiexzf.f1364Ujhhgtgfeyxiexzf;
        f4201Ujhhgtgfeyxiexzf = new C1107feyxiexzfUjhhgtg(C0174Ujhhgtgfeyxiexzf.f1364Ujhhgtgfeyxiexzf);
    }

    public C1107feyxiexzfUjhhgtg(C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf) {
        this.f4202Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f4202Ujhhgtgfeyxiexzf.f1377Ujhhgtgfeyxiexzf) {
            return new C1101feyxiexzfUjhhgtg(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4202Ujhhgtgfeyxiexzf.m1235Ujhhgtgfeyxiexzf(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f4202Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4202Ujhhgtgfeyxiexzf.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4202Ujhhgtgfeyxiexzf.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4202Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f4202Ujhhgtgfeyxiexzf;
        c0174Ujhhgtgfeyxiexzf.getClass();
        return new C0164Ujhhgtgfeyxiexzf(c0174Ujhhgtgfeyxiexzf, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f4202Ujhhgtgfeyxiexzf;
        c0174Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        int iM1240Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.m1240Ujhhgtgfeyxiexzf(obj);
        if (iM1240Ujhhgtgfeyxiexzf < 0) {
            return false;
        }
        c0174Ujhhgtgfeyxiexzf.m1243Ujhhgtgfeyxiexzf(iM1240Ujhhgtgfeyxiexzf);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f4202Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f4202Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC2936Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1234Ujhhgtgfeyxiexzf() {
        return this.f4202Ujhhgtgfeyxiexzf.f1373Ujhhgtgfeyxiexzf;
    }
}
