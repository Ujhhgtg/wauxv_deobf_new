package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1466 {

    public final Map f5231;

    public C1466(Map map) {
        this.f5231 = map;
    }

    public C1466(C0963 c0963) {
        this.f5231 = Collections.unmodifiableMap(new HashMap(c0963.f3488));
    }
}
