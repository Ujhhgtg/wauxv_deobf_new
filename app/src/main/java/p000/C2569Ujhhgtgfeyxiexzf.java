package p000;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2569Ujhhgtgfeyxiexzf implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8319Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8320Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2569Ujhhgtgfeyxiexzf(ArrayList arrayList, int i) {
        this.f8319Ujhhgtgfeyxiexzf = i;
        this.f8320Ujhhgtgfeyxiexzf = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8319Ujhhgtgfeyxiexzf) {
            case 0:
                C2585feyxiexzfUjhhgtg c2585feyxiexzfUjhhgtg = (C2585feyxiexzfUjhhgtg) obj;
                c2585feyxiexzfUjhhgtg.getClass();
                ArrayList<URL> arrayList = new ArrayList();
                c2585feyxiexzfUjhhgtg.f8370Ujhhgtgfeyxiexzf.forEach(new C2569Ujhhgtgfeyxiexzf(arrayList, 0));
                arrayList.addAll(c2585feyxiexzfUjhhgtg.f8369Ujhhgtgfeyxiexzf);
                for (URL url : arrayList) {
                    ArrayList arrayList2 = this.f8320Ujhhgtgfeyxiexzf;
                    if (!arrayList2.contains(url)) {
                        arrayList2.add(url);
                    }
                }
                break;
            default:
                this.f8320Ujhhgtgfeyxiexzf.add((Constructor) obj);
                break;
        }
    }
}
