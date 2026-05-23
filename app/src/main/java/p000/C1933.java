package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1933 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6384;

    public /* synthetic */ C1933(int i) {
        this.f6384 = i;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) throws JSONException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String genericString;
        String strM3344;
        String content;
        Object c2585;
        int i = this.f6384;
        int i2 = 9;
        int i3 = 10;
        int i4 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Member) obj2).isSynthetic() != ((Boolean) obj).booleanValue());
            case 1:
                String str = (String) obj;
                Member member = (Member) obj2;
                if (member instanceof Method) {
                    genericString = ((Method) member).toGenericString();
                } else if (member instanceof Constructor) {
                    genericString = ((Constructor) member).toGenericString();
                } else {
                    if (!(member instanceof Field)) {
                        throw new IllegalStateException(("Unsupported member type: " + member).toString());
                    }
                    genericString = ((Field) member).toGenericString();
                }
                return Boolean.valueOf(AbstractC2207.m4087(genericString, str));
            case 2:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 3:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 4:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
            case 6:
                Boolean bool = (Boolean) ((InterfaceC1425) obj).invoke(((Field) obj2).getType());
                bool.booleanValue();
                return bool;
            case 7:
                Context context = (Context) obj;
                String[] strArr = AbstractC1574.f5469;
                ArrayList arrayList = new ArrayList();
                for (MsgInfoBean msgInfoBean : (List) obj2) {
                    if (!msgInfoBean.isText()) {
                        msgInfoBean = null;
                    }
                    String content2 = msgInfoBean != null ? msgInfoBean.getContent() : null;
                    if (content2 != null) {
                        arrayList.add(content2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String strM2196 = AbstractC0744.m2196(arrayList, "\n", null, null, null, 62);
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    intent.putExtra("Ksnsupload_type", 9);
                    intent.putExtra("Kdescription", strM2196);
                    context.startActivity(intent);
                }
                return c3497;
            case 8:
                Context context2 = (Context) obj;
                List<MsgInfoBean> list = (List) obj2;
                String[] strArr2 = AbstractC1574.f5469;
                ArrayList arrayList2 = new ArrayList();
                for (MsgInfoBean msgInfoBean2 : list) {
                    if (!msgInfoBean2.isText()) {
                        msgInfoBean2 = null;
                    }
                    String content3 = msgInfoBean2 != null ? msgInfoBean2.getContent() : null;
                    if (content3 != null) {
                        arrayList2.add(content3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (MsgInfoBean msgInfoBean3 : list) {
                    if (!msgInfoBean3.isImage()) {
                        msgInfoBean3 = null;
                    }
                    if (msgInfoBean3 != null) {
                        C1616 c1616 = C1616.f5487;
                        Object origin = msgInfoBean3.getOrigin();
                        c1616.getClass();
                        strM3344 = C1616.m3344(origin);
                    } else {
                        strM3344 = null;
                    }
                    if (strM3344 != null) {
                        arrayList3.add(strM3344);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    String strM2197 = AbstractC0744.m2196(arrayList2, MagicFactory.get(-572394586503860L, strArr2), null, null, null, 62);
                    ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
                    Intent intent2 = new Intent();
                    intent2.setClassName(context2, MagicFactory.get(-102340480727732L, strArr2));
                    intent2.putStringArrayListExtra(MagicFactory.get(-102516574386868L, strArr2), arrayList4);
                    intent2.putExtra(MagicFactory.get(-102606768700084L, strArr2), strM2197);
                    context2.startActivity(intent2);
                }
                return c3497;
            case 9:
                Context context3 = (Context) obj;
                List<MsgInfoBean> list2 = (List) obj2;
                String[] strArr3 = AbstractC1574.f5469;
                ArrayList arrayList5 = new ArrayList();
                for (MsgInfoBean msgInfoBean4 : list2) {
                    if (!msgInfoBean4.isText()) {
                        msgInfoBean4 = null;
                    }
                    String content4 = msgInfoBean4 != null ? msgInfoBean4.getContent() : null;
                    if (content4 != null) {
                        arrayList5.add(content4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (MsgInfoBean msgInfoBean5 : list2) {
                    if (!msgInfoBean5.isVideo()) {
                        msgInfoBean5 = null;
                    }
                    String imgPath = msgInfoBean5 != null ? msgInfoBean5.getImgPath() : null;
                    if (imgPath != null) {
                        arrayList6.add(imgPath);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    String strM2198 = AbstractC0744.m2196(arrayList5, MagicFactory.get(-572403176438452L, strArr3), null, null, null, 62);
                    C3558 c3558 = C3558.f11162;
                    String str2 = (String) AbstractC0744.m2197(arrayList6);
                    c3558.getClass();
                    String strM5145 = C3558.m5145(str2);
                    String str3 = (String) AbstractC0744.m2197(arrayList6);
                    Method methodM3315 = AbstractC1574.m3315(C3556.f11160);
                    C3555.f11159.getClass();
                    Object objInvoke = methodM3315.invoke(C3555.m5144(), str3);
                    MagicFactory.get(-391116901841588L, strArr3);
                    Intent intent3 = new Intent();
                    intent3.setClassName(context3, MagicFactory.get(-102666898242228L, strArr3));
                    intent3.putExtra(MagicFactory.get(-102842991901364L, strArr3), 14);
                    intent3.putExtra(MagicFactory.get(-102911711378100L, strArr3), strM5145);
                    intent3.putExtra(MagicFactory.get(-102958956018356L, strArr3), (String) objInvoke);
                    intent3.putExtra(MagicFactory.get(-103027675495092L, strArr3), strM2198);
                    context3.startActivity(intent3);
                }
                return c3497;
            case 10:
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    MsgInfoBean msgInfoBean6 = (MsgInfoBean) obj3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i5 = msgInfoBean6.isFile() ? 10800000 : 120000;
                    if (msgInfoBean6.isSend() && jCurrentTimeMillis - msgInfoBean6.getCreateTime() <= i5) {
                        arrayList7.add(obj3);
                    }
                }
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    long msgId = ((MsgInfoBean) it.next()).getMsgId();
                    C2186 c2186 = C2186.f7147;
                    String[] strArr4 = AbstractC1574.f5469;
                    String str4 = MagicFactory.get(-128604205742772L, strArr4);
                    c2186.getClass();
                    C2079.f6881.getClass();
                    C2180.m3960(C2180.f7141, AbstractC1574.m3314(C2185.f7146).newInstance(C2079.m3883(msgId), str4, MagicFactory.get(-128599910775476L, strArr4)));
                }
                return c3497;
            case 11:
                List<MsgInfoBean> list3 = (List) obj2;
                ArrayList arrayList8 = new ArrayList();
                for (MsgInfoBean msgInfoBean7 : list3) {
                    if (!msgInfoBean7.isVoice()) {
                        msgInfoBean7 = null;
                    }
                    String strM5220 = msgInfoBean7 != null ? C3624.m5220(C3624.f11326, msgInfoBean7.getImgPath()) : null;
                    if (strM5220 != null) {
                        arrayList8.add(strM5220);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (MsgInfoBean msgInfoBean8 : list3) {
                    if (!msgInfoBean8.isVoice()) {
                        msgInfoBean8 = null;
                    }
                    Integer numValueOf = (msgInfoBean8 == null || (content = msgInfoBean8.getContent()) == null) ? null : Integer.valueOf(Integer.parseInt(content));
                    if (numValueOf != null) {
                        arrayList9.add(numValueOf);
                    }
                }
                if (!arrayList8.isEmpty() && !arrayList9.isEmpty()) {
                    AbstractC1458.m3166(C2034.f6800, new C2033(arrayList8, arrayList9, i4));
                }
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                int i6 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(obj).m3492();
                c1973M3492.f6543 = AbstractC2519.m4527(Activity.class);
                Activity activity = (Activity) ((C1982) AbstractC0744.m2191(c1973M3492.m3799())).m3832(new Object[0]);
                String content5 = ((MsgInfoBean) obj2).getContent();
                Intent intent4 = new Intent();
                String[] strArr5 = AbstractC1574.f5469;
                intent4.setClassName(activity, MagicFactory.get(-102039833017012L, strArr5));
                intent4.putExtra(MagicFactory.get(-102215926676148L, strArr5), 9);
                intent4.putExtra(MagicFactory.get(-102284646152884L, strArr5), content5);
                activity.startActivity(intent4);
                return c3497;
            case 13:
                int i7 = AbstractC1745.f5844;
                C1973 c1973M3493 = AbstractC0968.m2484(obj).m3492();
                c1973M3493.f6543 = AbstractC2519.m4527(Activity.class);
                Activity activity2 = (Activity) ((C1982) AbstractC0744.m2191(c1973M3493.m3799())).m3832(new Object[0]);
                C1616 c1617 = C1616.f5487;
                Object origin2 = ((MsgInfoBean) obj2).getOrigin();
                c1617.getClass();
                ArrayList<String> arrayList10 = new ArrayList<>(new C0253(new String[]{C1616.m3344(origin2)}, true));
                String[] strArr6 = AbstractC1574.f5469;
                String str5 = MagicFactory.get(-102662603274932L, strArr6);
                Intent intent5 = new Intent();
                intent5.setClassName(activity2, MagicFactory.get(-102340480727732L, strArr6));
                intent5.putStringArrayListExtra(MagicFactory.get(-102516574386868L, strArr6), arrayList10);
                intent5.putExtra(MagicFactory.get(-102606768700084L, strArr6), str5);
                activity2.startActivity(intent5);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                int i8 = AbstractC1745.f5844;
                C1973 c1973M3494 = AbstractC0968.m2484(obj).m3492();
                c1973M3494.f6543 = AbstractC2519.m4527(Activity.class);
                Activity activity3 = (Activity) ((C1982) AbstractC0744.m2191(c1973M3494.m3799())).m3832(new Object[0]);
                String imgPath2 = ((MsgInfoBean) obj2).getImgPath();
                C3558.f11162.getClass();
                String strM5146 = C3558.m5145(imgPath2);
                Method methodM3316 = AbstractC1574.m3315(C3556.f11160);
                C3555.f11159.getClass();
                Object objInvoke2 = methodM3316.invoke(C3555.m5144(), imgPath2);
                String[] strArr7 = AbstractC1574.f5469;
                MagicFactory.get(-391116901841588L, strArr7);
                String str6 = MagicFactory.get(-103083510069940L, strArr7);
                Intent intent6 = new Intent();
                intent6.setClassName(activity3, MagicFactory.get(-102666898242228L, strArr7));
                intent6.putExtra(MagicFactory.get(-102842991901364L, strArr7), 14);
                intent6.putExtra(MagicFactory.get(-102911711378100L, strArr7), strM5146);
                intent6.putExtra(MagicFactory.get(-102958956018356L, strArr7), (String) objInvoke2);
                intent6.putExtra(MagicFactory.get(-103027675495092L, strArr7), str6);
                activity3.startActivity(intent6);
                return c3497;
            case 15:
                MsgInfoBean msgInfoBean9 = (MsgInfoBean) obj2;
                String talker = msgInfoBean9.getTalker();
                String content6 = msgInfoBean9.getContent();
                C2523 c2523 = new C2523("\\[AtWx=([^]]+)]");
                List listM4655 = AbstractC2652.m4655(new C1009(C2523.m4530(c2523, content6), new C2158(i2), 2));
                String strM4531 = c2523.m4531(content6, new C2158(i3));
                C2173 c2173 = C2173.f7134;
                int i9 = EnumC3673.f11469.f11492;
                boolean z = !listM4655.isEmpty();
                c2173.getClass();
                C2180.m3960(C2180.f7141, C2173.m3958(talker, strM4531, i9, z, listM4655));
                return c3497;
            case 16:
                MsgInfoBean msgInfoBean10 = (MsgInfoBean) obj2;
                C1616 c1618 = C1616.f5487;
                Object origin3 = msgInfoBean10.getOrigin();
                c1618.getClass();
                C1133.m2718(msgInfoBean10.getTalker(), C1616.m3344(origin3), null);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                MsgInfoBean msgInfoBean11 = (MsgInfoBean) obj2;
                C1133.m2721(Integer.parseInt(msgInfoBean11.getContent()), msgInfoBean11.getTalker(), C3624.m5220(C3624.f11326, msgInfoBean11.getImgPath()));
                return c3497;
            case Opcodes.LDC /* 18 */:
                MsgInfoBean msgInfoBean12 = (MsgInfoBean) obj2;
                C3558 c3559 = C3558.f11162;
                String imgPath3 = msgInfoBean12.getImgPath();
                c3559.getClass();
                C1133.m2720(msgInfoBean12.getTalker(), C3558.m5145(imgPath3));
                return c3497;
            case 19:
                MsgInfoBean msgInfoBean13 = (MsgInfoBean) obj2;
                C1164 c1164 = C1164.f4291;
                String imgPath4 = msgInfoBean13.getImgPath();
                c1164.getClass();
                C1170.m2763(C1170.f4301, msgInfoBean13.getTalker(), C1164.m2761(imgPath4));
                return c3497;
            case 20:
                MsgInfoBean msgInfoBean14 = (MsgInfoBean) obj2;
                String talker2 = msgInfoBean14.getTalker();
                String title = msgInfoBean14.getQuoteMsg().getTitle();
                C2523 c2524 = new C2523("\\[AtWx=([^]]+)]");
                List listM4656 = AbstractC2652.m4655(new C1009(C2523.m4530(c2524, title), new C2158(i2), 2));
                String strM4532 = c2524.m4531(title, new C2158(i3));
                C2173 c2174 = C2173.f7134;
                int i10 = EnumC3673.f11469.f11492;
                boolean z2 = !listM4656.isEmpty();
                c2174.getClass();
                C2180.m3960(C2180.f7141, C2173.m3958(talker2, strM4532, i10, z2, listM4656));
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                InterfaceC0875 interfaceC0875 = (InterfaceC0875) obj2;
                if (!(interfaceC0875 instanceof InterfaceC2919)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0875 : Integer.valueOf(iIntValue + 1);
            case Opcodes.LLOAD /* 22 */:
                InterfaceC2919 interfaceC2919 = (InterfaceC2919) obj;
                InterfaceC0875 interfaceC0876 = (InterfaceC0875) obj2;
                if (interfaceC2919 != null) {
                    return interfaceC2919;
                }
                if (interfaceC0876 instanceof InterfaceC2919) {
                    return (InterfaceC2919) interfaceC0876;
                }
                return null;
            case Opcodes.FLOAD /* 23 */:
                return (C2922) obj;
            case Opcodes.DLOAD /* 24 */:
                int iIntValue2 = ((Integer) obj).intValue();
                List list4 = (List) obj2;
                String[] strArr8 = AbstractC1574.f5469;
                if (iIntValue2 == 2) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj4 : list4) {
                        int i11 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        JSONObject jSONObject = (JSONObject) obj4;
                        sb.append("第" + i11 + (char) 24352);
                        sb.append('\n');
                        sb.append(MagicFactory.get(-650039005280948L, strArr8) + jSONObject.getString(MagicFactory.get(-649978875738804L, strArr8)) + jSONObject.getString(MagicFactory.get(-649996055607988L, strArr8)));
                        sb.append('\n');
                        i4 = i11;
                    }
                    AbstractC2834.m4819(sb.toString());
                    AbstractC2834.m4823(null, 3, MagicFactory.get(-650060480117428L, strArr8));
                } else if (iIntValue2 == 4) {
                    JSONObject jSONObject2 = (JSONObject) list4.get(0);
                    int i12 = jSONObject2.getInt(MagicFactory.get(-650090544888500L, strArr8));
                    Locale locale = Locale.CHINA;
                    String str7 = String.format(locale, MagicFactory.get(-650150674430644L, strArr8), Arrays.copyOf(new Object[]{Integer.valueOf(i12 / 3600), Integer.valueOf((i12 % 3600) / 60), Integer.valueOf(i12 % 60)}, 3));
                    MagicFactory.get(-650215098940084L, strArr8);
                    String str8 = String.format(locale, MagicFactory.get(-650305293253300L, strArr8), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject2.getInt(MagicFactory.get(-650266638547636L, strArr8))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(-650339652991668L, strArr8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(MagicFactory.get(-650391192599220L, strArr8) + str7);
                    sb2.append('\n');
                    sb2.append(MagicFactory.get(-650412667435700L, strArr8) + str8);
                    sb2.append('\n');
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(MagicFactory.get(-650434142272180L, strArr8));
                    if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(MagicFactory.get(-650498566781620L, strArr8))) {
                        String string = jSONObject2.getString(MagicFactory.get(-650597351029428L, strArr8));
                        String string2 = jSONObject2.getString(MagicFactory.get(-650614530898612L, strArr8));
                        String string3 = jSONObject2.getString(MagicFactory.get(-650657480571572L, strArr8));
                        sb2.append(MagicFactory.get(-650700430244532L, strArr8) + string + string2);
                        sb2.append('\n');
                        sb2.append(MagicFactory.get(-650721905081012L, strArr8) + string3);
                        sb2.append('\n');
                    } else {
                        sb2.append(MagicFactory.get(-650537221487284L, strArr8) + jSONObjectOptJSONObject.getString(MagicFactory.get(-650558696323764L, strArr8)));
                        sb2.append('\n');
                    }
                    AbstractC2834.m4819(sb2.toString());
                    AbstractC2834.m4823(null, 3, MagicFactory.get(-650743379917492L, strArr8));
                }
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                int iIntValue3 = ((Integer) obj).intValue();
                List list5 = (List) obj2;
                String[] strArr9 = AbstractC1574.f5469;
                InterfaceC0842 interfaceC0842 = null;
                if (iIntValue3 == 2) {
                    for (Object obj5 : list5) {
                        int i13 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj5;
                        String string4 = jSONObject3.getString(MagicFactory.get(-650773444688564L, strArr9));
                        String string5 = jSONObject3.getString(MagicFactory.get(-650803509459636L, strArr9));
                        String string6 = jSONObject3.getString(MagicFactory.get(-650820689328820L, strArr9));
                        C1002 c1002 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3608("第" + i13 + (char) 24352, string4, string5, string6, null, 0));
                        i4 = i13;
                    }
                } else if (iIntValue3 == 4) {
                    JSONObject jSONObject4 = (JSONObject) list5.get(0);
                    String string7 = jSONObject4.getString(MagicFactory.get(-650863639001780L, strArr9));
                    String str9 = String.format(Locale.CHINA, MagicFactory.get(-650932358478516L, strArr9), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject4.getInt(MagicFactory.get(-650893703772852L, strArr9))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(-650962423249588L, strArr9);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject(MagicFactory.get(-651013962857140L, strArr9));
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has(MagicFactory.get(-651078387366580L, strArr9))) {
                        String string8 = jSONObject4.getString(MagicFactory.get(-651117042072244L, strArr9));
                        String string9 = jSONObject4.getString(MagicFactory.get(-651134221941428L, strArr9));
                        String string10 = jSONObject4.getString(MagicFactory.get(-651177171614388L, strArr9));
                        C1002 c1003 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3610(str9, string7, string10, string8, string9, null, 0));
                    } else {
                        C1002 c1004 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3609(str9, string7, jSONObjectOptJSONObject2, interfaceC0842, 0));
                    }
                }
                return c3497;
            case 26:
                int iIntValue4 = ((Integer) obj).intValue();
                List list6 = (List) obj2;
                String[] strArr10 = AbstractC1574.f5469;
                if (iIntValue4 == 2) {
                    StringBuilder sb3 = new StringBuilder();
                    for (Object obj6 : list6) {
                        int i14 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        JSONObject jSONObject5 = (JSONObject) obj6;
                        sb3.append("第" + i14 + (char) 24352);
                        sb3.append('\n');
                        sb3.append(MagicFactory.get(-654630325320372L, strArr10) + jSONObject5.getString(MagicFactory.get(-654570195778228L, strArr10)) + jSONObject5.getString(MagicFactory.get(-654587375647412L, strArr10)));
                        sb3.append('\n');
                        i4 = i14;
                    }
                    AbstractC2834.m4819(sb3.toString());
                    AbstractC2834.m4823(null, 3, MagicFactory.get(-654651800156852L, strArr10));
                } else if (iIntValue4 == 4) {
                    JSONObject jSONObject6 = (JSONObject) list6.get(0);
                    int i15 = jSONObject6.getInt(MagicFactory.get(-654681864927924L, strArr10));
                    Locale locale2 = Locale.CHINA;
                    String str10 = String.format(locale2, MagicFactory.get(-654741994470068L, strArr10), Arrays.copyOf(new Object[]{Integer.valueOf(i15 / 3600), Integer.valueOf((i15 % 3600) / 60), Integer.valueOf(i15 % 60)}, 3));
                    MagicFactory.get(-654806418979508L, strArr10);
                    String str11 = String.format(locale2, MagicFactory.get(-654896613292724L, strArr10), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject6.getInt(MagicFactory.get(-654857958587060L, strArr10))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(-654930973031092L, strArr10);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(MagicFactory.get(-654982512638644L, strArr10) + str10);
                    sb4.append('\n');
                    sb4.append(MagicFactory.get(-655003987475124L, strArr10) + str11);
                    sb4.append('\n');
                    JSONObject jSONObjectOptJSONObject3 = jSONObject6.optJSONObject(MagicFactory.get(-655025462311604L, strArr10));
                    if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.has(MagicFactory.get(-655089886821044L, strArr10))) {
                        String string11 = jSONObject6.getString(MagicFactory.get(-655188671068852L, strArr10));
                        String string12 = jSONObject6.getString(MagicFactory.get(-655205850938036L, strArr10));
                        String string13 = jSONObject6.getString(MagicFactory.get(-655248800610996L, strArr10));
                        sb4.append(MagicFactory.get(-655291750283956L, strArr10) + string11 + string12);
                        sb4.append('\n');
                        sb4.append(MagicFactory.get(-655313225120436L, strArr10) + string13);
                        sb4.append('\n');
                    } else {
                        sb4.append(MagicFactory.get(-655128541526708L, strArr10) + jSONObjectOptJSONObject3.getString(MagicFactory.get(-655150016363188L, strArr10)));
                        sb4.append('\n');
                    }
                    AbstractC2834.m4819(sb4.toString());
                    AbstractC2834.m4823(null, 3, MagicFactory.get(-655334699956916L, strArr10));
                }
                return c3497;
            case 27:
                int iIntValue5 = ((Integer) obj).intValue();
                List list7 = (List) obj2;
                String[] strArr11 = AbstractC1574.f5469;
                InterfaceC0842 interfaceC0843 = null;
                if (iIntValue5 == 2) {
                    for (Object obj7 : list7) {
                        int i16 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0745.m2213();
                            throw null;
                        }
                        JSONObject jSONObject7 = (JSONObject) obj7;
                        String string14 = jSONObject7.getString(MagicFactory.get(-655364764727988L, strArr11));
                        String string15 = jSONObject7.getString(MagicFactory.get(-655394829499060L, strArr11));
                        String string16 = jSONObject7.getString(MagicFactory.get(-655412009368244L, strArr11));
                        C1002 c1005 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3608("第" + i16 + (char) 24352, string14, string15, string16, null, 1));
                        i4 = i16;
                    }
                } else if (iIntValue5 == 4) {
                    JSONObject jSONObject8 = (JSONObject) list7.get(0);
                    String string17 = jSONObject8.getString(MagicFactory.get(-655454959041204L, strArr11));
                    String str12 = String.format(Locale.CHINA, MagicFactory.get(-655523678517940L, strArr11), Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject8.getInt(MagicFactory.get(-655485023812276L, strArr11))) / 1024.0d) / 1024.0d)}, 1));
                    MagicFactory.get(-655553743289012L, strArr11);
                    JSONObject jSONObjectOptJSONObject4 = jSONObject8.optJSONObject(MagicFactory.get(-655605282896564L, strArr11));
                    if (jSONObjectOptJSONObject4 == null || !jSONObjectOptJSONObject4.has(MagicFactory.get(-655669707406004L, strArr11))) {
                        String string18 = jSONObject8.getString(MagicFactory.get(-655708362111668L, strArr11));
                        String string19 = jSONObject8.getString(MagicFactory.get(-655725541980852L, strArr11));
                        String string20 = jSONObject8.getString(MagicFactory.get(-655768491653812L, strArr11));
                        C1002 c1006 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3610(str12, string17, string20, string18, string19, null, 1));
                    } else {
                        C1002 c1007 = AbstractC1075.f3893;
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C3609(str12, string17, jSONObjectOptJSONObject4, interfaceC0843, 1));
                    }
                }
                return c3497;
            case 28:
                MsgInfoBean msgInfoBean15 = (MsgInfoBean) obj2;
                AbstractC1458.m3166(C3616.f11309, new C3614(C3624.m5220(C3624.f11326, msgInfoBean15.getImgPath()), Integer.parseInt(msgInfoBean15.getContent()), i4));
                return c3497;
            default:
                MsgInfoBean msgInfoBean16 = (MsgInfoBean) obj2;
                String[] strArr12 = AbstractC1574.f5469;
                long msgId2 = msgInfoBean16.getMsgId();
                String imgPath5 = msgInfoBean16.getImgPath();
                String strM5221 = C3624.m5220(C3624.f11326, imgPath5);
                try {
                    File file = new File(C3625.f11327.m2542());
                    file.mkdirs();
                    String str13 = msgId2 + '-' + imgPath5 + '-' + System.currentTimeMillis() + MagicFactory.get(-567150431435444L, strArr12);
                    AbstractC1328.m3042(AbstractC1459.m3196(new File(strM5221)), new File(file, str13));
                    AbstractC2834.m4823(null, 3, MagicFactory.get(-567171906271924L, strArr12) + file.getAbsolutePath() + '/' + str13);
                    c2585 = c3497;
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(MagicFactory.get(-567201971042996L, strArr12));
                    String message = thM4594.getMessage();
                    sb5.append(message != null ? AbstractC2841.m4847(50, message) : MagicFactory.get(-567232035814068L, strArr12));
                    AbstractC2834.m4823(null, 3, sb5.toString());
                }
                return c3497;
        }
    }
}
