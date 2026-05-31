package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 implements InterfaceC1534 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Map f5936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile Map f5937;

    public C1783(Map map) {
        this.f5936 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1783) {
            return this.f5936.equals(((C1783) obj).f5936);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5936.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f5936 + '}';
    }

    @Override // p000.InterfaceC1534
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Map mo3436() {
        if (this.f5937 == null) {
            synchronized (this) {
                try {
                    if (this.f5937 == null) {
                        this.f5937 = Collections.unmodifiableMap(m3661());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f5937;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap m3661() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5936.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C1782) list.get(i)).f5935;
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
