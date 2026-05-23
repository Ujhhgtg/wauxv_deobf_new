package p000;

import android.database.Cursor;
import android.icu.util.Calendar;
import android.text.TextUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
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
        int i = this.f7629;
        int i2 = 4;
        List list = null;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                Object obj = objArr[0];
                String[] strArr = AbstractC1574.f5469;
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj;
                Object obj2 = objArr[1];
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj2;
                Object obj3 = objArr[2];
                "null cannot be cast to non-null type kotlin.String";
                String str3 = (String) obj3;
                Object obj4 = objArr[3];
                "null cannot be cast to non-null type kotlin.String";
                String str4 = (String) obj4;
                Object obj5 = objArr[4];
                "null cannot be cast to non-null type kotlin.String";
                String str5 = (String) obj5;
                Object obj6 = objArr[5];
                "null cannot be cast to non-null type kotlin.String";
                C1133.m2719(str, str2, str3, str4, str5, (String) obj6);
                return c3497;
            case 1:
                Object obj7 = objArr[0];
                String[] strArr2 = AbstractC1574.f5469;
                MagicFactory.get(-440156838427316L, strArr2);
                String str6 = (String) obj7;
                Object obj8 = objArr[1];
                MagicFactory.get(-440375881759412L, strArr2);
                JSONObject jSONObject = (JSONObject) obj8;
                C1133.m2719(str6, jSONObject.optString(MagicFactory.get(-432705070168756L, strArr2)), jSONObject.optString(MagicFactory.get(-432739429907124L, strArr2)), jSONObject.optString(MagicFactory.get(-432765199710900L, strArr2)), jSONObject.optString(MagicFactory.get(-432773789645492L, strArr2)), jSONObject.optString(MagicFactory.get(-432782379580084L, strArr2)));
                return c3497;
            case 2:
                Object obj9 = objArr[0];
                String[] strArr3 = AbstractC1574.f5469;
                MagicFactory.get(-440620694895284L, strArr3);
                Object obj10 = objArr[1];
                MagicFactory.get(-440839738227380L, strArr3);
                String str7 = (String) obj10;
                Object obj11 = objArr[2];
                MagicFactory.get(-441058781559476L, strArr3);
                JSONObject jSONObject2 = new JSONObject();
                String str8 = MagicFactory.get(-107464376711860L, strArr3);
                JSONObject jSONObject3 = new JSONObject();
                String str9 = MagicFactory.get(-107481556581044L, strArr3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(MagicFactory.get(-107511621352116L, strArr3), 1);
                jSONObject4.put(MagicFactory.get(-107533096188596L, strArr3), str7);
                jSONObject4.put(MagicFactory.get(-107558865992372L, strArr3), str7);
                jSONObject4.put(MagicFactory.get(-107576045861556L, strArr3), MagicFactory.get(-107610405599924L, strArr3) + TextUtils.htmlEncode((String) obj11));
                jSONObject3.put(str9, jSONObject4);
                jSONObject2.put(str8, jSONObject3);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                C1732 c1732 = new C1732();
                c1732.f5829 = jSONObject2;
                c1732.f5830 = hashSet;
                c1732.f5831 = hashSet2;
                C1133.m2722((String) obj9, c1732.toString());
                return c3497;
            case 3:
                Object obj12 = objArr[0];
                String[] strArr4 = AbstractC1574.f5469;
                MagicFactory.get(-441277824891572L, strArr4);
                Object obj13 = objArr[1];
                MagicFactory.get(-441496868223668L, strArr4);
                Object obj14 = objArr[2];
                MagicFactory.get(-441715911555764L, strArr4);
                Object obj15 = objArr[3];
                MagicFactory.get(-441934954887860L, strArr4);
                JSONObject jSONObject5 = new JSONObject();
                String str10 = MagicFactory.get(-107898168408756L, strArr4);
                JSONObject jSONObject6 = new JSONObject();
                String str11 = MagicFactory.get(-107915348277940L, strArr4);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(MagicFactory.get(-107945413049012L, strArr4), 33);
                jSONObject7.put(MagicFactory.get(-107966887885492L, strArr4), (String) obj13);
                String str12 = MagicFactory.get(-107992657689268L, strArr4);
                JSONObject jSONObject8 = new JSONObject();
                String str13 = MagicFactory.get(-108035607362228L, strArr4);
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(MagicFactory.get(-108057082198708L, strArr4), MagicFactory.get(-108095736904372L, strArr4) + ((String) obj14) + MagicFactory.get(-108138686577332L, strArr4));
                jSONObject9.put(MagicFactory.get(-108155866446516L, strArr4), (String) obj15);
                jSONObject8.put(str13, jSONObject9);
                jSONObject7.put(str12, jSONObject8);
                jSONObject6.put(str11, jSONObject7);
                jSONObject5.put(str10, jSONObject6);
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                C1732 c1733 = new C1732();
                c1733.f5829 = jSONObject5;
                c1733.f5830 = hashSet3;
                c1733.f5831 = hashSet4;
                C1133.m2722((String) obj12, c1733.toString());
                return c3497;
            case 4:
                Object obj16 = objArr[0];
                String[] strArr5 = AbstractC1574.f5469;
                MagicFactory.get(-442153998219956L, strArr5);
                Object obj17 = objArr[1];
                MagicFactory.get(-442373041552052L, strArr5);
                JSONObject jSONObject10 = new JSONObject();
                String str14 = MagicFactory.get(-108194521152180L, strArr5);
                JSONObject jSONObject11 = new JSONObject();
                String str15 = MagicFactory.get(-108211701021364L, strArr5);
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put(MagicFactory.get(-108241765792436L, strArr5), 53);
                jSONObject12.put(MagicFactory.get(-108263240628916L, strArr5), (String) obj17);
                String str16 = MagicFactory.get(-108289010432692L, strArr5);
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put(MagicFactory.get(-108323370171060L, strArr5), MagicFactory.get(-108387794680500L, strArr5));
                jSONObject12.put(str16, jSONObject13);
                jSONObject11.put(str15, jSONObject12);
                jSONObject10.put(str14, jSONObject11);
                HashSet hashSet5 = new HashSet();
                HashSet hashSet6 = new HashSet();
                hashSet5.add(MagicFactory.get(-108392089647796L, strArr5));
                C1732 c1734 = new C1732();
                c1734.f5829 = jSONObject10;
                c1734.f5830 = hashSet5;
                c1734.f5831 = hashSet6;
                C1133.m2722((String) obj16, c1734.toString());
                return c3497;
            case 5:
                Object obj18 = objArr[0];
                String[] strArr6 = AbstractC1574.f5469;
                MagicFactory.get(-442592084884148L, strArr6);
                String str17 = (String) obj18;
                Object obj19 = objArr[1];
                MagicFactory.get(-442811128216244L, strArr6);
                long jLongValue = ((Long) obj19).longValue();
                Object obj20 = objArr[2];
                MagicFactory.get(-443021581613748L, strArr6);
                C2079.f6881.getClass();
                MsgInfoBean msgInfoBean = new MsgInfoBean(C2079.m3883(jLongValue));
                JSONObject jSONObject14 = new JSONObject();
                String str18 = MagicFactory.get(-108469399059124L, strArr6);
                JSONObject jSONObject15 = new JSONObject();
                String str19 = MagicFactory.get(-108486578928308L, strArr6);
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put(MagicFactory.get(-108516643699380L, strArr6), 57);
                jSONObject16.put(MagicFactory.get(-108538118535860L, strArr6), (String) obj20);
                String str20 = MagicFactory.get(-108563888339636L, strArr6);
                JSONObject jSONObject17 = new JSONObject();
                String str21 = MagicFactory.get(-108602543045300L, strArr6);
                C0247 c0247 = C0247.f1410;
                int type = msgInfoBean.getType();
                c0247.getClass();
                int i3 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2483(AbstractC1574.m3315(C0246.f1409).getDeclaringClass()).m3492();
                c1973M3492.m3800(EnumC1999.STATIC);
                Class cls = Integer.TYPE;
                c1973M3492.f6543 = AbstractC2519.m4527(cls);
                jSONObject17.put(str21, ((Number) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls)}, 1, c1973M3492)).m3832(Integer.valueOf(type))).intValue());
                jSONObject17.put(MagicFactory.get(-108624017881780L, strArr6), msgInfoBean.getMsgSvrId());
                jSONObject17.put(MagicFactory.get(-108649787685556L, strArr6), msgInfoBean.getTalker());
                jSONObject17.put(MagicFactory.get(-108684147423924L, strArr6), msgInfoBean.getSendTalker());
                String str22 = MagicFactory.get(-108718507162292L, strArr6);
                Cursor cursorM2715 = C1133.m2715(MagicFactory.get(-79615808764596L, strArr6) + msgInfoBean.getSendTalker() + '\'');
                if (cursorM2715 != null) {
                    cursorM2715.moveToFirst();
                } else {
                    cursorM2715 = null;
                }
                FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                jSONObject17.put(str22, friendInfoM2176 != null ? friendInfoM2176.getNickname() : null);
                jSONObject17.put(MagicFactory.get(-108770046769844L, strArr6), MagicFactory.get(-108812996442804L, strArr6));
                jSONObject17.put(MagicFactory.get(-108817291410100L, strArr6), msgInfoBean.getContent());
                jSONObject17.put(MagicFactory.get(-108851651148468L, strArr6), MagicFactory.get(-108877420952244L, strArr6));
                jSONObject17.put(MagicFactory.get(-108881715919540L, strArr6), msgInfoBean.getCreateTime());
                jSONObject16.put(str20, jSONObject17);
                jSONObject15.put(str19, jSONObject16);
                jSONObject14.put(str18, jSONObject15);
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                C1732 c1735 = new C1732();
                c1735.f5829 = jSONObject14;
                c1735.f5830 = hashSet7;
                c1735.f5831 = hashSet8;
                C1133.m2722(str17, c1735.toString());
                return c3497;
            case 6:
                Object obj21 = objArr[0];
                String[] strArr7 = AbstractC1574.f5469;
                MagicFactory.get(-443240624945844L, strArr7);
                long jLongValue2 = ((Long) obj21).longValue();
                C2186 c2186 = C2186.f7147;
                String str23 = MagicFactory.get(-128604205742772L, strArr7);
                c2186.getClass();
                C2079.f6881.getClass();
                C2180.m3960(C2180.f7141, AbstractC1574.m3314(C2185.f7146).newInstance(C2079.m3883(jLongValue2), str23, MagicFactory.get(-128599910775476L, strArr7)));
                return c3497;
            case 7:
                Object obj22 = objArr[0];
                String[] strArr8 = AbstractC1574.f5469;
                MagicFactory.get(-443451078343348L, strArr8);
                Object obj23 = objArr[1];
                MagicFactory.get(-443670121675444L, strArr8);
                Object obj24 = objArr[2];
                MagicFactory.get(-443889165007540L, strArr8);
                return Long.valueOf(AbstractC2201.m3976(EnumC3673.f11478.f11492, (String) obj22, (String) obj23, ((Long) obj24).longValue()));
            case 8:
                return AbstractC2203.m4033();
            case 9:
                Object obj25 = objArr[0];
                String[] strArr9 = AbstractC1574.f5469;
                MagicFactory.get(-446144022837940L, strArr9);
                long jLongValue3 = ((Long) obj25).longValue();
                C2192.f7153.getClass();
                Constructor constructorM3314 = AbstractC1574.m3314(C2191.f7152);
                String str24 = MagicFactory.get(-130640020241076L, strArr9);
                String str25 = MagicFactory.get(-130644315208372L, strArr9);
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long j = 1000;
                Integer numValueOf = Integer.valueOf((int) (calendar.getTimeInMillis() / j));
                Integer numValueOf2 = Integer.valueOf((int) (System.currentTimeMillis() / j));
                Integer numValueOf3 = Integer.valueOf((int) jLongValue3);
                C2661.f8575.getClass();
                C2180.m3960(C2180.f7141, constructorM3314.newInstance(str24, str25, numValueOf, numValueOf2, numValueOf3, AbstractC1574.m3315(C2660.f8574).invoke(null, null), 1));
                return c3497;
            case 10:
                Object obj26 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                Object objM5098 = C3512.m5098(C3512.f11014, EnumC3676.f11520.f11526);
                C3512.m5099(objM5098, (String) obj26);
                C3512.m5097(objM5098);
                return c3497;
            case 11:
                Object obj27 = objArr[0];
                String[] strArr10 = AbstractC1574.f5469;
                MagicFactory.get(-447432513026740L, strArr10);
                Object obj28 = objArr[1];
                MagicFactory.get(-447651556358836L, strArr10);
                String str26 = (String) obj28;
                Object obj29 = objArr[2];
                MagicFactory.get(-447870599690932L, strArr10);
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
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                Object obj30 = objArr[0];
                String[] strArr11 = AbstractC1574.f5469;
                MagicFactory.get(-448089643023028L, strArr11);
                JSONObject jSONObject18 = (JSONObject) obj30;
                String strOptString = jSONObject18.optString(MagicFactory.get(-446354476235444L, strArr11));
                String strOptString2 = jSONObject18.optString(MagicFactory.get(-446388835973812L, strArr11));
                String strOptString3 = jSONObject18.optString(MagicFactory.get(-446414605777588L, strArr11));
                Object objM50910 = C3512.m5098(C3512.f11014, EnumC3676.f11520.f11526);
                C3512.m5099(objM50910, strOptString);
                if (strOptString2 != null) {
                    if (strOptString2.length() == 0) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        C3512.m5101(objM50910, strOptString2);
                    }
                }
                if (strOptString3 != null) {
                    String str29 = strOptString3.length() != 0 ? strOptString3 : null;
                    if (str29 != null) {
                        C3512.m5100(objM50910, str29);
                    }
                }
                C3512.m5097(objM50910);
                return c3497;
            case 13:
                Object obj31 = objArr[0];
                String[] strArr12 = AbstractC1574.f5469;
                MagicFactory.get(-448334456158900L, strArr12);
                Object obj32 = objArr[1];
                MagicFactory.get(-448553499490996L, strArr12);
                C1133.m2726((String) obj31, Collections.singletonList((String) obj32), null, null);
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                Object obj33 = objArr[0];
                String[] strArr13 = AbstractC1574.f5469;
                MagicFactory.get(-448772542823092L, strArr13);
                Object obj34 = objArr[1];
                MagicFactory.get(-448991586155188L, strArr13);
                Object obj35 = objArr[2];
                MagicFactory.get(-449210629487284L, strArr13);
                Object obj36 = objArr[3];
                MagicFactory.get(-449429672819380L, strArr13);
                C1133.m2726((String) obj33, Collections.singletonList((String) obj34), (String) obj35, (String) obj36);
                return c3497;
            case 15:
                Object obj37 = objArr[0];
                String[] strArr14 = AbstractC1574.f5469;
                MagicFactory.get(-449648716151476L, strArr14);
                Object obj38 = objArr[1];
                MagicFactory.get(-449867759483572L, strArr14);
                C1133.m2726((String) obj37, (List) obj38, null, null);
                return c3497;
            case 16:
                Object obj39 = objArr[0];
                String[] strArr15 = AbstractC1574.f5469;
                MagicFactory.get(-450194176998068L, strArr15);
                Object obj40 = objArr[1];
                MagicFactory.get(-450413220330164L, strArr15);
                Object obj41 = objArr[2];
                MagicFactory.get(-450739637844660L, strArr15);
                Object obj42 = objArr[3];
                MagicFactory.get(-450958681176756L, strArr15);
                C1133.m2726((String) obj39, (List) obj40, (String) obj41, (String) obj42);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                Object obj43 = objArr[0];
                String[] strArr16 = AbstractC1574.f5469;
                MagicFactory.get(-451177724508852L, strArr16);
                JSONObject jSONObject19 = (JSONObject) obj43;
                String strOptString4 = jSONObject19.optString(MagicFactory.get(-446461850417844L, strArr16));
                JSONArray jSONArrayOptJSONArray = jSONObject19.optJSONArray(MagicFactory.get(-446496210156212L, strArr16));
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
                C1133.m2726(strOptString4, list, jSONObject19.optString(MagicFactory.get(-446547749763764L, strArr16)), jSONObject19.optString(MagicFactory.get(-446573519567540L, strArr16)));
                return c3497;
            case Opcodes.LDC /* 18 */:
                Object obj44 = objArr[0];
                String[] strArr17 = AbstractC1574.f5469;
                MagicFactory.get(-451684530649780L, strArr17);
                String str30 = (String) obj44;
                Object obj45 = objArr[1];
                MagicFactory.get(-451903573981876L, strArr17);
                String str31 = (String) obj45;
                Object obj46 = objArr[2];
                MagicFactory.get(-452122617313972L, strArr17);
                String str32 = (String) obj46;
                Object obj47 = objArr[3];
                MagicFactory.get(-452341660646068L, strArr17);
                C2180.m3960(C2180.f7141, C2190.m3962(C2190.f7151, str30, str31, MagicFactory.get(-109620450294452L, strArr17), str32, ((Integer) obj47).intValue()));
                return c3497;
            case 19:
                Object obj48 = objArr[0];
                String[] strArr18 = AbstractC1574.f5469;
                MagicFactory.get(-452547819076276L, strArr18);
                String str33 = (String) obj48;
                Object obj49 = objArr[1];
                MagicFactory.get(-452766862408372L, strArr18);
                String str34 = (String) obj49;
                Object obj50 = objArr[2];
                MagicFactory.get(-452985905740468L, strArr18);
                C2180.m3960(C2180.f7141, C2190.m3962(C2190.f7151, str33, str34, MagicFactory.get(-109654810032820L, strArr18), (String) obj50, 0));
                return c3497;
            case 20:
                Object obj51 = objArr[0];
                String[] strArr19 = AbstractC1574.f5469;
                MagicFactory.get(-453204949072564L, strArr19);
                Object obj52 = objArr[1];
                MagicFactory.get(-453423992404660L, strArr19);
                new C0299((String) obj51, i2, (Consumer) obj52).invoke();
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                Object obj53 = objArr[0];
                String[] strArr20 = AbstractC1574.f5469;
                MagicFactory.get(-453771884755636L, strArr20);
                Object obj54 = objArr[1];
                MagicFactory.get(-453990928087732L, strArr20);
                C1133.m2722((String) obj53, (String) obj54);
                return c3497;
            default:
                Object obj55 = objArr[0];
                "null cannot be cast to non-null type kotlin.Any";
                C2180.m3960(C2180.f7141, obj55);
                return c3497;
        }
    }
}
