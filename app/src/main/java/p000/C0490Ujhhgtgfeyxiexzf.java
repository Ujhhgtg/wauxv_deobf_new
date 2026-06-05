package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ能不能ᛳᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0490Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0618Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0490Ujhhgtgfeyxiexzf f2404Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final List f2405Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2406Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2407Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f2408Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final C0317Ujhhgtgfeyxiexzf f2409Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401584053814666L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401678543095178L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401773032375690L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401730082702730L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401824571983242L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928401884701525386L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2404Ujhhgtgfeyxiexzf = new C0490Ujhhgtgfeyxiexzf(MagicFactory.get(4928398358533375370L, strArr));
        f2405Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928401983485773194L, strArr), MagicFactory.get(4928401949126034826L, strArr), MagicFactory.get(4928400918333883786L, strArr), MagicFactory.get(4928401021413098890L, strArr), MagicFactory.get(4928400982758393226L, strArr), MagicFactory.get(4928401068657739146L, strArr));
        f2406Ujhhgtgfeyxiexzf = MagicFactory.get(4928401145967150474L, strArr);
        f2407Ujhhgtgfeyxiexzf = MagicFactory.get(4928401133082248586L, strArr);
        f2408Ujhhgtgfeyxiexzf = MagicFactory.get(4928401103017477514L, strArr);
        f2409Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(21);
    }

    @Override // p000.InterfaceC0618Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo1789Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        if (mo1424feyxiexzfUjhhgtg()) {
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setVisibility(8);
            relativeLayout.setId(R.id.MsgInfo_RelativeLayout);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setId(R.id.MsgInfo_TextView);
            relativeLayout.addView(textView);
            viewGroup.addView(relativeLayout);
        }
    }

    @Override // p000.InterfaceC0618Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void mo1790Ujhhgtgfeyxiexzf(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        String str;
        String str2;
        if (mo1424feyxiexzfUjhhgtg()) {
            RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.MsgInfo_RelativeLayout);
            if (msgInfoBean.getType() == EnumC2267feyxiexzfUjhhgtg.f7427Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.setVisibility(0);
            if (msgInfoBean.isSend()) {
                layoutParams.addRule(11);
                layoutParams.setMarginEnd((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Integer.valueOf(C0483Ujhhgtgfeyxiexzf.f2397Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()), relativeLayout.getContext()));
            } else {
                layoutParams.addRule(9);
                layoutParams.setMarginStart((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Integer.valueOf(C0482Ujhhgtgfeyxiexzf.f2396Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()), relativeLayout.getContext()));
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu);
            if (viewGroup2 != null) {
                layoutParams.addRule(3, viewGroup2.getId());
            } else {
                C0521Ujhhgtgfeyxiexzf.f2469Ujhhgtgfeyxiexzf.getClass();
                C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                View viewFindViewById = viewGroup.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0520Ujhhgtgfeyxiexzf.f2468Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0521Ujhhgtgfeyxiexzf.m1809feyxiexzfUjhhgtg()));
                if (viewFindViewById != null) {
                    layoutParams.addRule(3, viewFindViewById.getId());
                }
            }
            relativeLayout.setLayoutParams(layoutParams);
            TextView textView = (TextView) viewGroup.findViewById(R.id.MsgInfo_TextView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(textView.getContext())) {
                gradientDrawable.setColor(Color.parseColor(C0477Ujhhgtgfeyxiexzf.f2390Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
                textView.setTextColor(Color.parseColor(C0485Ujhhgtgfeyxiexzf.f2399Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            } else {
                gradientDrawable.setColor(Color.parseColor(C0481Ujhhgtgfeyxiexzf.f2395Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
                textView.setTextColor(Color.parseColor(C0484Ujhhgtgfeyxiexzf.f2398Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            }
            gradientDrawable.setCornerRadius(5.0f);
            textView.setBackground(gradientDrawable);
            int iM5234Ujhhgtgfeyxiexzf = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(5, textView.getContext());
            textView.setPadding(iM5234Ujhhgtgfeyxiexzf, iM5234Ujhhgtgfeyxiexzf, iM5234Ujhhgtgfeyxiexzf, iM5234Ujhhgtgfeyxiexzf);
            f2404Ujhhgtgfeyxiexzf.getClass();
            String strM4623Ujhhgtgfeyxiexzf = C0488Ujhhgtgfeyxiexzf.f2402Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            String strM2681feyxiexzfUjhhgtg = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM4623Ujhhgtgfeyxiexzf, MagicFactory.get(4928398495972328842L, strArr), AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(msgInfoBean.getCreateTime(), C0487Ujhhgtgfeyxiexzf.f2401Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), null, 2));
            String str3 = MagicFactory.get(4928398599051543946L, strArr);
            long createTime = msgInfoBean.getCreateTime();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            long epochDay = LocalDate.now(zoneIdSystemDefault).toEpochDay() - Instant.ofEpochMilli(createTime).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
            if (epochDay > 1) {
                str = epochDay + MagicFactory.get(4928398444432721290L, strArr);
            } else if (epochDay == 1) {
                str = MagicFactory.get(4928398431547819402L, strArr);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - createTime;
                if (jCurrentTimeMillis <= 0) {
                    str = MagicFactory.get(4928398418662917514L, strArr);
                } else {
                    long j = jCurrentTimeMillis / ((long) 60000);
                    long j2 = jCurrentTimeMillis / ((long) 3600000);
                    if (j < 1) {
                        str = MagicFactory.get(4928398543216969098L, strArr);
                    } else if (j2 < 1) {
                        str = j + MagicFactory.get(4928398530332067210L, strArr);
                    } else {
                        str = Math.max(j2, 1L) + MagicFactory.get(4928398513152198026L, strArr);
                    }
                }
            }
            String strM2681feyxiexzfUjhhgtg2 = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM2681feyxiexzfUjhhgtg, str3, str);
            String str4 = MagicFactory.get(4928398667771020682L, strArr);
            StringBuilder sb = new StringBuilder();
            sb.append(MagicFactory.get(4928398633411282314L, strArr));
            int type = msgInfoBean.getType();
            AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
            String string = Integer.toString(type, 16);
            MagicFactory.get(4928402056500217226L, strArr);
            String upperCase = string.toUpperCase(Locale.ROOT);
            MagicFactory.get(4928401996370675082L, strArr);
            sb.append(upperCase);
            String strM2681feyxiexzfUjhhgtg3 = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM2681feyxiexzfUjhhgtg2, str4, sb.toString()), MagicFactory.get(4928402060795184522L, strArr), String.valueOf(msgInfoBean.getMsgId())), MagicFactory.get(4928402159579432330L, strArr), String.valueOf(msgInfoBean.getMsgSvrId()));
            String str5 = MagicFactory.get(4928402245478778250L, strArr);
            if (msgInfoBean.getAtUserList().isEmpty()) {
                str2 = MagicFactory.get(4928402271248582026L, strArr);
            } else if (msgInfoBean.isAnnounceAll()) {
                str2 = MagicFactory.get(4928402322788189578L, strArr);
            } else if (msgInfoBean.isNotifyAll()) {
                str2 = MagicFactory.get(4928402301313353098L, strArr);
            } else if (msgInfoBean.isAtMe()) {
                str2 = MagicFactory.get(4928402284133483914L, strArr);
            } else {
                str2 = "@" + msgInfoBean.getAtUserList().size() + (char) 20154;
            }
            textView.setText(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM2681feyxiexzfUjhhgtg3, str5, str2));
            Integer numValueOf = Integer.valueOf(C0486Ujhhgtgfeyxiexzf.f2400Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf());
            Context context = textView.getContext();
            textView.setTextSize((numValueOf.floatValue() * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity);
            relativeLayout.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(9, msgInfoBean));
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2408Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2407Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2406Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f2409Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
