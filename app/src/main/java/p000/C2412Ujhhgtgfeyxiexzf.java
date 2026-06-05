package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛳᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2412Ujhhgtgfeyxiexzf extends C1044feyxiexzfUjhhgtg implements Map {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2407Ujhhgtgfeyxiexzf f7817Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2409Ujhhgtgfeyxiexzf f7818Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C2411Ujhhgtgfeyxiexzf f7819Ujhhgtgfeyxiexzf;

    public C2412Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        super(0);
        mo2537Ujhhgtgfeyxiexzf(c2412Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2407Ujhhgtgfeyxiexzf c2407Ujhhgtgfeyxiexzf = this.f7817Ujhhgtgfeyxiexzf;
        if (c2407Ujhhgtgfeyxiexzf != null) {
            return c2407Ujhhgtgfeyxiexzf;
        }
        C2407Ujhhgtgfeyxiexzf c2407Ujhhgtgfeyxiexzf2 = new C2407Ujhhgtgfeyxiexzf(this);
        this.f7817Ujhhgtgfeyxiexzf = c2407Ujhhgtgfeyxiexzf2;
        return c2407Ujhhgtgfeyxiexzf2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2409Ujhhgtgfeyxiexzf c2409Ujhhgtgfeyxiexzf = this.f7818Ujhhgtgfeyxiexzf;
        if (c2409Ujhhgtgfeyxiexzf != null) {
            return c2409Ujhhgtgfeyxiexzf;
        }
        C2409Ujhhgtgfeyxiexzf c2409Ujhhgtgfeyxiexzf2 = new C2409Ujhhgtgfeyxiexzf(this);
        this.f7818Ujhhgtgfeyxiexzf = c2409Ujhhgtgfeyxiexzf2;
        return c2409Ujhhgtgfeyxiexzf2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2532Ujhhgtgfeyxiexzf(map.size() + this.f4069Ujhhgtgfeyxiexzf);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2411Ujhhgtgfeyxiexzf c2411Ujhhgtgfeyxiexzf = this.f7819Ujhhgtgfeyxiexzf;
        if (c2411Ujhhgtgfeyxiexzf != null) {
            return c2411Ujhhgtgfeyxiexzf;
        }
        C2411Ujhhgtgfeyxiexzf c2411Ujhhgtgfeyxiexzf2 = new C2411Ujhhgtgfeyxiexzf(this);
        this.f7819Ujhhgtgfeyxiexzf = c2411Ujhhgtgfeyxiexzf2;
        return c2411Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean m3663Ujhhgtgfeyxiexzf(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m3664Ujhhgtgfeyxiexzf(Collection collection) {
        int i = this.f4069Ujhhgtgfeyxiexzf;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f4069Ujhhgtgfeyxiexzf;
    }
}
