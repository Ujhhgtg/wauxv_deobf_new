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
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ要点脸ᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0780feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3082Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0780feyxiexzfUjhhgtg(int i) {
        this.f3082Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        int i = this.f3082Ujhhgtgfeyxiexzf;
        int i2 = 5;
        Class cls = Integer.TYPE;
        int i3 = 12;
        Class<Boolean> cls2 = Boolean.class;
        int i4 = 6;
        Class<String> cls3 = String.class;
        int i5 = 2;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928389828728325514L, strArr));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928389540965516682L, strArr), MagicFactory.get(4928389631159829898L, strArr));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928390387074073994L, strArr2));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928390056361592202L, strArr2), MagicFactory.get(4928390283994858890L, strArr2));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928392169485501834L, strArr3), MagicFactory.get(4928392418593605002L, strArr3));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_quote_remind_msg, null, false);
                int i6 = R.id.moduleDialogEdtQuoteRemindMsgColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtQuoteRemindMsgColor);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtQuoteRemindMsgText;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtQuoteRemindMsgText);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogInputQuoteRemindMsgColor;
                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputQuoteRemindMsgColor)) != null) {
                            i6 = R.id.moduleDialogInputQuoteRemindMsgText;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputQuoteRemindMsgText)) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, textInputEditText2, 4);
                                textInputEditText2.setText(C0766feyxiexzfUjhhgtg.f3043Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                textInputEditText.setText(C0767feyxiexzfUjhhgtg.f3044Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                feyxiexzfUjhhgtg.f3032Ujhhgtgfeyxiexzf.getClass();
                                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = feyxiexzfUjhhgtg.f3034Ujhhgtgfeyxiexzf;
                                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928393045658830218L, strArr4), new C0350Ujhhgtgfeyxiexzf(10, c0328Ujhhgtgfeyxiexzf));
                                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928393032773928330L, strArr4), new C0478Ujhhgtgfeyxiexzf(i3));
                                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                return c1943Ujhhgtgfeyxiexzf;
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928805628807218570L, strArr4).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i6)));
            case 4:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(i2);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0780feyxiexzfUjhhgtg(i5));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                Class<CharSequence> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(CharSequence.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1658feyxiexzfUjhhgtg(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : CharSequence.class);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1656Ujhhgtgfeyxiexzf(new C0682Ujhhgtgfeyxiexzf(7, 8, 1));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7384Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7364Ujhhgtgfeyxiexzf)) ? new C1381feyxiexzfUjhhgtg(1, 5) : new C1381feyxiexzfUjhhgtg(0, 4);
                int iIntValue = ((Number) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf).intValue();
                int iIntValue2 = ((Number) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).intValue();
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[iIntValue];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928393019889026442L, strArr5);
                int iIntValue3 = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928393080018568586L, strArr5);
                int iIntValue4 = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf()).intValue();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928392160895567242L, strArr5);
                String str = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928392100766025098L, strArr5);
                String str2 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf();
                if ((iIntValue3 > 0 || iIntValue4 > 0) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, String.valueOf(EnumC2267feyxiexzfUjhhgtg.f7426Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf))) {
                    String sendTalker = new MsgInfoBean.QuoteMsg(str2).getSendTalker();
                    C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(sendTalker, C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg())) {
                        try {
                            c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[iIntValue2];
                            if (c0919feyxiexzfUjhhgtg2 == null) {
                                c0919feyxiexzfUjhhgtg2 = null;
                            }
                        } catch (Throwable th2) {
                            c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                        }
                        Object obj2 = c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0766feyxiexzfUjhhgtg.f3043Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(C0767feyxiexzfUjhhgtg.f3044Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) MagicFactory.get(4928392178075436426L, strArr5));
                        spannableStringBuilder.append((CharSequence) obj2);
                        c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(spannableStringBuilder);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                Object obj3 = c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3;
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg4 = null;
                }
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj3).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.class);
                TextView textView = (TextView) AbstractC1896feyxiexzfUjhhgtg.m3232Ujhhgtgfeyxiexzf((ViewGroup) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4939Ujhhgtgfeyxiexzf(), new int[]{0, 1, 1, 1, 1});
                Field[] declaredFields = c0919feyxiexzfUjhhgtg4.getClass().getDeclaredFields();
                int length = declaredFields.length;
                int i9 = 0;
                boolean z = false;
                Field field = null;
                while (i9 < length) {
                    field = declaredFields[i9];
                    field.setAccessible(true);
                    if (z) {
                        throw new IllegalArgumentException(MagicFactory.get(4928891446548759946L, strArr6));
                    }
                    i9++;
                    z = true;
                }
                if (!z) {
                    throw new NoSuchElementException(MagicFactory.get(4928891657002157450L, strArr6));
                }
                Object obj4 = field.get(c0919feyxiexzfUjhhgtg4);
                int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj4).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3);
                boolean z2 = false;
                Object obj5 = null;
                for (Object obj6 : c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.m4942Ujhhgtgfeyxiexzf()) {
                    String str3 = (String) ((C3438feyxiexzfUjhhgtg) obj6).m4939Ujhhgtgfeyxiexzf();
                    if (str3 != null && str3.length() == 10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= str3.length()) {
                                if (!z2) {
                                    obj5 = obj6;
                                    z2 = true;
                                    break;
                                }
                                throw new IllegalArgumentException(MagicFactory.get(4928890755059025290L, strArr6));
                            }
                            if (!Character.isDigit(str3.charAt(i11))) {
                            }
                            i11++;
                            break;
                        }
                    }
                }
                if (!z2) {
                    throw new NoSuchElementException(MagicFactory.get(4928890944037586314L, strArr6));
                }
                long j = Long.parseLong((String) ((C3438feyxiexzfUjhhgtg) obj5).m4939Ujhhgtgfeyxiexzf()) * ((long) 1000);
                C0972feyxiexzfUjhhgtg.f3860Ujhhgtgfeyxiexzf.getClass();
                int i12 = AbstractC1997feyxiexzfUjhhgtg.f6583Ujhhgtgfeyxiexzf;
                textView.setText(AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(j, C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()) ? MagicFactory.get(4928892868182934922L, strArr6) : Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate().getYear() == LocalDate.now().getYear() ? MagicFactory.get(4928891867455554954L, strArr6) : MagicFactory.get(4928891944764966282L, strArr6), null, 2));
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                JSONObject jSONObject = (JSONObject) (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5);
                if (jSONObject != null) {
                    C0972feyxiexzfUjhhgtg.f3860Ujhhgtgfeyxiexzf.getClass();
                    String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    if (Math.random() > 0.65d) {
                        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928892000599541130L, strArr7), MagicFactory.get(4928891987714639242L, strArr7), MagicFactory.get(4928891974829737354L, strArr7), MagicFactory.get(4928891961944835466L, strArr7));
                        C0805feyxiexzfUjhhgtg c0805feyxiexzfUjhhgtg = AbstractC0804feyxiexzfUjhhgtg.f3192Ujhhgtgfeyxiexzf;
                        jSONObject.put(MagicFactory.get(4928892086498887050L, strArr7), MagicFactory.get(4928892163808298378L, strArr7) + ((String) AbstractC2856feyxiexzfUjhhgtg.m4246feyxiexzfUjhhgtg(listM4192Ujhhgtgfeyxiexzf)) + MagicFactory.get(4928892146628429194L, strArr7));
                    }
                    double d = jSONObject.getInt(MagicFactory.get(4928892112268690826L, strArr7));
                    int i13 = jSONObject.getInt(MagicFactory.get(4928892198168036746L, strArr7));
                    int i14 = jSONObject.getInt(MagicFactory.get(4928892296952284554L, strArr7));
                    double d2 = jSONObject.getInt(MagicFactory.get(4928892266887513482L, strArr7));
                    jSONObject.getInt(MagicFactory.get(4928892361376793994L, strArr7));
                    jSONObject.getJSONArray(MagicFactory.get(4928892331312022922L, strArr7));
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(MagicFactory.get(4928891339174577546L, strArr7));
                    double d3 = 100;
                    sb2.append(d2 / d3);
                    sb2.append('/');
                    sb2.append(d / d3);
                    sb2.append(MagicFactory.get(4928891321994708362L, strArr7));
                    sb.append(sb2.toString());
                    sb.append(MagicFactory.get(4928891309109806474L, strArr7) + i14 + '/' + i13 + '\n');
                    double d4 = (d - d2) / d3;
                    if (d4 > 0.0d) {
                        sb.append(MagicFactory.get(4928891291929937290L, strArr7) + d4 + MagicFactory.get(4928891274750068106L, strArr7));
                    }
                    jSONObject.put(MagicFactory.get(4928891399304119690L, strArr7), sb.toString());
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(11);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928894740788675978L, strArr8));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928891257570198922L, strArr8), MagicFactory.get(4928894573284951434L, strArr8));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(14);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1851Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg5);
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1659feyxiexzfUjhhgtg(MagicFactory.get(4928851142575654282L, strArr9));
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1658feyxiexzfUjhhgtg(clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Boolean.class);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928851348734084490L, strArr9));
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(17);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                int i15 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
                for (C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg : c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf()) {
                    Integer num = (Integer) c3438feyxiexzfUjhhgtg.m4939Ujhhgtgfeyxiexzf();
                    if (num != null && num.intValue() == 32) {
                        c3438feyxiexzfUjhhgtg.m4940Ujhhgtgfeyxiexzf(Integer.MAX_VALUE);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0780feyxiexzfUjhhgtg(18));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928855261449291146L, strArr10), MagicFactory.get(4928855398888244618L, strArr10));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                int i16 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f1481Ujhhgtgfeyxiexzf, (EnumC0283Ujhhgtgfeyxiexzf[]) Arrays.copyOf(new EnumC0283Ujhhgtgfeyxiexzf[]{EnumC0283Ujhhgtgfeyxiexzf.PUBLIC, EnumC0283Ujhhgtgfeyxiexzf.FINAL}, 2));
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls);
                for (C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg2 : c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf()) {
                    Integer num2 = (Integer) c3438feyxiexzfUjhhgtg2.m4939Ujhhgtgfeyxiexzf();
                    if (num2 != null && num2.intValue() == 10) {
                        c3438feyxiexzfUjhhgtg2.m4940Ujhhgtgfeyxiexzf(Integer.MAX_VALUE);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg6 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg6);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928838150299583882L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg6.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1851Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10255Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(23);
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C0780feyxiexzfUjhhgtg(24);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0780feyxiexzfUjhhgtg(27));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0780feyxiexzfUjhhgtg(26));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg6 == null) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                }
                String str4 = (String) (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg6);
                try {
                    Object obj7 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[1];
                    break;
                } catch (Throwable unused) {
                }
                for (InterfaceC0743Ujhhgtgfeyxiexzf interfaceC0743Ujhhgtgfeyxiexzf : C0980feyxiexzfUjhhgtg.f3879Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0743Ujhhgtgfeyxiexzf.mo1745Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf4, str4);
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(MagicFactory.get(4928313142087255434L, strArr11));
                        sb3.append(interfaceC0743Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0743Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928313326770849162L, strArr11));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb3, MagicFactory.get(4928313288116143498L, strArr11), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<Object> cls4 = Object.class;
                Class<Object> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls4));
                if (clsM5159Ujhhgtgfeyxiexzf3 == null) {
                    clsM5159Ujhhgtgfeyxiexzf3 = cls4;
                }
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf4, clsM5159Ujhhgtgfeyxiexzf3, cls3);
                cls3 = clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : String.class;
                Class<Object> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls4));
                c0394Ujhhgtgfeyxiexzf4.m1657Ujhhgtgfeyxiexzf(cls3, clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Object.class);
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928312411942815114L, strArr12), MagicFactory.get(4928312381878044042L, strArr12), MagicFactory.get(4928312502137128330L, strArr12), MagicFactory.get(4928312480662291850L, strArr12));
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928313391195358602L, strArr13), MagicFactory.get(4928313438439998858L, strArr13));
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<ImageView> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ImageView.class));
                Class cls5 = clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : ImageView.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                cls3 = clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : String.class;
                Class<Float> clsM5159Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Float.class));
                Class cls6 = clsM5159Ujhhgtgfeyxiexzf7 != null ? clsM5159Ujhhgtgfeyxiexzf7 : Float.class;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf8 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                c0394Ujhhgtgfeyxiexzf5.m1657Ujhhgtgfeyxiexzf(cls5, cls3, cls6, clsM5159Ujhhgtgfeyxiexzf8 != null ? clsM5159Ujhhgtgfeyxiexzf8 : Boolean.class);
                c0394Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928347037969155466L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf5 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf5.getClass();
                new C2501feyxiexzfUjhhgtg(2, 6, c0578Ujhhgtgfeyxiexzf5).m3786Ujhhgtgfeyxiexzf(Float.valueOf(C0913feyxiexzfUjhhgtg.f3529Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
