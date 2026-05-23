package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0605 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2429;

    public /* synthetic */ C0605(int i) {
        this.f2429 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final Object m2026(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        C1563 c1563 = (C1563) obj;
        String[] strArr = AbstractC1574.f5469;
        c1563.getClass();
        try {
            c2585 = c1563.m3267()[0];
            if (c2585 == null) {
                c2585 = null;
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        int i = 0;
        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(c2585).m3490();
        c1299M3490.name = "convertView";
        ViewGroup viewGroup = (ViewGroup) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
        try {
            c2586 = c1563.m3267()[1];
            if (c2586 == null) {
                c2586 = null;
            }
        } catch (Throwable th2) {
            c2586 = new C2585(th2);
        }
        if (c2586 instanceof C2585) {
            c2586 = null;
        }
        try {
            c2587 = c1563.m3267()[3];
            if (c2587 == null) {
                c2587 = null;
            }
        } catch (Throwable th3) {
            c2587 = new C2585(th3);
        }
        MsgInfoBean msgInfoBean = new MsgInfoBean(c2587 instanceof C2585 ? null : c2587);
        for (InterfaceC1577 interfaceC1577 : C0644.f2493) {
            try {
                interfaceC1577.mo3335(c2585, viewGroup, c2586, msgInfoBean);
            } catch (Exception e) {
                ArrayList arrayList = C3678.f11549;
                StringBuilder sb = new StringBuilder();
                sb.append("onBindViewHolder ");
                sb.append(interfaceC1577 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1577).mo1128() : "LoadHook");
                AbstractC1194.m2792(sb, " Failed", e, 12);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final Object m2027(Object obj) {
        ((C1333) obj).m3052(new C0645(0));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3, types: [android.widget.TextView, com.google.android.material.textview.MaterialTextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.widget.ListView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᲈᤝᲀ] */
    /* JADX WARN: Type inference failed for: r4v105, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᤝᲀᲁ] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r6v76, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᲈᲀᤝ] */
    /* JADX WARN: Type inference failed for: r8v17, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᲈᲀᤝ] */
    /* JADX WARN: Type inference failed for: r8v32, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᤝᲁᲀ] */
    /* JADX WARN: Type inference failed for: r8v40, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᤝᲁᲀ] */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zM4087;
        byte b;
        boolean zIsAssignableFrom;
        Object c2585;
        Object c2586;
        Object c2587;
        Object objM3831;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        Object c25812;
        Object c25813;
        int i = this.f2429;
        int i2 = 8;
        int i3 = 19;
        int i4 = 18;
        Class<View> cls = View.class;
        int i5 = 5;
        int i6 = 1;
        Object obj2 = null;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                Object obj3 = ((List) obj).get(0);
                C2060.f6855.getClass();
                zM4087 = AbstractC2207.m4087(obj3, AbstractC1574.dexToClass(C2059.f6854));
                break;
            case 1:
                Object objM3268 = ((C1563) obj).m3268();
                FrameLayout frameLayout = (FrameLayout) (!(objM3268 instanceof FrameLayout) ? null : objM3268);
                if (frameLayout == null) {
                    Class<FrameLayout> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(FrameLayout.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2183 != null ? clsM2183 : FrameLayout.class).getName()).toString());
                }
                for (?? r2 : C0608.f2433) {
                    try {
                        ((C0663) r2).m2061(frameLayout);
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = AbstractC1574.f5469;
                        sb.append("onInit ");
                        sb.append(r2 instanceof AbstractC2867 ? ((AbstractC2867) r2).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return unit;
            case 2:
                String[] strArr2 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_chat_group_tab, null, false);
                int i7 = R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor);
                if (textInputEditText != null) {
                    i7 = R.id.moduleDialogEdtChatGroupTabIndicatorLightColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabIndicatorLightColor);
                    if (textInputEditText2 != null) {
                        i7 = R.id.moduleDialogEdtChatGroupTabNormalDarkColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabNormalDarkColor);
                        if (textInputEditText3 != null) {
                            i7 = R.id.moduleDialogEdtChatGroupTabNormalLightColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabNormalLightColor);
                            if (textInputEditText4 != null) {
                                i7 = R.id.moduleDialogEdtChatGroupTabSelectedDarkColor;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabSelectedDarkColor);
                                if (textInputEditText5 != null) {
                                    i7 = R.id.moduleDialogEdtChatGroupTabSelectedLightColor;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabSelectedLightColor);
                                    if (textInputEditText6 != null) {
                                        i7 = R.id.moduleDialogEdtChatGroupTabTabDarkColor;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabTabDarkColor);
                                        if (textInputEditText7 != null) {
                                            i7 = R.id.moduleDialogEdtChatGroupTabTabLightColor;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtChatGroupTabTabLightColor);
                                            if (textInputEditText8 != null) {
                                                i7 = R.id.moduleDialogInputChatGroupTabIndicatorDarkColor;
                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabIndicatorDarkColor)) != null) {
                                                    i7 = R.id.moduleDialogInputChatGroupTabIndicatorLightColor;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabIndicatorLightColor)) != null) {
                                                        i7 = R.id.moduleDialogInputChatGroupTabNormalDarkColor;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabNormalDarkColor)) != null) {
                                                            i7 = R.id.moduleDialogInputChatGroupTabNormalLightColor;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabNormalLightColor)) != null) {
                                                                i7 = R.id.moduleDialogInputChatGroupTabSelectedDarkColor;
                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabSelectedDarkColor)) != null) {
                                                                    i7 = R.id.moduleDialogInputChatGroupTabSelectedLightColor;
                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabSelectedLightColor)) != null) {
                                                                        i7 = R.id.moduleDialogInputChatGroupTabTabDarkColor;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabTabDarkColor)) != null) {
                                                                            i7 = R.id.moduleDialogInputChatGroupTabTabLightColor;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputChatGroupTabTabLightColor)) != null) {
                                                                                LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                                                C2015 c2015 = new C2015(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8);
                                                                                textInputEditText8.setText(C0620.f2449.m2542());
                                                                                textInputEditText2.setText(C0613.f2442.m2542());
                                                                                textInputEditText4.setText(C0615.f2444.m2542());
                                                                                textInputEditText6.setText(C0617.f2446.m2542());
                                                                                textInputEditText7.setText(C0619.f2448.m2542());
                                                                                textInputEditText.setText(C0612.f2441.m2542());
                                                                                textInputEditText3.setText(C0614.f2443.m2542());
                                                                                textInputEditText5.setText(C0616.f2445.m2542());
                                                                                C2007 c2007 = new C2007();
                                                                                C0622.f2452.getClass();
                                                                                c2007.f6678 = C0622.f2454;
                                                                                c2007.f6680 = linearLayout;
                                                                                c2007.m3870("保存", new C0106(8, c2015));
                                                                                c2007.m3869("重置", new C0104(18));
                                                                                C2007.m3866(c2007, null, 3);
                                                                                c2007.m3868().m3791();
                                                                                return unit;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i7)));
            case 3:
                ((C1020) obj).thisMethodMatcher = new C0605(5);
                return unit;
            case 4:
                C1563 c1563 = (C1563) obj;
                int i8 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738(c1563);
                String[] strArr3 = AbstractC1574.f5469;
                c1299M4738.fieldType = "com.tencent.mm.ui.conversation.ConversationListView";
                ?? r3 = (ListView) ((C1315) AbstractC0744.firstInList(c1299M4738.resolve())).m3024();
                C1299 c1299M4739 = AbstractC2784.m4738(c1563);
                AbstractC0750.m2218(c1299M4739.f6373, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.FINAL}, 1));
                Object obj4 = null;
                ?? r4 = false;
                for (Object obj5 : c1299M4739.resolve()) {
                    Object objM3023 = ((C1315) obj5).m3023();
                    if (objM3023 == null) {
                        zIsAssignableFrom = false;
                    } else {
                        C0707 c0707M4527 = AbstractC2519.classToKClass(objM3023.getClass());
                        C0707 c0707M4528 = AbstractC2519.classToKClass(BaseAdapter.class);
                        ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
                        zIsAssignableFrom = c0707M4528.mo2114().isAssignableFrom(c0707M4527.mo2114());
                    }
                    if (zIsAssignableFrom) {
                        if (r4 == true) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj4 = obj5;
                        r4 = true;
                    }
                }
                if (r4 != true) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                BaseAdapter baseAdapter = (BaseAdapter) ((C1315) obj4).m3024();
                final C2891 c2891 = new C2891(AbstractC1128.m2700(AbstractC2207.m4086(r3.getContext())), null, R.attr.tabStyle);
                c2891.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                c2891.setTabMode(2);
                c2891.setTabGravity(1);
                c2891.setTabRippleColor(AbstractC1460.m3212(0));
                c2891.setInlineLabel(true);
                if (AbstractC3681.m5331(c2891.getContext())) {
                    c2891.setBackgroundColor(Color.parseColor(C0619.f2448.m2542()));
                    c2891.setSelectedTabIndicatorColor(Color.parseColor(C0612.f2441.m2542()));
                    c2891.setTabTextColors(C2891.m4888(Color.parseColor(C0614.f2443.m2542()), Color.parseColor(C0616.f2445.m2542())));
                } else {
                    c2891.setBackgroundColor(Color.parseColor(C0620.f2449.m2542()));
                    c2891.setSelectedTabIndicatorColor(Color.parseColor(C0613.f2442.m2542()));
                    c2891.setTabTextColors(C2891.m4888(Color.parseColor(C0615.f2444.m2542()), Color.parseColor(C0617.f2446.m2542())));
                }
                C0621 c0621 = new C0621(baseAdapter, r3);
                ArrayList arrayList2 = c2891.f9303;
                if (!arrayList2.contains(c0621)) {
                    arrayList2.add(c0621);
                }
                C1486.f5275.getClass();
                final int i9 = 0;
                for (Object obj6 : C1486.m3243()) {
                    int i10 = 1;
                    if (false) {
                        ?? r16 = obj2;
                        AbstractC0745.m2213();
                        throw r16;
                    }
                    final C1484 c1484 = (C1484) obj6;
                    C2888 c2888M4894 = c2891.m4894();
                    String str = c1484.f5261;
                    Object obj7 = obj2;
                    if (TextUtils.isEmpty(c2888M4894.f9246) && !TextUtils.isEmpty(str)) {
                        c2888M4894.f9250.setContentDescription(str);
                    }
                    c2888M4894.f9245 = str;
                    C2890 c2890 = c2888M4894.f9250;
                    if (c2890 != null) {
                        c2890.m4884();
                    }
                    ArrayList arrayList3 = c2891.f9267;
                    boolean zIsEmpty = arrayList3.isEmpty();
                    int i11 = 1;
                    int size = arrayList3.size();
                    if (c2888M4894.f9249 != c2891) {
                        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                    }
                    c2888M4894.f9247 = size;
                    arrayList3.add(size, c2888M4894);
                    int size2 = arrayList3.size();
                    int i12 = -1;
                    for (int i13 = size + 1; i13 < size2; i13++) {
                        if (((C2888) arrayList3.get(i13)).f9247 == c2891.f9266) {
                            i12 = i13;
                        }
                        ((C2888) arrayList3.get(i13)).f9247 = i13;
                    }
                    c2891.f9266 = i12;
                    C2890 c2892 = c2888M4894.f9250;
                    c2892.setSelected(false);
                    c2892.setActivated(false);
                    int i14 = c2888M4894.f9247;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    if (c2891.f9294 == 1 && c2891.f9291 == 0) {
                        layoutParams.width = 0;
                        layoutParams.weight = 1.0f;
                        b = -2;
                    } else {
                        b = -2;
                        layoutParams.width = -2;
                        layoutParams.weight = 0.0f;
                    }
                    c2891.f9269.addView(c2892, i14, layoutParams);
                    if (zIsEmpty) {
                        C2891 c2893 = c2888M4894.f9249;
                        if (c2893 == null) {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                        c2893.m4896(c2888M4894);
                    }
                    C0622 c0622 = C0622.f2452;
                    final C0299 c0299 = new C0299(baseAdapter, 1, r3);
                    c0622.getClass();
                    if (AbstractC2849.m4855(c1484.f5259, EnumC1485.f5270.f5273)) {
                        c2891.post(new Runnable() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᲈᤝᲀ
                            @Override // java.lang.Runnable
                            public final void run() {
                                View childAt;
                                View childAt2 = c2891.getChildAt(0);
                                ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
                                if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
                                    return;
                                }
                                final C1484 c1485 = c1484;
                                final C0299 c02910 = c0299;
                                childAt.setOnLongClickListener(new View.OnLongClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᲈᲀᤝ
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        C0106 c0106 = new C0106(7, c02910);
                                        C1484 c1486 = c1485;
                                        if (!AbstractC2849.m4855(c1486.f5259, EnumC1485.f5270.f5273)) {
                                            return true;
                                        }
                                        AbstractC1458.m3166(C1503.f5312, new C1514(c1486, 2, c0106));
                                        return true;
                                    }
                                });
                            }
                        });
                    }
                    i6 = 1;
                    0 = 1;
                    obj2 = obj7;
                }
                r3.addHeaderView(c2891);
                return unit;
            case 5:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                String[] strArr4 = AbstractC1574.f5469;
                C1981.m3818(c1981M4739, "com.tencent.mm.ui.conversation.MainUI");
                c1981M4739.m3827("MicroMsg.MainUI", "onTabCreate, %d");
                c1333.f4794 = c1981M4739;
                return unit;
            case 6:
                C0636 c0636 = C0636.f2474;
                String[] strArr5 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_chat_input_hint, null, false);
                int i15 = R.id.moduleDialogCbChatInputHintHandleSendCount;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4677, R.id.moduleDialogCbChatInputHintHandleSendCount);
                if (materialCheckBox != null) {
                    i15 = R.id.moduleDialogEdtChatInputHintTip;
                    TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtChatInputHintTip);
                    if (textInputEditText9 != null) {
                        i15 = R.id.moduleDialogInputChatInputHintTip;
                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputChatInputHintTip)) != null) {
                            i15 = R.id.moduleDialogTvChatInputHintPreview;
                            MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogTvChatInputHintPreview);
                            if (materialTextView != null) {
                                i15 = R.id.moduleDialogTvChatInputHintTextPlaceholders;
                                ?? r20 = (MaterialTextView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogTvChatInputHintTextPlaceholders);
                                if (r20 != null) {
                                    C2103 c2103 = new C2103((LinearLayout) viewM4677, materialCheckBox, textInputEditText9, materialTextView, (Object) r20);
                                    C0628 c0628 = C0628.f2463;
                                    String strM2542 = c0628.m2542();
                                    c0636.getClass();
                                    materialTextView.setText(C0636.m2038(strM2542));
                                    textInputEditText9.setText(c0628.m2542());
                                    textInputEditText9.addTextChangedListener(new C0635(0, c2103));
                                    materialCheckBox.setChecked(C0627.f2462.m2536());
                                    r20.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str2 : C0636.f2475) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str2 + ' '));
                                        spannableStringBuilder.setSpan(new C0634(0, str2, c2103), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    r20.setText(spannableStringBuilder);
                                    C2007 c2008 = new C2007();
                                    c2008.f6678 = C0636.f2477;
                                    c2008.f6680 = (LinearLayout) c2103.f6935;
                                    c2008.m3870("保存", new C0106(9, c2103));
                                    c2008.m3869("重置", new C0104(19));
                                    C2007.m3866(c2008, null, 3);
                                    c2008.m3868().m3791();
                                    return unit;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i15)));
            case 7:
                ((C1020) obj).thisMethodMatcher = new C0605(8);
                return unit;
            case 8:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                c1981M47310.m3820(C0607.f2431.m2028());
                String[] strArr6 = AbstractC1574.f5469;
                c1981M47310.m3827("MicroMsg.ChatFooter", "canSend true ! sendBtn is visible");
                c1334.f4794 = c1981M47310;
                return unit;
            case 9:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2585 = c1564.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Boolean bool = (Boolean) (c2585 instanceof C2585 ? null : c2585);
                if (!(bool != null ? bool.booleanValue() : false)) {
                    int i16 = 0;
                    MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(c1564.m3268()).m3492();
                    c1973M3492.name = "setHint";
                    C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
                    C0636 c0637 = C0636.f2474;
                    String strM2543 = C0628.f2463.m2542();
                    c0637.getClass();
                    c1982.m3831(C0636.m2038(strM2543));
                }
                return unit;
            case 10:
                ((C1020) obj).thisMethodMatcher = new C0605(15);
                return unit;
            case 11:
                ((C1020) obj).thisMethodMatcher = new C0605(14);
                return unit;
            case 12 /* 12 */:
                C1563 c1565 = (C1563) obj;
                c1565.getClass();
                try {
                    c2586 = c1565.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                Object obj8 = c2586 instanceof C2585 ? null : c2586;
                int i17 = 0;
                C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj8).m3490();
                c1299M3490.fieldType = AbstractC2519.classToKClass(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3024());
                C2873 c2873 = new C2873(new C0637(0, obj8));
                try {
                    c2587 = c1565.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                Object tag = ((View) (c2587 instanceof C2585 ? null : c2587)).getTag();
                MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(tag).m3492();
                c1973M3493.returnType = AbstractC2519.classToKClass(Integer.TYPE);
                c1973M3493.m2887();
                c1973M3493.superclass();
                Integer num = (Integer) ((C1982) AbstractC0744.firstInList(c1973M3493.resolve())).invoke(new Object[0]);
                if (AbstractC3471.m5079(WeChatVersions.f11545) || AbstractC3471.m5080(WeChatVersionsPlay.f11511)) {
                    MethodResolver c1973M3494 = AbstractC0968.startMethodResolution_(tag).m3492();
                    C2060.f6855.getClass();
                    c1973M3494.returnType = AbstractC1574.dexToClass(C2059.f6854);
                    c1973M3494.f4485 = 0;
                    objM3831 = ((C1982) AbstractC2784.m4742(c1973M3494)).m3831(new Object[0]);
                } else {
                    C1299 c1299M3491 = AbstractC0968.startMethodResolution_(tag).m3490();
                    C2060.f6855.getClass();
                    c1299M3491.fieldType = AbstractC1574.dexToClass(C2059.f6854);
                    objM3831 = ((C1315) AbstractC2784.m4741(c1299M3491)).m3023();
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(objM3831);
                for (?? r8 : C0641.f2489) {
                    try {
                        for (C0638 c0638 : r8.mo2764(msgInfoBean)) {
                            C1982 c1982M3830 = ((C1982) c2873.getValue()).m3830();
                            c1982M3830.m3378(obj8);
                            c1982M3830.m3831(num, Integer.valueOf(c0638.f2482), 0, c0638.f2483, Integer.valueOf(c0638.f2484));
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList4 = C3678.f11549;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr7 = AbstractC1574.f5469;
                        sb2.append("onCreateMenuItems ");
                        sb2.append(r8 instanceof AbstractC2867 ? ((AbstractC2867) r8).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb2, " Failed", e2, 12);
                    }
                }
                return unit;
            case 13:
                C1563 c1566 = (C1563) obj;
                String[] strArr8 = AbstractC1574.f5469;
                int i18 = 0;
                C1299 c1299M47310 = AbstractC2784.m4738(c1566);
                c1299M47310.f4726 = new C0605(16);
                C1299 c1299M3492 = AbstractC0968.startMethodResolution_((View.OnLongClickListener) ((C1315) AbstractC0744.firstInList(c1299M47310.resolve())).m3024()).m3490();
                C0676.f2559.getClass();
                C0675 c0675 = C0675.f2558;
                c1299M3492.fieldType = AbstractC1574.dexToClass(c0675);
                Object objM3024 = ((C1315) AbstractC2784.m4741(c1299M3492)).m3023();
                C1299 c1299M3493 = AbstractC0968.startMethodResolution_(objM3024).m3490();
                C0204.f1288.getClass();
                C0203 c0203 = C0203.f1287;
                c1299M3493.fieldType = AbstractC1574.dexToMethod(c0203).getDeclaringClass();
                Object objM3025 = ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).m3023();
                C0683.f2566.getClass();
                C1299 c1299M3494 = AbstractC0968.startMethodResolution_(AbstractC1574.dexToMethod(c0203).invoke(objM3025, (Class) AbstractC0270.m1385(AbstractC1574.dexToClass(C0682.f2565).getInterfaces()))).m3490();
                c1299M3494.fieldType = AbstractC1574.dexToClass(c0675);
                C1299 c1299M3495 = AbstractC0968.startMethodResolution_(((C1315) AbstractC2784.m4741(c1299M3494)).m3023()).m3490();
                c1299M3495.fieldType = AbstractC1574.dexToMethod(c0203).getDeclaringClass();
                Object objM3026 = ((C1315) AbstractC0744.firstInList(c1299M3495.resolve())).m3023();
                C0678.f2561.getClass();
                Object objInvoke = AbstractC1574.dexToMethod(c0203).invoke(objM3026, (Class) AbstractC0270.m1385(AbstractC1574.dexToClass(C0677.f2560).getInterfaces()));
                try {
                    c2588 = c1566.m3267()[0];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                MenuItem menuItem = (MenuItem) (c2588 instanceof C2585 ? null : c2588);
                MethodResolver c1973M3495 = AbstractC0968.startMethodResolution_(objInvoke).m3492();
                c1973M3495.name = "getItem";
                MsgInfoBean msgInfoBean2 = new MsgInfoBean(((C1982) AbstractC0744.firstInList(c1973M3495.resolve())).m3831(Integer.valueOf(menuItem.getGroupId())));
                for (?? r6 : C0641.f2489) {
                    try {
                        for (C0638 c0639 : r6.mo2764(msgInfoBean2)) {
                            if (menuItem.getItemId() == c0639.f2482) {
                                c0639.f2485.mo1196(objM3024, msgInfoBean2);
                            }
                        }
                    } catch (Exception e3) {
                        ArrayList arrayList5 = C3678.f11549;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onCreateMenuItems ");
                        sb3.append(r6 instanceof AbstractC2867 ? ((AbstractC2867) r6).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb3, " Failed", e3, 12);
                    }
                }
                return unit;
            case 14 /* 14 */:
                C1333 c1335 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.ui.chatting.viewitems");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.ChattingItem", "context item select failed, null dataTag");
                c1335.f4794 = c1981;
                return unit;
            case 15:
                C1333 c1336 = (C1333) obj;
                String[] strArr10 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.ui.chatting.viewitems");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.ChattingItem", "msg is null!");
                c1336.f4794 = c1983;
                return unit;
            case 16:
                C0707 c0707M4529 = AbstractC2519.classToKClass(View.OnLongClickListener.class);
                ConcurrentHashMap concurrentHashMap2 = AbstractC0710.f2698;
                zM4087 = c0707M4529.mo2114().isAssignableFrom((Class) obj);
                break;
            case 17 /* 17 */:
                C1317 c1317 = (C1317) obj;
                C0605 c0605 = new C0605(18);
                c1317.getClass();
                C1303 c1303 = new C1303(4);
                c0605.invoke(c1303);
                List arrayList6 = c1317.f4763;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                c1317.f4763 = arrayList6;
                arrayList6.add(c1303);
                C0605 c0606 = new C0605(19);
                C1303 c1304 = new C1303(4);
                c0606.invoke(c1304);
                List arrayList7 = c1317.f4763;
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                c1317.f4763 = arrayList7;
                arrayList7.add(c1304);
                return unit;
            case 18 /* 18 */:
                C1303 c1305 = (C1303) obj;
                String str3 = "convertView";
                c1305.getClass();
                c1305.f4735 = new C2837("convertView", 5, false);
                return unit;
            case 19:
                C1303 c1306 = (C1303) obj;
                String str4 = "avatarIV";
                c1306.getClass();
                c1306.f4735 = new C2837("avatarIV", 5, false);
                return unit;
            case 20:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C0605(25);
                c1020.thisMethodMatcher = new C0605(26);
                return unit;
            case 21 /* 21 */:
                ((C1020) obj).thisMethodMatcher = new C0605(23);
                return unit;
            case 22 /* 22 */:
                C1563 c1567 = (C1563) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1567.getClass();
                try {
                    c2589 = c1567.m3267()[0];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                ViewGroup viewGroup = (ViewGroup) (c2589 instanceof C2585 ? null : c2589);
                for (?? r5 : C0644.f2493) {
                    try {
                        r5.mo3334(viewGroup);
                    } catch (Exception e4) {
                        ArrayList arrayList8 = C3678.f11549;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onCreateViewHolder ");
                        sb4.append(r5 instanceof AbstractC2867 ? ((AbstractC2867) r5).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb4, " Failed", e4, 12);
                    }
                }
                return unit;
            case 23 /* 23 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.ui.chatting.viewitems");
                C1981 c1984 = new C1981(4);
                c1984.m3827("MicroMsg.ChattingItem", "attachAvatarClickListener: getBizKfWorker:%s");
                c1337.f4794 = c1984;
                return unit;
            case 24 /* 24 */:
                return m2026(obj);
            case 25 /* 25 */:
                C1332 c1332 = (C1332) obj;
                c1332.m3051("com.tencent.mm.ui.chatting.viewitems");
                C0705 c0705 = new C0705(4);
                c0705.m2125(new C0605(17));
                c1332.f4791 = c0705;
                return unit;
            case 26:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1338);
                c1981M47311.m3826("create");
                Class<View> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(View.class));
                c1981M47311.paramTypes(clsM2184 != null ? clsM2184 : View.class);
                c1338.f4794 = c1981M47311;
                return unit;
            case 27:
                ((C1020) obj).thisMethodMatcher = new C0605(28);
                return unit;
            case 28:
                return m2027(obj);
            default:
                C1563 c1568 = (C1563) obj;
                LinkedHashSet<??> linkedHashSet = C0647.f2497;
                String[] strArr13 = AbstractC1574.f5469;
                if (AbstractC3471.m5079(WeChatVersions.f11530) || AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
                    c1568.getClass();
                    try {
                        c25810 = c1568.m3267()[0];
                        if (c25810 == null) {
                            c25810 = null;
                        }
                    } catch (Throwable th6) {
                        c25810 = new C2585(th6);
                    }
                    Object obj9 = c25810 instanceof C2585 ? null : c25810;
                    try {
                        c25811 = c1568.m3267()[2];
                        if (c25811 == null) {
                            c25811 = null;
                        }
                    } catch (Throwable th7) {
                        c25811 = new C2585(th7);
                    }
                    Integer num2 = (Integer) (c25811 instanceof C2585 ? null : c25811);
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    int i19 = 0;
                    C1299 c1299M3496 = AbstractC0968.startMethodResolution_(obj9).m3490();
                    c1299M3496.fieldType = AbstractC2519.classToKClass(View.class);
                    View view = (View) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024();
                    Object tag2 = view.getTag();
                    C1299 c1299M47311 = AbstractC2784.m4738(c1568);
                    C0676.f2559.getClass();
                    c1299M47311.fieldType = AbstractC1574.dexToClass(C0675.f2558);
                    Object objM3027 = ((C1315) AbstractC0744.firstInList(c1299M47311.resolve())).m3023();
                    C1299 c1299M47312 = AbstractC2784.m4738(c1568);
                    C0678.f2561.getClass();
                    c1299M47312.fieldType = AbstractC1574.dexToClass(C0677.f2560);
                    MethodResolver c1973M3496 = AbstractC0968.startMethodResolution_(((C1315) AbstractC0744.firstInList(c1299M47312.resolve())).m3023()).m3492();
                    c1973M3496.name = "getItem";
                    MsgInfoBean msgInfoBean3 = new MsgInfoBean(((C1982) AbstractC0744.firstInList(c1973M3496.resolve())).m3831(Integer.valueOf(iIntValue)));
                    for (?? r9 : linkedHashSet) {
                        try {
                            r9.mo1408(view, tag2, objM3027, msgInfoBean3);
                        } catch (Exception e5) {
                            ArrayList arrayList9 = C3678.f11549;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("onBindView ");
                            sb5.append(r9 instanceof AbstractC2867 ? ((AbstractC2867) r9).mo1128() : "LoadHook");
                            AbstractC1194.m2792(sb5, " Failed", e5, 12);
                        }
                    }
                } else {
                    c1568.getClass();
                    try {
                        c25812 = c1568.m3267()[0];
                        if (c25812 == null) {
                            c25812 = null;
                        }
                    } catch (Throwable th8) {
                        c25812 = new C2585(th8);
                    }
                    Object obj10 = c25812 instanceof C2585 ? null : c25812;
                    try {
                        c25813 = c1568.m3267()[1];
                        if (c25813 == null) {
                            c25813 = null;
                        }
                    } catch (Throwable th9) {
                        c25813 = new C2585(th9);
                    }
                    Integer num3 = (Integer) (c25813 instanceof C2585 ? null : c25813);
                    int iIntValue2 = num3 != null ? num3.intValue() : 0;
                    int i20 = 0;
                    C1299 c1299M3497 = AbstractC0968.startMethodResolution_(obj10).m3490();
                    c1299M3497.fieldType = AbstractC2519.classToKClass(View.class);
                    View view2 = (View) ((C1315) AbstractC2784.m4741(c1299M3497)).m3024();
                    Object tag3 = view2.getTag();
                    C1299 c1299M47313 = AbstractC2784.m4738(c1568);
                    C0676.f2559.getClass();
                    c1299M47313.fieldType = AbstractC1574.dexToClass(C0675.f2558);
                    Object objM3028 = ((C1315) AbstractC0744.firstInList(c1299M47313.resolve())).m3023();
                    MethodResolver c1973M3497 = AbstractC0968.startMethodResolution_(c1568.m3268()).m3492();
                    c1973M3497.name = "getItem";
                    MsgInfoBean msgInfoBean4 = new MsgInfoBean(((C1982) AbstractC0744.firstInList(c1973M3497.resolve())).m3831(Integer.valueOf(iIntValue2)));
                    for (?? r10 : linkedHashSet) {
                        try {
                            r10.mo1408(view2, tag3, objM3028, msgInfoBean4);
                        } catch (Exception e6) {
                            ArrayList arrayList10 = C3678.f11549;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("onBindView ");
                            sb6.append(r10 instanceof AbstractC2867 ? ((AbstractC2867) r10).mo1128() : "LoadHook");
                            AbstractC1194.m2792(sb6, " Failed", e6, 12);
                        }
                    }
                }
                return unit;
        }
        return Boolean.valueOf(zM4087);
    }
}
