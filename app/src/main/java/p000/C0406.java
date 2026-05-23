package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0406 extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
