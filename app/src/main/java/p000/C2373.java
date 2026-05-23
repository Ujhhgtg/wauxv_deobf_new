package p000;

import android.database.Cursor;
import android.icu.util.Calendar;
import android.text.TextUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.data.bean.info.FriendInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲈᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2373 implements InterfaceC0500, InterfaceC2910 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2373 f7624 = new C2373(24);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2373 f7625 = new C2373(25);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2373 f7626 = new C2373(26);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2373 f7627 = new C2373(27);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2373 f7628 = new C2373(28);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7629;

    public /* synthetic */ C2373(int i) {
        this.f7629 = i;
    }

    @Override // p000.InterfaceC0500
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public Object mo1745(Object[] objArr) throws IllegalAccessException, JSONException, InvocationTargetException {
        int i2 = 4;
        List list = null;
        Unit unit = Unit.INSTANCE;
        switch (this.f7629) {
            case 0:
                Object obj = objArr[0];
                String[] strArr = AbstractC1574.f5469;
                String str = (String) obj;
                Object obj2 = objArr[1];
                String str2 = (String) obj2;
                Object obj3 = objArr[2];
                String str3 = (String) obj3;
                Object obj4 = objArr[3];
                String str4 = (String) obj4;
                Object obj5 = objArr[4];
                String str5 = (String) obj5;
                Object obj6 = objArr[5];
                C1133.m2719(str, str2, str3, str4, str5, (String) obj6);
                return unit;
            case 1:
                Object obj7 = objArr[0];
                String[] strArr2 = AbstractC1574.f5469;
                String str6 = (String) obj7;
                Object obj8 = objArr[1];
                JSONObject jSONObject = (JSONObject) obj8;
                C1133.m2719(str6, jSONObject.optString("poiName"), jSONObject.optString("label"), jSONObject.optString("x"), jSONObject.optString("y"), jSONObject.optString("scale"));
                return unit;
            case 2:
                Object obj9 = objArr[0];
                String[] strArr3 = AbstractC1574.f5469;
                Object obj10 = objArr[1];
                String str7 = (String) obj10;
                Object obj11 = objArr[2];
                JSONObject jSONObject2 = new JSONObject();
                String str8 = "msg";
                JSONObject jSONObject3 = new JSONObject();
                String str9 = "appmsg";
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("type", 1);
                jSONObject4.put("title", str7);
                jSONObject4.put("des", str7);
                jSONObject4.put("content", "|WA|" + TextUtils.htmlEncode((String) obj11));
                jSONObject3.put("appmsg", jSONObject4);
                jSONObject2.put("msg", jSONObject3);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                JsonToXmlConverter c1732 = new JsonToXmlConverter();
                c1732.f5829 = jSONObject2;
                c1732.f5830 = hashSet;
                c1732.f5831 = hashSet2;
                C1133.m2722((String) obj9, c1732.toString());
                return unit;
            case 3:
                Object obj12 = objArr[0];
                String[] strArr4 = AbstractC1574.f5469;
                Object obj13 = objArr[1];
                Object obj14 = objArr[2];
                Object obj15 = objArr[3];
                JSONObject jSONObject5 = new JSONObject();
                String str10 = "msg";
                JSONObject jSONObject6 = new JSONObject();
                String str11 = "appmsg";
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("type", 33);
                jSONObject7.put("title", (String) obj13);
                String str12 = "weappinfo";
                JSONObject jSONObject8 = new JSONObject();
                String str13 = "item";
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("pagepath", "<![CDATA[" + ((String) obj14) + "]]>");
                jSONObject9.put("username", (String) obj15);
                jSONObject8.put("item", jSONObject9);
                jSONObject7.put("weappinfo", jSONObject8);
                jSONObject6.put("appmsg", jSONObject7);
                jSONObject5.put("msg", jSONObject6);
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                JsonToXmlConverter c1733 = new JsonToXmlConverter();
                c1733.f5829 = jSONObject5;
                c1733.f5830 = hashSet3;
                c1733.f5831 = hashSet4;
                C1133.m2722((String) obj12, c1733.toString());
                return unit;
            case 4:
                Object obj16 = objArr[0];
                String[] strArr5 = AbstractC1574.f5469;
                Object obj17 = objArr[1];
                JSONObject jSONObject10 = new JSONObject();
                String str14 = "msg";
                JSONObject jSONObject11 = new JSONObject();
                String str15 = "appmsg";
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("type", 53);
                jSONObject12.put("title", (String) obj17);
                String str16 = "extinfo";
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("solitaire_info", "");
                jSONObject12.put("extinfo", jSONObject13);
                jSONObject11.put("appmsg", jSONObject12);
                jSONObject10.put("msg", jSONObject11);
                HashSet hashSet5 = new HashSet();
                HashSet hashSet6 = new HashSet();
                hashSet5.add("/msg/appmsg/appid");
                JsonToXmlConverter c1734 = new JsonToXmlConverter();
                c1734.f5829 = jSONObject10;
                c1734.f5830 = hashSet5;
                c1734.f5831 = hashSet6;
                C1133.m2722((String) obj16, c1734.toString());
                return unit;
            case 5:
                Object obj18 = objArr[0];
                String[] strArr6 = AbstractC1574.f5469;
                String str17 = (String) obj18;
                Object obj19 = objArr[1];
                long jLongValue = ((Long) obj19).longValue();
                Object obj20 = objArr[2];
                
                MsgInfoBean msgInfoBean = new MsgInfoBean(C2079.m3883(jLongValue));
                JSONObject jSONObject14 = new JSONObject();
                String str18 = "msg";
                JSONObject jSONObject15 = new JSONObject();
                String str19 = "appmsg";
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put("type", 57);
                jSONObject16.put("title", (String) obj20);
                String str20 = "refermsg";
                JSONObject jSONObject17 = new JSONObject();
                String str21 = "type";
                C0247 c0247 = C0247.f1410;
                int type = msgInfoBean.getType();
                
                int i3 = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToMethod(C0246.f1409).getDeclaringClass()).m3492();
                c1973M3492.m3800(EnumC1999.STATIC);
                Class cls = Integer.TYPE;
                c1973M3492.returnType = AbstractC2519.classToKClass(cls);
                jSONObject17.put("type", ((Number) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(cls)}, 1, c1973M3492)).invoke(Integer.valueOf(type))).intValue());
                jSONObject17.put("svrid", msgInfoBean.getMsgSvrId());
                jSONObject17.put("fromusr", msgInfoBean.getTalker());
                jSONObject17.put("chatusr", msgInfoBean.getSendTalker());
                String str22 = "displayname";
                Cursor cursorM2715 = C1133.m2715("select * from rcontact where username = '" + msgInfoBean.getSendTalker() + '\'');
                if (cursorM2715 != null) {
                    cursorM2715.moveToFirst();
                } else {
                    cursorM2715 = null;
                }
                FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                jSONObject17.put("displayname", friendInfoM2176 != null ? friendInfoM2176.getNickname() : null);
                jSONObject17.put("msgsource", "");
                jSONObject17.put("content", msgInfoBean.getContent());
                jSONObject17.put("strid", "");
                jSONObject17.put("createtime", msgInfoBean.getCreateTime());
                jSONObject16.put("refermsg", jSONObject17);
                jSONObject15.put("appmsg", jSONObject16);
                jSONObject14.put("msg", jSONObject15);
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                JsonToXmlConverter c1735 = new JsonToXmlConverter();
                c1735.f5829 = jSONObject14;
                c1735.f5830 = hashSet7;
                c1735.f5831 = hashSet8;
                C1133.m2722(str17, c1735.toString());
                return unit;
            case 6:
                Object obj21 = objArr[0];
                String[] strArr7 = AbstractC1574.f5469;
                long jLongValue2 = ((Long) obj21).longValue();
                C2186 c2186 = C2186.f7147;
                String str23 = "你撤回了一条消息";
                
                
                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2185.f7146).newInstance(C2079.m3883(jLongValue2), "你撤回了一条消息", ""));
                return unit;
            case 7:
                Object obj22 = objArr[0];
                String[] strArr8 = AbstractC1574.f5469;
                Object obj23 = objArr[1];
                Object obj24 = objArr[2];
                return Long.valueOf(AbstractC2201.m3976(EnumC3673.f11478.f11492, (String) obj22, (String) obj23, ((Long) obj24).longValue()));
            case 8:
                return AbstractC2203.m4033();
            case 9:
                Object obj25 = objArr[0];
                String[] strArr9 = AbstractC1574.f5469;
                long jLongValue3 = ((Long) obj25).longValue();
                
                Constructor constructorM3314 = AbstractC1574.dexToCtor(C2191.f7152);
                String str24 = "";
                String str25 = "gh_43f2581f6fd6";
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long j = 1000;
                Integer numValueOf = Integer.valueOf((int) (calendar.getTimeInMillis() / 1000L));
                Integer numValueOf2 = Integer.valueOf((int) (System.currentTimeMillis() / 1000L));
                Integer numValueOf3 = Integer.valueOf((int) jLongValue3);
                
                C2180.addNetSceneToQueue(constructorM3314.newInstance("", "gh_43f2581f6fd6", numValueOf, numValueOf2, numValueOf3, AbstractC1574.dexToMethod(C2660.f8574).invoke(null, null), 1));
                return unit;
            case 10:
                Object obj26 = objArr[0];
                Object objM5098 = C3512.m5098(C3512.f11014, EnumC3676.f11520.f11526);
                C3512.m5099(objM5098, (String) obj26);
                C3512.m5097(objM5098);
                return unit;
            case 11:
                Object obj27 = objArr[0];
                String[] strArr10 = AbstractC1574.f5469;
                Object obj28 = objArr[1];
                String str26 = (String) obj28;
                Object obj29 = objArr[2];
                String str27 = (String) obj29;
                Object objM5099 = C3512.m5098(C3512.f11014, EnumC3676.f11520.f11526);
                C3512.m5099(objM5099, (String) obj27);
                if (str26 != null) {
                    if (str26.length() == 0) {
                        str26 = null;
                    }
                    if (str26 != null) {
                        C3512.m5101(objM5099, str26);
                    }
                }
                if (str27 != null) {
                    String str28 = str27.length() != 0 ? str27 : null;
                    if (str28 != null) {
                        C3512.m5100(objM5099, str28);
                    }
                }
                C3512.m5097(objM5099);
                return unit;
            case 12 /* 12 */:
                Object obj30 = objArr[0];
                String[] strArr11 = AbstractC1574.f5469;
                JSONObject jSONObject18 = (JSONObject) obj30;
                String strOptString = jSONObject18.optString("content");
                String strOptString2 = jSONObject18.optString("sdkId");
                String strOptString3 = jSONObject18.optString("sdkAppName");
                Object objM50910 = C3512.m5098(C3512.f11014, EnumC3676.f11520.f11526);
                C3512.m5099(objM50910, strOptString);
                if (true) {
                    if (strOptString2.length() == 0) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        C3512.m5101(objM50910, strOptString2);
                    }
                }
                if (true) {
                    String str29 = strOptString3.length() != 0 ? strOptString3 : null;
                    if (str29 != null) {
                        C3512.m5100(objM50910, str29);
                    }
                }
                C3512.m5097(objM50910);
                return unit;
            case 13:
                Object obj31 = objArr[0];
                String[] strArr12 = AbstractC1574.f5469;
                Object obj32 = objArr[1];
                C1133.m2726((String) obj31, Collections.singletonList((String) obj32), null, null);
                return unit;
            case 14 /* 14 */:
                Object obj33 = objArr[0];
                String[] strArr13 = AbstractC1574.f5469;
                Object obj34 = objArr[1];
                Object obj35 = objArr[2];
                Object obj36 = objArr[3];
                C1133.m2726((String) obj33, Collections.singletonList((String) obj34), (String) obj35, (String) obj36);
                return unit;
            case 15:
                Object obj37 = objArr[0];
                String[] strArr14 = AbstractC1574.f5469;
                Object obj38 = objArr[1];
                C1133.m2726((String) obj37, (List) obj38, null, null);
                return unit;
            case 16:
                Object obj39 = objArr[0];
                String[] strArr15 = AbstractC1574.f5469;
                Object obj40 = objArr[1];
                Object obj41 = objArr[2];
                Object obj42 = objArr[3];
                C1133.m2726((String) obj39, (List) obj40, (String) obj41, (String) obj42);
                return unit;
            case 17 /* 17 */:
                Object obj43 = objArr[0];
                String[] strArr16 = AbstractC1574.f5469;
                JSONObject jSONObject19 = (JSONObject) obj43;
                String strOptString4 = jSONObject19.optString("content");
                JSONArray jSONArrayOptJSONArray = jSONObject19.optJSONArray("picPathList");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i4 = 0; i4 < length; i4++) {
                        arrayList.add(jSONArrayOptJSONArray.optString(i4));
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = C1189.f4329;
                }
                C1133.m2726(strOptString4, list, jSONObject19.optString("sdkId"), jSONObject19.optString("sdkAppName"));
                return unit;
            case 18 /* 18 */:
                Object obj44 = objArr[0];
                String str30 = (String) obj44;
                Object obj45 = objArr[1];
                String str31 = (String) obj45;
                Object obj46 = objArr[2];
                String str32 = (String) obj46;
                Object obj47 = objArr[3];
                C2180.addNetSceneToQueue(C2190.m3962(str30, str31, "confirm", str32, ((Integer) obj47).intValue()));
                return unit;
            case 19:
                Object obj48 = objArr[0];
                String str33 = (String) obj48;
                Object obj49 = objArr[1];
                String str34 = (String) obj49;
                Object obj50 = objArr[2];
                C2180.addNetSceneToQueue(C2190.m3962(str33, str34, "refuse", (String) obj50, 0));
                return unit;
            case 20:
                Object obj51 = objArr[0];
                String[] strArr19 = AbstractC1574.f5469;
                Object obj52 = objArr[1];
                new C0299((String) obj51, 4, (Consumer) obj52).invoke();
                return unit;
            case 21 /* 21 */:
                Object obj53 = objArr[0];
                String[] strArr20 = AbstractC1574.f5469;
                Object obj54 = objArr[1];
                C1133.m2722((String) obj53, (String) obj54);
                return unit;
            default:
                Object obj55 = objArr[0];
                C2180.addNetSceneToQueue(obj55);
                return unit;
        }
    }
}
