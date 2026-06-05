package p000;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2074Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0746Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2074Ujhhgtgfeyxiexzf f6812Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Set f6813Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Set f6814Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f6815Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f6816Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final String f6817Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1127feyxiexzfUjhhgtg f6818Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f6812Ujhhgtgfeyxiexzf = new C2074Ujhhgtgfeyxiexzf("SystemBrowserHook");
        String[] strArr2 = {"weixin.com", "qq.com", "weixin.qq.com.cn", "wechatpay.cn", "tenpay.com", "weixinbridge.com"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(6));
        for (int i = 0; i < 6; i++) {
            linkedHashSet.add(strArr2[i]);
        }
        f6813Ujhhgtgfeyxiexzf = linkedHashSet;
        String[] strArr3 = {"test.com"};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(1));
        linkedHashSet2.add(strArr3[0]);
        f6814Ujhhgtgfeyxiexzf = linkedHashSet2;
        f6815Ujhhgtgfeyxiexzf = "杂项";
        f6816Ujhhgtgfeyxiexzf = "系统浏览器";
        f6817Ujhhgtgfeyxiexzf = "致敬经典模块 '去你大爷的内置浏览器' ";
        f6818Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(18);
    }

    @Override // p000.InterfaceC0746Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2085Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, Intent intent) {
        String stringExtra;
        String shortClassName;
        ActivityOptions activityOptionsMakeBasic;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (!mo1424feyxiexzfUjhhgtg() || (stringExtra = intent.getStringExtra("rawUrl")) == null || AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith("http://") || stringExtra.startsWith("https://")) {
            String strM2641Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(stringExtra, "://", stringExtra), "/");
            int iM4619Ujhhgtgfeyxiexzf = C2071Ujhhgtgfeyxiexzf.f6807Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
            if (iM4619Ujhhgtgfeyxiexzf == EnumC2067feyxiexzfUjhhgtg.f6799Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf) {
                Set setM4622Ujhhgtgfeyxiexzf = C2072feyxiexzfUjhhgtg.f6808Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf();
                if (setM4622Ujhhgtgfeyxiexzf == null || !setM4622Ujhhgtgfeyxiexzf.isEmpty()) {
                    Iterator it = setM4622Ujhhgtgfeyxiexzf.iterator();
                    while (it.hasNext()) {
                        if (strM2641Ujhhgtgfeyxiexzf.endsWith((String) it.next())) {
                            return;
                        }
                    }
                }
            } else if (iM4619Ujhhgtgfeyxiexzf == EnumC2067feyxiexzfUjhhgtg.f6800Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf) {
                Set setM4622Ujhhgtgfeyxiexzf2 = C2070Ujhhgtgfeyxiexzf.f6806Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf();
                if (setM4622Ujhhgtgfeyxiexzf2 == null || !setM4622Ujhhgtgfeyxiexzf2.isEmpty()) {
                    Iterator it2 = setM4622Ujhhgtgfeyxiexzf2.iterator();
                    while (it2.hasNext()) {
                        if (strM2641Ujhhgtgfeyxiexzf.endsWith((String) it2.next())) {
                        }
                    }
                    return;
                }
                return;
            }
            ComponentName component = intent.getComponent();
            if (component == null || (shortClassName = component.getShortClassName()) == null || !AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(shortClassName, "MMWebViewUI", false)) {
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent2.putExtras(bundle);
            }
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent2.putExtras(new Bundle());
            intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            int i = Build.VERSION.SDK_INT;
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
            if (!TextUtils.isEmpty(languageTag)) {
                Bundle bundleExtra = intent2.hasExtra("com.android.browser.headers") ? intent2.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", languageTag);
                    intent2.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (i >= 34) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
                AbstractC2959feyxiexzfUjhhgtg.m4420Ujhhgtgfeyxiexzf(activityOptionsMakeBasic);
            } else {
                activityOptionsMakeBasic = null;
            }
            if (i >= 36) {
                if (activityOptionsMakeBasic == null) {
                    activityOptionsMakeBasic = ActivityOptions.makeBasic();
                }
                AbstractC2960feyxiexzfUjhhgtg.m4425Ujhhgtgfeyxiexzf(activityOptionsMakeBasic, true ^ intent2.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
            }
            Bundle bundle2 = activityOptionsMakeBasic != null ? activityOptionsMakeBasic.toBundle() : null;
            intent2.addFlags(268435456);
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            Context contextM1855Ujhhgtgfeyxiexzf = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf();
            intent2.setData(Uri.parse(stringExtra));
            contextM1855Ujhhgtgfeyxiexzf.startActivity(intent2, bundle2);
            c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(null);
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f6817Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f6816Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f6815Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f6818Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
