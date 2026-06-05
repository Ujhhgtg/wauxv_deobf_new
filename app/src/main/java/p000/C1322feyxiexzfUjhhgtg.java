package p000;

import android.content.ContentValues;
import com.alibaba.fastjson2.JSONObject;
import java.util.Iterator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴᛲᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1322feyxiexzfUjhhgtg extends AbstractC0255Ujhhgtgfeyxiexzf implements InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1322feyxiexzfUjhhgtg f4800Ujhhgtgfeyxiexzf = new C1322feyxiexzfUjhhgtg();

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo2081Ujhhgtgfeyxiexzf(String str, ContentValues contentValues) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (str.equals(MagicFactory.get(4928544546335229322L, strArr))) {
            Object obj = contentValues.get(MagicFactory.get(4928544610759738762L, strArr));
            MagicFactory.get(4928544718133921162L, strArr);
            if (((Integer) obj).intValue() == 0) {
                Object obj2 = contentValues.get(MagicFactory.get(4928544924292351370L, strArr));
                MagicFactory.get(4928544877047711114L, strArr);
                JSONObject jSONObjectM2619Ujhhgtgfeyxiexzf = AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf((String) obj2);
                Object byPath = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath(MagicFactory.get(4928543970809611658L, strArr));
                MagicFactory.get(4928544035234121098L, strArr);
                String str2 = (String) byPath;
                Object byPath2 = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath(MagicFactory.get(4928544365946602890L, strArr));
                MagicFactory.get(4928544318701962634L, strArr);
                String str3 = (String) byPath2;
                Object byPath3 = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath(MagicFactory.get(4928543549902816650L, strArr));
                MagicFactory.get(4928543506953143690L, strArr);
                int i = Integer.parseInt((String) byPath3);
                Iterator it = AbstractC1453feyxiexzfUjhhgtg.m2962Ujhhgtgfeyxiexzf().iterator();
                while (it.hasNext()) {
                    C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2963Ujhhgtgfeyxiexzf((C1414feyxiexzfUjhhgtg) it.next());
                    if (c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf != null) {
                        c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf.m2928Ujhhgtgfeyxiexzf(MagicFactory.get(4928463779475228042L, strArr), str2, str3, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
