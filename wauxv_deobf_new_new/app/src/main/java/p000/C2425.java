package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᲈᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2425 implements InterfaceC0476, InterfaceC2969 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2425 f7764 = new C2425(16);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2425 f7765 = new C2425(17);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2425 f7766 = new C2425(18);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2425 f7767 = new C2425(19);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2425 f7768 = new C2425(20);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7769;

    public /* synthetic */ C2425(int i) {
        this.f7769 = i;
    }

    @Override // p000.InterfaceC0476
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public Object mo1848(Object[] objArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i = this.f7769;
        List list = null;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                Object obj = objArr[0];
                String[] strArr = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.Any";
                Object obj2 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj3 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                Integer num = (Integer) obj3;
                num.getClass();
                int i2 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
                c2004M3560.f6475 = (String) obj2;
                c2004M3560.f4484 = num;
                return ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(Arrays.copyOf(new Object[0], 0));
            case 1:
                Object obj4 = objArr[0];
                String[] strArr2 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.Any";
                Object obj5 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj6 = objArr[2];
                "null cannot be cast to non-null type kotlin.Int";
                Integer num2 = (Integer) obj6;
                num2.getClass();
                Object obj7 = objArr[3];
                "null cannot be cast to non-null type kotlin.Array<out kotlin.Any?>";
                Object[] objArr2 = (Object[]) obj7;
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                int i3 = AbstractC1768.f5906;
                C2004 c2004M3561 = AbstractC2727.m4713(obj4).m3560();
                c2004M3561.f6475 = (String) obj5;
                c2004M3561.f4484 = num2;
                return ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4025(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            case 2:
                Object obj8 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                Object objM5110 = C3570.m5110(C3570.f11167, EnumC3736.f11669.f11675);
                C3570.m5111(objM5110, (String) obj8);
                C3570.m5109(objM5110);
                return c3554;
            case 3:
                Object obj9 = objArr[0];
                String[] strArr3 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj10 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj10;
                Object obj11 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj11;
                Object objM5111 = C3570.m5110(C3570.f11167, EnumC3736.f11669.f11675);
                C3570.m5111(objM5111, (String) obj9);
                if (str != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str != null) {
                        C3570.m5113(objM5111, str);
                    }
                }
                if (str2 != null) {
                    String str3 = str2.length() != 0 ? str2 : null;
                    if (str3 != null) {
                        C3570.m5112(objM5111, str3);
                    }
                }
                C3570.m5109(objM5111);
                return c3554;
            case 4:
                Object obj12 = objArr[0];
                String[] strArr4 = AbstractC1471.f5234;
                "null cannot be cast to non-null type org.json.JSONObject";
                JSONObject jSONObject = (JSONObject) obj12;
                String strOptString = jSONObject.optString("content");
                String strOptString2 = jSONObject.optString("sdkId");
                String strOptString3 = jSONObject.optString("sdkAppName");
                Object objM5112 = C3570.m5110(C3570.f11167, EnumC3736.f11669.f11675);
                C3570.m5111(objM5112, strOptString);
                if (strOptString2 != null) {
                    if (strOptString2.length() == 0) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        C3570.m5113(objM5112, strOptString2);
                    }
                }
                if (strOptString3 != null) {
                    String str4 = strOptString3.length() != 0 ? strOptString3 : null;
                    if (str4 != null) {
                        C3570.m5112(objM5112, str4);
                    }
                }
                C3570.m5109(objM5112);
                return c3554;
            case 5:
                Object obj13 = objArr[0];
                String[] strArr5 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj14 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C1139.m2870((String) obj13, Collections.singletonList((String) obj14), null, null);
                return c3554;
            case 6:
                Object obj15 = objArr[0];
                String[] strArr6 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj16 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj17 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                Object obj18 = objArr[3];
                "null cannot be cast to non-null type kotlin.String";
                C1139.m2870((String) obj15, Collections.singletonList((String) obj16), (String) obj17, (String) obj18);
                return c3554;
            case 7:
                Object obj19 = objArr[0];
                String[] strArr7 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj20 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                C1139.m2870((String) obj19, (List) obj20, null, null);
                return c3554;
            case 8:
                Object obj21 = objArr[0];
                String[] strArr8 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj22 = objArr[1];
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                Object obj23 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                Object obj24 = objArr[3];
                "null cannot be cast to non-null type kotlin.String";
                C1139.m2870((String) obj21, (List) obj22, (String) obj23, (String) obj24);
                return c3554;
            case 9:
                Object obj25 = objArr[0];
                String[] strArr9 = AbstractC1471.f5234;
                "null cannot be cast to non-null type org.json.JSONObject";
                JSONObject jSONObject2 = (JSONObject) obj25;
                String strOptString4 = jSONObject2.optString("content");
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("picPathList");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i4 = 0; i4 < length; i4++) {
                        arrayList.add(jSONArrayOptJSONArray.optString(i4));
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = C1191.f4326;
                }
                C1139.m2870(strOptString4, list, jSONObject2.optString("sdkId"), jSONObject2.optString("sdkAppName"));
                return c3554;
            case 10:
                Object obj26 = objArr[0];
                String[] strArr10 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                String str5 = (String) obj26;
                Object obj27 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                String str6 = (String) obj27;
                Object obj28 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                Object obj29 = objArr[3];
                "null cannot be cast to non-null type kotlin.Int";
                C2213.m4153(C2213.f7263, C2224.m4155(C2224.f7274, str5, str6, "confirm", (String) obj28, ((Integer) obj29).intValue()));
                return c3554;
            case 11:
                Object obj30 = objArr[0];
                String[] strArr11 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                String str7 = (String) obj30;
                Object obj31 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                Object obj32 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                C2213.m4153(C2213.f7263, C2224.m4155(C2224.f7274, str7, (String) obj31, "refuse", (String) obj32, 0));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                Object obj33 = objArr[0];
                String[] strArr12 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj34 = objArr[1];
                "null cannot be cast to non-null type java.util.function.Consumer<kotlin.String?>";
                new C0310((String) obj33, 5, (Consumer) obj34).invoke();
                return c3554;
            case 13:
                Object obj35 = objArr[0];
                String[] strArr13 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                Object obj36 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                C2199.m4149((String) obj35, (String) obj36);
                return c3554;
            default:
                Object obj37 = objArr[0];
                "null cannot be cast to non-null type kotlin.Any";
                C2213.m4153(C2213.f7263, obj37);
                return c3554;
        }
    }
}
