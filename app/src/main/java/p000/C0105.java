package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.ComponentCallbacks2C0020;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0105 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1053;

    public /* synthetic */ C0105(int i) {
        this.f1053 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws JSONException, IllegalAccessException, IOException, InvocationTargetException {
        Object c2585;
        AbstractC0379 abstractC0379M1531;
        C0423 c0423;
        Object c2586;
        Object c2587;
        Object c2588;
        List listM3699;
        int i = this.f1053;
        int i2 = 8;
        int i3 = 14;
        int i4 = 6;
        int i5 = 4;
        final int i6 = 1;
        str = null;
        String str = null;
        C2325 c2325 = null;
        final int i7 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_account_info_center, null, false);
                int i8 = R.id.moduleDialogCbAccountInfoCenterAliasShow;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbAccountInfoCenterAliasShow);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbAccountInfoCenterNameShow;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbAccountInfoCenterNameShow);
                    if (materialCheckBox2 != null) {
                        i8 = R.id.moduleDialogCbAccountInfoCenterSignShow;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbAccountInfoCenterSignShow);
                        if (materialCheckBox3 != null) {
                            i8 = R.id.moduleDialogEdtAccountInfoCenterAlias;
                            TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterAlias);
                            if (textInputEditText != null) {
                                i8 = R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin;
                                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin);
                                if (textInputEditText2 != null) {
                                    i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarRadian;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterAvatarRadian);
                                    if (textInputEditText3 != null) {
                                        i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarSize;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterAvatarSize);
                                        if (textInputEditText4 != null) {
                                            i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin;
                                            TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin);
                                            if (textInputEditText5 != null) {
                                                i8 = R.id.moduleDialogEdtAccountInfoCenterBgDarkColor;
                                                TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterBgDarkColor);
                                                if (textInputEditText6 != null) {
                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterBgLightColor;
                                                    TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterBgLightColor);
                                                    if (textInputEditText7 != null) {
                                                        i8 = R.id.moduleDialogEdtAccountInfoCenterName;
                                                        TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterName);
                                                        if (textInputEditText8 != null) {
                                                            i8 = R.id.moduleDialogEdtAccountInfoCenterNameTopMargin;
                                                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterNameTopMargin);
                                                            if (textInputEditText9 != null) {
                                                                i8 = R.id.moduleDialogEdtAccountInfoCenterSign;
                                                                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterSign);
                                                                if (textInputEditText10 != null) {
                                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterSignTopMargin;
                                                                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAccountInfoCenterSignTopMargin);
                                                                    if (textInputEditText11 != null) {
                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAlias;
                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterAlias)) != null) {
                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterAliasTopMargin;
                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterAliasTopMargin)) != null) {
                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterAvatarRadian;
                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterAvatarRadian)) != null) {
                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterAvatarSize;
                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterAvatarSize)) != null) {
                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin;
                                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin)) != null) {
                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterBgDarkColor;
                                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterBgDarkColor)) != null) {
                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterBgLightColor;
                                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterBgLightColor)) != null) {
                                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterName;
                                                                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterName)) != null) {
                                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterNameTopMargin;
                                                                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterNameTopMargin)) != null) {
                                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterSign;
                                                                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterSign)) != null) {
                                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterSignTopMargin;
                                                                                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAccountInfoCenterSignTopMargin)) != null) {
                                                                                                                    LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                                                                                    C2010 c2010 = new C2010(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11);
                                                                                                                    textInputEditText5.setText(String.valueOf(C0112.f1061.m2538()));
                                                                                                                    textInputEditText4.setText(String.valueOf(C0111.f1060.m2538()));
                                                                                                                    textInputEditText3.setText(String.valueOf(C0110.f1059.m2537()));
                                                                                                                    materialCheckBox2.setChecked(C0116.f1065.m2536());
                                                                                                                    textInputEditText9.setText(String.valueOf(C0117.f1066.m2538()));
                                                                                                                    textInputEditText8.setText(C0115.f1064.m2542());
                                                                                                                    materialCheckBox.setChecked(C0108.f1057.m2536());
                                                                                                                    textInputEditText2.setText(String.valueOf(C0109.f1058.m2538()));
                                                                                                                    textInputEditText.setText(C0107.f1056.m2542());
                                                                                                                    materialCheckBox3.setChecked(C0119.f1068.m2536());
                                                                                                                    textInputEditText11.setText(String.valueOf(C0120.f1069.m2538()));
                                                                                                                    textInputEditText10.setText(C0118.f1067.m2542());
                                                                                                                    textInputEditText7.setText(C0114.f1063.m2542());
                                                                                                                    textInputEditText6.setText(C0113.f1062.m2542());
                                                                                                                    C2007 c2007 = new C2007();
                                                                                                                    C0121.f1070.getClass();
                                                                                                                    c2007.f6678 = C0121.f1076;
                                                                                                                    c2007.f6680 = linearLayout;
                                                                                                                    c2007.m3870("保存", new C0106(0, c2010));
                                                                                                                    c2007.m3869("重置", new C0104(3));
                                                                                                                    C2007.m3866(c2007, null, 3);
                                                                                                                    c2007.m3868().m3791();
                                                                                                                    return c3497;
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
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i8)));
            case 1:
                C1563 c1563 = (C1563) obj;
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
                RelativeLayout relativeLayout = (RelativeLayout) c2585;
                Iterator c0060 = new C0060(7, relativeLayout);
                ArrayList arrayList = new ArrayList();
                while (c0060.hasNext()) {
                    View view = (View) c0060.next();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    C0060 c0061 = viewGroup != null ? new C0060(7, viewGroup) : null;
                    if (c0061 == null || !c0061.hasNext()) {
                        while (!c0060.hasNext() && !arrayList.isEmpty()) {
                            c0060 = (Iterator) AbstractC0744.m2197(arrayList);
                            AbstractC0750.m2219(arrayList);
                        }
                    } else {
                        arrayList.add(c0060);
                        c0060 = c0061;
                    }
                    view.setVisibility(8);
                }
                C0121 c0121 = C0121.f1070;
                Context context = relativeLayout.getContext();
                C0106 c0106 = new C0106(i6, relativeLayout);
                c0121.getClass();
                RelativeLayout relativeLayout2 = new RelativeLayout(context);
                relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                relativeLayout2.setPadding((int) AbstractC3681.m5322(20, context), (int) AbstractC3681.m5322(12, context), (int) AbstractC3681.m5322(20, context), (int) AbstractC3681.m5322(12, context));
                relativeLayout2.setBackgroundColor(Color.parseColor((AbstractC3681.m5331(context) ? C0113.f1062 : C0114.f1063).m2542()));
                relativeLayout2.setOnClickListener(new ViewOnClickListenerC0103(0, c0106));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.AccountInfoCenter_flAvatar);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14);
                layoutParams.topMargin = (int) AbstractC3681.m5322(Integer.valueOf(C0112.f1061.m2538()), context);
                frameLayout.setLayoutParams(layoutParams);
                ImageView imageView = new ImageView(context);
                int iM5322 = (int) AbstractC3681.m5322(Integer.valueOf(C0111.f1060.m2538()), context);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(iM5322, iM5322));
                C1873 c1873 = C1873.f6220;
                C0774.f2874.getClass();
                String strM2264 = C0774.m2264();
                c1873.getClass();
                String strM3654 = C1873.m3654(strM2264, true);
                C2606 c2606 = new C2606(Math.max(1, (int) (C0110.f1059.m2537() * iM5322)));
                ComponentCallbacks2C2563 componentCallbacks2C2563M4580 = ComponentCallbacks2C0020.m614(context).f541.m4580(context);
                componentCallbacks2C2563M4580.getClass();
                C2556 c2556Mo1526 = new C2556(componentCallbacks2C2563M4580.f8133, componentCallbacks2C2563M4580, Drawable.class, componentCallbacks2C2563M4580.f8134).m4573(strM3654).mo1526((C2565) new C2565().m1538(c2606, true));
                c2556Mo1526.getClass();
                AbstractC3522.m5104();
                if (!AbstractC0379.m1525(c2556Mo1526.f1766, 2048) && imageView.getScaleType() != null) {
                    switch (AbstractC2555.f8111[imageView.getScaleType().ordinal()]) {
                        case 1:
                            abstractC0379M1531 = c2556Mo1526.clone().m1531(C1096.f4109, new C0578());
                            break;
                        case 2:
                            abstractC0379M1531 = c2556Mo1526.clone().m1531(C1096.f4108, new C0579());
                            abstractC0379M1531.f1779 = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            abstractC0379M1531 = c2556Mo1526.clone().m1531(C1096.f4107, new C1343());
                            abstractC0379M1531.f1779 = true;
                            break;
                        case 6:
                            abstractC0379M1531 = c2556Mo1526.clone().m1531(C1096.f4108, new C0579());
                            abstractC0379M1531.f1779 = true;
                            break;
                        default:
                            abstractC0379M1531 = c2556Mo1526;
                            break;
                    }
                } else {
                    abstractC0379M1531 = c2556Mo1526;
                }
                C1461 c1461 = c2556Mo1526.f8116;
                Class cls = c2556Mo1526.f8115;
                c1461.f5207.getClass();
                if (Bitmap.class.equals(cls)) {
                    c0423 = new C0423(imageView, 0);
                } else {
                    if (!Drawable.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                    }
                    c0423 = new C0423(imageView, 1);
                }
                c2556Mo1526.m4572(c0423, abstractC0379M1531);
                if (c0423.f1975 == null) {
                    ViewOnAttachStateChangeListenerC0569 viewOnAttachStateChangeListenerC0569 = new ViewOnAttachStateChangeListenerC0569(3, c0423);
                    c0423.f1975 = viewOnAttachStateChangeListenerC0569;
                    if (!c0423.f1977) {
                        c0423.f1973.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0569);
                        c0423.f1977 = true;
                    }
                }
                frameLayout.addView(imageView);
                relativeLayout2.addView(frameLayout);
                relativeLayout2.addView(C0121.m1125(c0121, context, R.id.AccountInfoCenter_tvName, R.id.AccountInfoCenter_flAvatar, C0117.f1066.m2538(), 18.0f, C0115.f1064.m2542(), C0116.f1065.m2536(), new File(C0121.f1074, "nickName.ttf"), 128));
                relativeLayout2.addView(C0121.m1125(c0121, context, R.id.AccountInfoCenter_tvAlias, R.id.AccountInfoCenter_tvName, C0109.f1058.m2538(), 16.0f, C0107.f1056.m2542(), C0108.f1057.m2536(), null, 1920));
                relativeLayout2.addView(C0121.m1125(c0121, context, R.id.AccountInfoCenter_tvSign, R.id.AccountInfoCenter_tvAlias, C0120.f1069.m2538(), 14.0f, C0118.f1067.m2542(), C0119.f1068.m2536(), null, 1792));
                relativeLayout.addView(relativeLayout2);
                return c3497;
            case 2:
                int i9 = EnumC3673.f11482.f11492;
                String[] strArr2 = AbstractC1574.f5469;
                String str2 = "weixin";
                Object obj2 = "微信安全提醒";
                String str3 = "该微信号因使用外挂、模拟器等非官方客户端程序或其他违规技术（请卸载停用违规内容，若继续使用将升级至永久限制），当前无法使用所有社交场景。该限制为临时限制。\n\n你可以点击“详情”查看更多信息，进行安全验证以继续使用该功能。";
                String str4 = "https://www.bilibili.com/video/BV1UT42167xb/";
                JSONObject jSONObject = new JSONObject();
                String str5 = "msg";
                JSONObject jSONObject2 = new JSONObject();
                String str6 = "appmsg";
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", 5);
                jSONObject3.put("title", obj2);
                String str7 = "mmreader";
                JSONObject jSONObject4 = new JSONObject();
                String str8 = "category";
                JSONObject jSONObject5 = new JSONObject();
                String str9 = "item";
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("title", obj2);
                jSONObject6.put("digest", str3);
                jSONObject6.put("url", str4);
                jSONObject5.put(str9, jSONObject6);
                jSONObject4.put(str8, jSONObject5);
                jSONObject3.put(str7, jSONObject4);
                jSONObject2.put(str6, jSONObject3);
                jSONObject.put(str5, jSONObject2);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                C1732 c1732 = new C1732();
                c1732.f5829 = jSONObject;
                c1732.f5830 = hashSet;
                c1732.f5831 = hashSet2;
                AbstractC2201.m3976(i9, str2, c1732.toString(), System.currentTimeMillis());
                Activity activityM4033 = AbstractC2203.m4033();
                C1875 c1875 = C1875.f6222;
                String str10 = "";
                List listM2212 = AbstractC0745.m2212("该微信号因使用了微信外挂、非官方客户端或模拟器，被限制登录，请尽快卸载对应的非法软件。若后续仍继续使用将永久限制登录。如需继续使用，请轻触 “确定” 申请解除限制。", "该账号违反了《微信个人账号使用规范》，请轻触 “确定” 了解详情后，继续登录微信。", "你的账号可能有安全风险，为了你的账号安全，暂时无法在新设备登录，你可以在常用手机登录微信，或者轻触「了解详情」查看更多信息。", "账号状态异常，本次登录已失效。请尝试重新登录，并根据弹窗提示操作。");
                AbstractC0066 abstractC0066 = AbstractC2474.f7908;
                String str11 = (String) AbstractC0744.m2199(listM2212);
                String str12 = "确定";
                String str13 = "取消";
                DialogInterfaceOnClickListenerC1131 dialogInterfaceOnClickListenerC1131 = new DialogInterfaceOnClickListenerC1131();
                DialogInterfaceOnClickListenerC1131 dialogInterfaceOnClickListenerC1132 = new DialogInterfaceOnClickListenerC1131();
                c1875.getClass();
                int i10 = AbstractC1745.f5844;
                ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(Context.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(DialogInterface.OnClickListener.class), AbstractC2519.m4527(DialogInterface.OnClickListener.class)}, 7, AbstractC0968.m2483(AbstractC1574.m3313(C1874.f6221)).m3492())).m3831(activityM4033, str11, str10, str12, str13, dialogInterfaceOnClickListenerC1131, dialogInterfaceOnClickListenerC1132);
                return c3497;
            case 3:
                ((C1020) obj).f3733 = new C0105(i5);
                return c3497;
            case 4:
                ((C1333) obj).m3052(new C0105(i4));
                return c3497;
            case 5:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                Object obj3 = c2586 instanceof C2585 ? null : c2586;
                int i11 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj3).m3490();
                String[] strArr3 = AbstractC1574.f5469;
                c1299M3490.f6370 = "f";
                Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3023();
                C1299 c1299M3491 = AbstractC0968.m2484(objM3023).m3490();
                c1299M3491.f6370 = "f";
                try {
                    if (new JSONObject((String) ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3024()).optJSONArray("ad_slot_data") != null) {
                        C1299 c1299M3492 = AbstractC0968.m2484(objM3023).m3490();
                        c1299M3492.f6370 = "f";
                        ((C1315) AbstractC0744.m2191(c1299M3492.m3014())).m3025("{}");
                    }
                    break;
                } catch (Throwable unused) {
                }
                return c3497;
            case 6:
                C1981 c1981 = (C1981) obj;
                String[] strArr4 = AbstractC1574.f5469;
                String[] strArr5 = {"com.tencent.mm.plugin.brandservice.api.TransferResultInfo"};
                c1981.getClass();
                C2328 c2328 = new C2328(4);
                ArrayList arrayList2 = new ArrayList(C1189.f4329);
                c2328.f7469 = arrayList2;
                String str14 = strArr5[0];
                if (str14 != null) {
                    c2325 = new C2325(4);
                    C0705 c0705 = new C0705(4);
                    c0705.f2683 = new C2837(str14, 5, false);
                    c2325.f7464 = c0705;
                }
                c2328.f7469 = arrayList2;
                arrayList2.add(c2325);
                c1981.f6561 = c2328;
                c1981.m3827("MicroMsg.BaseTransferRequest");
                return c3497;
            case 7:
                AbstractC1458.m3166(C0186.f1243, new C0105(i2));
                return c3497;
            case 8:
                C0105 c0105 = new C0105(9);
                C0815 c0815 = new C0815();
                C0816 c0816 = new C0816(c0815);
                c0105.invoke(c0816);
                c0815.f3181 = c0816;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                return c3497;
            case 9:
                C0816 c0817 = (C0816) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c0817.f3198 = "搜索群聊";
                String str15 = "群聊";
                ArrayList<GroupInfo> arrayListM4032 = AbstractC2203.m4032();
                ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(arrayListM4032, 10));
                for (GroupInfo groupInfo : arrayListM4032) {
                    String roomId = groupInfo.getRoomId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(groupInfo.getName());
                    String remark = groupInfo.getRemark();
                    if (remark.length() <= 0) {
                        remark = null;
                    }
                    if (remark != null) {
                        sb.append("(" + remark + ')');
                    }
                    sb.append("(" + groupInfo.getGroupData().getMemberCount() + ')');
                    arrayList3.add(new C0801(roomId, sb.toString(), groupInfo.getRoomId(), C0185.f1242.m2541().contains(groupInfo.getRoomId())));
                }
                c0817.m2367(str15, arrayList3);
                c0817.f3199 = R.drawable.ic_contact_confirm_24dp;
                String str16 = "屏蔽";
                C0184 c0184 = new C0184(i7);
                c0817.f3202 = str16;
                c0817.f3204 = c0184;
                return c3497;
            case 10:
                ((C1020) obj).f3733 = new C0105(11);
                return c3497;
            case 11:
                ((C1333) obj).m3052(new C0105(13));
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1563) obj).m3272(null);
                return c3497;
            case 13:
                ((C1981) obj).m3827("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                ((C0705) obj).m2127("MicroMsg.VoiceMsgExtension");
                return c3497;
            case 15:
                ((C1332) obj).m3050(new C0105(18));
                return c3497;
            case 16:
                ((C1332) obj).m3050(new C0105(17));
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                ((C0705) obj).m2127("MicroMsg.ImgMsgExtension");
                return c3497;
            case Opcodes.LDC /* 18 */:
                ((C0705) obj).m2127("MicroMsg.VideoMsgExtension");
                return c3497;
            case 19:
                final C2011 c2011M3871 = C2011.m3871(LayoutInflater.from(((View) obj).getContext()));
                c2011M3871.f6708.setText(C0193.f1258.m2542());
                C2007 c2008 = new C2007();
                C0194.f1259.getClass();
                c2008.f6678 = C0194.f1261;
                c2008.f6680 = c2011M3871.f6707;
                c2008.m3870("保存", new InterfaceC1414() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲈᲇᲀᲁ
                    @Override // p000.InterfaceC1414
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                C0193.f1258.m2548(String.valueOf(c2011M3871.f6708.getText()));
                                break;
                            default:
                                C0196.f1265.m2548(String.valueOf(c2011M3871.f6708.getText()));
                                break;
                        }
                        return C3497.f10997;
                    }
                });
                AbstractC2784.m4755(c2008, null, 3);
                return c3497;
            case 20:
                ((C1020) obj).f3732 = new C0105(16);
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                ((C1020) obj).f3732 = new C0105(23);
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1020) obj).f3732 = new C0105(15);
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                ((C1332) obj).m3050(new C0105(i3));
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1563) obj).m3272(null);
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                final C2011 c2011M3872 = C2011.m3871(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C0196.f1265.m2542());
                C2007 c2009 = new C2007();
                C0197.f1266.getClass();
                c2009.f6678 = C0197.f1268;
                c2009.f6680 = c2011M3872.f6707;
                c2009.m3870("保存", new InterfaceC1414() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲈᲇᲀᲁ
                    @Override // p000.InterfaceC1414
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                C0193.f1258.m2548(String.valueOf(c2011M3872.f6708.getText()));
                                break;
                            default:
                                C0196.f1265.m2548(String.valueOf(c2011M3872.f6708.getText()));
                                break;
                        }
                        return C3497.f10997;
                    }
                });
                AbstractC2784.m4755(c2009, null, 3);
                return c3497;
            case 26:
                ((C1020) obj).f3733 = new C0105(27);
                return c3497;
            case 27:
                C1333 c1333 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.sdk.platformtools");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.SDK.XmlParser", "[ %s ]");
                c1333.f4794 = c1982;
                return c3497;
            case 28:
                C1563 c1565 = (C1563) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1565.getClass();
                try {
                    c2587 = c1565.m3267()[0];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                String str17 = (String) c2587;
                String str18 = str17 == null ? "" : str17;
                try {
                    c2588 = c1565.m3267()[1];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                String str19 = (String) c2588;
                if ((str19 != null ? str19 : "").equals("sysmsg") && AbstractC2841.m4828(str18, "revokemsg", false)) {
                    Object objM3269 = c1565.m3269();
                    if (!(objM3269 instanceof Map) || ((objM3269 instanceof InterfaceC1737) && !(objM3269 instanceof InterfaceC1739))) {
                        objM3269 = null;
                    }
                    Map map = (Map) objM3269;
                    if (map != null) {
                        String str20 = ".sysmsg.$type";
                        if (map.containsKey(str20) && AbstractC2207.m4087(map.get(str20), "revokemsg")) {
                            String str21 = (String) map.get(".sysmsg.revokemsg.session");
                            String str22 = (String) map.get(".sysmsg.revokemsg.replacemsg");
                            String str23 = (String) map.get(".sysmsg.revokemsg.newmsgid");
                            if (str22.startsWith("\"") || str22.startsWith("「")) {
                                map.put(str20, null);
                                c1565.m3272(map);
                                int i12 = AbstractC1745.f5844;
                                C2800.f8930.getClass();
                                C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
                                c1973M3492.f6370 = "rawQuery";
                                Cursor cursor = (Cursor) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(Object[].class)}, 2, c1973M3492)).m3832("SELECT createTime FROM message WHERE msgSvrId = ?", new Object[]{str23});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            long j = cursor.getLong(cursor.getColumnIndex("createTime"));
                                            C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("([\"「])(.*?)([」\"])").matcher(str22), 0, str22);
                                            if (c1904M4123 != null && (listM3699 = c1904M4123.m3699()) != null) {
                                                str = (String) ((C1903) listM3699).get(2);
                                            }
                                            AbstractC2201.m3976(EnumC3673.f11478.f11492, str21, "\"" + str + "\" " + C0196.f1265.m2542(), j + 1);
                                        }
                                        cursor.close();
                                        break;
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            AbstractC1458.m3154(cursor, th5);
                                            throw th6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return c3497;
            default:
                C1563 c1566 = (C1563) obj;
                c1566.getClass();
                new C0408(0, 6, c1566).m1608("");
                return c3497;
        }
    }
}
