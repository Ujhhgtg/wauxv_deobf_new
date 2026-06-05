package p000;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2860feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9120Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f9121Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2860feyxiexzfUjhhgtg(Object obj, Serializable serializable, int i) {
        this.f9119Ujhhgtgfeyxiexzf = i;
        this.f9120Ujhhgtgfeyxiexzf = obj;
        this.f9121Ujhhgtgfeyxiexzf = serializable;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        switch (this.f9119Ujhhgtgfeyxiexzf) {
            case 0:
                InterfaceC3739feyxiexzfUjhhgtg[] interfaceC3739feyxiexzfUjhhgtgArr = (InterfaceC3739feyxiexzfUjhhgtg[]) this.f9120Ujhhgtgfeyxiexzf;
                C0975feyxiexzfUjhhgtg c0975feyxiexzfUjhhgtg = (C0975feyxiexzfUjhhgtg) this.f9121Ujhhgtgfeyxiexzf;
                int i = c0975feyxiexzfUjhhgtg.f3869Ujhhgtgfeyxiexzf;
                c0975feyxiexzfUjhhgtg.f3869Ujhhgtgfeyxiexzf = i + 1;
                interfaceC3739feyxiexzfUjhhgtgArr[i] = (InterfaceC3737Ujhhgtgfeyxiexzf) obj2;
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            default:
                ArrayList arrayList = (ArrayList) this.f9120Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = (ArrayList) this.f9121Ujhhgtgfeyxiexzf;
                List<C3663feyxiexzfUjhhgtg> list = (List) obj;
                for (C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg : list) {
                    for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : AbstractC2856feyxiexzfUjhhgtg.m4257Ujhhgtgfeyxiexzf(arrayList, arrayList2)) {
                        C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(((Number) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).intValue(), c3663feyxiexzfUjhhgtg.f11657Ujhhgtgfeyxiexzf, (String) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf);
                    }
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                sb.append(MagicFactory.get(4928901651391055242L, strArr));
                sb.append(arrayList.size());
                sb.append(MagicFactory.get(4928900672138511754L, strArr));
                sb.append(list.size());
                sb.append(MagicFactory.get(4928900650663675274L, strArr));
                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb.toString());
                return Boolean.FALSE;
        }
    }
}
