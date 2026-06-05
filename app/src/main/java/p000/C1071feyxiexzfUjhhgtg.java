package p000;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ要点脸ᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1071feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0744Ujhhgtgfeyxiexzf, InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1071feyxiexzfUjhhgtg f4140Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4141Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4142Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4143Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4140Ujhhgtgfeyxiexzf = new C1071feyxiexzfUjhhgtg(MagicFactory.get(4928885171601540490L, strArr));
        f4141Ujhhgtgfeyxiexzf = MagicFactory.get(4928887821596362122L, strArr);
        f4142Ujhhgtgfeyxiexzf = MagicFactory.get(4928887804416492938L, strArr);
        f4143Ujhhgtgfeyxiexzf = MagicFactory.get(4928887774351721866L, strArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static Set m2551feyxiexzfUjhhgtg(long j) {
        Object next;
        StringBuilder sb;
        Iterator it = C1068feyxiexzfUjhhgtg.f4134Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            sb = new StringBuilder();
            sb.append(j);
            sb.append('|');
        } while (!((String) next).startsWith(sb.toString()));
        String str = (String) next;
        if (str == null) {
            return C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf;
        }
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928884140809389450L, strArr), str), new String[]{MagicFactory.get(4928884132219454858L, strArr)}));
    }

    @Override // p000.InterfaceC0744Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final List mo2080Ujhhgtgfeyxiexzf() {
        return !mo1424feyxiexzfUjhhgtg() ? C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf : Collections.singletonList(new C1056feyxiexzfUjhhgtg(R.id.MenuItem_Sns_Like, MagicFactory.get(4928884261068473738L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), new C1073feyxiexzfUjhhgtg(0)));
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo2082Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m2552feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IllegalAccessException {
        m2552feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4143Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4142Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4141Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2552feyxiexzfUjhhgtg(String str, ContentValues contentValues) throws IllegalAccessException {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg() && str.equals(MagicFactory.get(4928884226708735370L, strArr))) {
            Object obj = contentValues.get(MagicFactory.get(4928884329787950474L, strArr));
            MagicFactory.get(4928884304018146698L, strArr);
            Set<String> setM2551feyxiexzfUjhhgtg = m2551feyxiexzfUjhhgtg(((Long) obj).longValue());
            if (setM2551feyxiexzfUjhhgtg.isEmpty()) {
                return;
            }
            Class clsM2792Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928884505881609610L, strArr));
            Object obj2 = contentValues.get(MagicFactory.get(4928888032049759626L, strArr));
            MagicFactory.get(4928887997690021258L, strArr);
            Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(clsM2792Ujhhgtgfeyxiexzf, new Object[0]);
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888315517601162L, strArr);
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class)}, 1));
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
            ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf((byte[]) obj2);
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf);
            LinkedList linkedList = new LinkedList();
            for (String str2 : setM2551feyxiexzfUjhhgtg) {
                C1240feyxiexzfUjhhgtg.f4577Ujhhgtgfeyxiexzf.getClass();
                Object objM4168Ujhhgtgfeyxiexzf2 = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1239feyxiexzfUjhhgtg.f4576Ujhhgtgfeyxiexzf), new Object[0]);
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888272567928202L, strArr);
                ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(str2);
                linkedList.push(objM4168Ujhhgtgfeyxiexzf2);
            }
            int size = linkedList.size();
            int i3 = !linkedList.isEmpty() ? 1 : 0;
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888263977993610L, strArr);
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(linkedList);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888345582372234L, strArr);
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(size));
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888405711914378L, strArr);
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(size));
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888500201194890L, strArr);
            ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(i3));
            int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class);
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928888461546489226L, strArr);
            contentValues.put(MagicFactory.get(4928887447934207370L, strArr), (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0]));
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
