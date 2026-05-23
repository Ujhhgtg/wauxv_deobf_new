package p000;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.data.bean.MsgInfoBean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2444 implements InterfaceC1425 {

    public final /* synthetic */ int f7773;

    public /* synthetic */ C2444(int i) {
        this.f7773 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException, InvocationTargetException {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        Object c25812;
        Object c25813;
        Object c25814;
        Object c25815;
        Object c25816;
        Object c25817;
        Object c25818;
        Object c25819;
        Object c25820;
        Object c25821;
        Object c25822;
        Object c25823;
        Object c25824;
        Object c25825;
        Object c25826;
        Object c25827;
        Object c25828;
        int i = this.f7773;
        int i2 = 8;
        Class cls = Integer.TYPE;
        int i3 = 9;
        int i4 = 7;
        int i5 = 0;
        int i6 = 1;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                C1333 c1333 = (C1333) obj;
                c1333.m3053("com.tencent.mm.pluginsdk.ui.chat");
                c1333.m3052(new C2444(1));
                return unit;
            case 1:
                C1981 c1981 = (C1981) obj;
                String[] strArr = AbstractC1574.f5469;
                c1981.m3826("onKey");
                c1981.m3827("ChatFooterKtHelper", "supportAutoComplete err");
                return unit;
            case 2:
                return Boolean.valueOf(((Class) obj).getName().startsWith("com.tencent.mm.pluginsdk.ui.chat."));
            case 3:
                AbstractC1458.m3166(C2451.f7789, new C2449((ConversationBean) obj, 1));
                return unit;
            case 4:
                ((C1020) obj).thisMethodMatcher = new C2444(8);
                return unit;
            case 5:
                ((C1020) obj).thisMethodMatcher = new C2444(7);
                return unit;
            case 6:
                C1563 c1563 = (C1563) obj;
                if (AbstractC3471.m5079(WeChatVersions.f11539) || AbstractC3471.m5080(WeChatVersionsPlay.f11502)) {
                    
                    try {
                        c2585 = c1563.m3267()[0];
                        if (c2585 == null) {
                            c2585 = null;
                        }
                    } catch (Throwable th) {
                        c2585 = new C2585(th);
                    }
                    Object obj2 = c2585 instanceof C2585 ? null : c2585;
                    try {
                        c2586 = c1563.m3267()[2];
                        if (c2586 == null) {
                            c2586 = null;
                        }
                    } catch (Throwable th2) {
                        c2586 = new C2585(th2);
                    }
                    Object obj3 = c2586 instanceof C2585 ? null : c2586;
                    try {
                        c2587 = c1563.m3267()[3];
                        if (c2587 == null) {
                            c2587 = null;
                        }
                    } catch (Throwable th3) {
                        c2587 = new C2585(th3);
                    }
                    if (c2587 instanceof C2585) {
                        c2587 = null;
                    }
                    View view = (View) c2587;
                    try {
                        c2588 = c1563.m3267()[4];
                        if (c2588 == null) {
                            c2588 = null;
                        }
                    } catch (Throwable th4) {
                        c2588 = new C2585(th4);
                    }
                    if (c2588 instanceof C2585) {
                        c2588 = null;
                    }
                    long jLongValue = ((Number) c2588).longValue();
                    try {
                        c2589 = c1563.m3267()[5];
                        if (c2589 == null) {
                            c2589 = null;
                        }
                    } catch (Throwable th5) {
                        c2589 = new C2585(th5);
                    }
                    if (c2589 instanceof C2585) {
                        c2589 = null;
                    }
                    String str = (String) c2589;
                    try {
                        c25810 = c1563.m3267()[6];
                        if (c25810 == null) {
                            c25810 = null;
                        }
                    } catch (Throwable th6) {
                        c25810 = new C2585(th6);
                    }
                    Object obj4 = c25810 instanceof C2585 ? null : c25810;
                    
                    AbstractC1574.dexToMethod(C2454.f7795).invoke(null, obj2, obj3, C2079.m3883(jLongValue), view, Long.valueOf(jLongValue), str, obj4);
                    c1563.setReturn(null);
                } else if (AbstractC3471.m5079(WeChatVersions.f11535) || AbstractC3471.m5080(WeChatVersionsPlay.f11498)) {
                    
                    try {
                        c25811 = c1563.m3267()[0];
                        if (c25811 == null) {
                            c25811 = null;
                        }
                    } catch (Throwable th7) {
                        c25811 = new C2585(th7);
                    }
                    Object obj5 = c25811 instanceof C2585 ? null : c25811;
                    try {
                        c25812 = c1563.m3267()[2];
                        if (c25812 == null) {
                            c25812 = null;
                        }
                    } catch (Throwable th8) {
                        c25812 = new C2585(th8);
                    }
                    Object obj6 = c25812 instanceof C2585 ? null : c25812;
                    try {
                        c25813 = c1563.m3267()[3];
                        if (c25813 == null) {
                            c25813 = null;
                        }
                    } catch (Throwable th9) {
                        c25813 = new C2585(th9);
                    }
                    if (c25813 instanceof C2585) {
                        c25813 = null;
                    }
                    View view2 = (View) c25813;
                    try {
                        c25814 = c1563.m3267()[4];
                        if (c25814 == null) {
                            c25814 = null;
                        }
                    } catch (Throwable th10) {
                        c25814 = new C2585(th10);
                    }
                    if (c25814 instanceof C2585) {
                        c25814 = null;
                    }
                    long jLongValue2 = ((Number) c25814).longValue();
                    try {
                        c25815 = c1563.m3267()[5];
                        if (c25815 == null) {
                            c25815 = null;
                        }
                    } catch (Throwable th11) {
                        c25815 = new C2585(th11);
                    }
                    if (c25815 instanceof C2585) {
                        c25815 = null;
                    }
                    String str2 = (String) c25815;
                    try {
                        c25816 = c1563.m3267()[6];
                        if (c25816 == null) {
                            c25816 = null;
                        }
                    } catch (Throwable th12) {
                        c25816 = new C2585(th12);
                    }
                    Object obj7 = c25816 instanceof C2585 ? null : c25816;
                    try {
                        c25817 = c1563.m3267()[7];
                        if (c25817 == null) {
                            c25817 = null;
                        }
                    } catch (Throwable th13) {
                        c25817 = new C2585(th13);
                    }
                    if (c25817 instanceof C2585) {
                        c25817 = null;
                    }
                    Boolean bool = (Boolean) c25817;
                    
                    
                    AbstractC1574.dexToMethod(C2454.f7795).invoke(null, obj5, obj6, C2079.m3883(jLongValue2), view2, Long.valueOf(jLongValue2), str2, obj7, bool);
                    c1563.setReturn(null);
                } else {
                    
                    try {
                        c25818 = c1563.m3267()[0];
                        if (c25818 == null) {
                            c25818 = null;
                        }
                    } catch (Throwable th14) {
                        c25818 = new C2585(th14);
                    }
                    Object obj8 = c25818 instanceof C2585 ? null : c25818;
                    try {
                        c25819 = c1563.m3267()[2];
                        if (c25819 == null) {
                            c25819 = null;
                        }
                    } catch (Throwable th15) {
                        c25819 = new C2585(th15);
                    }
                    Object obj9 = c25819 instanceof C2585 ? null : c25819;
                    try {
                        c25820 = c1563.m3267()[3];
                        if (c25820 == null) {
                            c25820 = null;
                        }
                    } catch (Throwable th16) {
                        c25820 = new C2585(th16);
                    }
                    if (c25820 instanceof C2585) {
                        c25820 = null;
                    }
                    View view3 = (View) c25820;
                    try {
                        c25821 = c1563.m3267()[4];
                        if (c25821 == null) {
                            c25821 = null;
                        }
                    } catch (Throwable th17) {
                        c25821 = new C2585(th17);
                    }
                    if (c25821 instanceof C2585) {
                        c25821 = null;
                    }
                    long jLongValue3 = ((Number) c25821).longValue();
                    try {
                        c25822 = c1563.m3267()[5];
                        if (c25822 == null) {
                            c25822 = null;
                        }
                    } catch (Throwable th18) {
                        c25822 = new C2585(th18);
                    }
                    Object obj10 = c25822 instanceof C2585 ? null : c25822;
                    try {
                        c25823 = c1563.m3267()[6];
                        if (c25823 == null) {
                            c25823 = null;
                        }
                    } catch (Throwable th19) {
                        c25823 = new C2585(th19);
                    }
                    if (c25823 instanceof C2585) {
                        c25823 = null;
                    }
                    Boolean bool2 = (Boolean) c25823;
                    
                    
                    AbstractC1574.dexToMethod(C2454.f7795).invoke(null, obj8, obj9, C2079.m3883(jLongValue3), view3, Long.valueOf(jLongValue3), obj10, bool2);
                    c1563.setReturn(null);
                }
                return unit;
            case 7:
                C1333 c1334 = (C1333) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.ui.chatting.viewitems");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,quotedMsg is null!");
                c1334.f4794 = c1982;
                return unit;
            case 8:
                C1333 c1335 = (C1333) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.ui.chatting.viewitems");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickEvent,quotedMsg is null!");
                c1335.f4794 = c1983;
                return unit;
            case 9:
                String[] strArr4 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.ConversationWithCacheAdapter", "is transfer remind msg ");
                return unit;
            case 10:
                String[] strArr5 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_quote_remind_msg, null, false);
                int i7 = R.id.moduleDialogEdtQuoteRemindMsgColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtQuoteRemindMsgColor);
                if (textInputEditText != null) {
                    i7 = R.id.moduleDialogEdtQuoteRemindMsgText;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtQuoteRemindMsgText);
                    if (textInputEditText2 != null) {
                        i7 = R.id.moduleDialogInputQuoteRemindMsgColor;
                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputQuoteRemindMsgColor)) != null) {
                            i7 = R.id.moduleDialogInputQuoteRemindMsgText;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputQuoteRemindMsgText)) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewM4676;
                                C2018 c2018 = new C2018(linearLayout, textInputEditText, textInputEditText2);
                                textInputEditText2.setText(C2458.f7803.m2542());
                                textInputEditText.setText(C2457.f7802.m2542());
                                C2007 c2007 = new C2007();
                                
                                c2007.f6678 = C2459.f7806;
                                c2007.f6680 = linearLayout;
                                c2007.m3870("保存", new C2042(9, c2018));
                                c2007.m3869("重置", new C2083(9));
                                c2007.m3868().m3791();
                                return unit;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i7)));
            case 11:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C2444(12);
                c1020.thisMethodMatcher = new C2444(13);
                return unit;
            case 12 /* 12 */:
                ((C1332) obj).m3050(new C2444(9));
                return unit;
            case 13:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1336);
                Class<CharSequence> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(CharSequence.class));
                c1981M4739.m3824(clsM2183 != null ? clsM2183 : CharSequence.class);
                c1981M4739.m3822(new C1664(7, 8, 1));
                c1336.f4794 = c1981M4739;
                return unit;
            case 14 /* 14 */:
                C1563 c1564 = (C1563) obj;
                C2315 c2315 = (AbstractC3471.m5079(WeChatVersions.f11543) || AbstractC3471.m5080(WeChatVersionsPlay.f11509)) ? new C2315(1, 5) : new C2315(0, 4);
                int iIntValue = ((Number) c2315.f7445).intValue();
                int iIntValue2 = ((Number) c2315.f7446).intValue();
                
                try {
                    c25824 = c1564.m3267()[iIntValue];
                    if (c25824 == null) {
                        c25824 = null;
                    }
                } catch (Throwable th20) {
                    c25824 = new C2585(th20);
                }
                if (c25824 instanceof C2585) {
                    c25824 = null;
                }
                int i8 = 0;
                C1299 c1299M3490 = AbstractC0968.startMethodResolution_(c25824).m3490();
                String[] strArr6 = AbstractC1574.f5469;
                c1299M3490.name = "field_unReadCount";
                int iIntValue3 = ((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).intValue();
                C1299 c1299M3491 = AbstractC0968.startMethodResolution_(c25824).m3490();
                c1299M3491.name = "field_unReadMuteCount";
                int iIntValue4 = ((Number) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024()).intValue();
                C1299 c1299M3492 = AbstractC0968.startMethodResolution_(c25824).m3490();
                c1299M3492.name = "field_msgType";
                String str3 = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                C1299 c1299M3493 = AbstractC0968.startMethodResolution_(c25824).m3490();
                c1299M3493.name = "field_content";
                String str4 = (String) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024();
                if ((iIntValue3 > 0 || iIntValue4 > 0) && AbstractC2207.m4087(str3, String.valueOf(EnumC3673.f11488.f11492))) {
                    String sendTalker = new MsgInfoBean.QuoteMsg(str4).getSendTalker();
                    
                    if (AbstractC2207.m4087(sendTalker, C0774.getSelfWxId())) {
                        try {
                            c25825 = c1564.m3267()[iIntValue2];
                            if (c25825 == null) {
                                c25825 = null;
                            }
                        } catch (Throwable th21) {
                            c25825 = new C2585(th21);
                        }
                        Object obj11 = c25825 instanceof C2585 ? null : c25825;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2458.f7803.m2542());
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(C2457.f7802.m2542())), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) obj11);
                        c1564.setReturn(spannableStringBuilder);
                    }
                }
                return unit;
            case 15:
                C1563 c1565 = (C1563) obj;
                String[] strArr7 = AbstractC1574.f5469;
                
                try {
                    c25826 = c1565.m3267()[0];
                    if (c25826 == null) {
                        c25826 = null;
                    }
                } catch (Throwable th22) {
                    c25826 = new C2585(th22);
                }
                Object obj12 = c25826 instanceof C2585 ? null : c25826;
                try {
                    c25827 = c1565.m3267()[1];
                    if (c25827 == null) {
                        c25827 = null;
                    }
                } catch (Throwable th23) {
                    c25827 = new C2585(th23);
                }
                if (c25827 instanceof C2585) {
                    c25827 = null;
                }
                int i9 = 0;
                C1299 c1299M3494 = AbstractC0968.startMethodResolution_(obj12).m3490();
                c1299M3494.fieldType = AbstractC2519.classToKClass(View.class);
                TextView textView = (TextView) AbstractC3580.m5198((ViewGroup) ((C1315) AbstractC2784.m4741(c1299M3494)).m3024(), new int[]{0, 1, 1, 1, 1});
                Field[] declaredFields = c25827.getClass().getDeclaredFields();
                int length = declaredFields.length;
                Field field = null;
                int i10 = 0;
                boolean z = false;
                while (i10 < length) {
                    field = declaredFields[i10];
                    field.setAccessible(true);
                    if (z) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    0++;
                    z = true;
                }
                if (!z) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                Object obj13 = field.get(c25827);
                int i11 = 0;
                C1299 c1299M3495 = AbstractC0968.startMethodResolution_(obj13).m3490();
                c1299M3495.fieldType = AbstractC2519.classToKClass(String.class);
                Object obj14 = null;
                boolean z2 = false;
                for (Object obj15 : c1299M3495.resolve()) {
                    String str5 = (String) ((C1315) obj15).m3024();
                    if (str5 != null && str5.length() == 10) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= str5.length()) {
                                if (true) {
                                    obj14 = obj15;
                                    z2 = true;
                                    break;
                                }
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            if (!Character.isDigit(str5.charAt(i12))) {
                            }
                            i12++;
                        }
                    }
                    break;
                }
                if (!z2) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                long j = Long.parseLong((String) ((C1315) obj14).m3024()) * ((long) 1000);
                
                int i13 = 0;
                textView.setText(AbstractC3681.m5339(j, AbstractC2207.m4087(Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()) ? "HH:mm:ss" : Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate().getYear() == LocalDate.now().getYear() ? "M月d日 HH:mm:ss" : "yyyy年M月d日 HH:mm:ss", null, 2));
                return unit;
            case 16:
                C1563 c1566 = (C1563) obj;
                
                try {
                    c25828 = c1566.m3267()[2];
                    if (c25828 == null) {
                        c25828 = null;
                    }
                } catch (Throwable th24) {
                    c25828 = new C2585(th24);
                }
                JSONObject jSONObject = (JSONObject) (c25828 instanceof C2585 ? null : c25828);
                if (jSONObject != null) {
                    
                    String[] strArr8 = AbstractC1574.f5469;
                    if (Math.random() > 0.65d) {
                        List listM2212 = AbstractC0745.listOf("Hd", "久雾", "豆子", "拖鞋");
                        AbstractC0066 abstractC0066 = AbstractC2474.f7908;
                        jSONObject.put("changeWording", "已存入" + ((String) AbstractC0744.randomFromList(listM2212)) + "的余额(WA)");
                    }
                    double d = jSONObject.getInt("totalAmount");
                    int i14 = jSONObject.getInt("totalNum");
                    int i15 = jSONObject.getInt("recNum");
                    double d2 = jSONObject.getInt("recAmount");
                    jSONObject.getInt("amount");
                    jSONObject.getJSONArray("record");
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("金额:");
                    double d3 = 100;
                    sb2.append(d2 / 100.0);
                    sb2.append('/');
                    sb2.append(d / 100.0);
                    sb2.append("元\n");
                    sb.append(sb2.toString());
                    sb.append("数量:" + i15 + '/' + i14 + '\n');
                    double d4 = (d - d2) / 100.0;
                    if (d4 > 0.0d) {
                        sb.append("剩余:" + d4 + "元\n");
                    }
                    jSONObject.put("headTitle", sb.toString());
                }
                return unit;
            case 17 /* 17 */:
                ((C1020) obj).thisMethodMatcher = new C2444(18);
                return unit;
            case 18 /* 18 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.plugin.luckymoney.ui");
                C1981 c1984 = new C1981(4);
                c1984.m3827("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s");
                c1337.f4794 = c1984;
                return unit;
            case 19:
                ((C1020) obj).thisMethodMatcher = new C2444(21);
                return unit;
            case 20:
                ((C1563) obj).m3270();
                return unit;
            case 21 /* 21 */:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1338);
                String[] strArr10 = AbstractC1574.f5469;
                c1981M47310.m3825("com.tencent.mm.ui.transmit.SelectConversationUI");
                Class<Boolean> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                c1981M47310.m3824(clsM2184 != null ? clsM2184 : Boolean.class);
                c1981M47310.m3827("max_limit_num");
                c1338.f4794 = c1981M47310;
                return unit;
            case 22 /* 22 */:
                ((C1020) obj).thisMethodMatcher = new C2444(24);
                return unit;
            case 23 /* 23 */:
                int i16 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738((C1563) obj);
                c1299M4738.fieldType = AbstractC2519.classToKClass(cls);
                c1299M4738.superclass();
                for (C1315 c1315 : c1299M4738.resolve()) {
                    Integer num = (Integer) c1315.m3024();
                    if (num != null && num.intValue() == 32) {
                        c1315.set(2147483647);
                    }
                }
                return unit;
            case 24 /* 24 */:
                ((C1333) obj).m3052(new C2444(25));
                return unit;
            case 25 /* 25 */:
                String[] strArr11 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
                return unit;
            case 26:
                int i17 = 0;
                C1299 c1299M4739 = AbstractC2784.m4738((C1563) obj);
                AbstractC0750.m2218(c1299M4739.f6372, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.PUBLIC, EnumC1999.FINAL}, 2));
                c1299M4739.fieldType = AbstractC2519.classToKClass(cls);
                for (C1315 c1316 : c1299M4739.resolve()) {
                    Integer num2 = (Integer) c1316.m3024();
                    if (num2 != null && num2.intValue() == 10) {
                        c1316.set(2147483647);
                    }
                }
                return unit;
            case 27:
                C1333 c1339 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1339);
                c1981M47311.m3826("callback");
                c1339.f4794 = c1981M47311;
                return unit;
            case 28:
                ((C1563) obj).m3270();
                return unit;
            default:
                C1020 c1021 = (C1020) obj;
                c1021.declaringClassMatcher = new C2544(0);
                c1021.thisMethodMatcher = new C2544(1);
                return unit;
        }
    }
}
