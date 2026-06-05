package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.data.bean.ContactBean;
import me.hd.wauxv.data.bean.ContactLabelBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3162feyxiexzfUjhhgtg implements InterfaceC3595feyxiexzfUjhhgtg, InterfaceC2588feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9790Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3162feyxiexzfUjhhgtg(int i) {
        this.f9790Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3595feyxiexzfUjhhgtg
    public Object get() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC2588feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public Object mo2919Ujhhgtgfeyxiexzf(Object[] objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i = this.f9790Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 3:
                Object obj = objArr[0];
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj2 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj3 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                return Integer.valueOf(AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.mp3ToSilk((String) obj, (String) obj2, ((Integer) obj3).intValue()));
            case 4:
                Object obj4 = objArr[0];
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj5 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                return Integer.valueOf(AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.mp3ToSilk((String) obj4, (String) obj5, 24000));
            case 5:
                Object obj6 = objArr[0];
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj7 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj8 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                return Integer.valueOf(AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.silkToMp3((String) obj6, (String) obj7, ((Integer) obj8).intValue()));
            case 6:
                Object obj9 = objArr[0];
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj10 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                return Integer.valueOf(AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.silkToMp3((String) obj9, (String) obj10, 24000));
            case 7:
                Object obj11 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                return Long.valueOf(AbstractC2549feyxiexzfUjhhgtg.f8274Ujhhgtgfeyxiexzf.getDuration((String) obj11));
            case 8:
                C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
                return C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg();
            case 9:
                Object obj12 = objArr[0];
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj13 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                List listSingletonList = Collections.singletonList((String) obj13);
                C0453Ujhhgtgfeyxiexzf.f2356Ujhhgtgfeyxiexzf.getClass();
                C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C0454Ujhhgtgfeyxiexzf.f2357Ujhhgtgfeyxiexzf).newInstance((String) obj12, listSingletonList, 0));
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
                String strM4272feyxiexzfUjhhgtg = C2884feyxiexzfUjhhgtg.m4272feyxiexzfUjhhgtg();
                return strM4272feyxiexzfUjhhgtg == null ? C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg() : strM4272feyxiexzfUjhhgtg;
            case 11:
                Object obj14 = objArr[0];
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj15 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                C0453Ujhhgtgfeyxiexzf.f2356Ujhhgtgfeyxiexzf.getClass();
                C1345feyxiexzfUjhhgtg.m2866feyxiexzfUjhhgtg(C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C0454Ujhhgtgfeyxiexzf.f2357Ujhhgtgfeyxiexzf).newInstance((String) obj14, (List) obj15, 0));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                Object obj16 = objArr[0];
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj17 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj18 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                C0452Ujhhgtgfeyxiexzf.m1785Ujhhgtgfeyxiexzf(((Integer) obj18).intValue(), (String) obj16, (String) obj17, 0);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                Object obj19 = objArr[0];
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj20 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj21 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                int iIntValue = ((Integer) obj21).intValue();
                Object obj22 = objArr[3];
                "null cannot be cast to non-null type kotlin.Int";
                C0452Ujhhgtgfeyxiexzf.m1785Ujhhgtgfeyxiexzf(iIntValue, (String) obj19, (String) obj20, ((Integer) obj22).intValue());
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                List listM5361feyxiexzfUjhhgtg = C3673feyxiexzfUjhhgtg.m5361feyxiexzfUjhhgtg();
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM5361feyxiexzfUjhhgtg, 10));
                Iterator it = listM5361feyxiexzfUjhhgtg.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ContactLabelBean(it.next()));
                }
                return arrayList;
            case 15:
                Object obj23 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                return C3673feyxiexzfUjhhgtg.m5362feyxiexzfUjhhgtg((String) obj23);
            case 16:
                Object obj24 = objArr[0];
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3671feyxiexzfUjhhgtg.f11668Ujhhgtgfeyxiexzf);
                C3669feyxiexzfUjhhgtg.f11666Ujhhgtgfeyxiexzf.getClass();
                Object objInvoke = methodM3154feyxiexzfUjhhgtg.invoke(C3669feyxiexzfUjhhgtg.m5360feyxiexzfUjhhgtg(), (String) obj24);
                "null cannot be cast to non-null type kotlin.String";
                return C3673feyxiexzfUjhhgtg.m5362feyxiexzfUjhhgtg((String) objInvoke);
            case Opcodes.SIPUSH /* 17 */:
                Object obj25 = objArr[0];
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj26 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C0452Ujhhgtgfeyxiexzf.m1778Ujhhgtgfeyxiexzf((String) obj25, Collections.singletonList((String) obj26));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                Object obj27 = objArr[0];
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj28 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                C0452Ujhhgtgfeyxiexzf.m1778Ujhhgtgfeyxiexzf((String) obj27, (List) obj28);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                Object obj29 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C0178Ujhhgtgfeyxiexzf.f1381Ujhhgtgfeyxiexzf.getClass();
                return C0178Ujhhgtgfeyxiexzf.m1244feyxiexzfUjhhgtg((String) obj29, false);
            case 20:
                C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                return C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ArrayList arrayList2 = new ArrayList();
                Cursor cursorM5194feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11713Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg != null) {
                    while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
                        try {
                            arrayList2.add(AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg));
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                                throw th2;
                            }
                        }
                    }
                    cursorM5194feyxiexzfUjhhgtg.close();
                }
                return arrayList2;
            case Opcodes.LLOAD /* 22 */:
                return AbstractC3594Ujhhgtgfeyxiexzf.m5175Ujhhgtgfeyxiexzf();
            case Opcodes.FLOAD /* 23 */:
                Object obj30 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                return C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg((String) obj30);
            case Opcodes.DLOAD /* 24 */:
                Object obj31 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj31;
                C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                String conRemark = new ContactBean(C3681feyxiexzfUjhhgtg.m5372feyxiexzfUjhhgtg(str)).getConRemark();
                return AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(conRemark) ? C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str) : conRemark;
            case Opcodes.ALOAD /* 25 */:
                Object obj32 = objArr[0];
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj32;
                Object obj33 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C2903feyxiexzfUjhhgtg.f9182Ujhhgtgfeyxiexzf.getClass();
                Object objM4279feyxiexzfUjhhgtg = C2903feyxiexzfUjhhgtg.m4279feyxiexzfUjhhgtg((String) obj33);
                if (objM4279feyxiexzfUjhhgtg != null) {
                    C2759feyxiexzfUjhhgtg.f8740Ujhhgtgfeyxiexzf.getClass();
                    Object objInvoke2 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C2751Ujhhgtgfeyxiexzf.f8723Ujhhgtgfeyxiexzf).invoke(objM4279feyxiexzfUjhhgtg, str2);
                    if (objInvoke2 != null) {
                        int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objInvoke2).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "e";
                        String str3 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                        return str3 == null ? "" : str3;
                    }
                }
                C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                return C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str2);
            case 26:
                Object obj34 = objArr[0];
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                C2897Ujhhgtgfeyxiexzf c2897Ujhhgtgfeyxiexzf = C2897Ujhhgtgfeyxiexzf.f9174Ujhhgtgfeyxiexzf;
                String str4 = "";
                c2897Ujhhgtgfeyxiexzf.getClass();
                return C2897Ujhhgtgfeyxiexzf.m4277feyxiexzfUjhhgtg((String) obj34, str4);
            case 27:
                Object obj35 = objArr[0];
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj36 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C2897Ujhhgtgfeyxiexzf.f9174Ujhhgtgfeyxiexzf.getClass();
                return C2897Ujhhgtgfeyxiexzf.m4277feyxiexzfUjhhgtg((String) obj35, (String) obj36);
            case 28:
                Object obj37 = objArr[0];
                String[] strArr15 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                Object obj38 = objArr[1];
                "null cannot be cast to non-null type kotlin.Boolean";
                boolean zBooleanValue = ((Boolean) obj38).booleanValue();
                C0178Ujhhgtgfeyxiexzf.f1381Ujhhgtgfeyxiexzf.getClass();
                return C0178Ujhhgtgfeyxiexzf.m1244feyxiexzfUjhhgtg((String) obj37, zBooleanValue);
            default:
                return AbstractC3594Ujhhgtgfeyxiexzf.m5176Ujhhgtgfeyxiexzf();
        }
    }
}
