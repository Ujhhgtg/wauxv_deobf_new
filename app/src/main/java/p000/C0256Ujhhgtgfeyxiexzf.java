package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能要点脸ᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0256Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1445feyxiexzfUjhhgtg f1628Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f1629Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f1630Ujhhgtgfeyxiexzf;

    public C0256Ujhhgtgfeyxiexzf(Class cls, Class cls2, Class cls3, List list, InterfaceC1445feyxiexzfUjhhgtg interfaceC1445feyxiexzfUjhhgtg) {
        this.f1628Ujhhgtgfeyxiexzf = interfaceC1445feyxiexzfUjhhgtg;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f1629Ujhhgtgfeyxiexzf = list;
        this.f1630Ujhhgtgfeyxiexzf = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1629Ujhhgtgfeyxiexzf.toArray()) + '}';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg m1425Ujhhgtgfeyxiexzf(int i, int i2, C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, InterfaceC3106Ujhhgtgfeyxiexzf interfaceC3106Ujhhgtgfeyxiexzf, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        InterfaceC1445feyxiexzfUjhhgtg interfaceC1445feyxiexzfUjhhgtg = this.f1628Ujhhgtgfeyxiexzf;
        List list = (List) interfaceC1445feyxiexzfUjhhgtg.mo2933Ujhhgtgfeyxiexzf();
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(list, "Argument must not be null");
        try {
            List list2 = this.f1629Ujhhgtgfeyxiexzf;
            int size = list2.size();
            InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtgM4590Ujhhgtgfeyxiexzf = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC0901feyxiexzfUjhhgtgM4590Ujhhgtgfeyxiexzf = ((C3092Ujhhgtgfeyxiexzf) list2.get(i3)).m4590Ujhhgtgfeyxiexzf(i, i2, c2501feyxiexzfUjhhgtg, interfaceC3106Ujhhgtgfeyxiexzf, c1471feyxiexzfUjhhgtg);
                } catch (C3591Ujhhgtgfeyxiexzf e) {
                    list.add(e);
                }
                if (interfaceC0901feyxiexzfUjhhgtgM4590Ujhhgtgfeyxiexzf != null) {
                    break;
                }
            }
            if (interfaceC0901feyxiexzfUjhhgtgM4590Ujhhgtgfeyxiexzf == null) {
                throw new C3591Ujhhgtgfeyxiexzf(this.f1630Ujhhgtgfeyxiexzf, new ArrayList(list));
            }
            interfaceC1445feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(list);
            return interfaceC0901feyxiexzfUjhhgtgM4590Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            interfaceC1445feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(list);
            throw th;
        }
    }
}
