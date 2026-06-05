package p000;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2925Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9212Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9213Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2925Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9212Ujhhgtgfeyxiexzf = i;
        this.f9213Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        int i = this.f9212Ujhhgtgfeyxiexzf;
        boolean zM2623feyxiexzfUjhhgtg = true;
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = null;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        Object obj2 = this.f9213Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                return obj == ((AbstractC2933Ujhhgtgfeyxiexzf) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf = (C0113Ujhhgtgfeyxiexzf) obj2;
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Integer num = (Integer) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                c0113Ujhhgtgfeyxiexzf.setSelectedTabIndex(num != null ? num.intValue() : 0);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C2665Ujhhgtgfeyxiexzf c2665Ujhhgtgfeyxiexzf = (C2665Ujhhgtgfeyxiexzf) obj2;
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                Integer num2 = (Integer) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                c2665Ujhhgtgfeyxiexzf.setSelectedItemId(num2 != null ? num2.intValue() : 0);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) obj2;
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 = (C0627Ujhhgtgfeyxiexzf) obj;
                return Boolean.valueOf(C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf2.f2657Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf) && c0627Ujhhgtgfeyxiexzf2.f2658Ujhhgtgfeyxiexzf == c0627Ujhhgtgfeyxiexzf.f2658Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf2.f2659Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf));
            case 4:
                CompoundButton compoundButton = (CompoundButton) obj2;
                C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg = (C3677feyxiexzfUjhhgtg) obj;
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(((EditText) c3677feyxiexzfUjhhgtg.f11683Ujhhgtgfeyxiexzf.getValue()).getText())) {
                    String strM2774Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(compoundButton);
                    C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
                    if (c3678feyxiexzfUjhhgtg2 == null) {
                        "info";
                    } else {
                        c3678feyxiexzfUjhhgtg = c3678feyxiexzfUjhhgtg2;
                    }
                    List listM5370Ujhhgtgfeyxiexzf = c3678feyxiexzfUjhhgtg.m5370Ujhhgtgfeyxiexzf(strM2774Ujhhgtgfeyxiexzf);
                    c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf = new C3662feyxiexzfUjhhgtg(c3677feyxiexzfUjhhgtg);
                    ((RecyclerView) c3677feyxiexzfUjhhgtg.f11682Ujhhgtgfeyxiexzf.getValue()).setAdapter(c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf);
                    C3662feyxiexzfUjhhgtg.m5358Ujhhgtgfeyxiexzf(c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf, listM5370Ujhhgtgfeyxiexzf);
                } else {
                    c3677feyxiexzfUjhhgtg.m5366Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((EditText) c3677feyxiexzfUjhhgtg.f11683Ujhhgtgfeyxiexzf.getValue()));
                }
                c3677feyxiexzfUjhhgtg.m5365Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                Boolean bool = (Boolean) obj2;
                AbstractC2059Ujhhgtgfeyxiexzf abstractC2059Ujhhgtgfeyxiexzf = (AbstractC2059Ujhhgtgfeyxiexzf) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (bool.equals(Boolean.TRUE)) {
                    zM2623feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(abstractC2059Ujhhgtgfeyxiexzf.mo1480feyxiexzfUjhhgtg(), "测试/", false);
                } else {
                    if (!bool.equals(Boolean.FALSE)) {
                        throw new C2870Ujhhgtgfeyxiexzf();
                    }
                    if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(abstractC2059Ujhhgtgfeyxiexzf.mo1480feyxiexzfUjhhgtg(), "测试/", false)) {
                        zM2623feyxiexzfUjhhgtg = false;
                    }
                }
                return Boolean.valueOf(zM2623feyxiexzfUjhhgtg);
            case 6:
                return Boolean.valueOf(((C3485Ujhhgtgfeyxiexzf) obj).f10821Ujhhgtgfeyxiexzf == ((C3485Ujhhgtgfeyxiexzf) obj2).f10821Ujhhgtgfeyxiexzf);
            case 7:
                C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg = (C2285feyxiexzfUjhhgtg) obj2;
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                Object obj3 = c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3;
                if (obj3 != null) {
                    int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj3);
                    C0277Ujhhgtgfeyxiexzf c0277Ujhhgtgfeyxiexzf = C0277Ujhhgtgfeyxiexzf.f1689Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                    String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getLatitude";
                    C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = c0277Ujhhgtgfeyxiexzf.m2996Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf()), 1);
                    c0277Ujhhgtgfeyxiexzf.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf, new C0760Ujhhgtgfeyxiexzf(17));
                    c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getLongitude";
                    C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf2 = c0277Ujhhgtgfeyxiexzf.m2996Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf()), 1);
                    c0277Ujhhgtgfeyxiexzf.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf2, new C0760Ujhhgtgfeyxiexzf(23));
                    c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf2.m3485Ujhhgtgfeyxiexzf();
                }
                C2285feyxiexzfUjhhgtg.m3482Ujhhgtgfeyxiexzf(c2285feyxiexzfUjhhgtg);
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                int parameterCount = ((Constructor) obj2).getParameterCount();
                int i3 = 8;
                if (parameterCount != 13 && parameterCount != 14) {
                    i3 = 7;
                }
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[i3];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg4 = null;
                }
                String str = (String) c0919feyxiexzfUjhhgtg4;
                if (str == null) {
                    str = "";
                }
                C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg(i3, 6, c0578Ujhhgtgfeyxiexzf4);
                C0496Ujhhgtgfeyxiexzf.f2415Ujhhgtgfeyxiexzf.getClass();
                String strM4623Ujhhgtgfeyxiexzf = C0494Ujhhgtgfeyxiexzf.f2413Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c2501feyxiexzfUjhhgtg.m3786Ujhhgtgfeyxiexzf(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM4623Ujhhgtgfeyxiexzf, "${sendText}", str), "${line}", "\n"), "${sendTime}", AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(System.currentTimeMillis(), C0495Ujhhgtgfeyxiexzf.f2414Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), null, 2)));
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                List list = (List) obj2;
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.getClass();
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1155feyxiexzfUjhhgtg((String) it.next(), 5, false));
                }
                c2812Ujhhgtgfeyxiexzf.f8951Ujhhgtgfeyxiexzf = new ArrayList(arrayList);
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((Runnable) obj2).run();
                return c1943Ujhhgtgfeyxiexzf;
            default:
                AbstractC1245feyxiexzfUjhhgtg.m2758Ujhhgtgfeyxiexzf((Context) obj2, 4, (String) obj);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
