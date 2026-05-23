package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᤝᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0313 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1553;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0313(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.f1553 = i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.f1553) {
            case 0:
                if (obj instanceof Long) {
                    return super.containsKey((Long) obj);
                }
                return false;
            case 1:
                if (obj instanceof C2315) {
                    return super.containsKey((C2315) obj);
                }
                return false;
            default:
                if (obj instanceof C2315) {
                    return super.containsKey((C2315) obj);
                }
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.f1553) {
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
        switch (this.f1553) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.get((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C2315) {
                    return (Boolean) super.get((C2315) obj);
                }
                return null;
            default:
                if (obj instanceof C2315) {
                    return (Boolean) super.get((C2315) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f1553) {
            case 0:
                return !(obj instanceof Long) ? obj2 : (Boolean) super.getOrDefault((Long) obj, (Boolean) obj2);
            case 1:
                return !(obj instanceof C2315) ? obj2 : (Boolean) super.getOrDefault((C2315) obj, (Boolean) obj2);
            default:
                return !(obj instanceof C2315) ? obj2 : (Boolean) super.getOrDefault((C2315) obj, (Boolean) obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        switch (this.f1553) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.remove((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C2315) {
                    return (Boolean) super.remove((C2315) obj);
                }
                return null;
            default:
                if (obj instanceof C2315) {
                    return (Boolean) super.remove((C2315) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f1553) {
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
        switch (this.f1553) {
            case 0:
                if ((obj instanceof Long) && (obj2 instanceof Boolean)) {
                    return super.remove((Long) obj, (Boolean) obj2);
                }
                return false;
            case 1:
                if ((obj instanceof C2315) && (obj2 instanceof Boolean)) {
                    return super.remove((C2315) obj, (Boolean) obj2);
                }
                return false;
            default:
                if ((obj instanceof C2315) && (obj2 instanceof Boolean)) {
                    return super.remove((C2315) obj, (Boolean) obj2);
                }
                return false;
        }
    }
}
