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
import com.bumptech.glide.ComponentCallbacks2C0027;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0113 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1121;

    public /* synthetic */ C0113(int i) {
        this.f1121 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws JSONException, IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        Object c2641;
        AbstractC0354 abstractC0354M1637;
        C0398 c0398;
        Object c2642;
        Object c2643;
        Object c2644;
        List listM3883;
        int i = this.f1121;
        int i2 = 4;
        int i3 = 8;
        int i4 = 14;
        int i5 = 6;
        final int i6 = 1;
        str = null;
        String str = null;
        C2365 c2365 = null;
        final int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_account_info_center, null, false);
                int i8 = R.id.moduleDialogCbAccountInfoCenterAliasShow;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAccountInfoCenterAliasShow);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbAccountInfoCenterNameShow;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAccountInfoCenterNameShow);
                    if (materialCheckBox2 != null) {
                        i8 = R.id.moduleDialogCbAccountInfoCenterSignShow;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAccountInfoCenterSignShow);
                        if (materialCheckBox3 != null) {
                            i8 = R.id.moduleDialogEdtAccountInfoCenterAlias;
                            TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterAlias);
                            if (textInputEditText != null) {
                                i8 = R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin;
                                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin);
                                if (textInputEditText2 != null) {
                                    i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarRadian;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterAvatarRadian);
                                    if (textInputEditText3 != null) {
                                        i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarSize;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterAvatarSize);
                                        if (textInputEditText4 != null) {
                                            i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin;
                                            TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin);
                                            if (textInputEditText5 != null) {
                                                i8 = R.id.moduleDialogEdtAccountInfoCenterBgDarkColor;
                                                TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterBgDarkColor);
                                                if (textInputEditText6 != null) {
                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterBgLightColor;
                                                    TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterBgLightColor);
                                                    if (textInputEditText7 != null) {
                                                        i8 = R.id.moduleDialogEdtAccountInfoCenterName;
                                                        TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterName);
                                                        if (textInputEditText8 != null) {
                                                            i8 = R.id.moduleDialogEdtAccountInfoCenterNameTopMargin;
                                                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterNameTopMargin);
                                                            if (textInputEditText9 != null) {
                                                                i8 = R.id.moduleDialogEdtAccountInfoCenterSign;
                                                                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterSign);
                                                                if (textInputEditText10 != null) {
                                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterSignTopMargin;
                                                                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAccountInfoCenterSignTopMargin);
                                                                    if (textInputEditText11 != null) {
                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAlias;
                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterAlias)) != null) {
                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterAliasTopMargin;
                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterAliasTopMargin)) != null) {
                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterAvatarRadian;
                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterAvatarRadian)) != null) {
                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterAvatarSize;
                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterAvatarSize)) != null) {
                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin;
                                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin)) != null) {
                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterBgDarkColor;
                                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterBgDarkColor)) != null) {
                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterBgLightColor;
                                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterBgLightColor)) != null) {
                                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterName;
                                                                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterName)) != null) {
                                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterNameTopMargin;
                                                                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterNameTopMargin)) != null) {
                                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterSign;
                                                                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterSign)) != null) {
                                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterSignTopMargin;
                                                                                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAccountInfoCenterSignTopMargin)) != null) {
                                                                                                                    LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                                                                                    C2040 c2040 = new C2040(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11);
                                                                                                                    textInputEditText5.setText(String.valueOf(C0120.f1129.m2662()));
                                                                                                                    textInputEditText4.setText(String.valueOf(C0119.f1128.m2662()));
                                                                                                                    textInputEditText3.setText(String.valueOf(C0118.f1127.m2661()));
                                                                                                                    materialCheckBox2.setChecked(C0124.f1133.m2660());
                                                                                                                    textInputEditText9.setText(String.valueOf(C0125.f1134.m2662()));
                                                                                                                    textInputEditText8.setText(C0123.f1132.m2666());
                                                                                                                    materialCheckBox.setChecked(C0116.f1125.m2660());
                                                                                                                    textInputEditText2.setText(String.valueOf(C0117.f1126.m2662()));
                                                                                                                    textInputEditText.setText(C0115.f1124.m2666());
                                                                                                                    materialCheckBox3.setChecked(C0127.f1136.m2660());
                                                                                                                    textInputEditText11.setText(String.valueOf(C0128.f1137.m2662()));
                                                                                                                    textInputEditText10.setText(C0126.f1135.m2666());
                                                                                                                    textInputEditText7.setText(C0122.f1131.m2666());
                                                                                                                    textInputEditText6.setText(C0121.f1130.m2666());
                                                                                                                    C2037 c2037 = new C2037();
                                                                                                                    C0129.f1138.getClass();
                                                                                                                    c2037.f6779 = C0129.f1144;
                                                                                                                    c2037.f6781 = linearLayout;
                                                                                                                    c2037.m4057("保存", new C0114(c2040, 0));
                                                                                                                    c2037.m4056("重置", new C0112(3));
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
            case 1:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                RelativeLayout relativeLayout = (RelativeLayout) c2641;
                Iterator c0067 = new C0067(relativeLayout, 7);
                ArrayList arrayList = new ArrayList();
                while (c0067.hasNext()) {
                    View view = (View) c0067.next();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    C0067 c0068 = viewGroup != null ? new C0067(viewGroup, 7) : null;
                    if (c0068 == null || !c0068.hasNext()) {
                        while (!c0067.hasNext() && !arrayList.isEmpty()) {
                            c0067 = (Iterator) AbstractC0739.m2296(arrayList);
                            AbstractC0745.m2319(arrayList);
                        }
                    } else {
                        arrayList.add(c0067);
                        c0067 = c0068;
                    }
                    view.setVisibility(8);
                }
                C0129 c0129 = C0129.f1138;
                Context context = relativeLayout.getContext();
                C0114 c0114 = new C0114(relativeLayout, i6);
                c0129.getClass();
                RelativeLayout relativeLayout2 = new RelativeLayout(context);
                relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                relativeLayout2.setPadding((int) AbstractC2234.m4163(20, context), (int) AbstractC2234.m4163(12, context), (int) AbstractC2234.m4163(20, context), (int) AbstractC2234.m4163(12, context));
                relativeLayout2.setBackgroundColor(Color.parseColor((AbstractC2234.m4176(context) ? C0121.f1130 : C0122.f1131).m2666()));
                relativeLayout2.setOnClickListener(new ViewOnClickListenerC0111(c0114, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.AccountInfoCenter_flAvatar);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14);
                layoutParams.topMargin = (int) AbstractC2234.m4163(Integer.valueOf(C0120.f1129.m2662()), context);
                frameLayout.setLayoutParams(layoutParams);
                ImageView imageView = new ImageView(context);
                int iM4163 = (int) AbstractC2234.m4163(Integer.valueOf(C0119.f1128.m2662()), context);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(iM4163, iM4163));
                C1900 c1900 = C1900.f6295;
                C0772.f2876.getClass();
                String strM2366 = C0772.m2366();
                c1900.getClass();
                String strM3832 = C1900.m3832(strM2366, true);
                C2667 c2667 = new C2667(Math.max(1, (int) (C0118.f1127.m2661() * iM4163)));
                ComponentCallbacks2C2619 componentCallbacks2C2619M4602 = ComponentCallbacks2C0027.m757(context).f593.m4602(context);
                componentCallbacks2C2619M4602.getClass();
                C2612 c2612M4591 = new C2612(componentCallbacks2C2619M4602.f8286, componentCallbacks2C2619M4602, Drawable.class, componentCallbacks2C2619M4602.f8287).m4595(strM3832).mo1632((C2621) new C2621().m1644(c2667, true));
                c2612M4591.getClass();
                AbstractC3580.m5116();
                if (!AbstractC0354.m1631(c2612M4591.f1737, 2048) && imageView.getScaleType() != null) {
                    switch (AbstractC2611.f8264[imageView.getScaleType().ordinal()]) {
                        case 1:
                            abstractC0354M1637 = c2612M4591.clone().m1637(C1102.f4120, new C0559());
                            break;
                        case 2:
                            abstractC0354M1637 = c2612M4591.clone().m1637(C1102.f4119, new C0560());
                            abstractC0354M1637.f1750 = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            abstractC0354M1637 = c2612M4591.clone().m1637(C1102.f4118, new C1344());
                            abstractC0354M1637.f1750 = true;
                            break;
                        case 6:
                            abstractC0354M1637 = c2612M4591.clone().m1637(C1102.f4119, new C0560());
                            abstractC0354M1637.f1750 = true;
                            break;
                        default:
                            abstractC0354M1637 = c2612M4591;
                            break;
                    }
                } else {
                    abstractC0354M1637 = c2612M4591;
                }
                C1472 c1472 = c2612M4591.f8269;
                Class cls = c2612M4591.f8268;
                c1472.f5239.getClass();
                if (Bitmap.class.equals(cls)) {
                    c0398 = new C0398(imageView, 0);
                } else {
                    if (!Drawable.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                    }
                    c0398 = new C0398(imageView, 1);
                }
                c2612M4591.m4594(c0398, abstractC0354M1637);
                if (c0398.f1947 == null) {
                    ViewOnAttachStateChangeListenerC0546 viewOnAttachStateChangeListenerC0546 = new ViewOnAttachStateChangeListenerC0546(c0398, 4);
                    c0398.f1947 = viewOnAttachStateChangeListenerC0546;
                    if (!c0398.f1949) {
                        c0398.f1945.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0546);
                        c0398.f1949 = true;
                    }
                }
                frameLayout.addView(imageView);
                relativeLayout2.addView(frameLayout);
                relativeLayout2.addView(C0129.m1271(c0129, context, R.id.AccountInfoCenter_tvName, R.id.AccountInfoCenter_flAvatar, C0125.f1134.m2662(), 18.0f, C0123.f1132.m2666(), C0124.f1133.m2660(), new File(C0129.f1142, "nickName.ttf"), 128));
                relativeLayout2.addView(C0129.m1271(c0129, context, R.id.AccountInfoCenter_tvAlias, R.id.AccountInfoCenter_tvName, C0117.f1126.m2662(), 16.0f, C0115.f1124.m2666(), C0116.f1125.m2660(), null, 1920));
                relativeLayout2.addView(C0129.m1271(c0129, context, R.id.AccountInfoCenter_tvSign, R.id.AccountInfoCenter_tvAlias, C0128.f1137.m2662(), 14.0f, C0126.f1135.m2666(), C0127.f1136.m2660(), null, 1792));
                relativeLayout.addView(relativeLayout2);
                return c3554;
            case 2:
                int i9 = EnumC3733.f11631.f11641;
                String[] strArr2 = AbstractC1471.f5234;
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
                C1756 c1756 = new C1756();
                c1756.f5892 = jSONObject;
                c1756.f5893 = hashSet;
                c1756.f5894 = hashSet2;
                AbstractC0738.m2275(i9, str2, c1756.toString(), System.currentTimeMillis());
                Activity activityM3476 = AbstractC1586.m3476();
                C1902 c1902 = C1902.f6297;
                String str10 = "";
                List listM2311 = AbstractC0740.m2311("该微信号因使用了微信外挂、非官方客户端或模拟器，被限制登录，请尽快卸载对应的非法软件。若后续仍继续使用将永久限制登录。如需继续使用，请轻触 “确定” 申请解除限制。", "该账号违反了《微信个人账号使用规范》，请轻触 “确定” 了解详情后，继续登录微信。", "你的账号可能有安全风险，为了你的账号安全，暂时无法在新设备登录，你可以在常用手机登录微信，或者轻触「了解详情」查看更多信息。", "账号状态异常，本次登录已失效。请尝试重新登录，并根据弹窗提示操作。");
                C2527 c2527 = AbstractC2528.f8058;
                String str11 = (String) AbstractC0739.m2298(listM2311);
                String str12 = "确定";
                String str13 = "取消";
                int i10 = 0;
                DialogInterfaceOnClickListenerC1137 dialogInterfaceOnClickListenerC1137 = new DialogInterfaceOnClickListenerC1137(i10);
                DialogInterfaceOnClickListenerC1137 dialogInterfaceOnClickListenerC1138 = new DialogInterfaceOnClickListenerC1137(i10);
                c1902.getClass();
                int i11 = AbstractC1768.f5906;
                ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Context.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(DialogInterface.OnClickListener.class), AbstractC2574.m4549(DialogInterface.OnClickListener.class)}, 7, AbstractC2727.m4712(AbstractC0972.m2608(C1901.f6296)).m3560())).m4025(activityM3476, str11, str10, str12, str13, dialogInterfaceOnClickListenerC1137, dialogInterfaceOnClickListenerC1138);
                return c3554;
            case 3:
                ((C1023) obj).f3740 = new C0113(i2);
                return c3554;
            case 4:
                ((C1335) obj).m3155(new C0113(i5));
                return c3554;
            case 5:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                Object obj3 = c2642 instanceof C2641 ? null : c2642;
                int i12 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj3).m3558();
                String[] strArr3 = AbstractC1471.f5234;
                c1300M3558.f6475 = "f";
                Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126();
                C1300 c1300M3559 = AbstractC2727.m4713(objM3126).m3558();
                c1300M3559.f6475 = "f";
                try {
                    if (new JSONObject((String) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).optJSONArray("ad_slot_data") != null) {
                        C1300 c1300M35510 = AbstractC2727.m4713(objM3126).m3558();
                        c1300M35510.f6475 = "f";
                        ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3128("{}");
                    }
                    break;
                } catch (Throwable unused) {
                }
                return c3554;
            case 6:
                C2012 c2012 = (C2012) obj;
                String[] strArr4 = AbstractC1471.f5234;
                String[] strArr5 = {"com.tencent.mm.plugin.brandservice.api.TransferResultInfo"};
                c2012.getClass();
                C2368 c2368 = new C2368();
                ArrayList arrayList2 = new ArrayList(C1191.f4326);
                c2368.f7607 = arrayList2;
                String str14 = strArr5[0];
                if (str14 != null) {
                    c2365 = new C2365();
                    C0700 c0700 = new C0700();
                    c0700.f2677 = new C2897(str14, 5, false);
                    c2365.f7602 = c0700;
                }
                c2368.f7607 = arrayList2;
                arrayList2.add(c2365);
                c2012.f6666 = c2368;
                c2012.m4021("MicroMsg.BaseTransferRequest");
                return c3554;
            case 7:
                C1787.m3673(C0194.f1311, new C0113(i3));
                return c3554;
            case 8:
                C0113 c0113 = new C0113(9);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c0113, (InterfaceC0841) null));
                return c3554;
            case 9:
                C0815 c0815 = (C0815) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c0815.f3205 = "搜索群聊";
                String str15 = "群聊";
                ArrayList<GroupInfo> arrayListM4251 = AbstractC2240.m4251();
                ArrayList arrayList3 = new ArrayList(AbstractC0741.m2313(arrayListM4251, 10));
                for (GroupInfo groupInfo : arrayListM4251) {
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
                    arrayList3.add(new C0800(roomId, sb.toString(), groupInfo.getRoomId(), C0193.f1310.m2665().contains(groupInfo.getRoomId())));
                }
                c0815.m2483(str15, arrayList3);
                c0815.f3206 = R.drawable.ic_contact_confirm_24dp;
                String str16 = "屏蔽";
                C0192 c0192 = new C0192(i7);
                c0815.f3209 = str16;
                c0815.f3211 = c0192;
                return c3554;
            case 10:
                ((C1023) obj).f3740 = new C0113(11);
                return c3554;
            case 11:
                ((C1335) obj).m3155(new C0113(13));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1574) obj).m3452(null);
                return c3554;
            case 13:
                ((C2012) obj).m4021("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C0700) obj).m2220("MicroMsg.VoiceMsgExtension");
                return c3554;
            case 15:
                ((C1334) obj).m3153(new C0113(18));
                return c3554;
            case 16:
                ((C1334) obj).m3153(new C0113(17));
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                ((C0700) obj).m2220("MicroMsg.ImgMsgExtension");
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C0700) obj).m2220("MicroMsg.VideoMsgExtension");
                return c3554;
            case 19:
                final C2041 c2041M4058 = C2041.m4058(LayoutInflater.from(((View) obj).getContext()));
                c2041M4058.f6811.setText(C0201.f1326.m2666());
                C2037 c2038 = new C2037();
                C0202.f1327.getClass();
                c2038.f6779 = C0202.f1329;
                c2038.f6781 = c2041M4058.f6810;
                c2038.m4057("保存", new InterfaceC1422() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲈᲇᲁᲀ
                    @Override // p000.InterfaceC1422
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                C0201.f1326.m2672(String.valueOf(c2041M4058.f6811.getText()));
                                break;
                            default:
                                C0204.f1333.m2672(String.valueOf(c2041M4058.f6811.getText()));
                                break;
                        }
                        return C3554.UNIT;
                    }
                });
                AbstractC2844.m4788(c2038, null, 3);
                return c3554;
            case 20:
                ((C1023) obj).f3739 = new C0113(16);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3739 = new C0113(23);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1023) obj).f3739 = new C0113(15);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1334) obj).m3153(new C0113(i4));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1574) obj).m3452(null);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                final C2041 c2041M4059 = C2041.m4058(LayoutInflater.from(((View) obj).getContext()));
                c2041M4059.f6811.setText(C0204.f1333.m2666());
                C2037 c2039 = new C2037();
                C0205.f1334.getClass();
                c2039.f6779 = C0205.f1336;
                c2039.f6781 = c2041M4059.f6810;
                c2039.m4057("保存", new InterfaceC1422() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲈᲇᲁᲀ
                    @Override // p000.InterfaceC1422
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                C0201.f1326.m2672(String.valueOf(c2041M4059.f6811.getText()));
                                break;
                            default:
                                C0204.f1333.m2672(String.valueOf(c2041M4059.f6811.getText()));
                                break;
                        }
                        return C3554.UNIT;
                    }
                });
                AbstractC2844.m4788(c2039, null, 3);
                return c3554;
            case 26:
                ((C1023) obj).f3740 = new C0113(27);
                return c3554;
            case 27:
                C1335 c1335 = (C1335) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.sdk.platformtools");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.SDK.XmlParser", "[ %s ]");
                c1335.f4794 = c2013;
                return c3554;
            case 28:
                C1574 c1576 = (C1574) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1576.getClass();
                try {
                    c2643 = c1576.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                String str17 = (String) c2643;
                String str18 = str17 == null ? "" : str17;
                try {
                    c2644 = c1576.m3447()[1];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                String str19 = (String) c2644;
                if ((str19 != null ? str19 : "").equals("sysmsg") && AbstractC2901.m4861(str18, "revokemsg", false)) {
                    Object objM3449 = c1576.m3449();
                    if (!(objM3449 instanceof Map) || ((objM3449 instanceof InterfaceC1761) && !(objM3449 instanceof InterfaceC1763))) {
                        objM3449 = null;
                    }
                    Map map = (Map) objM3449;
                    if (map != null) {
                        String str20 = ".sysmsg.$type";
                        if (map.containsKey(str20) && AbstractC1469.m3322(map.get(str20), "revokemsg")) {
                            String str21 = (String) map.get(".sysmsg.revokemsg.session");
                            String str22 = (String) map.get(".sysmsg.revokemsg.replacemsg");
                            String str23 = (String) map.get(".sysmsg.revokemsg.newmsgid");
                            if (str22.startsWith("\"") || str22.startsWith("「")) {
                                map.put(str20, null);
                                c1576.m3452(map);
                                int i13 = AbstractC1768.f5906;
                                C2859.f9091.getClass();
                                C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
                                c2004M3560.f6475 = "rawQuery";
                                Cursor cursor = (Cursor) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(Object[].class)}, 2, c2004M3560)).m4026("SELECT createTime FROM message WHERE msgSvrId = ?", new Object[]{str23});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            long j = cursor.getLong(cursor.getColumnIndex("createTime"));
                                            C1931 c1931M3093 = AbstractC1272.m3093(Pattern.compile("([\"「])(.*?)([」\"])").matcher(str22), 0, str22);
                                            if (c1931M3093 != null && (listM3883 = c1931M3093.m3883()) != null) {
                                                str = (String) ((C1930) listM3883).get(2);
                                            }
                                            AbstractC0738.m2275(EnumC3733.f11627.f11641, str21, "\"" + str + "\" " + C0204.f1333.m2666(), j + 1);
                                        }
                                        cursor.close();
                                        break;
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            AbstractC3528.m5090(cursor, th5);
                                            throw th6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return c3554;
            default:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                new C0383(0, 6, c1577).m1714("");
                return c3554;
        }
    }
}
