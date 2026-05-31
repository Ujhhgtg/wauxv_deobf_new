package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲇᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1750 extends AbstractC1736 implements Map<String, AbstractC1736>, InterfaceC1761 {
    public static final C1749 Companion = new C1749();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Map f5883;

    public C1750(Map map) {
        this.f5883 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 compute(String str, BiFunction<? super String, ? super AbstractC1736, ? extends AbstractC1736> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 computeIfAbsent(String str, Function<? super String, ? extends AbstractC1736> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC1736, ? extends AbstractC1736> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f5883.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC1736)) {
            return false;
        }
        return this.f5883.containsValue((AbstractC1736) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC1736>> entrySet() {
        return this.f5883.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1469.m3322(this.f5883, obj);
    }

    @Override // java.util.Map
    public final AbstractC1736 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC1736) this.f5883.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5883.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5883.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f5883.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 merge(String str, AbstractC1736 abstractC1736, BiFunction<? super AbstractC1736, ? super AbstractC1736, ? extends AbstractC1736> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 put(String str, AbstractC1736 abstractC1736) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC1736> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 putIfAbsent(String str, AbstractC1736 abstractC1736) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC1736 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1736 replace(String str, AbstractC1736 abstractC1736) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC1736, ? extends AbstractC1736> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5883.size();
    }

    public final String toString() {
        return AbstractC0739.m2295(this.f5883.entrySet(), ",", "{", "}", new C1633(10), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC1736> values() {
        return this.f5883.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC1736 abstractC1736, AbstractC1736 abstractC1737) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
