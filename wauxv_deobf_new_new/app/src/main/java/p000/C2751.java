package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᤝᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2751 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8851;

    public /* synthetic */ C2751(int i) {
        this.f8851 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        int i = this.f8851;
        Class<Activity> cls = Activity.class;
        int i2 = 10;
        int i3 = 14;
        int i4 = 16;
        int i5 = 15;
        int i6 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.pluginsdk.model.app");
                C2012 c2012 = new C2012();
                c2012.m4021("checkAppSignature get local signature failed");
                c1335.f4794 = c2012;
                return c3554;
            case 1:
                ((C1574) obj).m3451();
                return c3554;
            case 2:
                Object objM3448 = ((C1574) obj).m3448();
                Activity activity = (Activity) (!(objM3448 instanceof Activity) ? null : objM3448);
                if (activity == null) {
                    Class<Activity> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4232 != null ? clsM4232 : Activity.class).getName()).toString());
                }
                int i7 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(activity).m3560();
                String[] strArr2 = AbstractC1471.f5234;
                c2004M3560.f6475 = "getPreferenceScreen";
                BaseAdapter baseAdapter = (BaseAdapter) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                String stringExtra = activity.getIntent().getStringExtra("Chat_User");
                if (stringExtra == null) {
                    stringExtra = "异常";
                }
                AbstractC2240.m4239(baseAdapter, AbstractC2240.m4254(activity, "WAuxiliary_chatroom_info_pref", "ID: " + stringExtra), 1);
                return c3554;
            case 3:
                C1574 c1574 = (C1574) obj;
                Object objM3449 = c1574.m3448();
                if (!(objM3449 instanceof Activity)) {
                    objM3449 = null;
                }
                Activity activity2 = (Activity) objM3449;
                if (activity2 == null) {
                    Class<Activity> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4233 != null ? clsM4233 : Activity.class).getName()).toString());
                }
                try {
                    c2641 = c1574.m3447()[1];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Object obj2 = c2641 instanceof C2641 ? null : c2641;
                int i8 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                c1300M3558.f4724 = AbstractC2574.m4549(String.class);
                c1300M3558.m3926();
                Iterator it = c1300M3558.m3117().iterator();
                while (it.hasNext()) {
                    String str = (String) ((C1316) it.next()).m3127();
                    if (str != null) {
                        String[] strArr3 = AbstractC1471.f5234;
                        if (str.equals("WAuxiliary_chatroom_info_pref")) {
                            String stringExtra2 = activity2.getIntent().getStringExtra("Chat_User");
                            if (stringExtra2 == null) {
                                stringExtra2 = "异常";
                            }
                            AbstractC2894.m4851(activity2, stringExtra2);
                            AbstractC2894.m4856(activity2, 2, "复制成功");
                            c1574.m3451();
                        }
                    }
                }
                return c3554;
            case 4:
                ((C1023) obj).f3740 = new C2751(5);
                return c3554;
            case 5:
                ((C1335) obj).m3155(new C2751(7));
                return c3554;
            case 6:
                Object objM34410 = ((C1574) obj).m3449();
                if (!(objM34410 instanceof List) || ((objM34410 instanceof InterfaceC1761) && !(objM34410 instanceof InterfaceC1762))) {
                    objM34410 = null;
                }
                List list = (List) objM34410;
                C2933 c2933 = new C2933(new C2096(i3));
                List list2 = C2762.f8881;
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list2, 10));
                int i9 = 0;
                for (Object obj3 : list2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    Constructor constructor = ((C0797) c2933.getValue()).f3164;
                    Object[] objArr = {Integer.valueOf(list.size() + i9), ((C2760) obj3).f8875};
                    Constructor constructor2 = constructor != null ? constructor : null;
                    if (constructor2 != null && !constructor2.isAccessible()) {
                        constructor2.setAccessible(true);
                    }
                    arrayList.add(constructor.newInstance(Arrays.copyOf(objArr, 2)));
                    i9 = i10;
                }
                list.addAll(arrayList);
                return c3554;
            case 7:
                String[] strArr4 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.EmojiResHelper", "parseSmileyPanelConfig parseXML exception:%s");
                return c3554;
            case 8:
                ((C1023) obj).f3740 = new C2751(i2);
                return c3554;
            case 9:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[1];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                String str2 = (String) c2642;
                try {
                    c2643 = c1575.m3447()[3];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                int iIntValue = ((Number) c2643).intValue();
                try {
                    c2644 = c1575.m3447()[4];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                int iIntValue2 = ((Number) c2644).intValue();
                try {
                    c2645 = c1575.m3447()[6];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                Object obj4 = c2645 instanceof C2641 ? null : c2645;
                int i11 = AbstractC1768.f5906;
                C1300 c1300M3559 = AbstractC2727.m4713(obj4).m3558();
                String[] strArr5 = AbstractC1471.f5234;
                c1300M3559.f6475 = "d";
                C1316 c1316 = (C1316) AbstractC0739.m2290(c1300M3559.m3117());
                if (iIntValue == 4 && iIntValue2 == -2005 && ((String) c1316.m3127()).startsWith("https://weixin110.qq.com/")) {
                    new C0383(3, 6, c1575).m1714(0);
                    new C0383(4, 6, c1575).m1714(0);
                    c1316.m3128(str2);
                }
                return c3554;
            case 10:
                C1335 c1336 = (C1335) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.webview.permission");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.LuggageGetA8Key", "WebView-Trace onSceneEnd resp or cb not found(%b/%b), reqUrl: %s, reason: %d");
                c1336.f4794 = c2013;
                return c3554;
            case 11:
                C2041 c2041M4059 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M4059.f6811.setText(C2781.f8942.m2666());
                C2037 c2037 = new C2037();
                C2782.f8943.getClass();
                c2037.f6779 = C2782.f8946;
                c2037.f6781 = c2041M4059.f6810;
                String[] strArr7 = AbstractC1471.f5234;
                c2037.m4057("保存", new C1175(c2041M4059, 2));
                c2037.m4056("重置", new C2096(i5));
                C2037.m4053(c2037, null, 3);
                c2037.m4055().m3985();
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                int i12 = 1;
                C1574 c1576 = (C1574) obj;
                Object objM34411 = c1576.m3448();
                ViewGroup viewGroup = (ViewGroup) (!(objM34411 instanceof ViewGroup) ? null : objM34411);
                if (viewGroup == null) {
                    Class<ViewGroup> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(ViewGroup.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4234 != null ? clsM4234 : ViewGroup.class).getName()).toString());
                }
                viewGroup.setOnLongClickListener(new ViewOnLongClickListenerC0962(c1576, i12));
                return c3554;
            case 13:
                ((C1023) obj).f3739 = new C2751(i3);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1334 c1334 = (C1334) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.plugin.sns.model");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.SnsCore", "do SnsCore preload");
                c1334.f4791 = c0700;
                return c3554;
            case 15:
                ((C1023) obj).f3740 = new C2751(i4);
                return c3554;
            case 16:
                C1335 c1337 = (C1335) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2014 = new C2012();
                c2014.m4015(4);
                c2014.m4021("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                c1337.f4794 = c2014;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr10 = AbstractC1471.f5234;
                ((C2012) obj).m4021("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1335) obj).m3155(new C2751(23));
                return c3554;
            case 19:
                ((C1335) obj).m3155(new C2751(22));
                return c3554;
            case 20:
                C1574 c1577 = (C1574) obj;
                int i13 = AbstractC1768.f5906;
                C1681 c1681M4713 = AbstractC2727.m4713(c1577.m3448());
                try {
                    c2646 = c1577.m3447()[0];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                C1300 c1300M35510 = AbstractC2727.m4713(c2646 instanceof C2641 ? null : c2646).m3558();
                String[] strArr11 = AbstractC1471.f5234;
                c1300M35510.f4724 = "com.tencent.mm.plugin.sns.storage.SnsInfo";
                Object objM3126 = ((C1316) AbstractC2844.m4775(c1300M35510)).m3126();
                C2004 c2004M3561 = c1681M4713.m3560();
                c2004M3561.f6475 = "getPublishTimeText";
                TextView textView = (TextView) ((C2013) AbstractC2844.m4776(c2004M3561)).m4026(new Object[0]);
                C2800.f8975.getClass();
                textView.setText(AbstractC2909.m4918(C2800.m4764(objM3126), "${originalText}", textView.getText().toString()));
                C2004 c2004M3562 = c1681M4713.m3560();
                c2004M3562.f6475 = "getGroupImageStub";
                View view = (View) ((C2013) AbstractC2844.m4776(c2004M3562)).m4026(new Object[0]);
                if (view != null && (view instanceof ImageView)) {
                    ((ImageView) view).setVisibility(C2797.f8972.m2660() ? 8 : 0);
                }
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1335) obj).m3155(new C2751(17));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr12 = AbstractC1471.f5234;
                ((C2012) obj).m4021("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr13 = AbstractC1471.f5234;
                ((C2012) obj).m4021("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr14 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_sns_info, null, false);
                int i14 = R.id.moduleDialogCbSnsInfoHideGroupIcon;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbSnsInfoHideGroupIcon);
                if (materialCheckBox != null) {
                    i14 = R.id.moduleDialogEdtSnsInfoTextFormat;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsInfoTextFormat);
                    if (textInputEditText != null) {
                        i14 = R.id.moduleDialogEdtSnsInfoTextPlaceholders;
                        MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsInfoTextPlaceholders);
                        if (materialTextView != null) {
                            i14 = R.id.moduleDialogEdtSnsInfoTimeFormat;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtSnsInfoTimeFormat);
                            if (textInputEditText2 != null) {
                                i14 = R.id.moduleDialogInputSnsInfoTextFormat;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSnsInfoTextFormat)) != null) {
                                    i14 = R.id.moduleDialogInputSnsInfoTimeFormat;
                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputSnsInfoTimeFormat)) != null) {
                                        C1693 c1693 = new C1693((LinearLayout) viewM4622, materialCheckBox, textInputEditText, materialTextView, textInputEditText2);
                                        textInputEditText.setText(C2798.f8973.m2666());
                                        textInputEditText2.setText(C2799.f8974.m2666());
                                        materialCheckBox.setChecked(C2797.f8972.m2660());
                                        materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                        for (String str3 : C2800.f8976) {
                                            int length = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) (str3 + ' '));
                                            spannableStringBuilder.setSpan(new C0627(c1693, str3, 4), length, spannableStringBuilder.length() + (-1), 33);
                                        }
                                        materialTextView.setText(spannableStringBuilder);
                                        C2037 c2038 = new C2037();
                                        C2800.f8975.getClass();
                                        c2038.f6779 = C2800.f8978;
                                        c2038.f6781 = c1693.f5695;
                                        c2038.m4057("保存", new C2070(c1693, i5));
                                        c2038.m4056("重置", new C2096(i4));
                                        C2037.m4053(c2038, null, 3);
                                        c2038.m4055().m3985();
                                        return c3554;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i14)));
            case Opcodes.ALOAD /* 25 */:
                ((C1023) obj).f3740 = new C2751(21);
                return c3554;
            case 26:
                ((C1023) obj).f3740 = new C2751(19);
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C2751(18);
                return c3554;
            case 28:
                int i15 = AbstractC1768.f5906;
                C1681 c1681M4714 = AbstractC2727.m4713(((C1574) obj).m3448());
                C1300 c1300M35511 = c1681M4714.m3558();
                C2794 c2794 = C2794.f8969;
                c1300M35511.f4724 = AbstractC0972.m2610(c2794).getDeclaringClass();
                Object objInvoke = AbstractC0972.m2610(c2794).invoke(((C1316) AbstractC2844.m4775(c1300M35511)).m3126(), null);
                C2004 c2004M3563 = c1681M4714.m3560();
                String[] strArr15 = AbstractC1471.f5234;
                c2004M3563.f6475 = "getPublishTimeText";
                TextView textView2 = (TextView) ((C2013) AbstractC2844.m4776(c2004M3563)).m4026(new Object[0]);
                C2800.f8975.getClass();
                textView2.setText(AbstractC2909.m4918(C2800.m4764(objInvoke), "${originalText}", textView2.getText().toString()));
                C2004 c2004M3564 = c1681M4714.m3560();
                c2004M3564.f6475 = "getGroupImageStub";
                View view2 = (View) ((C2013) AbstractC2844.m4776(c2004M3564)).m4026(new Object[0]);
                if (view2 != null && (view2 instanceof ImageView)) {
                    ((ImageView) view2).setVisibility(C2797.f8972.m2660() ? 8 : 0);
                }
                return c3554;
            default:
                ((C1023) obj).f3740 = new C2801(i6);
                return c3554;
        }
    }
}
