package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲁᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0325 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0325(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.f1629 = i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.f1629) {
            case 0:
                if (obj instanceof Long) {
                    return super.containsKey((Long) obj);
                }
                return false;
            case 1:
                if (obj instanceof C2348) {
                    return super.containsKey((C2348) obj);
                }
                return false;
            default:
                if (obj instanceof C2348) {
                    return super.containsKey((C2348) obj);
                }
                return false;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.f1629) {
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
        switch (this.f1629) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.get((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C2348) {
                    return (Boolean) super.get((C2348) obj);
                }
                return null;
            default:
                if (obj instanceof C2348) {
                    return (Boolean) super.get((C2348) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f1629) {
            case 0:
                return !(obj instanceof Long) ? obj2 : (Boolean) super.getOrDefault((Long) obj, (Boolean) obj2);
            case 1:
                return !(obj instanceof C2348) ? obj2 : (Boolean) super.getOrDefault((C2348) obj, (Boolean) obj2);
            default:
                return !(obj instanceof C2348) ? obj2 : (Boolean) super.getOrDefault((C2348) obj, (Boolean) obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        switch (this.f1629) {
            case 0:
                if (obj instanceof Long) {
                    return (Boolean) super.remove((Long) obj);
                }
                return null;
            case 1:
                if (obj instanceof C2348) {
                    return (Boolean) super.remove((C2348) obj);
                }
                return null;
            default:
                if (obj instanceof C2348) {
                    return (Boolean) super.remove((C2348) obj);
                }
                return null;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f1629) {
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
        switch (this.f1629) {
            case 0:
                if ((obj instanceof Long) && (obj2 instanceof Boolean)) {
                    return super.remove((Long) obj, (Boolean) obj2);
                }
                return false;
            case 1:
                if ((obj instanceof C2348) && (obj2 instanceof Boolean)) {
                    return super.remove((C2348) obj, (Boolean) obj2);
                }
                return false;
            default:
                if ((obj instanceof C2348) && (obj2 instanceof Boolean)) {
                    return super.remove((C2348) obj, (Boolean) obj2);
                }
                return false;
        }
    }
}
