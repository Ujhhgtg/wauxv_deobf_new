package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2844feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashMap f9042Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final HashMap f9043Ujhhgtgfeyxiexzf;

    public C2844feyxiexzfUjhhgtg(HashMap map) {
        this.f9043Ujhhgtgfeyxiexzf = map;
        for (Map.Entry entry : map.entrySet()) {
            Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) entry.getValue();
            List arrayList = (List) this.f9042Ujhhgtgfeyxiexzf.get(ujhhgtgfeyxiexzf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9042Ujhhgtgfeyxiexzf.put(ujhhgtgfeyxiexzf, arrayList);
            }
            arrayList.add((C2825feyxiexzfUjhhgtg) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4176Ujhhgtgfeyxiexzf(List list, InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2825feyxiexzfUjhhgtg c2825feyxiexzfUjhhgtg = (C2825feyxiexzfUjhhgtg) list.get(size);
                Method method = c2825feyxiexzfUjhhgtg.f8984Ujhhgtgfeyxiexzf;
                try {
                    int i = c2825feyxiexzfUjhhgtg.f8983Ujhhgtgfeyxiexzf;
                    if (i == 0) {
                        method.invoke(interfaceC0050Ujhhgtgfeyxiexzf, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0050Ujhhgtgfeyxiexzf, interfaceC0083Ujhhgtgfeyxiexzf);
                    } else if (i == 2) {
                        method.invoke(interfaceC0050Ujhhgtgfeyxiexzf, interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
