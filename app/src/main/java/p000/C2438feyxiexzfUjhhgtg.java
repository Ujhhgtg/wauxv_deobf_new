package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2438feyxiexzfUjhhgtg extends LinkedHashMap {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7888Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2438feyxiexzfUjhhgtg(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.f7888Ujhhgtgfeyxiexzf = i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                if (obj instanceof Long) {
                    return super.containsKey((Long) obj);
                }
                return false;
            case 1:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return super.containsKey((C1381feyxiexzfUjhhgtg) obj);
                }
                return false;
            default:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return super.containsKey((C1381feyxiexzfUjhhgtg) obj);
                }
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                if (obj instanceof Boolean) {
                    return super.containsValue((Boolean) obj);
                }
                return false;
            case 1:
                if (obj instanceof Boolean) {
                    return super.containsValue((Boolean) obj);
                }
                return false;
            default:
                if (obj instanceof Boolean) {
                    return super.containsValue((Boolean) obj);
                }
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.get((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return (Boolean) super.get((C1381feyxiexzfUjhhgtg) obj);
                }
                return null;
            default:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return (Boolean) super.get((C1381feyxiexzfUjhhgtg) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                return !(obj instanceof Long) ? obj2 : (Boolean) super.getOrDefault((Long) obj, (Boolean) obj2);
            case 1:
                return !(obj instanceof C1381feyxiexzfUjhhgtg) ? obj2 : (Boolean) super.getOrDefault((C1381feyxiexzfUjhhgtg) obj, (Boolean) obj2);
            default:
                return !(obj instanceof C1381feyxiexzfUjhhgtg) ? obj2 : (Boolean) super.getOrDefault((C1381feyxiexzfUjhhgtg) obj, (Boolean) obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.remove((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return (Boolean) super.remove((C1381feyxiexzfUjhhgtg) obj);
                }
                return null;
            default:
                if (obj instanceof C1381feyxiexzfUjhhgtg) {
                    return (Boolean) super.remove((C1381feyxiexzfUjhhgtg) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                return super.size() > 100;
            case 1:
                return super.size() > 100;
            default:
                return super.size() > 100;
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.f7888Ujhhgtgfeyxiexzf) {
            case 0:
                if ((obj instanceof Long) && (obj2 instanceof Boolean)) {
                    return super.remove((Long) obj, (Boolean) obj2);
                }
                return false;
            case 1:
                if ((obj instanceof C1381feyxiexzfUjhhgtg) && (obj2 instanceof Boolean)) {
                    return super.remove((C1381feyxiexzfUjhhgtg) obj, (Boolean) obj2);
                }
                return false;
            default:
                if ((obj instanceof C1381feyxiexzfUjhhgtg) && (obj2 instanceof Boolean)) {
                    return super.remove((C1381feyxiexzfUjhhgtg) obj, (Boolean) obj2);
                }
                return false;
        }
    }
}
