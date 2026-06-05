package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1905feyxiexzfUjhhgtg extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f6365Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        return this.f6365Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2136Ujhhgtgfeyxiexzf(int i) {
        AbstractC2485feyxiexzfUjhhgtg abstractC2485feyxiexzfUjhhgtg = (AbstractC2485feyxiexzfUjhhgtg) this.f6365Ujhhgtgfeyxiexzf.get(i);
        if (abstractC2485feyxiexzfUjhhgtg instanceof C2508feyxiexzfUjhhgtg) {
            return 0;
        }
        if (abstractC2485feyxiexzfUjhhgtg instanceof C2507feyxiexzfUjhhgtg) {
            return 1;
        }
        if (abstractC2485feyxiexzfUjhhgtg instanceof C2486feyxiexzfUjhhgtg) {
            return 2;
        }
        if (abstractC2485feyxiexzfUjhhgtg instanceof C2489feyxiexzfUjhhgtg) {
            return 3;
        }
        if (abstractC2485feyxiexzfUjhhgtg instanceof C2490feyxiexzfUjhhgtg) {
            return 4;
        }
        throw new C2870Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        boolean z;
        String str;
        final C1906Ujhhgtgfeyxiexzf c1906Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg instanceof C1906Ujhhgtgfeyxiexzf ? (C1906Ujhhgtgfeyxiexzf) abstractC0821feyxiexzfUjhhgtg : null;
        if (c1906Ujhhgtgfeyxiexzf != null) {
            final AbstractC2485feyxiexzfUjhhgtg abstractC2485feyxiexzfUjhhgtg = (AbstractC2485feyxiexzfUjhhgtg) this.f6365Ujhhgtgfeyxiexzf.get(i);
            switch (c1906Ujhhgtgfeyxiexzf.f6366Ujhhgtgfeyxiexzf) {
                case 0:
                    C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = (C0701Ujhhgtgfeyxiexzf) c1906Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf;
                    C2507feyxiexzfUjhhgtg c2507feyxiexzfUjhhgtg = abstractC2485feyxiexzfUjhhgtg instanceof C2507feyxiexzfUjhhgtg ? (C2507feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg : null;
                    if (c2507feyxiexzfUjhhgtg != null) {
                        View.OnClickListener onClickListener = c2507feyxiexzfUjhhgtg.f8188Ujhhgtgfeyxiexzf;
                        String str2 = c2507feyxiexzfUjhhgtg.f8187Ujhhgtgfeyxiexzf;
                        ((MaterialTextView) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf).setText(c2507feyxiexzfUjhhgtg.f8186Ujhhgtgfeyxiexzf);
                        if (str2 == null || str2.length() == 0) {
                            ((MaterialTextView) c0701Ujhhgtgfeyxiexzf.f2876Ujhhgtgfeyxiexzf).setVisibility(8);
                        } else {
                            MaterialTextView materialTextView = (MaterialTextView) c0701Ujhhgtgfeyxiexzf.f2876Ujhhgtgfeyxiexzf;
                            materialTextView.setVisibility(0);
                            materialTextView.setText(str2);
                        }
                        if (onClickListener == null) {
                            ((ShapeableImageView) c0701Ujhhgtgfeyxiexzf.f2877Ujhhgtgfeyxiexzf).setVisibility(8);
                            c0701Ujhhgtgfeyxiexzf.f2875Ujhhgtgfeyxiexzf.setOnClickListener(null);
                        } else {
                            ((ShapeableImageView) c0701Ujhhgtgfeyxiexzf.f2877Ujhhgtgfeyxiexzf).setVisibility(0);
                            c0701Ujhhgtgfeyxiexzf.f2875Ujhhgtgfeyxiexzf.setOnClickListener(onClickListener);
                        }
                    }
                    break;
                case 1:
                    C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg = abstractC2485feyxiexzfUjhhgtg instanceof C2508feyxiexzfUjhhgtg ? (C2508feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg : null;
                    if (c2508feyxiexzfUjhhgtg != null) {
                        ((MaterialTextView) ((C0693Ujhhgtgfeyxiexzf) c1906Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf).f2835Ujhhgtgfeyxiexzf).setText(c2508feyxiexzfUjhhgtg.f8189Ujhhgtgfeyxiexzf);
                    }
                    break;
                case 2:
                    C0702Ujhhgtgfeyxiexzf c0702Ujhhgtgfeyxiexzf = (C0702Ujhhgtgfeyxiexzf) c1906Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf;
                    C2489feyxiexzfUjhhgtg c2489feyxiexzfUjhhgtg = abstractC2485feyxiexzfUjhhgtg instanceof C2489feyxiexzfUjhhgtg ? (C2489feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg : null;
                    if (c2489feyxiexzfUjhhgtg != null) {
                        ViewOnClickListenerC3674feyxiexzfUjhhgtg viewOnClickListenerC3674feyxiexzfUjhhgtg = c2489feyxiexzfUjhhgtg.f8127Ujhhgtgfeyxiexzf;
                        String str3 = c2489feyxiexzfUjhhgtg.f8125Ujhhgtgfeyxiexzf;
                        C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = c2489feyxiexzfUjhhgtg.f8126Ujhhgtgfeyxiexzf;
                        MaterialTextView materialTextView2 = c0702Ujhhgtgfeyxiexzf.f2884Ujhhgtgfeyxiexzf;
                        MaterialTextView materialTextView3 = c0702Ujhhgtgfeyxiexzf.f2882Ujhhgtgfeyxiexzf;
                        MaterialSwitch materialSwitch = c0702Ujhhgtgfeyxiexzf.f2881Ujhhgtgfeyxiexzf;
                        materialTextView2.setText(c2489feyxiexzfUjhhgtg.f8124Ujhhgtgfeyxiexzf);
                        c0702Ujhhgtgfeyxiexzf.f2883Ujhhgtgfeyxiexzf.setText(c1414feyxiexzfUjhhgtg.f4968Ujhhgtgfeyxiexzf);
                        materialSwitch.setEnabled(C1420feyxiexzfUjhhgtg.f4989Ujhhgtgfeyxiexzf.mo1424feyxiexzfUjhhgtg());
                        materialSwitch.setChecked(c1414feyxiexzfUjhhgtg.m2924Ujhhgtgfeyxiexzf());
                        materialSwitch.setOnCheckedChangeListener(new C2817Ujhhgtgfeyxiexzf(1, c2489feyxiexzfUjhhgtg));
                        if (str3 == null || str3.length() == 0) {
                            materialTextView3.setVisibility(8);
                        } else {
                            materialTextView3.setVisibility(0);
                            materialTextView3.setText(str3);
                        }
                        materialSwitch.setThumbIconResource(R.drawable.ic_setting_switch_24dp);
                        c0702Ujhhgtgfeyxiexzf.f2880Ujhhgtgfeyxiexzf.setOnClickListener(viewOnClickListenerC3674feyxiexzfUjhhgtg);
                    }
                    break;
                case 3:
                    C0694Ujhhgtgfeyxiexzf c0694Ujhhgtgfeyxiexzf = (C0694Ujhhgtgfeyxiexzf) c1906Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf;
                    C2490feyxiexzfUjhhgtg c2490feyxiexzfUjhhgtg = abstractC2485feyxiexzfUjhhgtg instanceof C2490feyxiexzfUjhhgtg ? (C2490feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg : null;
                    if (c2490feyxiexzfUjhhgtg != null) {
                        ViewOnClickListenerC3674feyxiexzfUjhhgtg viewOnClickListenerC3674feyxiexzfUjhhgtg2 = c2490feyxiexzfUjhhgtg.f8133Ujhhgtgfeyxiexzf;
                        String str4 = c2490feyxiexzfUjhhgtg.f8129Ujhhgtgfeyxiexzf;
                        TextView textView = (TextView) c0694Ujhhgtgfeyxiexzf.f2841Ujhhgtgfeyxiexzf;
                        MaterialTextView materialTextView4 = (MaterialTextView) c0694Ujhhgtgfeyxiexzf.f2838Ujhhgtgfeyxiexzf;
                        textView.setText(c2490feyxiexzfUjhhgtg.f8131Ujhhgtgfeyxiexzf);
                        ((MaterialTextView) c0694Ujhhgtgfeyxiexzf.f2839Ujhhgtgfeyxiexzf).setText(c2490feyxiexzfUjhhgtg.f8128Ujhhgtgfeyxiexzf);
                        if (str4 == null || str4.length() == 0) {
                            materialTextView4.setVisibility(8);
                        } else {
                            materialTextView4.setVisibility(0);
                            materialTextView4.setText(str4);
                        }
                        ((ShapeableImageView) c0694Ujhhgtgfeyxiexzf.f2837Ujhhgtgfeyxiexzf).setVisibility(0);
                        ((LinearLayout) c0694Ujhhgtgfeyxiexzf.f2840Ujhhgtgfeyxiexzf).setOnClickListener(viewOnClickListenerC3674feyxiexzfUjhhgtg2);
                    }
                    break;
                default:
                    String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    C0702Ujhhgtgfeyxiexzf c0702Ujhhgtgfeyxiexzf2 = (C0702Ujhhgtgfeyxiexzf) c1906Ujhhgtgfeyxiexzf.f6367Ujhhgtgfeyxiexzf;
                    final C2486feyxiexzfUjhhgtg c2486feyxiexzfUjhhgtg = abstractC2485feyxiexzfUjhhgtg instanceof C2486feyxiexzfUjhhgtg ? (C2486feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg : null;
                    if (c2486feyxiexzfUjhhgtg != null) {
                        String str5 = c2486feyxiexzfUjhhgtg.f8120Ujhhgtgfeyxiexzf;
                        View.OnLongClickListener onLongClickListener = c2486feyxiexzfUjhhgtg.f8123Ujhhgtgfeyxiexzf;
                        View.OnClickListener onClickListener2 = c2486feyxiexzfUjhhgtg.f8122Ujhhgtgfeyxiexzf;
                        MaterialTextView materialTextView5 = c0702Ujhhgtgfeyxiexzf2.f2884Ujhhgtgfeyxiexzf;
                        LinearLayout linearLayout = c0702Ujhhgtgfeyxiexzf2.f2880Ujhhgtgfeyxiexzf;
                        MaterialTextView materialTextView6 = c0702Ujhhgtgfeyxiexzf2.f2883Ujhhgtgfeyxiexzf;
                        MaterialSwitch materialSwitch2 = c0702Ujhhgtgfeyxiexzf2.f2881Ujhhgtgfeyxiexzf;
                        materialTextView5.setText(c2486feyxiexzfUjhhgtg.f8119Ujhhgtgfeyxiexzf);
                        boolean z2 = onClickListener2 != null;
                        boolean z3 = onLongClickListener != null;
                        MaterialTextView materialTextView7 = c0702Ujhhgtgfeyxiexzf2.f2882Ujhhgtgfeyxiexzf;
                        if (z2 && z3) {
                            z = z2;
                            str = MagicFactory.get(4928462838877390218L, strArr);
                        } else {
                            z = z2;
                            str = z3 ? MagicFactory.get(4928462813107586442L, strArr) : z ? MagicFactory.get(4928462937661638026L, strArr) : MagicFactory.get(4928462924776736138L, strArr);
                        }
                        materialTextView7.setText(str);
                        materialTextView7.setVisibility((z || z3) ? 0 : 8);
                        materialSwitch2.setChecked(c2486feyxiexzfUjhhgtg.f8121Ujhhgtgfeyxiexzf.mo1424feyxiexzfUjhhgtg());
                        materialSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 上海高中ᛱ谢子非ᛱᛲᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                                if (compoundButton.isPressed()) {
                                    C2486feyxiexzfUjhhgtg c2486feyxiexzfUjhhgtg2 = c2486feyxiexzfUjhhgtg;
                                    C1907feyxiexzfUjhhgtg c1907feyxiexzfUjhhgtg = new C1907feyxiexzfUjhhgtg(c2486feyxiexzfUjhhgtg2, z4, c1906Ujhhgtgfeyxiexzf);
                                    if (!z4 || c2486feyxiexzfUjhhgtg2.f8121Ujhhgtgfeyxiexzf.mo2094feyxiexzfUjhhgtg()) {
                                        c1907feyxiexzfUjhhgtg.invoke();
                                        return;
                                    }
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                    String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = MagicFactory.get(4928462886122030474L, strArr2);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(MagicFactory.get(4928463010676082058L, strArr2));
                                    sb.append(((C2486feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8119Ujhhgtgfeyxiexzf);
                                    sb.append(MagicFactory.get(4928462984906278282L, strArr2));
                                    C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                                    sb.append(C0580Ujhhgtgfeyxiexzf.m1858Ujhhgtgfeyxiexzf());
                                    sb.append(MagicFactory.get(4928462946251572618L, strArr2));
                                    c0290Ujhhgtgfeyxiexzf.f1722Ujhhgtgfeyxiexzf = sb.toString();
                                    C0290Ujhhgtgfeyxiexzf.m1499Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, new C0350Ujhhgtgfeyxiexzf(19, c1907feyxiexzfUjhhgtg), 1);
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, new C1903Ujhhgtgfeyxiexzf(compoundButton, 0), 1);
                                    c0290Ujhhgtgfeyxiexzf.f1733Ujhhgtgfeyxiexzf = new C1903Ujhhgtgfeyxiexzf(compoundButton, 1);
                                    c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                }
                            }
                        });
                        if (str5 == null || str5.length() == 0) {
                            materialTextView6.setVisibility(8);
                        } else {
                            materialTextView6.setVisibility(0);
                            materialTextView6.setText(str5);
                        }
                        linearLayout.setOnClickListener(onClickListener2);
                        linearLayout.setOnLongClickListener(onLongClickListener);
                    }
                    break;
            }
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (i == 0) {
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            View viewInflate = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf()).inflate(R.layout.item_rv_view_header, viewGroup, false);
            MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemHeaderViewTextViewTitle);
            if (materialTextView != null) {
                return new C1906Ujhhgtgfeyxiexzf(new C0693Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, materialTextView, 1));
            }
            throw new NullPointerException(MagicFactory.get(4928817311118263690L, strArr).concat(viewInflate.getResources().getResourceName(R.id.itemHeaderViewTextViewTitle)));
        }
        if (i == 1) {
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            View viewInflate2 = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf()).inflate(R.layout.item_rv_view_content, viewGroup, false);
            int i2 = R.id.itemContentViewImageViewNav;
            ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate2, R.id.itemContentViewImageViewNav);
            if (shapeableImageView != null) {
                i2 = R.id.itemContentViewTextViewDesc;
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate2, R.id.itemContentViewTextViewDesc);
                if (materialTextView2 != null) {
                    i2 = R.id.itemContentViewTextViewTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate2, R.id.itemContentViewTextViewTitle);
                    if (materialTextView3 != null) {
                        return new C1906Ujhhgtgfeyxiexzf(new C0701Ujhhgtgfeyxiexzf((LinearLayout) viewInflate2, shapeableImageView, materialTextView2, materialTextView3, 0));
                    }
                }
            }
            throw new NullPointerException(MagicFactory.get(4928817173679310218L, strArr).concat(viewInflate2.getResources().getResourceName(i2)));
        }
        if (i == 2) {
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            View viewInflate3 = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf()).inflate(R.layout.item_rv_view_switch, viewGroup, false);
            int i3 = R.id.itemSwitchViewSwitchFunc;
            MaterialSwitch materialSwitch = (MaterialSwitch) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate3, R.id.itemSwitchViewSwitchFunc);
            if (materialSwitch != null) {
                i3 = R.id.itemSwitchViewTextViewActionTag;
                MaterialTextView materialTextView4 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate3, R.id.itemSwitchViewTextViewActionTag);
                if (materialTextView4 != null) {
                    i3 = R.id.itemSwitchViewTextViewDesc;
                    MaterialTextView materialTextView5 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate3, R.id.itemSwitchViewTextViewDesc);
                    if (materialTextView5 != null) {
                        i3 = R.id.itemSwitchViewTextViewTitle;
                        MaterialTextView materialTextView6 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate3, R.id.itemSwitchViewTextViewTitle);
                        if (materialTextView6 != null) {
                            return new C1906Ujhhgtgfeyxiexzf(new C0702Ujhhgtgfeyxiexzf((LinearLayout) viewInflate3, materialSwitch, materialTextView4, materialTextView5, materialTextView6, 1), (byte) 0);
                        }
                    }
                }
            }
            throw new NullPointerException(MagicFactory.get(4928817585996170634L, strArr).concat(viewInflate3.getResources().getResourceName(i3)));
        }
        if (i == 3) {
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            View viewInflate4 = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf()).inflate(R.layout.item_rv_view_plugin, viewGroup, false);
            int i4 = R.id.itemPluginViewSwitchFunc;
            MaterialSwitch materialSwitch2 = (MaterialSwitch) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate4, R.id.itemPluginViewSwitchFunc);
            if (materialSwitch2 != null) {
                i4 = R.id.itemPluginViewTextViewDesc;
                MaterialTextView materialTextView7 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate4, R.id.itemPluginViewTextViewDesc);
                if (materialTextView7 != null) {
                    i4 = R.id.itemPluginViewTextViewPluginId;
                    MaterialTextView materialTextView8 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate4, R.id.itemPluginViewTextViewPluginId);
                    if (materialTextView8 != null) {
                        i4 = R.id.itemPluginViewTextViewTitle;
                        MaterialTextView materialTextView9 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate4, R.id.itemPluginViewTextViewTitle);
                        if (materialTextView9 != null) {
                            return new C1906Ujhhgtgfeyxiexzf(new C0702Ujhhgtgfeyxiexzf((LinearLayout) viewInflate4, materialSwitch2, materialTextView7, materialTextView8, materialTextView9, 0));
                        }
                    }
                }
            }
            throw new NullPointerException(MagicFactory.get(4928817448557217162L, strArr).concat(viewInflate4.getResources().getResourceName(i4)));
        }
        if (i != 4) {
            throw new IllegalArgumentException(MagicFactory.get(4928461932639290762L, strArr));
        }
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        View viewInflate5 = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf()).inflate(R.layout.item_rv_search_result, viewGroup, false);
        int i5 = R.id.itemSearchResultImageViewNav;
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate5, R.id.itemSearchResultImageViewNav);
        if (shapeableImageView2 != null) {
            i5 = R.id.itemSearchResultTextViewChip;
            TextView textView = (TextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate5, R.id.itemSearchResultTextViewChip);
            if (textView != null) {
                i5 = R.id.itemSearchResultTextViewDesc;
                MaterialTextView materialTextView10 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate5, R.id.itemSearchResultTextViewDesc);
                if (materialTextView10 != null) {
                    i5 = R.id.itemSearchResultTextViewTitle;
                    MaterialTextView materialTextView11 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate5, R.id.itemSearchResultTextViewTitle);
                    if (materialTextView11 != null) {
                        return new C1906Ujhhgtgfeyxiexzf(new C0694Ujhhgtgfeyxiexzf((LinearLayout) viewInflate5, shapeableImageView2, textView, materialTextView10, materialTextView11, 1));
                    }
                }
            }
        }
        throw new NullPointerException(MagicFactory.get(4928817998313031050L, strArr).concat(viewInflate5.getResources().getResourceName(i5)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3268Ujhhgtgfeyxiexzf(List list) {
        this.f6365Ujhhgtgfeyxiexzf = list;
        m2137Ujhhgtgfeyxiexzf();
    }
}
