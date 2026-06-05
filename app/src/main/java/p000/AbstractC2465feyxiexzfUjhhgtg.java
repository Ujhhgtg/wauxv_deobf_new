package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2465feyxiexzfUjhhgtg extends ArrayList {
    public final Object first() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return get(0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m3695Ujhhgtgfeyxiexzf() {
        if (super.size() == 0) {
            throw new C2870Ujhhgtgfeyxiexzf("No result found for query");
        }
        E e = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(e, get(i))) {
                throw new C2870Ujhhgtgfeyxiexzf(super.size());
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object m3696Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        if (super.size() == 0) {
            throw new C2870Ujhhgtgfeyxiexzf("No result found for query");
        }
        Object obj = null;
        for (Object obj2 : this) {
            if (((Boolean) interfaceC3549feyxiexzfUjhhgtg.invoke(obj2)).booleanValue()) {
                if (obj != null && !obj.equals(obj2)) {
                    throw new C2870Ujhhgtgfeyxiexzf(super.size());
                }
                obj = obj2;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new C2870Ujhhgtgfeyxiexzf("No result found for query");
    }
}
