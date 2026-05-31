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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᛸᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1042 implements InterfaceC1478, InterfaceC0476 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3792;

    public /* synthetic */ C1042(int i) {
        this.f3792 = i;
    }

    @Override // p000.InterfaceC1478
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

    @Override // p000.InterfaceC0476
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public Object mo1848(Object[] objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i = this.f3792;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 3:
                Object obj = objArr[0];
                String[] strArr = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj2 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj3 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                return Integer.valueOf(AbstractC0309.f1589.mp3ToSilk((String) obj, (String) obj2, ((Integer) obj3).intValue()));
            case 4:
                Object obj4 = objArr[0];
                String[] strArr2 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj5 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                return Integer.valueOf(AbstractC0309.f1589.mp3ToSilk((String) obj4, (String) obj5, 24000));
            case 5:
                Object obj6 = objArr[0];
                String[] strArr3 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj7 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj8 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                return Integer.valueOf(AbstractC0309.f1589.silkToMp3((String) obj6, (String) obj7, ((Integer) obj8).intValue()));
            case 6:
                Object obj9 = objArr[0];
                String[] strArr4 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj10 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                return Integer.valueOf(AbstractC0309.f1589.silkToMp3((String) obj9, (String) obj10, 24000));
            case 7:
                Object obj11 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                return Long.valueOf(AbstractC0309.f1589.getDuration((String) obj11));
            case 8:
                C0772.f2876.getClass();
                return C0772.m2366();
            case 9:
                Object obj12 = objArr[0];
                String[] strArr5 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj13 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                List listSingletonList = Collections.singletonList((String) obj13);
                C2195.f7245.getClass();
                C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2194.f7244).newInstance((String) obj12, listSingletonList, 0));
                return c3554;
            case 10:
                C0772.f2876.getClass();
                String strM2365 = C0772.m2365();
                return strM2365 == null ? C0772.m2366() : strM2365;
            case 11:
                Object obj14 = objArr[0];
                String[] strArr6 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj15 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                C2195.f7245.getClass();
                C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2194.f7244).newInstance((String) obj14, (List) obj15, 0));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                Object obj16 = objArr[0];
                String[] strArr7 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj17 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj18 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                C2199.m4150(((Integer) obj18).intValue(), (String) obj16, (String) obj17, 0);
                return c3554;
            case 13:
                Object obj19 = objArr[0];
                String[] strArr8 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj20 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj21 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                int iIntValue = ((Integer) obj21).intValue();
                Object obj22 = objArr[3];
                "null cannot be cast to non-null type kotlin.Int";
                C2199.m4150(iIntValue, (String) obj19, (String) obj20, ((Integer) obj22).intValue());
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C0810.f3180.getClass();
                List listM2476 = C0810.m2476();
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listM2476, 10));
                Iterator it = listM2476.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ContactLabelBean(it.next()));
                }
                return arrayList;
            case 15:
                Object obj23 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C0810.f3180.getClass();
                return C0810.m2477((String) obj23);
            case 16:
                Object obj24 = objArr[0];
                String[] strArr9 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                C0810.f3180.getClass();
                Method methodM2610 = AbstractC0972.m2610(C0808.f3178);
                C0806.f3176.getClass();
                Object objInvoke = methodM2610.invoke(C0806.m2475(), (String) obj24);
                "null cannot be cast to non-null type kotlin.String";
                return C0810.m2477((String) objInvoke);
            case Opcodes.SIPUSH /* 17 */:
                Object obj25 = objArr[0];
                String[] strArr10 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj26 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C2199.m4143((String) obj25, Collections.singletonList((String) obj26));
                return c3554;
            case Opcodes.LDC /* 18 */:
                Object obj27 = objArr[0];
                String[] strArr11 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj28 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                C2199.m4143((String) obj27, (List) obj28);
                return c3554;
            case 19:
                Object obj29 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C1900.f6295.getClass();
                return C1900.m3832((String) obj29, false);
            case 20:
                C2952.f9477.getClass();
                return C2952.f9478;
            case Opcodes.ILOAD /* 21 */:
                ArrayList arrayList2 = new ArrayList();
                Cursor cursorM4265 = AbstractC2240.m4265(new EnumC0821[]{EnumC0821.f3223});
                if (cursorM4265 != null) {
                    while (cursorM4265.moveToNext()) {
                        try {
                            arrayList2.add(AbstractC2727.m4697(cursorM4265));
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3528.m5090(cursorM4265, th);
                                throw th2;
                            }
                        }
                    }
                    cursorM4265.close();
                }
                return arrayList2;
            case Opcodes.LLOAD /* 22 */:
                return AbstractC2240.m4250();
            case Opcodes.FLOAD /* 23 */:
                Object obj30 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                C0818.f3214.getClass();
                return C0818.m2488((String) obj30);
            case Opcodes.DLOAD /* 24 */:
                Object obj31 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj31;
                C0818.f3214.getClass();
                String conRemark = new ContactBean(C0818.m2487(str)).getConRemark();
                return AbstractC2901.m4869(conRemark) ? C0818.m2488(str) : conRemark;
            case Opcodes.ALOAD /* 25 */:
                Object obj32 = objArr[0];
                String[] strArr12 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj32;
                Object obj33 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C0665.f2551.getClass();
                Object objM2156 = C0665.m2156((String) obj33);
                if (objM2156 != null) {
                    C0643.f2506.getClass();
                    Object objInvoke2 = AbstractC0972.m2610(C0642.f2505).invoke(objM2156, str2);
                    if (objInvoke2 != null) {
                        int i2 = AbstractC1768.f5906;
                        C1300 c1300M3558 = AbstractC2727.m4713(objInvoke2).m3558();
                        c1300M3558.f6475 = "e";
                        String str3 = (String) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127();
                        return str3 == null ? "" : str3;
                    }
                }
                C0818.f3214.getClass();
                return C0818.m2488(str2);
            case 26:
                Object obj34 = objArr[0];
                String[] strArr13 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                C0659 c0659 = C0659.f2543;
                String str4 = "";
                c0659.getClass();
                return C0659.m2153((String) obj34, str4);
            case 27:
                Object obj35 = objArr[0];
                String[] strArr14 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj36 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C0659.f2543.getClass();
                return C0659.m2153((String) obj35, (String) obj36);
            case 28:
                Object obj37 = objArr[0];
                String[] strArr15 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj38 = objArr[1];
                "null cannot be cast to non-null type kotlin.Boolean";
                boolean zBooleanValue = ((Boolean) obj38).booleanValue();
                C1900.f6295.getClass();
                return C1900.m3832((String) obj37, zBooleanValue);
            default:
                return AbstractC2240.m4251();
        }
    }
}
