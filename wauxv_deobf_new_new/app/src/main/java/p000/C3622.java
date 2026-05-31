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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤞᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3622 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public List f11322;

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2124() {
        return this.f11322.size();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2469(int i) {
        AbstractC0374 abstractC0374 = (AbstractC0374) this.f11322.get(i);
        if (abstractC0374 instanceof C0370) {
            return 0;
        }
        if (abstractC0374 instanceof C0369) {
            return 1;
        }
        if (abstractC0374 instanceof C0373) {
            return 2;
        }
        if (abstractC0374 instanceof C0371) {
            return 3;
        }
        if (abstractC0374 instanceof C0372) {
            return 4;
        }
        throw new C0758();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2125(AbstractC2563 abstractC2563, int i) {
        boolean z;
        String str;
        final C3618 c3618 = abstractC2563 instanceof C3618 ? (C3618) abstractC2563 : null;
        if (c3618 != null) {
            final AbstractC0374 abstractC0374 = (AbstractC0374) this.f11322.get(i);
            switch (c3618.f11312) {
                case 0:
                    C1693 c1693 = (C1693) c3618.f11313;
                    C0369 c0369 = abstractC0374 instanceof C0369 ? (C0369) abstractC0374 : null;
                    if (c0369 != null) {
                        View.OnClickListener onClickListener = c0369.f1852;
                        String str2 = c0369.f1851;
                        ((MaterialTextView) c1693.f5698).setText(c0369.f1850);
                        if (str2 == null || str2.length() == 0) {
                            ((MaterialTextView) c1693.f5696).setVisibility(8);
                        } else {
                            MaterialTextView materialTextView = (MaterialTextView) c1693.f5696;
                            materialTextView.setVisibility(0);
                            materialTextView.setText(str2);
                        }
                        if (onClickListener == null) {
                            ((ShapeableImageView) c1693.f5697).setVisibility(8);
                            c1693.f5695.setOnClickListener(null);
                        } else {
                            ((ShapeableImageView) c1693.f5697).setVisibility(0);
                            c1693.f5695.setOnClickListener(onClickListener);
                        }
                    }
                    break;
                case 1:
                    C0370 c0370 = abstractC0374 instanceof C0370 ? (C0370) abstractC0374 : null;
                    if (c0370 != null) {
                        ((MaterialTextView) ((C1692) c3618.f11313).f5693).setText(c0370.f1853);
                    }
                    break;
                case 2:
                    C1694 c1694 = (C1694) c3618.f11313;
                    C0371 c0371 = abstractC0374 instanceof C0371 ? (C0371) abstractC0374 : null;
                    if (c0371 != null) {
                        ViewOnClickListenerC0811 viewOnClickListenerC0811 = c0371.f1857;
                        String str3 = c0371.f1855;
                        C2400 c2400 = c0371.f1856;
                        MaterialTextView materialTextView2 = c1694.f5704;
                        MaterialTextView materialTextView3 = c1694.f5702;
                        MaterialSwitch materialSwitch = c1694.f5701;
                        materialTextView2.setText(c0371.f1854);
                        c1694.f5703.setText(c2400.f7684);
                        materialSwitch.setEnabled(C2406.f7709.mo3445());
                        materialSwitch.setChecked(c2400.m4345());
                        materialSwitch.setOnCheckedChangeListener(new C0681(c0371, 1));
                        if (str3 == null || str3.length() == 0) {
                            materialTextView3.setVisibility(8);
                        } else {
                            materialTextView3.setVisibility(0);
                            materialTextView3.setText(str3);
                        }
                        materialSwitch.setThumbIconResource(R.drawable.ic_setting_switch_24dp);
                        c1694.f5700.setOnClickListener(viewOnClickListenerC0811);
                    }
                    break;
                case 3:
                    C1691 c1691 = (C1691) c3618.f11313;
                    C0372 c0372 = abstractC0374 instanceof C0372 ? (C0372) abstractC0374 : null;
                    if (c0372 != null) {
                        ViewOnClickListenerC0811 viewOnClickListenerC0812 = c0372.f1863;
                        String str4 = c0372.f1859;
                        TextView textView = (TextView) c1691.f5690;
                        MaterialTextView materialTextView4 = (MaterialTextView) c1691.f5687;
                        textView.setText(c0372.f1861);
                        ((MaterialTextView) c1691.f5688).setText(c0372.f1858);
                        if (str4 == null || str4.length() == 0) {
                            materialTextView4.setVisibility(8);
                        } else {
                            materialTextView4.setVisibility(0);
                            materialTextView4.setText(str4);
                        }
                        ((ShapeableImageView) c1691.f5686).setVisibility(0);
                        ((LinearLayout) c1691.f5689).setOnClickListener(viewOnClickListenerC0812);
                    }
                    break;
                default:
                    String[] strArr = AbstractC1471.f5234;
                    C1694 c1695 = (C1694) c3618.f11313;
                    final C0373 c0373 = abstractC0374 instanceof C0373 ? (C0373) abstractC0374 : null;
                    if (c0373 != null) {
                        String str5 = c0373.f1865;
                        View.OnLongClickListener onLongClickListener = c0373.f1868;
                        View.OnClickListener onClickListener2 = c0373.f1867;
                        MaterialTextView materialTextView5 = c1695.f5704;
                        LinearLayout linearLayout = c1695.f5700;
                        MaterialTextView materialTextView6 = c1695.f5703;
                        MaterialSwitch materialSwitch2 = c1695.f5701;
                        materialTextView5.setText(c0373.f1864);
                        boolean z2 = onClickListener2 != null;
                        boolean z3 = onLongClickListener != null;
                        MaterialTextView materialTextView7 = c1695.f5702;
                        if (z2 && z3) {
                            z = z2;
                            str = "单击+长按";
                        } else {
                            z = z2;
                            str = z3 ? "长按" : z ? "单击" : "";
                        }
                        materialTextView7.setText(str);
                        materialTextView7.setVisibility((z || z3) ? 0 : 8);
                        materialSwitch2.setChecked(c0373.f1866.mo3445());
                        materialSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤞᛸᲇᤝ
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                                if (compoundButton.isPressed()) {
                                    C0373 c0374 = c0373;
                                    C3619 c3619 = new C3619(c0374, z4, c3618);
                                    if (!z4 || c0374.f1866.mo4271()) {
                                        c3619.invoke();
                                        return;
                                    }
                                    C2037 c2037 = new C2037();
                                    String[] strArr2 = AbstractC1471.f5234;
                                    c2037.f6779 = "提示";
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("此功能 (");
                                    sb.append(((C0373) abstractC0374).f1864);
                                    sb.append(") 暂不支持在 ");
                                    C1576.f5470.getClass();
                                    sb.append(C1576.m3459());
                                    sb.append(" 上使用, 仍要开启?");
                                    c2037.f6780 = sb.toString();
                                    C2037.m4054(c2037, new C2070(c3619, 19), 1);
                                    C2037.m4053(c2037, new C3620(compoundButton, 0), 1);
                                    c2037.f6791 = new C3620(compoundButton, 1);
                                    c2037.m4055().m3985();
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

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        String[] strArr = AbstractC1471.f5234;
        if (i == 0) {
            C1576.f5470.getClass();
            View viewInflate = AbstractC2902.m4890(C1576.m3456()).inflate(R.layout.item_rv_view_header, viewGroup, false);
            MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewInflate, R.id.itemHeaderViewTextViewTitle);
            if (materialTextView != null) {
                return new C3618(new C1692((LinearLayout) viewInflate, materialTextView, 1));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemHeaderViewTextViewTitle)));
        }
        if (i == 1) {
            C1576.f5470.getClass();
            View viewInflate2 = AbstractC2902.m4890(C1576.m3456()).inflate(R.layout.item_rv_view_content, viewGroup, false);
            int i2 = R.id.itemContentViewImageViewNav;
            ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC1272.m3098(viewInflate2, R.id.itemContentViewImageViewNav);
            if (shapeableImageView != null) {
                i2 = R.id.itemContentViewTextViewDesc;
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1272.m3098(viewInflate2, R.id.itemContentViewTextViewDesc);
                if (materialTextView2 != null) {
                    i2 = R.id.itemContentViewTextViewTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) AbstractC1272.m3098(viewInflate2, R.id.itemContentViewTextViewTitle);
                    if (materialTextView3 != null) {
                        return new C3618(new C1693((LinearLayout) viewInflate2, shapeableImageView, materialTextView2, materialTextView3, 0));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
        }
        if (i == 2) {
            C1576.f5470.getClass();
            View viewInflate3 = AbstractC2902.m4890(C1576.m3456()).inflate(R.layout.item_rv_view_switch, viewGroup, false);
            int i3 = R.id.itemSwitchViewSwitchFunc;
            MaterialSwitch materialSwitch = (MaterialSwitch) AbstractC1272.m3098(viewInflate3, R.id.itemSwitchViewSwitchFunc);
            if (materialSwitch != null) {
                i3 = R.id.itemSwitchViewTextViewActionTag;
                MaterialTextView materialTextView4 = (MaterialTextView) AbstractC1272.m3098(viewInflate3, R.id.itemSwitchViewTextViewActionTag);
                if (materialTextView4 != null) {
                    i3 = R.id.itemSwitchViewTextViewDesc;
                    MaterialTextView materialTextView5 = (MaterialTextView) AbstractC1272.m3098(viewInflate3, R.id.itemSwitchViewTextViewDesc);
                    if (materialTextView5 != null) {
                        i3 = R.id.itemSwitchViewTextViewTitle;
                        MaterialTextView materialTextView6 = (MaterialTextView) AbstractC1272.m3098(viewInflate3, R.id.itemSwitchViewTextViewTitle);
                        if (materialTextView6 != null) {
                            return new C3618(new C1694((LinearLayout) viewInflate3, materialSwitch, materialTextView4, materialTextView5, materialTextView6, 1), (byte) 0);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
        }
        if (i == 3) {
            C1576.f5470.getClass();
            View viewInflate4 = AbstractC2902.m4890(C1576.m3456()).inflate(R.layout.item_rv_view_plugin, viewGroup, false);
            int i4 = R.id.itemPluginViewSwitchFunc;
            MaterialSwitch materialSwitch2 = (MaterialSwitch) AbstractC1272.m3098(viewInflate4, R.id.itemPluginViewSwitchFunc);
            if (materialSwitch2 != null) {
                i4 = R.id.itemPluginViewTextViewDesc;
                MaterialTextView materialTextView7 = (MaterialTextView) AbstractC1272.m3098(viewInflate4, R.id.itemPluginViewTextViewDesc);
                if (materialTextView7 != null) {
                    i4 = R.id.itemPluginViewTextViewPluginId;
                    MaterialTextView materialTextView8 = (MaterialTextView) AbstractC1272.m3098(viewInflate4, R.id.itemPluginViewTextViewPluginId);
                    if (materialTextView8 != null) {
                        i4 = R.id.itemPluginViewTextViewTitle;
                        MaterialTextView materialTextView9 = (MaterialTextView) AbstractC1272.m3098(viewInflate4, R.id.itemPluginViewTextViewTitle);
                        if (materialTextView9 != null) {
                            return new C3618(new C1694((LinearLayout) viewInflate4, materialSwitch2, materialTextView7, materialTextView8, materialTextView9, 0));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i4)));
        }
        if (i != 4) {
            throw new IllegalArgumentException("onCreateViewHolder Failed");
        }
        C1576.f5470.getClass();
        View viewInflate5 = AbstractC2902.m4890(C1576.m3456()).inflate(R.layout.item_rv_search_result, viewGroup, false);
        int i5 = R.id.itemSearchResultImageViewNav;
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) AbstractC1272.m3098(viewInflate5, R.id.itemSearchResultImageViewNav);
        if (shapeableImageView2 != null) {
            i5 = R.id.itemSearchResultTextViewChip;
            TextView textView = (TextView) AbstractC1272.m3098(viewInflate5, R.id.itemSearchResultTextViewChip);
            if (textView != null) {
                i5 = R.id.itemSearchResultTextViewDesc;
                MaterialTextView materialTextView10 = (MaterialTextView) AbstractC1272.m3098(viewInflate5, R.id.itemSearchResultTextViewDesc);
                if (materialTextView10 != null) {
                    i5 = R.id.itemSearchResultTextViewTitle;
                    MaterialTextView materialTextView11 = (MaterialTextView) AbstractC1272.m3098(viewInflate5, R.id.itemSearchResultTextViewTitle);
                    if (materialTextView11 != null) {
                        return new C3618(new C1691((LinearLayout) viewInflate5, shapeableImageView2, textView, materialTextView10, materialTextView11, 1));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i5)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m5152(List list) {
        this.f11322 = list;
        m4462();
    }
}
