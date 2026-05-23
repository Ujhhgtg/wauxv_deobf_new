package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.data.bean.ContactBean;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1039 implements InterfaceC1467, InterfaceC0500 {

    public final /* synthetic */ int f3785;

    public /* synthetic */ C1039(int i) {
        this.f3785 = i;
    }

    @Override // p000.InterfaceC1467
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

    @Override // p000.InterfaceC0500
    public Object mo1745(Object[] objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i = this.f3785;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 3:
                Object obj = objArr[0];
                return AbstractC0743.m2186((String) obj);
            case 4:
                Object obj2 = objArr[0];
                return AbstractC0743.m2186((String) obj2).getAbsolutePath();
            case 5:
                Object obj3 = objArr[0];
                String[] strArr = AbstractC1574.f5469;
                Object obj4 = objArr[1];
                File fileM2186 = AbstractC0743.m2186((String) obj3);
                AbstractC1328.m3042(fileM2186, new File((String) obj4));
                fileM2186.delete();
                return unit;
            case 6:
                Object obj5 = objArr[0];
                return AbstractC1459.m3196(new File((String) obj5));
            case 7:
                Object obj6 = objArr[0];
                return AbstractC1459.m3196(new File((String) obj6)).getAbsolutePath();
            case 8:
                Object obj7 = objArr[0];
                String[] strArr2 = AbstractC1574.f5469;
                Object obj8 = objArr[1];
                File fileM3196 = AbstractC1459.m3196(new File((String) obj7));
                AbstractC1328.m3042(fileM3196, new File((String) obj8));
                fileM3196.delete();
                return unit;
            case 9:
                Object obj9 = objArr[0];
                return Integer.valueOf(AbstractC1459.m3188((String) obj9));
            case 10:
                
                return C0774.getSelfWxId();
            case 11:
                Object obj10 = objArr[0];
                String[] strArr3 = AbstractC1574.f5469;
                Object obj11 = objArr[1];
                
                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2161.f7121).newInstance((String) obj10, (List) obj11, 0));
                return unit;
            case 12 /* 12 */:
                
                Object objInvoke = AbstractC1574.dexToMethod(C0773.f2873).invoke(null, null);
                String[] strArr4 = AbstractC1574.f5469;
                Object obj12 = ((Map) objInvoke).get("last_login_alias");
                String str = obj12 instanceof String ? (String) obj12 : null;
                return str == null ? C0774.getSelfWxId() : str;
            case 13:
                Object obj13 = objArr[0];
                String[] strArr5 = AbstractC1574.f5469;
                Object obj14 = objArr[1];
                Object obj15 = objArr[2];
                C1133.m2727(((Integer) obj15).intValue(), (String) obj13, (String) obj14, 0);
                return unit;
            case 14 /* 14 */:
                Object obj16 = objArr[0];
                String[] strArr6 = AbstractC1574.f5469;
                Object obj17 = objArr[1];
                Object obj18 = objArr[2];
                int iIntValue = ((Integer) obj18).intValue();
                Object obj19 = objArr[3];
                C1133.m2727(iIntValue, (String) obj16, (String) obj17, ((Integer) obj19).intValue());
                return unit;
            case 15:
                Object obj20 = objArr[0];
                String[] strArr7 = AbstractC1574.f5469;
                Object obj21 = objArr[1];
                C1133.m2713((String) obj20, Collections.singletonList((String) obj21));
                return unit;
            case 16:
                Object obj22 = objArr[0];
                String[] strArr8 = AbstractC1574.f5469;
                Object obj23 = objArr[1];
                C1133.m2713((String) obj22, (List) obj23);
                return unit;
            case 17 /* 17 */:
                
                return C2893.f9311;
            case 18 /* 18 */:
                return AbstractC2203.m4031();
            case 19:
                Object obj24 = objArr[0];
                
                return new ContactBean(C0819.m2371((String) obj24)).getNickname();
            case 20:
                Object obj25 = objArr[0];
                String str2 = (String) obj25;
                C0819 c0819 = C0819.f3207;
                
                String conRemark = new ContactBean(C0819.m2371(str2)).getConRemark();
                if (!AbstractC2841.m4836(conRemark)) {
                    return conRemark;
                }
                
                return new ContactBean(C0819.m2371(str2)).getNickname();
            case 21 /* 21 */:
                Object obj26 = objArr[0];
                String[] strArr9 = AbstractC1574.f5469;
                Object obj27 = objArr[1];
                boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                
                return C1873.m3654((String) obj26, zBooleanValue);
            case 22 /* 22 */:
                Object obj28 = objArr[0];
                String[] strArr10 = AbstractC1574.f5469;
                String str3 = (String) obj28;
                Object obj29 = objArr[1];
                
                Object objM2066 = C0674.m2066((String) obj29);
                if (objM2066 != null) {
                    
                    Object objInvoke2 = AbstractC1574.dexToMethod(C0651.f2503).invoke(objM2066, str3);
                    if (objInvoke2 != null) {
                        int i2 = 0;
                        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objInvoke2).m3490();
                        c1299M3490.name = "e";
                        String str4 = (String) ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3024();
                        return str4 == null ? "" : str4;
                    }
                }
                
                return new ContactBean(C0819.m2371(str3)).getNickname();
            case 23 /* 23 */:
                Object obj30 = objArr[0];
                String[] strArr11 = AbstractC1574.f5469;
                C0669 c0669 = C0669.f2550;
                String str5 = "";
                
                return C0669.m2063((String) obj30, "");
            case 24 /* 24 */:
                Object obj31 = objArr[0];
                String[] strArr12 = AbstractC1574.f5469;
                Object obj32 = objArr[1];
                
                return C0669.m2063((String) obj31, (String) obj32);
            case 25 /* 25 */:
                Object obj33 = objArr[0];
                
                return C1873.m3654((String) obj33, false);
            case 26:
                return AbstractC2203.m4032();
            case 27:
                Object obj34 = objArr[0];
                
                int i3 = 0;
                
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C0672.m2065()).m3492();
                c1973M3492.returnType = AbstractC2519.classToKClass(List.class);
                List list = (List) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class)}, 1, c1973M3492)).invoke((String) obj34);
                return list == null ? C1189.f4329 : list;
            case 28:
                Object obj35 = objArr[0];
                String[] strArr13 = AbstractC1574.f5469;
                
                Method methodM3315 = AbstractC1574.dexToMethod(C0673.f2556);
                
                Object objInvoke3 = methodM3315.invoke(C0672.m2065(), (String) obj35);
                Integer num = (Integer) objInvoke3;
                
                return num;
            default:
                Object obj36 = objArr[0];
                String[] strArr14 = AbstractC1574.f5469;
                Object obj37 = objArr[1];
                List listSingletonList = Collections.singletonList((String) obj37);
                
                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2156.f7116).newInstance((String) obj36, listSingletonList, null, null));
                return unit;
        }
    }
}
