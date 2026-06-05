package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ要点脸能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0066Ujhhgtgfeyxiexzf implements InterfaceC0538Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Map f1081Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile Map f1082Ujhhgtgfeyxiexzf;

    public C0066Ujhhgtgfeyxiexzf(Map map) {
        this.f1081Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0066Ujhhgtgfeyxiexzf) {
            return this.f1081Ujhhgtgfeyxiexzf.equals(((C0066Ujhhgtgfeyxiexzf) obj).f1081Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1081Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f1081Ujhhgtgfeyxiexzf + '}';
    }

    @Override // p000.InterfaceC0538Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Map mo1075Ujhhgtgfeyxiexzf() {
        if (this.f1082Ujhhgtgfeyxiexzf == null) {
            synchronized (this) {
                try {
                    if (this.f1082Ujhhgtgfeyxiexzf == null) {
                        this.f1082Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(m1076Ujhhgtgfeyxiexzf());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1082Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final HashMap m1076Ujhhgtgfeyxiexzf() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f1081Ujhhgtgfeyxiexzf.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C0065Ujhhgtgfeyxiexzf) list.get(i)).f1080Ujhhgtgfeyxiexzf;
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
