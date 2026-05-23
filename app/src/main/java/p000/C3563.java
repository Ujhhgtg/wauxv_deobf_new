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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᤞᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3563 extends AbstractC2482 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public List f11173;

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2040() {
        return this.f11173.size();
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2353(int i) {
        AbstractC0399 abstractC0399 = (AbstractC0399) this.f11173.get(i);
        if (abstractC0399 instanceof C0395) {
            return 0;
        }
        if (abstractC0399 instanceof C0394) {
            return 1;
        }
        if (abstractC0399 instanceof C0398) {
            return 2;
        }
        if (abstractC0399 instanceof C0396) {
            return 3;
        }
        if (abstractC0399 instanceof C0397) {
            return 4;
        }
        throw new C0761();
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2041(AbstractC2508 abstractC2508, int i) {
        final C3559 c3559 = abstractC2508 instanceof C3559 ? (C3559) abstractC2508 : null;
        if (c3559 != null) {
            final AbstractC0399 abstractC0399 = (AbstractC0399) this.f11173.get(i);
            switch (3) {
                case 0:
                    C2103 c2103 = (C2103) c3559.f11164;
                    C0394 c0394 = abstractC0399 instanceof C0394 ? (C0394) abstractC0399 : null;
                    if (c0394 != null) {
                        View.OnClickListener onClickListener = c0394.f1881;
                        String str = c0394.f1880;
                        ((MaterialTextView) c2103.f6938).setText(c0394.f1879);
                        if (str == null || str.length() == 0) {
                            ((MaterialTextView) c2103.f6937).setVisibility(8);
                        } else {
                            MaterialTextView materialTextView = (MaterialTextView) c2103.f6937;
                            materialTextView.setVisibility(0);
                            materialTextView.setText(str);
                        }
                        if (onClickListener == null) {
                            ((ShapeableImageView) c2103.f6936).setVisibility(8);
                            ((LinearLayout) c2103.f6935).setOnClickListener(null);
                        } else {
                            ((ShapeableImageView) c2103.f6936).setVisibility(0);
                            ((LinearLayout) c2103.f6935).setOnClickListener(onClickListener);
                        }
                    }
                    break;
                case 1:
                    C0395 c0395 = abstractC0399 instanceof C0395 ? (C0395) abstractC0399 : null;
                    if (c0395 != null) {
                        ((C1677) c3559.f11164).f5664.setText(c0395.f1882);
                    }
                    break;
                case 2:
                    C1676 c1676 = (C1676) c3559.f11164;
                    C0396 c0396 = abstractC0399 instanceof C0396 ? (C0396) abstractC0399 : null;
                    if (c0396 != null) {
                        ViewOnClickListenerC0812 viewOnClickListenerC0812 = c0396.f1886;
                        String str2 = c0396.f1884;
                        C2355 c2355 = c0396.f1885;
                        MaterialTextView materialTextView2 = (MaterialTextView) c1676.f5662;
                        MaterialTextView materialTextView3 = (MaterialTextView) c1676.f5659;
                        MaterialSwitch materialSwitch = (MaterialSwitch) c1676.f5661;
                        materialTextView2.setText(c0396.f1883);
                        ((MaterialTextView) c1676.f5660).setText(c2355.f7554);
                        materialSwitch.setEnabled(C2361.f7579.mo3264());
                        materialSwitch.setChecked(c2355.m4334());
                        materialSwitch.setOnCheckedChangeListener(new C0690(1, c0396));
                        if (str2 == null || str2.length() == 0) {
                            materialTextView3.setVisibility(8);
                        } else {
                            materialTextView3.setVisibility(0);
                            materialTextView3.setText(str2);
                        }
                        materialSwitch.setThumbIconResource(R.drawable.ic_setting_switch_24dp);
                        ((LinearLayout) c1676.f5658).setOnClickListener(viewOnClickListenerC0812);
                    }
                    break;
                case 3:
                    C1676 c1677 = (C1676) c3559.f11164;
                    C0397 c0397 = abstractC0399 instanceof C0397 ? (C0397) abstractC0399 : null;
                    if (c0397 != null) {
                        ViewOnClickListenerC0812 viewOnClickListenerC0813 = c0397.f1892;
                        String str3 = c0397.f1888;
                        TextView textView = (TextView) c1677.f5662;
                        MaterialTextView materialTextView4 = (MaterialTextView) c1677.f5659;
                        textView.setText(c0397.f1890);
                        ((MaterialTextView) c1677.f5660).setText(c0397.f1887);
                        if (str3 == null || str3.length() == 0) {
                            materialTextView4.setVisibility(8);
                        } else {
                            materialTextView4.setVisibility(0);
                            materialTextView4.setText(str3);
                        }
                        ((ShapeableImageView) c1677.f5661).setVisibility(0);
                        ((LinearLayout) c1677.f5658).setOnClickListener(viewOnClickListenerC0813);
                    }
                    break;
                default:
                    C2103 c2104 = (C2103) c3559.f11164;
                    final C0398 c0398 = abstractC0399 instanceof C0398 ? (C0398) abstractC0399 : null;
                    if (c0398 != null) {
                        View.OnClickListener onClickListener2 = c0398.f1896;
                        String str4 = c0398.f1894;
                        MaterialTextView materialTextView5 = (MaterialTextView) c2104.f6938;
                        LinearLayout linearLayout = (LinearLayout) c2104.f6935;
                        MaterialTextView materialTextView6 = (MaterialTextView) c2104.f6937;
                        MaterialSwitch materialSwitch2 = (MaterialSwitch) c2104.f6936;
                        materialTextView5.setText(c0398.f1893);
                        materialSwitch2.setChecked(c0398.f1895.mo3264());
                        materialSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᤞᲀᲇᛸ
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                if (compoundButton.isPressed()) {
                                    C0398 c0399 = c0398;
                                    C3560 c3560 = new C3560(c0399, z, c3559);
                                    if (!z || c0399.f1895.mo4142()) {
                                        c3560.invoke();
                                        return;
                                    }
                                    C2007 c2007 = new C2007();
                                    String[] strArr = AbstractC1574.f5469;
                                    c2007.f6678 = "提示";
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("此功能 (");
                                    sb.append(((C0398) abstractC0399).f1893);
                                    sb.append(") 暂不支持在 ");
                                    
                                    sb.append(C1565.m3279());
                                    sb.append(" 上使用, 仍要开启?");
                                    c2007.f6679 = sb.toString();
                                    C2007.m3867(c2007, new C2042(18, c3560), 1);
                                    C2007.m3866(c2007, new C3561(compoundButton, 0), 1);
                                    c2007.f6690 = new C3561(compoundButton, 1);
                                    c2007.m3868().m3791();
                                }
                            }
                        });
                        if (str4 == null || str4.length() == 0) {
                            materialTextView6.setVisibility(8);
                        } else {
                            materialTextView6.setVisibility(0);
                            materialTextView6.setText(str4);
                        }
                        if (onClickListener2 == null) {
                            materialSwitch2.setThumbIconDrawable(null);
                            linearLayout.setOnClickListener(null);
                        } else {
                            materialSwitch2.setThumbIconResource(R.drawable.ic_setting_switch_24dp);
                            linearLayout.setOnClickListener(onClickListener2);
                        }
                    }
                    break;
            }
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2508 mo2042(ViewGroup viewGroup, int i) {
        String[] strArr = AbstractC1574.f5469;
        if (i == 0) {
            
            View viewInflate = AbstractC1460.m3216(C1565.m3276()).inflate(R.layout.item_rv_view_header, viewGroup, false);
            MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewInflate, R.id.itemHeaderViewTextViewTitle);
            if (materialTextView != null) {
                return new C3559(new C1677((LinearLayout) viewInflate, materialTextView));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemHeaderViewTextViewTitle)));
        }
        if (i == 1) {
            
            View viewInflate2 = AbstractC1460.m3216(C1565.m3276()).inflate(R.layout.item_rv_view_content, viewGroup, false);
            int i2 = R.id.itemContentViewImageViewNav;
            ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC3681.m5325(viewInflate2, R.id.itemContentViewImageViewNav);
            if (shapeableImageView != null) {
                i2 = R.id.itemContentViewTextViewDesc;
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC3681.m5325(viewInflate2, R.id.itemContentViewTextViewDesc);
                if (materialTextView2 != null) {
                    i2 = R.id.itemContentViewTextViewTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) AbstractC3681.m5325(viewInflate2, R.id.itemContentViewTextViewTitle);
                    if (materialTextView3 != null) {
                        return new C3559(new C2103((LinearLayout) viewInflate2, shapeableImageView, materialTextView2, materialTextView3));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
        }
        if (i == 2) {
            
            View viewInflate3 = AbstractC1460.m3216(C1565.m3276()).inflate(R.layout.item_rv_view_switch, viewGroup, false);
            int i3 = R.id.itemSwitchViewSwitchFunc;
            MaterialSwitch materialSwitch = (MaterialSwitch) AbstractC3681.m5325(viewInflate3, R.id.itemSwitchViewSwitchFunc);
            if (materialSwitch != null) {
                i3 = R.id.itemSwitchViewTextViewDesc;
                MaterialTextView materialTextView4 = (MaterialTextView) AbstractC3681.m5325(viewInflate3, R.id.itemSwitchViewTextViewDesc);
                if (materialTextView4 != null) {
                    i3 = R.id.itemSwitchViewTextViewTitle;
                    MaterialTextView materialTextView5 = (MaterialTextView) AbstractC3681.m5325(viewInflate3, R.id.itemSwitchViewTextViewTitle);
                    if (materialTextView5 != null) {
                        return new C3559(new C2103((LinearLayout) viewInflate3, materialSwitch, materialTextView4, materialTextView5), (byte) 0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
        }
        if (i == 3) {
            
            View viewInflate4 = AbstractC1460.m3216(C1565.m3276()).inflate(R.layout.item_rv_view_plugin, viewGroup, false);
            int i4 = R.id.itemPluginViewSwitchFunc;
            MaterialSwitch materialSwitch2 = (MaterialSwitch) AbstractC3681.m5325(viewInflate4, R.id.itemPluginViewSwitchFunc);
            if (materialSwitch2 != null) {
                i4 = R.id.itemPluginViewTextViewDesc;
                MaterialTextView materialTextView6 = (MaterialTextView) AbstractC3681.m5325(viewInflate4, R.id.itemPluginViewTextViewDesc);
                if (materialTextView6 != null) {
                    i4 = R.id.itemPluginViewTextViewPluginId;
                    MaterialTextView materialTextView7 = (MaterialTextView) AbstractC3681.m5325(viewInflate4, R.id.itemPluginViewTextViewPluginId);
                    if (materialTextView7 != null) {
                        i4 = R.id.itemPluginViewTextViewTitle;
                        MaterialTextView materialTextView8 = (MaterialTextView) AbstractC3681.m5325(viewInflate4, R.id.itemPluginViewTextViewTitle);
                        if (materialTextView8 != null) {
                            return new C3559(new C1676((LinearLayout) viewInflate4, materialSwitch2, materialTextView6, materialTextView7, materialTextView8), (byte) 0);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i4)));
        }
        if (i != 4) {
            throw new IllegalArgumentException("onCreateViewHolder Failed");
        }
        
        View viewInflate5 = AbstractC1460.m3216(C1565.m3276()).inflate(R.layout.item_rv_search_result, viewGroup, false);
        int i5 = R.id.itemSearchResultImageViewNav;
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) AbstractC3681.m5325(viewInflate5, R.id.itemSearchResultImageViewNav);
        if (shapeableImageView2 != null) {
            i5 = R.id.itemSearchResultTextViewChip;
            TextView textView = (TextView) AbstractC3681.m5325(viewInflate5, R.id.itemSearchResultTextViewChip);
            if (textView != null) {
                i5 = R.id.itemSearchResultTextViewDesc;
                MaterialTextView materialTextView9 = (MaterialTextView) AbstractC3681.m5325(viewInflate5, R.id.itemSearchResultTextViewDesc);
                if (materialTextView9 != null) {
                    i5 = R.id.itemSearchResultTextViewTitle;
                    MaterialTextView materialTextView10 = (MaterialTextView) AbstractC3681.m5325(viewInflate5, R.id.itemSearchResultTextViewTitle);
                    if (materialTextView10 != null) {
                        return new C3559(new C1676((LinearLayout) viewInflate5, shapeableImageView2, textView, materialTextView9, materialTextView10));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i5)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m5146(List list) {
        this.f11173 = list;
        m4441();
    }
}
