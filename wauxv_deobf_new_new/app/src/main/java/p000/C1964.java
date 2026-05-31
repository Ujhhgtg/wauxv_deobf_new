package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.io.IOException;
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
import me.yun.silk.SilkCodec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1964 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6489;

    public /* synthetic */ C1964(int i) {
        this.f6489 = i;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws JSONException, IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        String genericString;
        String strM3508;
        String content;
        Object c2641;
        int i = this.f6489;
        int i2 = 25;
        int i3 = 0;
        C3554 c3554 = C3554.UNIT;
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
                return Boolean.valueOf(AbstractC1469.m3322(genericString, str));
            case 2:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 3:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 4:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
            case 6:
                Boolean bool = (Boolean) ((InterfaceC1433) obj).invoke(((Field) obj2).getType());
                bool.booleanValue();
                return bool;
            case 7:
                Context context = (Context) obj;
                String[] strArr = AbstractC1471.f5234;
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
                    String strM2295 = AbstractC0739.m2295(arrayList, "\n", null, null, null, 62);
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    intent.putExtra("Ksnsupload_type", 9);
                    intent.putExtra("Kdescription", strM2295);
                    context.startActivity(intent);
                }
                return c3554;
            case 8:
                Context context2 = (Context) obj;
                List<MsgInfoBean> list = (List) obj2;
                String[] strArr2 = AbstractC1471.f5234;
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
                        C1628 c1628 = C1628.f5520;
                        Object origin = msgInfoBean3.getOrigin();
                        c1628.getClass();
                        strM3508 = C1628.m3508(origin);
                    } else {
                        strM3508 = null;
                    }
                    if (strM3508 != null) {
                        arrayList3.add(strM3508);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    String strM2296 = AbstractC0739.m2295(arrayList2, "\n", null, null, null, 62);
                    ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
                    Intent intent2 = new Intent();
                    intent2.setClassName(context2, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList4);
                    intent2.putExtra("Kdescription", strM2296);
                    context2.startActivity(intent2);
                }
                return c3554;
            case 9:
                Context context3 = (Context) obj;
                List<MsgInfoBean> list2 = (List) obj2;
                String[] strArr3 = AbstractC1471.f5234;
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
                    String strM2297 = AbstractC0739.m2295(arrayList5, "\n", null, null, null, 62);
                    C3617 c3617 = C3617.f11311;
                    String str2 = (String) AbstractC0739.m2296(arrayList6);
                    c3617.getClass();
                    String strM5151 = C3617.m5151(str2);
                    String str3 = (String) AbstractC0739.m2296(arrayList6);
                    Method methodM2610 = AbstractC0972.m2610(C3615.f11309);
                    C3614.f11308.getClass();
                    Object objInvoke = methodM2610.invoke(C3614.m5150(), str3);
                    "null cannot be cast to non-null type kotlin.String";
                    Intent intent3 = new Intent();
                    intent3.setClassName(context3, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    intent3.putExtra("Ksnsupload_type", 14);
                    intent3.putExtra("KSightPath", strM5151);
                    intent3.putExtra("KSightThumbPath", (String) objInvoke);
                    intent3.putExtra("Kdescription", strM2297);
                    context3.startActivity(intent3);
                }
                return c3554;
            case 10:
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    MsgInfoBean msgInfoBean6 = (MsgInfoBean) obj3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i4 = msgInfoBean6.isFile() ? 10800000 : 120000;
                    if (msgInfoBean6.isSend() && jCurrentTimeMillis - msgInfoBean6.getCreateTime() <= i4) {
                        arrayList7.add(obj3);
                    }
                }
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    long msgId = ((MsgInfoBean) it.next()).getMsgId();
                    C2220 c2220 = C2220.f7270;
                    String[] strArr4 = AbstractC1471.f5234;
                    String str4 = "你撤回了一条消息";
                    c2220.getClass();
                    C2112.f7005.getClass();
                    C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2219.f7269).newInstance(C2112.m4066(msgId), str4, ""));
                }
                return c3554;
            case 11:
                List<MsgInfoBean> list3 = (List) obj2;
                ArrayList arrayList8 = new ArrayList();
                for (MsgInfoBean msgInfoBean7 : list3) {
                    if (!msgInfoBean7.isVoice()) {
                        msgInfoBean7 = null;
                    }
                    String strM5226 = msgInfoBean7 != null ? C3684.m5226(C3684.f11475, msgInfoBean7.getImgPath()) : null;
                    if (strM5226 != null) {
                        arrayList8.add(strM5226);
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
                    C1787.m3673(C2067.f6924, new C2066(arrayList8, arrayList9, i3));
                }
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                int i5 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(Activity.class);
                Activity activity = (Activity) ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0]);
                String content5 = ((MsgInfoBean) obj2).getContent();
                Intent intent4 = new Intent();
                String[] strArr5 = AbstractC1471.f5234;
                intent4.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent4.putExtra("Ksnsupload_type", 9);
                intent4.putExtra("Kdescription", content5);
                activity.startActivity(intent4);
                return c3554;
            case 13:
                int i6 = AbstractC1768.f5906;
                C2004 c2004M3561 = AbstractC2727.m4713(obj).m3560();
                c2004M3561.f6648 = AbstractC2574.m4549(Activity.class);
                Activity activity2 = (Activity) ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4026(new Object[0]);
                C1628 c1629 = C1628.f5520;
                Object origin2 = ((MsgInfoBean) obj2).getOrigin();
                c1629.getClass();
                ArrayList<String> arrayList10 = new ArrayList<>(new C0263(new String[]{C1628.m3508(origin2)}, true));
                String[] strArr6 = AbstractC1471.f5234;
                String str5 = "";
                Intent intent5 = new Intent();
                intent5.setClassName(activity2, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent5.putStringArrayListExtra("sns_kemdia_path_list", arrayList10);
                intent5.putExtra("Kdescription", str5);
                activity2.startActivity(intent5);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                int i7 = AbstractC1768.f5906;
                C2004 c2004M3562 = AbstractC2727.m4713(obj).m3560();
                c2004M3562.f6648 = AbstractC2574.m4549(Activity.class);
                Activity activity3 = (Activity) ((C2013) AbstractC0739.m2290(c2004M3562.m3993())).m4026(new Object[0]);
                String imgPath2 = ((MsgInfoBean) obj2).getImgPath();
                C3617.f11311.getClass();
                String strM5152 = C3617.m5151(imgPath2);
                Method methodM2611 = AbstractC0972.m2610(C3615.f11309);
                C3614.f11308.getClass();
                Object objInvoke2 = methodM2611.invoke(C3614.m5150(), imgPath2);
                String[] strArr7 = AbstractC1471.f5234;
                "null cannot be cast to non-null type kotlin.String";
                String str6 = "";
                Intent intent6 = new Intent();
                intent6.setClassName(activity3, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent6.putExtra("Ksnsupload_type", 14);
                intent6.putExtra("KSightPath", strM5152);
                intent6.putExtra("KSightThumbPath", (String) objInvoke2);
                intent6.putExtra("Kdescription", str6);
                activity3.startActivity(intent6);
                return c3554;
            case 15:
                MsgInfoBean msgInfoBean9 = (MsgInfoBean) obj2;
                String talker = msgInfoBean9.getTalker();
                String content6 = msgInfoBean9.getContent();
                C2579 c2579 = new C2579("\\[AtWx=([^]]+)]");
                List listM4689 = AbstractC2713.m4689(new C1012(C2579.m4552(c2579, content6), new C2117(i2), 2));
                String strM4553 = c2579.m4553(content6, new C2117(26));
                C2208 c2208 = C2208.f7258;
                int i8 = EnumC3733.f11618.f11641;
                boolean z = !listM4689.isEmpty();
                c2208.getClass();
                C2213.m4153(C2213.f7263, C2208.m4151(talker, strM4553, i8, z, listM4689));
                return c3554;
            case 16:
                MsgInfoBean msgInfoBean10 = (MsgInfoBean) obj2;
                C1628 c16210 = C1628.f5520;
                Object origin3 = msgInfoBean10.getOrigin();
                c16210.getClass();
                C2199.m4145(msgInfoBean10.getTalker(), C1628.m3508(origin3), null);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                MsgInfoBean msgInfoBean11 = (MsgInfoBean) obj2;
                C2199.m4148(Integer.parseInt(msgInfoBean11.getContent()), msgInfoBean11.getTalker(), C3684.m5226(C3684.f11475, msgInfoBean11.getImgPath()));
                return c3554;
            case Opcodes.LDC /* 18 */:
                MsgInfoBean msgInfoBean12 = (MsgInfoBean) obj2;
                C3617 c3618 = C3617.f11311;
                String imgPath3 = msgInfoBean12.getImgPath();
                c3618.getClass();
                C2199.m4147(msgInfoBean12.getTalker(), C3617.m5151(imgPath3));
                return c3554;
            case 19:
                MsgInfoBean msgInfoBean13 = (MsgInfoBean) obj2;
                C1166 c1166 = C1166.f4288;
                String imgPath4 = msgInfoBean13.getImgPath();
                c1166.getClass();
                C1172.m2907(C1172.f4298, msgInfoBean13.getTalker(), C1166.m2905(imgPath4));
                return c3554;
            case 20:
                MsgInfoBean msgInfoBean14 = (MsgInfoBean) obj2;
                String talker2 = msgInfoBean14.getTalker();
                String title = msgInfoBean14.getQuoteMsg().getTitle();
                C2579 c25710 = new C2579("\\[AtWx=([^]]+)]");
                List listM46810 = AbstractC2713.m4689(new C1012(C2579.m4552(c25710, title), new C2117(i2), 2));
                String strM4554 = c25710.m4553(title, new C2117(26));
                C2208 c2209 = C2208.f7258;
                int i9 = EnumC3733.f11618.f11641;
                boolean z2 = !listM46810.isEmpty();
                c2209.getClass();
                C2213.m4153(C2213.f7263, C2208.m4151(talker2, strM4554, i9, z2, listM46810));
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                InterfaceC0874 interfaceC0874 = (InterfaceC0874) obj2;
                if (!(interfaceC0874 instanceof InterfaceC2978)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0874 : Integer.valueOf(iIntValue + 1);
            case Opcodes.LLOAD /* 22 */:
                InterfaceC2978 interfaceC2978 = (InterfaceC2978) obj;
                InterfaceC0874 interfaceC0875 = (InterfaceC0874) obj2;
                if (interfaceC2978 != null) {
                    return interfaceC2978;
                }
                if (interfaceC0875 instanceof InterfaceC2978) {
                    return (InterfaceC2978) interfaceC0875;
                }
                return null;
            case Opcodes.FLOAD /* 23 */:
                return (C2981) obj;
            case Opcodes.DLOAD /* 24 */:
                int iIntValue2 = ((Integer) obj).intValue();
                List list4 = (List) obj2;
                String[] strArr8 = AbstractC1471.f5234;
                if (iIntValue2 == 2) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj4 : list4) {
                        int i10 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        JSONObject jSONObject = (JSONObject) obj4;
                        sb.append("第" + i10 + (char) 24352);
                        sb.append('\n');
                        sb.append("链接: " + jSONObject.getString("url") + jSONObject.getString("url_token"));
                        sb.append('\n');
                        i3 = i10;
                    }
                    AbstractC2894.m4852(sb.toString());
                    AbstractC2894.m4856(null, 3, "复制图片成功");
                } else if (iIntValue2 == 4) {
                    JSONObject jSONObject2 = (JSONObject) list4.get(0);
                    int i11 = jSONObject2.getInt("videoDuration");
                    Locale locale = Locale.CHINA;
                    String str7 = String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60), Integer.valueOf(i11 % 60)}, 3));
                    "format(...)";
                    String str8 = String.format(locale, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject2.getInt("fileSize")) / 1024.0d) / 1024.0d)}, 1));
                    "format(...)";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("时长: " + str7);
                    sb2.append('\n');
                    sb2.append("大小: " + str8);
                    sb2.append('\n');
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("media_cdn_info");
                    if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("pcdn_url")) {
                        String string = jSONObject2.getString("url");
                        String string2 = jSONObject2.getString("url_token");
                        String string3 = jSONObject2.getString("decodeKey");
                        sb2.append("密链: " + string + string2);
                        sb2.append('\n');
                        sb2.append("密钥: " + string3);
                        sb2.append('\n');
                    } else {
                        sb2.append("直链: " + jSONObjectOptJSONObject.getString("pcdn_url"));
                        sb2.append('\n');
                    }
                    AbstractC2894.m4852(sb2.toString());
                    AbstractC2894.m4856(null, 3, "复制视频成功");
                }
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                int iIntValue3 = ((Integer) obj).intValue();
                List list5 = (List) obj2;
                String[] strArr9 = AbstractC1471.f5234;
                InterfaceC0841 interfaceC0841 = null;
                if (iIntValue3 == 2) {
                    for (Object obj5 : list5) {
                        int i12 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj5;
                        String string4 = jSONObject3.getString("md5sum");
                        String string5 = jSONObject3.getString("url");
                        String string6 = jSONObject3.getString("url_token");
                        C1006 c1006 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3668("第" + i12 + (char) 24352, string4, string5, string6, null, 0));
                        i3 = i12;
                    }
                } else if (iIntValue3 == 4) {
                    JSONObject jSONObject4 = (JSONObject) list5.get(0);
                    String string7 = jSONObject4.getString("md5sum");
                    String str9 = String.format(Locale.CHINA, "%.2fMB", Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject4.getInt("fileSize")) / 1024.0d) / 1024.0d)}, 1));
                    "format(...)";
                    JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("media_cdn_info");
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has("pcdn_url")) {
                        String string8 = jSONObject4.getString("url");
                        String string9 = jSONObject4.getString("url_token");
                        String string10 = jSONObject4.getString("decodeKey");
                        C1006 c1007 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3670(str9, string7, string10, string8, string9, null, 0));
                    } else {
                        C1006 c1008 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3669(str9, string7, jSONObjectOptJSONObject2, interfaceC0841, 0));
                    }
                }
                return c3554;
            case 26:
                int iIntValue4 = ((Integer) obj).intValue();
                List list6 = (List) obj2;
                String[] strArr10 = AbstractC1471.f5234;
                if (iIntValue4 == 2) {
                    StringBuilder sb3 = new StringBuilder();
                    for (Object obj6 : list6) {
                        int i13 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        JSONObject jSONObject5 = (JSONObject) obj6;
                        sb3.append("第" + i13 + (char) 24352);
                        sb3.append('\n');
                        sb3.append("链接: " + jSONObject5.getString("url") + jSONObject5.getString("url_token"));
                        sb3.append('\n');
                        i3 = i13;
                    }
                    AbstractC2894.m4852(sb3.toString());
                    AbstractC2894.m4856(null, 3, "复制图片成功");
                } else if (iIntValue4 == 4) {
                    JSONObject jSONObject6 = (JSONObject) list6.get(0);
                    int i14 = jSONObject6.getInt("videoDuration");
                    Locale locale2 = Locale.CHINA;
                    String str10 = String.format(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14 / 3600), Integer.valueOf((i14 % 3600) / 60), Integer.valueOf(i14 % 60)}, 3));
                    "format(...)";
                    String str11 = String.format(locale2, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject6.getInt("fileSize")) / 1024.0d) / 1024.0d)}, 1));
                    "format(...)";
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("时长: " + str10);
                    sb4.append('\n');
                    sb4.append("大小: " + str11);
                    sb4.append('\n');
                    JSONObject jSONObjectOptJSONObject3 = jSONObject6.optJSONObject("media_cdn_info");
                    if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.has("pcdn_url")) {
                        String string11 = jSONObject6.getString("url");
                        String string12 = jSONObject6.getString("url_token");
                        String string13 = jSONObject6.getString("decodeKey");
                        sb4.append("密链: " + string11 + string12);
                        sb4.append('\n');
                        sb4.append("密钥: " + string13);
                        sb4.append('\n');
                    } else {
                        sb4.append("直链: " + jSONObjectOptJSONObject3.getString("pcdn_url"));
                        sb4.append('\n');
                    }
                    AbstractC2894.m4852(sb4.toString());
                    AbstractC2894.m4856(null, 3, "复制视频成功");
                }
                return c3554;
            case 27:
                int iIntValue5 = ((Integer) obj).intValue();
                List list7 = (List) obj2;
                String[] strArr11 = AbstractC1471.f5234;
                InterfaceC0841 interfaceC0842 = null;
                if (iIntValue5 == 2) {
                    for (Object obj7 : list7) {
                        int i15 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0740.m2312();
                            throw null;
                        }
                        JSONObject jSONObject7 = (JSONObject) obj7;
                        String string14 = jSONObject7.getString("md5sum");
                        String string15 = jSONObject7.getString("url");
                        String string16 = jSONObject7.getString("url_token");
                        C1006 c1009 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3668("第" + i15 + (char) 24352, string14, string15, string16, null, 1));
                        i3 = i15;
                    }
                } else if (iIntValue5 == 4) {
                    JSONObject jSONObject8 = (JSONObject) list7.get(0);
                    String string17 = jSONObject8.getString("md5sum");
                    String str12 = String.format(Locale.CHINA, "%.2fMB", Arrays.copyOf(new Object[]{Double.valueOf((((double) jSONObject8.getInt("fileSize")) / 1024.0d) / 1024.0d)}, 1));
                    "format(...)";
                    JSONObject jSONObjectOptJSONObject4 = jSONObject8.optJSONObject("media_cdn_info");
                    if (jSONObjectOptJSONObject4 == null || !jSONObjectOptJSONObject4.has("pcdn_url")) {
                        String string18 = jSONObject8.getString("url");
                        String string19 = jSONObject8.getString("url_token");
                        String string20 = jSONObject8.getString("decodeKey");
                        C1006 c10010 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3670(str12, string17, string20, string18, string19, null, 1));
                    } else {
                        C1006 c10011 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C3669(str12, string17, jSONObjectOptJSONObject4, interfaceC0842, 1));
                    }
                }
                return c3554;
            case 28:
                MsgInfoBean msgInfoBean15 = (MsgInfoBean) obj2;
                C1787.m3673(C3676.f11458, new C3674(C3684.m5226(C3684.f11475, msgInfoBean15.getImgPath()), Integer.parseInt(msgInfoBean15.getContent()), i3));
                return c3554;
            default:
                MsgInfoBean msgInfoBean16 = (MsgInfoBean) obj2;
                String[] strArr12 = AbstractC1471.f5234;
                long msgId2 = msgInfoBean16.getMsgId();
                String imgPath5 = msgInfoBean16.getImgPath();
                String strM5227 = C3684.m5226(C3684.f11475, imgPath5);
                try {
                    File file = new File(C3685.f11476.m2666());
                    file.mkdirs();
                    String str13 = msgId2 + '-' + imgPath5 + '-' + System.currentTimeMillis() + ".mp3";
                    File file2 = new File(file, str13);
                    SilkCodec silkCodec = AbstractC0309.f1589;
                    AbstractC0309.f1589.silkToMp3(strM5227, file2.getAbsolutePath(), 24000);
                    AbstractC2894.m4856(null, 3, "已保存到: " + file.getAbsolutePath() + '/' + str13);
                    c2641 = c3554;
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("保存失败: ");
                    String message = thM4616.getMessage();
                    sb5.append(message != null ? AbstractC2901.m4881(50, message) : "未知错误");
                    AbstractC2894.m4856(null, 3, sb5.toString());
                }
                return c3554;
        }
    }
}
