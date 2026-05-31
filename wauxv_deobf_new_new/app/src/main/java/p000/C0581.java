package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲈᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0581 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2382;

    public /* synthetic */ C0581(int i) {
        this.f2382 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2641;
        Object obj2;
        Object c2642;
        Object obj3;
        boolean zM3322;
        C0601 c0601;
        C0601 c0602;
        C0601 c0603;
        boolean zIsAssignableFrom;
        Object c2643;
        Object c2644;
        Object c2645;
        Object objM4025;
        Object c2646;
        int i = this.f2382;
        int i2 = 18;
        int i3 = 10;
        int i4 = 28;
        int i5 = 2;
        boolean zBooleanValue = true;
        C0601 c0604 = null;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                Object objM3448 = ((C1574) obj).m3448();
                Activity activity = (Activity) (!(objM3448 instanceof Activity) ? null : objM3448);
                if (activity == null) {
                    Class<Activity> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4232 != null ? clsM4232 : Activity.class).getName()).toString());
                }
                Intent intent = activity.getIntent();
                String[] strArr = AbstractC1471.f5234;
                intent.putExtra("key_fav_item_id", "");
                return c3554;
            case 1:
                C0585 c0585 = C0585.f2388;
                C3752 c3752M4301 = C2342.m4301(c0585, Collections.singletonList((Method) obj));
                c0585.m3444(c3752M4301, new C0581(5));
                c3752M4301.m5360();
                return c3554;
            case 2:
                C0585 c0586 = C0585.f2388;
                C3752 c3752M4302 = C2342.m4301(c0586, Collections.singletonList((Method) obj));
                c0586.m3444(c3752M4302, new C0581(6));
                c3752M4302.m5360();
                return c3554;
            case 3:
                ((C1335) obj).m3155(new C0316(i4));
                return c3554;
            case 4:
                C1335 c1335 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.fav.ui");
                C2012 c2012 = new C2012();
                c2012.m4020("onItemClick");
                c2012.m4021("onItemClick", (AbstractC0972.m2596(EnumC3737.f11676) || AbstractC0972.m2597(EnumC3734.f11644)) ? "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$initOnItemClickListener$1" : "com/tencent/mm/plugin/fav/ui/FavSearchUI$10");
                c1335.f4794 = c2012;
                return c3554;
            case 5:
                ((C1574) obj).m3450();
                return c3554;
            case 6:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[1];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                View view = (View) c2641;
                Object tag = view.getTag();
                int i6 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(tag).m3558();
                String[] strArr3 = AbstractC1471.f5234;
                c1300M3558.f6475 = "a";
                Object objM3126 = ((C1316) AbstractC2844.m4775(c1300M3558)).m3126();
                C1300 c1300M4772 = AbstractC2844.m4772(c1574);
                c1300M4772.f6475 = "d";
                Object objM3127 = ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3126();
                if (AbstractC0972.m2596(EnumC3737.f11676) || AbstractC0972.m2597(EnumC3734.f11644)) {
                    C1300 c1300M3559 = AbstractC2727.m4713(objM3127).m3558();
                    c1300M3559.f6475 = "w";
                    zBooleanValue = ((Boolean) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).booleanValue();
                } else {
                    C1300 c1300M35510 = AbstractC2727.m4713(objM3127).m3558();
                    c1300M35510.f6475 = "d";
                    if (((Number) ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3127()).intValue() != 1) {
                        zBooleanValue = false;
                    }
                }
                if (zBooleanValue) {
                    C1300 c1300M35511 = AbstractC2727.m4713(objM3126).m3558();
                    c1300M35511.f6475 = "field_type";
                    if (((Number) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127()).intValue() == 3) {
                        C1300 c1300M35512 = AbstractC2727.m4713(objM3126).m3558();
                        c1300M35512.f6475 = "field_favProto";
                        C2004 c2004M3560 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M35512)).m3126()).m3560();
                        c2004M3560.f6475 = "getData";
                        byte[] bArr = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                        C2480 c2480 = C2480.f7862;
                        c2480.getClass();
                        final C1285 c1285 = ((C1286) c2480.m4408(C1286.Companion.serializer(), bArr)).f4695;
                        final String string = c1285.f4693;
                        String str = c1285.f4692;
                        if (string == null) {
                            String strM4702 = AbstractC2727.m4702();
                            String strValueOf = String.valueOf(str.hashCode() & 255);
                            StringBuilder sbM4787 = AbstractC2844.m4787(strM4702);
                            sbM4787.append("/favorite/");
                            sbM4787.append(strValueOf);
                            sbM4787.append('/');
                            sbM4787.append(str);
                            sbM4787.append('.');
                            sbM4787.append(c1285.f4689);
                            string = sbM4787.toString();
                        }
                        if (new File(string).exists()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                            builder.setTitle("提示");
                            builder.setMessage("是否发送收藏语音");
                            String str2 = "发送";
                            final Object[] objArr = null == true ? 1 : 0;
                            builder.setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᤞᲁᲈ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i7) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
                                    switch (objArr) {
                                        case 0:
                                            C2952.f9477.getClass();
                                            C2199.m4148(c1285.f4688, C2952.f9478, string);
                                            AbstractC2894.m4856(null, 3, "已发送");
                                            break;
                                        default:
                                            C2952.f9477.getClass();
                                            C2199.m4148(c1285.f4688, C2952.f9478, string);
                                            AbstractC2894.m4856(null, 3, "已发送");
                                            break;
                                    }
                                }
                            });
                            obj2 = null;
                            builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                            builder.show();
                        } else {
                            obj2 = null;
                            AbstractC2894.m4856(null, 3, "获取语音路径失败, 请尝试播放后重发");
                        }
                        c1574.m3452(obj2);
                    }
                }
                return c3554;
            case 7:
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
                View view2 = (View) c2642;
                Object tag2 = view2.getTag();
                int i7 = AbstractC1768.f5906;
                C1300 c1300M35513 = AbstractC2727.m4713(tag2).m3558();
                String[] strArr4 = AbstractC1471.f5234;
                c1300M35513.f6475 = "a";
                Object objM3128 = ((C1316) AbstractC2844.m4775(c1300M35513)).m3126();
                C1300 c1300M35514 = AbstractC2727.m4713(objM3128).m3558();
                c1300M35514.f6475 = "field_type";
                if (((Number) ((C1316) AbstractC2844.m4775(c1300M35514)).m3127()).intValue() == 3) {
                    C1300 c1300M35515 = AbstractC2727.m4713(objM3128).m3558();
                    c1300M35515.f6475 = "field_favProto";
                    C2004 c2004M3561 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M35515)).m3126()).m3560();
                    c2004M3561.f6475 = "getData";
                    byte[] bArr2 = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3561)).m4026(new Object[0]);
                    C2480 c2481 = C2480.f7862;
                    c2481.getClass();
                    final C1285 c1286 = ((C1286) c2481.m4408(C1286.Companion.serializer(), bArr2)).f4695;
                    final String string2 = c1286.f4693;
                    String str3 = c1286.f4692;
                    if (string2 == null) {
                        String strM4703 = AbstractC2727.m4702();
                        String strValueOf2 = String.valueOf(str3.hashCode() & 255);
                        StringBuilder sbM4788 = AbstractC2844.m4787(strM4703);
                        sbM4788.append("/favorite/");
                        sbM4788.append(strValueOf2);
                        sbM4788.append('/');
                        sbM4788.append(str3);
                        sbM4788.append('.');
                        sbM4788.append(c1286.f4689);
                        string2 = sbM4788.toString();
                    }
                    if (new File(string2).exists()) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view2.getContext());
                        builder2.setTitle("提示");
                        builder2.setMessage("是否发送收藏语音");
                        String str4 = "发送";
                        final char c = 1 == true ? 1 : 0;
                        builder2.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᤞᲁᲈ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
                                switch (c) {
                                    case 0:
                                        C2952.f9477.getClass();
                                        C2199.m4148(c1286.f4688, C2952.f9478, string2);
                                        AbstractC2894.m4856(null, 3, "已发送");
                                        break;
                                    default:
                                        C2952.f9477.getClass();
                                        C2199.m4148(c1286.f4688, C2952.f9478, string2);
                                        AbstractC2894.m4856(null, 3, "已发送");
                                        break;
                                }
                            }
                        });
                        obj3 = null;
                        builder2.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder2.show();
                    } else {
                        obj3 = null;
                        AbstractC2894.m4856(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                    c1575.m3452(obj3);
                }
                return c3554;
            case 8:
                ((C1023) obj).f3740 = new C0581(9);
                return c3554;
            case 9:
                ((C1335) obj).m3155(new C0581(i3));
                return c3554;
            case 10:
                C2012 c2013 = (C2012) obj;
                c2013.m4014(C0588.f2397.m2123());
                Class<Boolean> cls = Boolean.class;
                Class<Boolean> clsM4774 = AbstractC2844.m4774(c2013, Void.TYPE, cls);
                if (clsM4774 == null) {
                    clsM4774 = cls;
                }
                Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2013.m4017(clsM4774, clsM4233 != null ? clsM4233 : Boolean.class);
                C2015 c2015 = new C2015();
                C2012 c2014 = new C2012();
                String[] strArr5 = AbstractC1471.f5234;
                c2014.m4021("MicroMsg.ChatFooter", "this is a quote msg");
                c2015.m4042(c2014);
                c2013.f6670 = c2015;
                return c3554;
            case 11:
                Object obj4 = ((List) obj).get(0);
                C2092.f6978.getClass();
                zM3322 = AbstractC1469.m3322(obj4, AbstractC0972.m2608(C2091.f6977));
                break;
            case Opcodes.FCONST_1 /* 12 */:
                Object objM3449 = ((C1574) obj).m3448();
                FrameLayout frameLayout = (FrameLayout) (objM3449 instanceof FrameLayout ? objM3449 : null);
                if (frameLayout == null) {
                    Class<FrameLayout> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(FrameLayout.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4234 != null ? clsM4234 : FrameLayout.class).getName()).toString());
                }
                for (InterfaceC1587 interfaceC1587 : C0589.f2399) {
                    try {
                        ((C0653) interfaceC1587).m2151(frameLayout);
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr6 = AbstractC1471.f5234;
                        sb.append("onInit ");
                        sb.append(interfaceC1587 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1587).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 13:
                String[] strArr7 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_chat_group_tab, null, false);
                int i8 = R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor);
                if (textInputEditText != null) {
                    i8 = R.id.moduleDialogEdtChatGroupTabIndicatorLightColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabIndicatorLightColor);
                    if (textInputEditText2 != null) {
                        i8 = R.id.moduleDialogEdtChatGroupTabNormalDarkColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabNormalDarkColor);
                        if (textInputEditText3 != null) {
                            i8 = R.id.moduleDialogEdtChatGroupTabNormalLightColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabNormalLightColor);
                            if (textInputEditText4 != null) {
                                i8 = R.id.moduleDialogEdtChatGroupTabSelectedDarkColor;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabSelectedDarkColor);
                                if (textInputEditText5 != null) {
                                    i8 = R.id.moduleDialogEdtChatGroupTabSelectedLightColor;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabSelectedLightColor);
                                    if (textInputEditText6 != null) {
                                        i8 = R.id.moduleDialogEdtChatGroupTabTabDarkColor;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabTabDarkColor);
                                        if (textInputEditText7 != null) {
                                            i8 = R.id.moduleDialogEdtChatGroupTabTabLightColor;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtChatGroupTabTabLightColor);
                                            if (textInputEditText8 != null) {
                                                i8 = R.id.moduleDialogInputChatGroupTabIndicatorDarkColor;
                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabIndicatorDarkColor)) != null) {
                                                    i8 = R.id.moduleDialogInputChatGroupTabIndicatorLightColor;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabIndicatorLightColor)) != null) {
                                                        i8 = R.id.moduleDialogInputChatGroupTabNormalDarkColor;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabNormalDarkColor)) != null) {
                                                            i8 = R.id.moduleDialogInputChatGroupTabNormalLightColor;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabNormalLightColor)) != null) {
                                                                i8 = R.id.moduleDialogInputChatGroupTabSelectedDarkColor;
                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabSelectedDarkColor)) != null) {
                                                                    i8 = R.id.moduleDialogInputChatGroupTabSelectedLightColor;
                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabSelectedLightColor)) != null) {
                                                                        i8 = R.id.moduleDialogInputChatGroupTabTabDarkColor;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabTabDarkColor)) != null) {
                                                                            i8 = R.id.moduleDialogInputChatGroupTabTabLightColor;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputChatGroupTabTabLightColor)) != null) {
                                                                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                                                C2044 c2044 = new C2044(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, 0);
                                                                                textInputEditText8.setText(C0612.f2452.m2666());
                                                                                textInputEditText2.setText(C0605.f2445.m2666());
                                                                                textInputEditText4.setText(C0607.f2447.m2666());
                                                                                textInputEditText6.setText(C0609.f2449.m2666());
                                                                                textInputEditText7.setText(C0611.f2451.m2666());
                                                                                textInputEditText.setText(C0604.f2444.m2666());
                                                                                textInputEditText3.setText(C0606.f2446.m2666());
                                                                                textInputEditText5.setText(C0608.f2448.m2666());
                                                                                C2037 c2037 = new C2037();
                                                                                C0615.f2456.getClass();
                                                                                c2037.f6779 = C0615.f2459;
                                                                                c2037.f6781 = linearLayout;
                                                                                c2037.m4057("保存", new C0114(c2044, 8));
                                                                                c2037.m4056("重置", new C0112(18));
                                                                                C2037.m4053(c2037, null, 3);
                                                                                c2037.m4055().m3985();
                                                                                return c3554;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case Opcodes.DCONST_0 /* 14 */:
                Context context = ((View) obj).getContext();
                C2136 c2136 = new C2136(context, C0614.f2455);
                C0615.f2456.getClass();
                c2136.f7061 = C0615.f2459;
                c2136.f7062 = new C0581(context);
                c2136.m4094().m2556();
                return c3554;
            case 15:
                ((C1023) obj).f3740 = new C0581(i2);
                return c3554;
            case 16:
                C2045 c2045 = (C2045) obj;
                String[] strArr8 = AbstractC1471.f5234;
                C1498.f5308.getClass();
                List listM3423 = C1498.m3423();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : listM3423) {
                    if (((C1496) obj5).f5295) {
                        arrayList2.add(obj5);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0739.m2300(arrayList2, new C0179(i5)));
                C2571 c2571 = new C2571();
                c2571.f8191 = new C0601(new C0591(arrayList3, c2571, c2045, 0), new C0591(arrayList3, c2571, c2045, 1));
                RecyclerView recyclerView = c2045.f6837;
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                Object obj6 = c2571.f8191;
                if (obj6 == null) {
                    "adapter";
                    c0601 = null;
                } else {
                    c0601 = (C0601) obj6;
                }
                recyclerView.setAdapter(c0601);
                recyclerView.setItemAnimator(null);
                Object obj7 = c2571.f8191;
                if (obj7 == null) {
                    "adapter";
                    c0602 = null;
                } else {
                    c0602 = (C0601) obj7;
                }
                c0602.m2127(arrayList3);
                C0615 c0615 = C0615.f2456;
                Object obj8 = c2571.f8191;
                if (obj8 == null) {
                    "adapter";
                    c0603 = null;
                } else {
                    c0603 = (C0601) obj8;
                }
                c0615.getClass();
                C0615.m2137(c2045, arrayList3, c0603);
                c2045.f6835.setOnClickListener(new ViewOnClickListenerC0592(c2045, c2571, arrayList3));
                Object obj9 = c2571.f8191;
                if (obj9 == null) {
                    "adapter";
                } else {
                    c0604 = (C0601) obj9;
                }
                new C1700(new C0602(c0604, arrayList3, new C0590(arrayList3, c2571, c2045, i5), null == true ? 1 : 0)).m3579(c2045.f6837);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1574 c1576 = (C1574) obj;
                int i9 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772(c1576);
                String[] strArr9 = AbstractC1471.f5234;
                c1300M4773.f4724 = "com.tencent.mm.ui.conversation.ConversationListView";
                ListView listView = (ListView) ((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3127();
                C1300 c1300M4774 = AbstractC2844.m4772(c1576);
                AbstractC0745.m2317(c1300M4774.f6478, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.FINAL}, 1));
                Object obj10 = null;
                Object[] objArr2 = false;
                for (Object obj11 : c1300M4774.m3117()) {
                    Object objM3129 = ((C1316) obj11).m3126();
                    if (objM3129 == null) {
                        zIsAssignableFrom = false;
                    } else {
                        C0702 c0702M4549 = AbstractC2574.m4549(objM3129.getClass());
                        C0702 c0702M45410 = AbstractC2574.m4549(BaseAdapter.class);
                        ConcurrentHashMap concurrentHashMap = AbstractC0705.f2692;
                        zIsAssignableFrom = c0702M45410.mo2209().isAssignableFrom(c0702M4549.mo2209());
                    }
                    if (zIsAssignableFrom) {
                        if (objArr2 == true) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj10 = obj11;
                        objArr2 = true;
                    }
                }
                if (objArr2 != true) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                C0310 c0310 = new C0310((BaseAdapter) ((C1316) obj10).m3127(), 2, listView);
                C2950 c2950 = new C2950(AbstractC1134.m2849(AbstractC2902.m4884(listView.getContext())), null, R.attr.tabStyle);
                c2950.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                C0615.f2456.getClass();
                C0615.m2136(c2950);
                C0613 c0613 = new C0613(c0310, null == true ? 1 : 0);
                ArrayList arrayList4 = c2950.f9470;
                if (!arrayList4.contains(c0613)) {
                    arrayList4.add(c0613);
                }
                C0615.m2140(c2950, c0310);
                C0615.f2457.put(Integer.valueOf(System.identityHashCode(c2950)), new C0598(c2950, c0310));
                c2950.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0546(c2950, 1));
                listView.addHeaderView(c2950);
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                String[] strArr10 = AbstractC1471.f5234;
                C2012.m4012(c2012M4773, "com.tencent.mm.ui.conversation.MainUI");
                c2012M4773.m4021("MicroMsg.MainUI", "onTabCreate, %d");
                c1336.f4794 = c2012M4773;
                return c3554;
            case 19:
                C0629 c0629 = C0629.f2480;
                String[] strArr11 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_chat_input_hint, null, false);
                int i10 = R.id.moduleDialogCbChatInputHintHandleSendCount;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4623, R.id.moduleDialogCbChatInputHintHandleSendCount);
                if (materialCheckBox != null) {
                    i10 = R.id.moduleDialogEdtChatInputHintTip;
                    TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtChatInputHintTip);
                    if (textInputEditText9 != null) {
                        i10 = R.id.moduleDialogInputChatInputHintTip;
                        if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputChatInputHintTip)) != null) {
                            i10 = R.id.moduleDialogTvChatInputHintPreview;
                            MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewM4623, R.id.moduleDialogTvChatInputHintPreview);
                            if (materialTextView != null) {
                                i10 = R.id.moduleDialogTvChatInputHintTextPlaceholders;
                                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1272.m3098(viewM4623, R.id.moduleDialogTvChatInputHintTextPlaceholders);
                                if (materialTextView2 != null) {
                                    C1693 c1693 = new C1693((LinearLayout) viewM4623, materialCheckBox, textInputEditText9, materialTextView, materialTextView2);
                                    C0621 c0621 = C0621.f2469;
                                    String strM2666 = c0621.m2666();
                                    c0629.getClass();
                                    materialTextView.setText(C0629.m2149(strM2666));
                                    textInputEditText9.setText(c0621.m2666());
                                    textInputEditText9.addTextChangedListener(new C0628(c1693, null == true ? 1 : 0));
                                    materialCheckBox.setChecked(C0620.f2468.m2660());
                                    materialTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str5 : C0629.f2481) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str5 + ' '));
                                        spannableStringBuilder.setSpan(new C0627(c1693, str5, 0), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView2.setText(spannableStringBuilder);
                                    C2037 c2038 = new C2037();
                                    c2038.f6779 = C0629.f2483;
                                    c2038.f6781 = c1693.f5695;
                                    c2038.m4057("保存", new C0114(c1693, i3));
                                    c2038.m4056("重置", new C0112(19));
                                    C2037.m4053(c2038, null, 3);
                                    c2038.m4055().m3985();
                                    return c3554;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i10)));
            case 20:
                ((C1023) obj).f3740 = new C0581(21);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1337);
                c2012M4774.m4014(C0588.f2397.m2123());
                String[] strArr12 = AbstractC1471.f5234;
                c2012M4774.m4021("MicroMsg.ChatFooter", "canSend true ! sendBtn is visible");
                c1337.f4794 = c2012M4774;
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                try {
                    c2643 = c1577.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                Boolean bool = (Boolean) (c2643 instanceof C2641 ? null : c2643);
                if (!(bool != null ? bool.booleanValue() : false)) {
                    int i11 = AbstractC1768.f5906;
                    C2004 c2004M3562 = AbstractC2727.m4713(c1577.m3448()).m3560();
                    c2004M3562.f6475 = "setHint";
                    C2013 c2016 = (C2013) AbstractC0739.m2290(c2004M3562.m3993());
                    C0629 c06210 = C0629.f2480;
                    String strM2667 = C0621.f2469.m2666();
                    c06210.getClass();
                    c2016.m4025(C0629.m2149(strM2667));
                }
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C0581(i4);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3740 = new C0581(27);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1574 c1578 = (C1574) obj;
                c1578.getClass();
                try {
                    c2644 = c1578.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                Object obj12 = c2644 instanceof C2641 ? null : c2644;
                int i12 = AbstractC1768.f5906;
                C1300 c1300M35516 = AbstractC2727.m4713(obj12).m3558();
                c1300M35516.f4724 = AbstractC2574.m4549(Context.class);
                AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M35516.m3117())).m3127());
                C2933 c2933 = new C2933(new C0630(obj12, null == true ? 1 : 0));
                try {
                    c2645 = c1578.m3447()[1];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                Object tag3 = ((View) (c2645 instanceof C2641 ? null : c2645)).getTag();
                C2004 c2004M3563 = AbstractC2727.m4713(tag3).m3560();
                c2004M3563.f6648 = AbstractC2574.m4549(Integer.TYPE);
                c2004M3563.m3006();
                c2004M3563.m3926();
                Integer num = (Integer) ((C2013) AbstractC0739.m2290(c2004M3563.m3993())).m4026(new Object[0]);
                if (AbstractC0972.m2596(EnumC3737.f11692) || AbstractC0972.m2597(EnumC3734.f11660)) {
                    C2004 c2004M3564 = AbstractC2727.m4713(tag3).m3560();
                    C2092.f6978.getClass();
                    c2004M3564.f6648 = AbstractC0972.m2608(C2091.f6977);
                    c2004M3564.f4484 = 0;
                    objM4025 = ((C2013) AbstractC2844.m4776(c2004M3564)).m4025(new Object[0]);
                } else {
                    C1300 c1300M35517 = AbstractC2727.m4713(tag3).m3558();
                    C2092.f6978.getClass();
                    c1300M35517.f4724 = AbstractC0972.m2608(C2091.f6977);
                    objM4025 = ((C1316) AbstractC2844.m4775(c1300M35517)).m3126();
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(objM4025);
                for (InterfaceC1588 interfaceC1588 : C0634.f2495) {
                    try {
                        for (C0631 c0631 : interfaceC1588.mo2908(msgInfoBean)) {
                            C2013 c2013M4024 = ((C2013) c2933.getValue()).m4024();
                            c2013M4024.m3542(obj12);
                            c2013M4024.m4025(num, Integer.valueOf(c0631.f2488), 0, c0631.f2489, Integer.valueOf(c0631.f2490));
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList5 = C3741.f11709;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr13 = AbstractC1471.f5234;
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC1588 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1588).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb2, " Failed", e2, 12);
                    }
                }
                return c3554;
            case 26:
                C1574 c1579 = (C1574) obj;
                String[] strArr14 = AbstractC1471.f5234;
                int i13 = AbstractC1768.f5906;
                C1300 c1300M4775 = AbstractC2844.m4772(c1579);
                c1300M4775.f4725 = new C0581(29);
                C1300 c1300M35518 = AbstractC2727.m4713((View.OnLongClickListener) ((C1316) AbstractC0739.m2290(c1300M4775.m3117())).m3127()).m3558();
                C0667.f2553.getClass();
                C0666 c0666 = C0666.f2552;
                c1300M35518.f4724 = AbstractC0972.m2608(c0666);
                Object objM31210 = ((C1316) AbstractC2844.m4775(c1300M35518)).m3126();
                C1300 c1300M35519 = AbstractC2727.m4713(objM31210).m3558();
                C0212.f1356.getClass();
                C0211 c0211 = C0211.f1355;
                c1300M35519.f4724 = AbstractC0972.m2610(c0211).getDeclaringClass();
                Object objM31211 = ((C1316) AbstractC0739.m2290(c1300M35519.m3117())).m3126();
                C0673.f2559.getClass();
                C1300 c1300M35520 = AbstractC2727.m4713(AbstractC0972.m2610(c0211).invoke(objM31211, (Class) AbstractC0280.m1531(AbstractC0972.m2608(C0672.f2558).getInterfaces()))).m3558();
                c1300M35520.f4724 = AbstractC0972.m2608(c0666);
                C1300 c1300M35521 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M35520)).m3126()).m3558();
                c1300M35521.f4724 = AbstractC0972.m2610(c0211).getDeclaringClass();
                Object objM31212 = ((C1316) AbstractC0739.m2290(c1300M35521.m3117())).m3126();
                C0669.f2555.getClass();
                Object objInvoke = AbstractC0972.m2610(c0211).invoke(objM31212, (Class) AbstractC0280.m1531(AbstractC0972.m2608(C0668.f2554).getInterfaces()));
                try {
                    c2646 = c1579.m3447()[0];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                MenuItem menuItem = (MenuItem) (c2646 instanceof C2641 ? null : c2646);
                C2004 c2004M3565 = AbstractC2727.m4713(objInvoke).m3560();
                c2004M3565.f6475 = "getItem";
                MsgInfoBean msgInfoBean2 = new MsgInfoBean(((C2013) AbstractC0739.m2290(c2004M3565.m3993())).m4025(Integer.valueOf(menuItem.getGroupId())));
                for (InterfaceC1588 interfaceC1589 : C0634.f2495) {
                    try {
                        for (C0631 c0632 : interfaceC1589.mo2908(msgInfoBean2)) {
                            if (menuItem.getItemId() == c0632.f2488) {
                                c0632.f2491.mo1342(objM31210, msgInfoBean2);
                            }
                        }
                    } catch (Exception e3) {
                        ArrayList arrayList6 = C3741.f11709;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onCreateMenuItems ");
                        sb3.append(interfaceC1589 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1589).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb3, " Failed", e3, 12);
                    }
                }
                return c3554;
            case 27:
                C1335 c1338 = (C1335) obj;
                String[] strArr15 = AbstractC1471.f5234;
                c1338.m3156("com.tencent.mm.ui.chatting.viewitems");
                C2012 c2017 = new C2012();
                c2017.m4021("MicroMsg.ChattingItem", "context item select failed, null dataTag");
                c1338.f4794 = c2017;
                return c3554;
            case 28:
                C1335 c1339 = (C1335) obj;
                String[] strArr16 = AbstractC1471.f5234;
                c1339.m3156("com.tencent.mm.ui.chatting.viewitems");
                C2012 c2018 = new C2012();
                c2018.m4021("MicroMsg.ChattingItem", "msg is null!");
                c1339.f4794 = c2018;
                return c3554;
            default:
                C0702 c0702M45411 = AbstractC2574.m4549(View.OnLongClickListener.class);
                ConcurrentHashMap concurrentHashMap2 = AbstractC0705.f2692;
                zM3322 = c0702M45411.mo2209().isAssignableFrom((Class) obj);
                break;
        }
        return Boolean.valueOf(zM3322);
    }

    public /* synthetic */ C0581(Context context) {
        this.f2382 = 16;
    }
}
