package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸能不能ᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1119feyxiexzfUjhhgtg extends AbstractC1120feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m2589feyxiexzfUjhhgtg(C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg) {
        C3576feyxiexzfUjhhgtg c3576feyxiexzfUjhhgtg = new C3576feyxiexzfUjhhgtg(c3254feyxiexzfUjhhgtg);
        int i = 0;
        while (c3576feyxiexzfUjhhgtg.hasNext()) {
            c3576feyxiexzfUjhhgtg.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static List m2590feyxiexzfUjhhgtg(InterfaceC1117feyxiexzfUjhhgtg interfaceC1117feyxiexzfUjhhgtg) {
        Iterator it = interfaceC1117feyxiexzfUjhhgtg.iterator();
        if (!it.hasNext()) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
