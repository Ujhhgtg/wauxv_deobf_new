package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 extends AbstractC1715 implements Map<String, AbstractC1715>, InterfaceC1737 {
    public static final C1725 Companion = new C1725();

    public final Map f5820;

    public C1726(Map map) {
        this.f5820 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 compute(String str, BiFunction<? super String, ? super AbstractC1715, ? extends AbstractC1715> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 computeIfAbsent(String str, Function<? super String, ? extends AbstractC1715> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC1715, ? extends AbstractC1715> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f5820.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC1715)) {
            return false;
        }
        return this.f5820.containsValue((AbstractC1715) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC1715>> entrySet() {
        return this.f5820.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC2207.m4087(this.f5820, obj);
    }

    @Override // java.util.Map
    public final AbstractC1715 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC1715) this.f5820.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5820.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5820.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f5820.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 merge(String str, AbstractC1715 abstractC1715, BiFunction<? super AbstractC1715, ? super AbstractC1715, ? extends AbstractC1715> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 put(String str, AbstractC1715 abstractC1715) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC1715> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 putIfAbsent(String str, AbstractC1715 abstractC1715) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC1715 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1715 replace(String str, AbstractC1715 abstractC1715) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC1715, ? extends AbstractC1715> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5820.size();
    }

    public final String toString() {
        return AbstractC0744.m2196(this.f5820.entrySet(), ",", "{", "}", new C1608(24), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC1715> values() {
        return this.f5820.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC1715 abstractC1715, AbstractC1715 abstractC1716) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
