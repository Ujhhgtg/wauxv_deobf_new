package p000;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᛸᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2504 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7937;

    public /* synthetic */ C2504(int i) {
        this.f7937 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        int i = this.f7937;
        Class cls = Integer.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        int i2 = 4;
        Class<String> cls3 = String.class;
        int i3 = 5;
        int i4 = 10;
        int i5 = 1;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.ui.chatting.viewitems");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickEvent,quotedMsg is null!");
                c1335.f4794 = c2012;
                return c3554;
            case 1:
                String[] strArr2 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ConversationWithCacheAdapter", "is transfer remind msg ");
                return c3554;
            case 2:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_quote_remind_msg, null, false);
                int i6 = R.id.moduleDialogEdtQuoteRemindMsgColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtQuoteRemindMsgColor);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtQuoteRemindMsgText;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtQuoteRemindMsgText);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogInputQuoteRemindMsgColor;
                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputQuoteRemindMsgColor)) != null) {
                            i6 = R.id.moduleDialogInputQuoteRemindMsgText;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputQuoteRemindMsgText)) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                C2048 c2048 = new C2048(linearLayout, textInputEditText, textInputEditText2, 4);
                                textInputEditText2.setText(C2510.f7947.m2666());
                                textInputEditText.setText(C2509.f7946.m2666());
                                C2037 c2037 = new C2037();
                                C2511.f7948.getClass();
                                c2037.f6779 = C2511.f7950;
                                c2037.f6781 = linearLayout;
                                c2037.m4057("保存", new C2070(c2048, 10));
                                c2037.m4056("重置", new C2096(11));
                                c2037.m4055().m3985();
                                return c3554;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i6)));
            case 3:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2504(i2);
                c1023.f3740 = new C2504(i3);
                return c3554;
            case 4:
                ((C1334) obj).m3153(new C2504(i5));
                return c3554;
            case 5:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                Class<CharSequence> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(CharSequence.class));
                c2012M4773.m4018(clsM4232 != null ? clsM4232 : CharSequence.class);
                c2012M4773.m4016(new C1679(7, 8, 1));
                c1336.f4794 = c2012M4773;
                return c3554;
            case 6:
                C1574 c1574 = (C1574) obj;
                C2348 c2348 = (AbstractC0972.m2596(EnumC3737.f11690) || AbstractC0972.m2597(EnumC3734.f11658)) ? new C2348(1, 5) : new C2348(0, 4);
                int iIntValue = ((Number) c2348.f7567).intValue();
                int iIntValue2 = ((Number) c2348.f7568).intValue();
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[iIntValue];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                int i7 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(c2641).m3558();
                String[] strArr4 = AbstractC1471.f5234;
                c1300M3558.f6475 = "field_unReadCount";
                int iIntValue3 = ((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).intValue();
                C1300 c1300M3559 = AbstractC2727.m4713(c2641).m3558();
                c1300M3559.f6475 = "field_unReadMuteCount";
                int iIntValue4 = ((Number) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).intValue();
                C1300 c1300M35510 = AbstractC2727.m4713(c2641).m3558();
                c1300M35510.f6475 = "field_msgType";
                String str = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                C1300 c1300M35511 = AbstractC2727.m4713(c2641).m3558();
                c1300M35511.f6475 = "field_content";
                String str2 = (String) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127();
                if ((iIntValue3 > 0 || iIntValue4 > 0) && AbstractC1469.m3322(str, String.valueOf(EnumC3733.f11637.f11641))) {
                    String sendTalker = new MsgInfoBean.QuoteMsg(str2).getSendTalker();
                    C0772.f2876.getClass();
                    if (AbstractC1469.m3322(sendTalker, C0772.m2366())) {
                        try {
                            c2642 = c1574.m3447()[iIntValue2];
                            if (c2642 == null) {
                                c2642 = null;
                            }
                        } catch (Throwable th2) {
                            c2642 = new C2641(th2);
                        }
                        Object obj2 = c2642 instanceof C2641 ? null : c2642;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2510.f7947.m2666());
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(C2509.f7946.m2666())), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) obj2);
                        c1574.m3452(spannableStringBuilder);
                    }
                }
                return c3554;
            case 7:
                C1574 c1575 = (C1574) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1575.getClass();
                try {
                    c2643 = c1575.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                Object obj3 = c2643 instanceof C2641 ? null : c2643;
                try {
                    c2644 = c1575.m3447()[1];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                int i8 = AbstractC1768.f5906;
                C1300 c1300M35512 = AbstractC2727.m4713(obj3).m3558();
                c1300M35512.f4724 = AbstractC2574.m4549(View.class);
                TextView textView = (TextView) AbstractC3640.m5204((ViewGroup) ((C1316) AbstractC2844.m4775(c1300M35512)).m3127(), new int[]{0, 1, 1, 1, 1});
                Field[] declaredFields = c2644.getClass().getDeclaredFields();
                int length = declaredFields.length;
                int i9 = 0;
                boolean z = false;
                Field field = null;
                while (i9 < length) {
                    field = declaredFields[i9];
                    field.setAccessible(true);
                    if (z) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    i9++;
                    z = true;
                }
                if (!z) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                Object obj4 = field.get(c2644);
                int i10 = AbstractC1768.f5906;
                C1300 c1300M35513 = AbstractC2727.m4713(obj4).m3558();
                c1300M35513.f4724 = AbstractC2574.m4549(cls3);
                boolean z2 = false;
                Object obj5 = null;
                for (Object obj6 : c1300M35513.m3117()) {
                    String str3 = (String) ((C1316) obj6).m3127();
                    if (str3 != null && str3.length() == 10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= str3.length()) {
                                if (!z2) {
                                    obj5 = obj6;
                                    z2 = true;
                                    break;
                                }
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            if (!Character.isDigit(str3.charAt(i11))) {
                            }
                            i11++;
                            break;
                        }
                    }
                }
                if (!z2) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                long j = Long.parseLong((String) ((C1316) obj5).m3127()) * ((long) 1000);
                C2567.f8181.getClass();
                int i12 = AbstractC2986.f9559;
                textView.setText(AbstractC2234.m4188(j, AbstractC1469.m3322(Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()) ? "HH:mm:ss" : Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate().getYear() == LocalDate.now().getYear() ? "M月d日 HH:mm:ss" : "yyyy年M月d日 HH:mm:ss", null, 2));
                return c3554;
            case 8:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2645 = c1576.m3447()[2];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                JSONObject jSONObject = (JSONObject) (c2645 instanceof C2641 ? null : c2645);
                if (jSONObject != null) {
                    C2567.f8181.getClass();
                    String[] strArr6 = AbstractC1471.f5234;
                    if (Math.random() > 0.65d) {
                        List listM2311 = AbstractC0740.m2311("Hd", "久雾", "豆子", "拖鞋");
                        C2527 c2527 = AbstractC2528.f8058;
                        jSONObject.put("changeWording", "已存入" + ((String) AbstractC0739.m2298(listM2311)) + "的余额(WA)");
                    }
                    double d = jSONObject.getInt("totalAmount");
                    int i13 = jSONObject.getInt("totalNum");
                    int i14 = jSONObject.getInt("recNum");
                    double d2 = jSONObject.getInt("recAmount");
                    jSONObject.getInt("amount");
                    jSONObject.getJSONArray("record");
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("金额:");
                    double d3 = 100;
                    sb2.append(d2 / d3);
                    sb2.append('/');
                    sb2.append(d / d3);
                    sb2.append("元\n");
                    sb.append(sb2.toString());
                    sb.append("数量:" + i14 + '/' + i13 + '\n');
                    double d4 = (d - d2) / d3;
                    if (d4 > 0.0d) {
                        sb.append("剩余:" + d4 + "元\n");
                    }
                    jSONObject.put("headTitle", sb.toString());
                }
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C2504(i4);
                return c3554;
            case 10:
                C1335 c1337 = (C1335) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.luckymoney.ui");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s");
                c1337.f4794 = c2013;
                return c3554;
            case 11:
                ((C1023) obj).f3740 = new C2504(13);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1574) obj).m3450();
                return c3554;
            case 13:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1338);
                String[] strArr8 = AbstractC1471.f5234;
                c2012M4774.m4019("com.tencent.mm.ui.transmit.SelectConversationUI");
                Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2012M4774.m4018(clsM4233 != null ? clsM4233 : Boolean.class);
                c2012M4774.m4021("max_limit_num");
                c1338.f4794 = c2012M4774;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1023) obj).f3740 = new C2504(16);
                return c3554;
            case 15:
                int i15 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772((C1574) obj);
                c1300M4772.f4724 = AbstractC2574.m4549(cls);
                c1300M4772.m3926();
                for (C1316 c1316 : c1300M4772.m3117()) {
                    Integer num = (Integer) c1316.m3127();
                    if (num != null && num.intValue() == 32) {
                        c1316.m3128(Integer.MAX_VALUE);
                    }
                }
                return c3554;
            case 16:
                ((C1335) obj).m3155(new C2504(17));
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr9 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
                return c3554;
            case Opcodes.LDC /* 18 */:
                int i16 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772((C1574) obj);
                AbstractC0745.m2317(c1300M4773.f6477, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.PUBLIC, EnumC2030.FINAL}, 2));
                c1300M4773.f4724 = AbstractC2574.m4549(cls);
                for (C1316 c1317 : c1300M4773.m3117()) {
                    Integer num2 = (Integer) c1317.m3127();
                    if (num2 != null && num2.intValue() == 10) {
                        c1317.m3128(Integer.MAX_VALUE);
                    }
                }
                return c3554;
            case 19:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c1339);
                c2012M4775.m4020("callback");
                c1339.f4794 = c2012M4775;
                return c3554;
            case 20:
                ((C1574) obj).m3450();
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C2504(22);
                c1024.f3740 = new C2504(23);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1334) obj).m3153(new C2504(26));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1335) obj).m3155(new C2504(25));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1574 c1577 = (C1574) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c1577.getClass();
                try {
                    c2646 = c1577.m3447()[0];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                String str4 = (String) (c2646 instanceof C2641 ? null : c2646);
                try {
                    Object obj7 = c1577.m3447()[1];
                    break;
                } catch (Throwable unused) {
                }
                for (InterfaceC1612 interfaceC1612 : C2602.f8256) {
                    try {
                        interfaceC1612.mo3414(c1577, str4);
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onGetRepairerConfig ");
                        sb3.append(interfaceC1612 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1612).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e, 12);
                    }
                }
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C2012 c2014 = (C2012) obj;
                Class<Object> cls4 = Object.class;
                Class<Object> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls4));
                if (clsM4234 == null) {
                    clsM4234 = cls4;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2014, clsM4234, cls3);
                cls3 = clsM4774 != null ? clsM4774 : String.class;
                Class<Object> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls4));
                c2014.m4017(cls3, clsM4235 != null ? clsM4235 : Object.class);
                String[] strArr11 = AbstractC1471.f5234;
                c2014.m4021("String", "Int", "Long", "Float");
                return c3554;
            case 26:
                String[] strArr12 = AbstractC1471.f5234;
                ((C0700) obj).m2220("RepairerConfigThread", "ValueStrategy_");
                return c3554;
            case 27:
                C2012 c2015 = (C2012) obj;
                Class<ImageView> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(ImageView.class));
                Class cls5 = clsM4236 != null ? clsM4236 : ImageView.class;
                Class<String> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                cls3 = clsM4237 != null ? clsM4237 : String.class;
                Class<Float> clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(Float.class));
                Class cls6 = clsM4238 != null ? clsM4238 : Float.class;
                Class<Boolean> clsM4239 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2015.m4017(cls5, cls3, cls6, clsM4239 != null ? clsM4239 : Boolean.class);
                c2015.m4021("MicroMsg.AvatarDrawable");
                return c3554;
            case 28:
                C1574 c1578 = (C1574) obj;
                c1578.getClass();
                new C0383(2, 6, c1578).m1714(Float.valueOf(C2661.f8619.m2661()));
                return c3554;
            default:
                ((C1335) obj).m3155(new C2657(i3));
                return c3554;
        }
    }
}
