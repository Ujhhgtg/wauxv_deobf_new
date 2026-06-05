package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3325Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ArrayList f10365Ujhhgtgfeyxiexzf;

    public C3325Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 1:
                this.f10365Ujhhgtgfeyxiexzf = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.f10365Ujhhgtgfeyxiexzf = new ArrayList();
                break;
            case 3:
                this.f10365Ujhhgtgfeyxiexzf = new ArrayList();
                break;
            case 4:
                this.f10365Ujhhgtgfeyxiexzf = new ArrayList();
                break;
            default:
                this.f10365Ujhhgtgfeyxiexzf = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public synchronized InterfaceC0887feyxiexzfUjhhgtg m4814Ujhhgtgfeyxiexzf(Class cls) {
        int size = this.f10365Ujhhgtgfeyxiexzf.size();
        for (int i = 0; i < size; i++) {
            C0886feyxiexzfUjhhgtg c0886feyxiexzfUjhhgtg = (C0886feyxiexzfUjhhgtg) this.f10365Ujhhgtgfeyxiexzf.get(i);
            if (c0886feyxiexzfUjhhgtg.f3428Ujhhgtgfeyxiexzf.isAssignableFrom(cls)) {
                return c0886feyxiexzfUjhhgtg.f3429Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public List m4815Ujhhgtgfeyxiexzf() {
        ArrayList arrayList;
        if (this.f10365Ujhhgtgfeyxiexzf.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f10365Ujhhgtgfeyxiexzf) {
            arrayList = new ArrayList(this.f10365Ujhhgtgfeyxiexzf);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public synchronized ArrayList m4816Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1760feyxiexzfUjhhgtg c1760feyxiexzfUjhhgtg : this.f10365Ujhhgtgfeyxiexzf) {
            if ((c1760feyxiexzfUjhhgtg.f5919Ujhhgtgfeyxiexzf.isAssignableFrom(cls) && cls2.isAssignableFrom(c1760feyxiexzfUjhhgtg.f5920Ujhhgtgfeyxiexzf)) && !arrayList.contains(c1760feyxiexzfUjhhgtg.f5920Ujhhgtgfeyxiexzf)) {
                arrayList.add(c1760feyxiexzfUjhhgtg.f5920Ujhhgtgfeyxiexzf);
            }
        }
        return arrayList;
    }
}
