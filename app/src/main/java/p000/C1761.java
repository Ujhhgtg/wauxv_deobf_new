package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1761 implements InterfaceC1522 {

    public final Map f5883;

    public volatile Map f5884;

    public C1761(Map map) {
        this.f5883 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1761) {
            return this.f5883.equals(((C1761) obj).f5883);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5883.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f5883 + '}';
    }

    @Override // p000.InterfaceC1522
    public final Map mo3255() {
        if (this.f5884 == null) {
            synchronized (this) {
                try {
                    if (this.f5884 == null) {
                        this.f5884 = Collections.unmodifiableMap(m3509());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f5884;
    }

    public final HashMap m3509() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5883.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C1760) list.get(i)).f5882;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }
}
