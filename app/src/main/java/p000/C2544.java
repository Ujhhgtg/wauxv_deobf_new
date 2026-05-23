package p000;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᛸᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2544 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8100;

    public /* synthetic */ C2544(int i) {
        this.f8100 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        int i = this.f8100;
        int i2 = 12;
        int i3 = 11;
        int i4 = 4;
        Class<String> cls = String.class;
        int i5 = 10;
        int i6 = 2;
        int i7 = 6;
        int i8 = 3;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                ((C1332) obj).m3050(new C2544(4));
                return unit;
            case 1:
                ((C1333) obj).m3052(new C2544(3));
                return unit;
            case 2:
                C1563 c1563 = (C1563) obj;
                String[] strArr = AbstractC1574.f5469;
                
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                String str = (String) (c2585 instanceof C2585 ? null : c2585);
                try {
                    Object obj2 = c1563.m3267()[1];
                    break;
                } catch (Throwable unused) {
                }
                for (InterfaceC1599 interfaceC1599 : C2546.f8103) {
                    try {
                        interfaceC1599.mo3237(c1563, str);
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onGetRepairerConfig ");
                        sb.append(interfaceC1599 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1599).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return unit;
            case 3:
                C1981 c1981 = (C1981) obj;
                Class<Object> cls2 = Object.class;
                Class<Object> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Object.class));
                if (clsM2183 == null) {
                    clsM2183 = Object.class;
                }
                Class<String> clsM4740 = AbstractC2784.m4740(c1981, clsM2183, String.class);
                cls = clsM4740 != null ? clsM4740 : String.class;
                Class<Object> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Object.class));
                c1981.paramTypes(cls, clsM2184 != null ? clsM2184 : Object.class);
                String[] strArr2 = AbstractC1574.f5469;
                c1981.m3827("String", "Int", "Long", "Float");
                return unit;
            case 4:
                String[] strArr3 = AbstractC1574.f5469;
                ((C0705) obj).m2127("RepairerConfigThread", "ValueStrategy_");
                return unit;
            case 5:
                C1981 c1982 = (C1981) obj;
                Class<ImageView> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(ImageView.class));
                Class cls3 = clsM2185 != null ? clsM2185 : ImageView.class;
                Class<String> clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                cls = clsM2186 != null ? clsM2186 : String.class;
                Class<Float> clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(Float.class));
                Class cls4 = clsM2187 != null ? clsM2187 : Float.class;
                Class<Boolean> clsM2188 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                c1982.paramTypes(cls3, cls, cls4, clsM2188 != null ? clsM2188 : Boolean.class);
                c1982.m3827("MicroMsg.AvatarDrawable");
                return unit;
            case 6:
                C1563 c1564 = (C1563) obj;
                
                new C0408(2, 6, c1564).m1608(Float.valueOf(C2602.f8466.m2537()));
                return unit;
            case 7:
                ((C1333) obj).m3052(new C2544(13));
                return unit;
            case 8:
                String str2 = ((C1974) obj).m3801().f3755;
                return Boolean.valueOf((AbstractC2207.m4087(str2, "<clinit>") || AbstractC2207.m4087(str2, "<init>")) ? false : true);
            case 9:
                ((C1333) obj).m3052(new C2544(12));
                return unit;
            case 10:
                return Boolean.valueOf(AbstractC2207.m4087(((C1974) obj).m3801().f3755, "<init>"));
            case 11:
                ((C1333) obj).m3052(new C2544(5));
                return unit;
            case 12 /* 12 */:
                String[] strArr4 = AbstractC1574.f5469;
                ((C1981) obj).m3827("workerScope", "username");
                return unit;
            case 13:
                String[] strArr5 = AbstractC1574.f5469;
                ((C1981) obj).m3827("workerScope", "username");
                return unit;
            case 14 /* 14 */:
                String[] strArr6 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_round_avatar, null, false);
                Slider slider = (Slider) AbstractC3681.m5325(viewM4676, R.id.moduleDialogSliderRoundAvatar);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(R.id.moduleDialogSliderRoundAvatar)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4676;
                C2023 c2023 = new C2023(linearLayout, slider);
                slider.setValue(C2602.f8466.m2537());
                C2007 c2007 = new C2007();
                
                c2007.f6678 = C2603.f8469;
                c2007.f6680 = linearLayout;
                c2007.m3870("保存", new C2042(10, c2023));
                AbstractC2784.m4755(c2007, null, 3);
                return unit;
            case 15:
                ((C1020) obj).thisMethodMatcher = new C2544(11);
                return unit;
            case 16:
                C1020 c1020 = (C1020) obj;
                c1020.thisMethodMatcher = new C2544(9);
                c1020.f3734 = new C2544(10);
                return unit;
            case 17 /* 17 */:
                C1020 c1021 = (C1020) obj;
                c1021.thisMethodMatcher = new C2544(7);
                c1021.f3734 = new C2544(8);
                return unit;
            case 18 /* 18 */:
                C2603 c2603 = C2603.f8467;
                C3689 c3689M4172 = C2309.createHook(c2603, Collections.singletonList((Method) obj));
                c2603.hookBefore(c3689M4172, new C2544(6));
                c3689M4172.applyHook();
                return unit;
            case 19:
                C1563 c1565 = (C1563) obj;
                
                new C0408(2, 6, c1565).m1608(Float.valueOf(C2602.f8466.m2537()));
                return unit;
            case 20:
                C1563 c1566 = (C1563) obj;
                
                new C0408(3, 6, c1566).m1608(Float.valueOf(C2602.f8466.m2537()));
                return unit;
            case 21 /* 21 */:
                ((C1020) obj).thisMethodMatcher = new C2544(22);
                return unit;
            case 22 /* 22 */:
                ((C1333) obj).m3052(new C2544(23));
                return unit;
            case 23 /* 23 */:
                C1981 c1983 = (C1981) obj;
                
                C1984 c1984 = new C1984(4);
                C1981 c1985 = new C1981(4);
                String[] strArr7 = AbstractC1574.f5469;
                c1985.m3827("MicroMsg.ChattingUI.VideoComponent", "send video path: %s, toUser:%s, origin:%b", "ChattingUI_importMultiVideo");
                c1984.m3848(c1985);
                c1983.f6565 = c1984;
                Class<Runnable> clsM2189 = AbstractC0743.m2183(AbstractC2519.classToKClass(Runnable.class));
                Class cls5 = clsM2189 != null ? clsM2189 : Runnable.class;
                Class<String> clsM21810 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                c1983.paramTypes(cls5, clsM21810 != null ? clsM21810 : String.class);
                return unit;
            case 24 /* 24 */:
                String[] strArr8 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_say_hi_remark_name, null, false);
                int i9 = R.id.moduleDialogEdtSayHiRemarkNameTextFormat;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSayHiRemarkNameTextFormat);
                if (textInputEditText != null) {
                    i9 = R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders);
                    if (materialTextView != null) {
                        i9 = R.id.moduleDialogEdtSayHiRemarkNameTimeFormat;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSayHiRemarkNameTimeFormat);
                        if (textInputEditText2 != null) {
                            i9 = R.id.moduleDialogInputSayHiRemarkNameTextFormat;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputSayHiRemarkNameTextFormat)) != null) {
                                i9 = R.id.moduleDialogInputSayHiRemarkNameTimeFormat;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputSayHiRemarkNameTimeFormat)) != null) {
                                    C2022 c2022 = new C2022((LinearLayout) viewM4677, textInputEditText, materialTextView, textInputEditText2);
                                    textInputEditText.setText(C2630.f8519.m2542());
                                    textInputEditText2.setText(C2631.f8520.m2542());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str3 : C2632.f8522) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str3 + ' '));
                                        spannableStringBuilder.setSpan(new C0634(3, str3, c2022), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C2007 c2008 = new C2007();
                                    
                                    c2008.f6678 = C2632.f8524;
                                    c2008.f6680 = c2022.f6774;
                                    c2008.m3870("保存", new C2042(11, c2022));
                                    c2008.m3869("重置", new C2083(10));
                                    C2007.m3866(c2008, null, 3);
                                    c2008.m3868().m3791();
                                    return unit;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i9)));
            case 25 /* 25 */:
                Object objM3268 = ((C1563) obj).m3268();
                if (!(objM3268 instanceof Activity)) {
                    objM3268 = null;
                }
                Activity activity = (Activity) objM3268;
                if (activity == null) {
                    Class<Activity> clsM21811 = AbstractC0743.m2183(AbstractC2519.classToKClass(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM21811 != null ? clsM21811 : Activity.class).getName()).toString());
                }
                Intent intent = activity.getIntent();
                String[] strArr9 = AbstractC1574.f5469;
                String stringExtra = intent.getStringExtra("Contact_Nick");
                Intent intent2 = activity.getIntent();
                String str4 = "Contact_RemarkName";
                
                intent2.putExtra("Contact_RemarkName", AbstractC2849.m4857(AbstractC2849.m4857(C2630.f8519.m2542(), "${nick}", stringExtra), "${time}", AbstractC3681.m5339(System.currentTimeMillis(), C2631.f8520.m2542(), null, 2)));
                return unit;
            case 26:
                ((C1020) obj).declaringClassMatcher = new C2544(27);
                return unit;
            case 27:
                ((C1332) obj).m3050(new C2544(28));
                return unit;
            case 28:
                String[] strArr10 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.SceneVoiceService", "//voicetrymore", "getVoiceService %s");
                return unit;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
