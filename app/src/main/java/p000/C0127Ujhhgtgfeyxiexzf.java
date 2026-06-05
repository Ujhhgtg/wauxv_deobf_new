package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛴᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0127Ujhhgtgfeyxiexzf extends AbstractC0120Ujhhgtgfeyxiexzf implements Map<String, AbstractC0120Ujhhgtgfeyxiexzf>, InterfaceC0140Ujhhgtgfeyxiexzf {
    public static final C0128Ujhhgtgfeyxiexzf Companion = new C0128Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Map f1274Ujhhgtgfeyxiexzf;

    public C0127Ujhhgtgfeyxiexzf(Map map) {
        this.f1274Ujhhgtgfeyxiexzf = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf compute(String str, BiFunction<? super String, ? super AbstractC0120Ujhhgtgfeyxiexzf, ? extends AbstractC0120Ujhhgtgfeyxiexzf> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf computeIfAbsent(String str, Function<? super String, ? extends AbstractC0120Ujhhgtgfeyxiexzf> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf computeIfPresent(String str, BiFunction<? super String, ? super AbstractC0120Ujhhgtgfeyxiexzf, ? extends AbstractC0120Ujhhgtgfeyxiexzf> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f1274Ujhhgtgfeyxiexzf.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC0120Ujhhgtgfeyxiexzf)) {
            return false;
        }
        return this.f1274Ujhhgtgfeyxiexzf.containsValue((AbstractC0120Ujhhgtgfeyxiexzf) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC0120Ujhhgtgfeyxiexzf>> entrySet() {
        return this.f1274Ujhhgtgfeyxiexzf.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1274Ujhhgtgfeyxiexzf, obj);
    }

    @Override // java.util.Map
    public final AbstractC0120Ujhhgtgfeyxiexzf get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC0120Ujhhgtgfeyxiexzf) this.f1274Ujhhgtgfeyxiexzf.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f1274Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1274Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f1274Ujhhgtgfeyxiexzf.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf merge(String str, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf, BiFunction<? super AbstractC0120Ujhhgtgfeyxiexzf, ? super AbstractC0120Ujhhgtgfeyxiexzf, ? extends AbstractC0120Ujhhgtgfeyxiexzf> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf put(String str, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC0120Ujhhgtgfeyxiexzf> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf putIfAbsent(String str, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC0120Ujhhgtgfeyxiexzf remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf replace(String str, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC0120Ujhhgtgfeyxiexzf, ? extends AbstractC0120Ujhhgtgfeyxiexzf> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1274Ujhhgtgfeyxiexzf.size();
    }

    public final String toString() {
        return AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(this.f1274Ujhhgtgfeyxiexzf.entrySet(), ",", "{", "}", new C0760Ujhhgtgfeyxiexzf(12), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC0120Ujhhgtgfeyxiexzf> values() {
        return this.f1274Ujhhgtgfeyxiexzf.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
