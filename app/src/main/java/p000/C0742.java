package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0742 implements Iterator {

    public int f2833 = 0;

    public final int f2834;

    public final /* synthetic */ Object f2835;

    public C0742(Object obj) {
        this.f2835 = obj;
        this.f2834 = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2833 < this.f2834;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f2835;
            int i = this.f2833;
            this.f2833 = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            throw new NoSuchElementException(th.getMessage());
        }
    }
}
